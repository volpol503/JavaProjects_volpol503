/*******************************************************************************
 Copyright (c) CovertJaguar, 2011-2016
 http://railcraft.info

 This code is the property of CovertJaguar
 and may only be used with explicit written
 permission unless otherwise specified on the
 license page at http://railcraft.info/wiki/info:license.
 ******************************************************************************/
package mods.railcraft.client.render.broken;

import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer.ItemRenderType;

/**
 *
 * @author CovertJaguar <http://www.railcraft.info>
 */
public interface IInvRenderer
{

    void renderItem(RenderBlocks renderBlocks, ItemStack item, ItemRenderType renderType);

}
