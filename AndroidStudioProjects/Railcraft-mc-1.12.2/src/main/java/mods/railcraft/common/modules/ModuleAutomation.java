/*------------------------------------------------------------------------------
 Copyright (c) CovertJaguar, 2011-2019
 http://railcraft.info

 This code is the property of CovertJaguar
 and may only be used with explicit written
 permission unless otherwise specified on the
 license page at http://railcraft.info/wiki/info:license.
 -----------------------------------------------------------------------------*/
package mods.railcraft.common.modules;

import mods.railcraft.api.core.RailcraftModule;
import mods.railcraft.common.blocks.RailcraftBlocks;
import mods.railcraft.common.blocks.machine.manipulator.ManipulatorVariant;
import mods.railcraft.common.carts.RailcraftCarts;
import mods.railcraft.common.core.RailcraftConfig;
import mods.railcraft.common.items.RailcraftItems;
import mods.railcraft.common.modules.orehandlers.BoreOreHandler;
import mods.railcraft.common.plugins.forge.CraftingPlugin;
import mods.railcraft.common.util.crafting.Ingredients;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraftforge.common.MinecraftForge;

@RailcraftModule(value = "railcraft:automation", description = "tunnel bore, maintenance carts, feed station, trade station, detectors")
public class ModuleAutomation extends RailcraftModulePayload {
    public ModuleAutomation() {
        setEnabledEventHandler(new ModuleEventHandler() {

            @Override
            public void construction() {
                if (!RailcraftConfig.boreMinesAllBlocks())
                    MinecraftForge.EVENT_BUS.register(new BoreOreHandler());
                add(
                        RailcraftBlocks.DETECTOR,
                        RailcraftBlocks.MANIPULATOR,
                        RailcraftBlocks.EQUIPMENT,
                        RailcraftBlocks.TRADE_STATION,
                        RailcraftBlocks.FORCE_TRACK_EMITTER,
                        RailcraftBlocks.TRACK_FORCE,

                        RailcraftItems.FILTER_BLANK,
                        RailcraftItems.FILTER_TYPE,
                        RailcraftItems.FILTER_ORE_DICT,

                        RailcraftCarts.BORE,
                        RailcraftItems.BORE_HEAD_BRONZE,
                        RailcraftItems.BORE_HEAD_IRON,
                        RailcraftItems.BORE_HEAD_STEEL,
                        RailcraftItems.BORE_HEAD_DIAMOND,
                        RailcraftCarts.MOW_TRACK_LAYER,
                        RailcraftCarts.MOW_TRACK_RELAYER,
                        RailcraftCarts.MOW_TRACK_REMOVER,
                        RailcraftCarts.MOW_UNDERCUTTER,
                        RailcraftCarts.TRADE_STATION
                );
            }

            @Override
            public void init() {
                ManipulatorVariant gamma = ManipulatorVariant.DISPENSER_CART;
                if (gamma.isAvailable())
                    CraftingPlugin.addShapelessRecipe(gamma.getStack(),
                            Ingredients.catalyst(Items.MINECART), Blocks.DISPENSER);

//                EnumMachineAlpha alpha = EnumMachineAlpha.TRADE_STATION;
//                if (alpha.isAvailable()) {
//                    ItemStack stack = alpha.getStack();
//                    CraftingPlugin.addRecipe(stack,
//                            "SGS",
//                            "EDE",
//                            "SGS",
//                            'D', new ItemStack(Blocks.DISPENSER),
//                            'G', "paneGlass",
//                            'E', "gemEmerald",
//                            'S', RailcraftModuleManager.isModuleEnabled(ModuleFactory.class) ? RailcraftItems.PLATE.getRecipeObject(Metal.STEEL) : "blockIron");
//                }
            }
        });
    }
}
