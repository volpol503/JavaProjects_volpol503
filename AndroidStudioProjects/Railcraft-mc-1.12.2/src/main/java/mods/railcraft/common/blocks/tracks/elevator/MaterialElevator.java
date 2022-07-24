/*------------------------------------------------------------------------------
 Copyright (c) CovertJaguar, 2011-2019
 http://railcraft.info

 This code is the property of CovertJaguar
 and may only be used with explicit written
 permission unless otherwise specified on the
 license page at http://railcraft.info/wiki/info:license.
 -----------------------------------------------------------------------------*/
package mods.railcraft.common.blocks.tracks.elevator;

import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

public class MaterialElevator extends Material {

    public MaterialElevator() {
        super(MapColor.IRON);
    }

    @Override
    public boolean blocksMovement() {
        return true;
    }

    @Override
    public boolean isSolid() {
        return false;
    }

    @Override
    public boolean blocksLight() {
        return false;
    }
}
