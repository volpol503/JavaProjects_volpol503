/*------------------------------------------------------------------------------
 Copyright (c) CovertJaguar, 2011-2020
 http://railcraft.info

 This code is the property of CovertJaguar
 and may only be used with explicit written
 permission unless otherwise specified on the
 license page at http://railcraft.info/wiki/info:license.
 -----------------------------------------------------------------------------*/

package mods.railcraft.common.blocks.tracks.outfitted;

import mods.railcraft.api.core.ILocalizedObject;
import mods.railcraft.api.core.IVariantEnum;
import mods.railcraft.api.tracks.TrackKit;
import mods.railcraft.api.tracks.TrackRegistry;
import mods.railcraft.api.tracks.TrackType;
import mods.railcraft.client.render.models.resource.ModelManager;
import mods.railcraft.common.advancements.criterion.RailcraftAdvancementTriggers;
import mods.railcraft.common.blocks.tracks.TrackShapeHelper;
import mods.railcraft.common.blocks.tracks.TrackTools;
import mods.railcraft.common.blocks.tracks.behaivor.TrackTypes;
import mods.railcraft.common.blocks.tracks.flex.BlockTrackFlex;
import mods.railcraft.common.items.ItemRailcraft;
import mods.railcraft.common.plugins.forge.ChatPlugin;
import mods.railcraft.common.plugins.forge.LocalizationPlugin;
import mods.railcraft.common.plugins.forge.WorldPlugin;
import mods.railcraft.common.util.misc.Game;
import mods.railcraft.common.util.sounds.SoundHelper;
import net.minecraft.block.BlockRailBase;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;
import org.jetbrains.annotations.Nullable;

import java.util.HashMap;
import java.util.Map;

import static mods.railcraft.common.util.inventory.InvTools.dec;

/**
 * Created by CovertJaguar on 8/11/2016 for Railcraft.
 *
 * @author CovertJaguar <http://www.railcraft.info>
 */
/*
 * /give @s railcraft:track_outfitted 1 0 {railcraft:{kit:"railcraft_buffer"}
 * Gives a buffer stop track kit.
 */
public class ItemTrackKit extends ItemRailcraft {
    @Override
    public void initializeDefinition() {
        TrackKit.itemKit = this;
        setCreativeTab(CreativeTabs.TRANSPORTATION);
        setHasSubtypes(true);
    }

    @Override
    public @Nullable Class<? extends IVariantEnum> getVariantEnumClass() {
        return TrackKit.class;
    }

    @Override
    public int getMetadata(ItemStack stack) {
        if (super.getMetadata(stack) == OreDictionary.WILDCARD_VALUE)
            return OreDictionary.WILDCARD_VALUE; // Keep this for the sake of forestry backpack item identification
        return TrackRegistry.TRACK_KIT.getId(TrackRegistry.TRACK_KIT.get(stack));
    }

    @Override
    public int getDamage(ItemStack stack) {
        return getMetadata(stack);
    }

    @Override
    public ItemStack getStack(int qty, @Nullable IVariantEnum variant) {
        if (variant != null) {
            checkVariant(variant);
            return ((TrackKit) variant).getTrackKitItem(qty);
        }
        return TrackRegistry.getMissingTrackKit().getTrackKitItem();
    }

    @Override
    public String getTranslationKey() {
        return "item.railcraft.track_kit";
    }

    @Override
    public String getTranslationKey(ItemStack stack) {
        return getTranslationKey() + "." + TrackRegistry.TRACK_KIT.get(stack).getResourcePathSuffix();
    }

    @Override
    public String getItemStackDisplayName(ItemStack stack) {
        String locTag = getTranslationKey(stack) + ".name";
        if (LocalizationPlugin.hasTag(locTag))
            return LocalizationPlugin.translateFast(locTag);
        Map<String, ILocalizedObject> args = new HashMap<>();
        args.put("track_kit", TrackRegistry.TRACK_KIT.get(stack));
        return LocalizationPlugin.translateArgs(getTranslationKey() + ".name", args);
    }

    @Override
    public String getTooltipTag(ItemStack stack) {
        return TrackRegistry.TRACK_KIT.get(stack).getLocalizationTag().replace(".name", ".tips");
    }

    @Override
    public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> list) {
        if (!isInCreativeTab(tab))
            return;
        TrackRegistry.TRACK_KIT.stream().filter(TrackKit::isVisible).map(this::getStack).filter(stack -> !stack.isEmpty()).forEach(list::add);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void initializeClient() {
        TrackRegistry.TRACK_KIT.stream().filter(TrackKit::isVisible).forEach(trackKit -> ModelManager.registerItemModel(this, trackKit.ordinal(),
                trackKit.getRegistryName().getNamespace(), "track_kits/" + trackKit.getRegistryName().getPath()));
    }

    @Override
    public EnumActionResult onItemUse(EntityPlayer playerIn, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        ItemStack stack = playerIn.getHeldItem(hand);
        playerIn.swingArm(hand);
        if (Game.isClient(worldIn))
            return EnumActionResult.PASS;
        IBlockState oldState = WorldPlugin.getBlockState(worldIn, pos);
        if (!TrackTools.isRail(oldState)) {
            return EnumActionResult.PASS;
        }
        TrackType trackType = null;
        if (oldState.getBlock() instanceof BlockTrackFlex) {
            BlockTrackFlex track = (BlockTrackFlex) oldState.getBlock();
            trackType = track.getTrackType(worldIn, pos);
        } else if (oldState.getBlock() == Blocks.RAIL) {
            trackType = TrackTypes.IRON.getTrackType();
        }
        if (trackType != null) {
            BlockRailBase.EnumRailDirection shape = TrackTools.getTrackDirectionRaw(worldIn, pos);
            if (TrackShapeHelper.isStraight(shape)) {
                TrackKit trackKit = TrackRegistry.TRACK_KIT.get(stack);
                if (!shape.isAscending() || trackKit.isAllowedOnSlopes()) {
                    if (!trackKit.isAllowedTrackType(trackType)) {
                        ChatPlugin.sendLocalizedHotBarMessageFromServer(playerIn, "gui.railcraft.track_kit.item.invalid.track_type");
                        return EnumActionResult.PASS;
                    }
                    if (BlockTrackOutfitted.placeTrack(worldIn, pos, playerIn, shape, trackType, trackKit)) {
                        SoundHelper.playPlaceSoundForBlock(worldIn, pos);
                        RailcraftAdvancementTriggers.getInstance().onTrackKitUse((EntityPlayerMP) playerIn, worldIn, pos, stack);
                        dec(stack);
                        return EnumActionResult.SUCCESS;
                    }
                } else {
                    ChatPlugin.sendLocalizedHotBarMessageFromServer(playerIn, "gui.railcraft.track_kit.item.invalid.slope");
                }
            } else {
                ChatPlugin.sendLocalizedHotBarMessageFromServer(playerIn, "gui.railcraft.track_kit.item.invalid.curve");
            }
        } else {
            ChatPlugin.sendLocalizedHotBarMessageFromServer(playerIn, "gui.railcraft.track_kit.item.invalid.track");
        }
        return EnumActionResult.PASS;
    }
}
