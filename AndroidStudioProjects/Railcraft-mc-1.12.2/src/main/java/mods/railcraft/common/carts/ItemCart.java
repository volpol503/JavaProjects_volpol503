/*------------------------------------------------------------------------------
 Copyright (c) CovertJaguar, 2011-2019
 http://railcraft.info

 This code is the property of CovertJaguar
 and may only be used with explicit written
 permission unless otherwise specified on the
 license page at http://railcraft.info/wiki/info:license.
 -----------------------------------------------------------------------------*/
package mods.railcraft.common.carts;

import com.mojang.authlib.GameProfile;
import mods.railcraft.api.items.IMinecartItem;
import mods.railcraft.common.blocks.tracks.TrackTools;
import mods.railcraft.common.core.RailcraftConfig;
import mods.railcraft.common.items.IRailcraftItemSimple;
import mods.railcraft.common.plugins.forge.LocalizationPlugin;
import mods.railcraft.common.util.inventory.InvTools;
import mods.railcraft.common.util.misc.Game;
import net.minecraft.block.BlockDispenser;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.dispenser.BehaviorDefaultDispenseItem;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemMinecart;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.jetbrains.annotations.Nullable;

import java.util.List;

import static mods.railcraft.common.util.inventory.InvTools.dec;

public class ItemCart extends ItemMinecart implements IMinecartItem, IRailcraftItemSimple {

    private final IRailcraftCartContainer type;
    private int rarity;

    public ItemCart(IRailcraftCartContainer cart) {
        super(EntityMinecart.Type.RIDEABLE);
        maxStackSize = RailcraftConfig.getMinecartStackSize();
        this.type = cart;
        setMaxDamage(0);
        setHasSubtypes(true);
        BlockDispenser.DISPENSE_BEHAVIOR_REGISTRY.putObject(this, new BehaviorDefaultDispenseItem());
    }

    @Override
    public Item getObject() {
        return this;
    }

    public ItemCart setRarity(int rarity) {
        this.rarity = rarity;
        return this;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public EnumRarity getRarity(ItemStack par1ItemStack) {
        return EnumRarity.values()[rarity];
    }

    @Override
    public EnumActionResult onItemUse(EntityPlayer player, World world, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        ItemStack stack = player.getHeldItem(hand);
        if (!TrackTools.isRailBlockAt(world, pos))
            return EnumActionResult.FAIL;
        if (Game.isHost(world)) {
            EntityMinecart placedCart = placeCart(player.getGameProfile(), stack, world, pos);
            if (placedCart != null) {
                dec(stack);
            }
        }
        return EnumActionResult.SUCCESS;
    }

    public IRailcraftCartContainer getCartType() {
        return type;
    }

    @Override
    public boolean canBePlacedByNonPlayer(ItemStack cart) {
        return true;
    }

    @Override
    public @Nullable EntityMinecart placeCart(GameProfile owner, ItemStack cartStack, World world, BlockPos pos) {
        return CartTools.placeCart(type, owner, cartStack, world, pos);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void addInformation(ItemStack stack, @Nullable World world, List<String> info, ITooltipFlag adv) {
        super.addInformation(stack, world, info, adv);
        addToolTips(stack, world, info, adv);
        ItemStack filter = CartBaseFiltered.getFilterFromCartItem(stack);
        if (!InvTools.isEmpty(filter)) {
            info.add(TextFormatting.BLUE + LocalizationPlugin.translate("gui.railcraft.filter") + ": " + filter.getDisplayName());
        }
    }

}
