///*
// * Copyright (c) CovertJaguar, 2014 http://railcraft.info
// *
// * This code is the property of CovertJaguar
// * and may only be used with explicit written
// * permission unless otherwise specified on the
// * license page at http://railcraft.info/wiki/info:license.
// */
//package mods.railcraft.common.plugins.thaumcraft;
//
//import mods.railcraft.common.util.inventory.InvTools;
//import net.minecraft.inventory.IInventory;
//import net.minecraft.item.ItemStack;
//import thaumcraft.api.aspects.Aspect;
//import thaumcraft.api.aspects.AspectList;
//import thaumcraft.api.aspects.IEssentiaContainerItem;
//
///**
// *
// * @author CovertJaguar <http://www.railcraft.info/>
// */
//public class EssentiaHelper {
//
//    public static boolean getEssentia(IInventory inv, int slot, Aspect aspect) {
//        ItemStack stack = inv.getStackInSlot(slot);
//
//        if (!InvTools.isEmpty(stack) && stack.getItem() instanceof IEssentiaContainerItem && "item.BlockJarFilledItem".equals(stack.getTranslationKey())) {
//            IEssentiaContainerItem jar = (IEssentiaContainerItem) stack.getItem();
//            AspectList aspects = jar.getAspects(stack);
//            if (aspects.getAmount(aspect) > 0) {
//                aspects.remove(aspect, 1);
//                if (aspects.size() == 0) {
//                    ItemStack emptyJar = ThaumcraftPlugin.BLOCKS.get("jar");
//                    inv.setInventorySlotContents(slot, emptyJar);
//                } else
//                    jar.setAspects(stack, aspects);
//                return true;
//            }
//        }
//        return false;
//    }
//
//}
