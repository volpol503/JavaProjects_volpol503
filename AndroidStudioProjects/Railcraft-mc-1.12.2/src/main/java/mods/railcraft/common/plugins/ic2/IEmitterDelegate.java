/*------------------------------------------------------------------------------
 Copyright (c) CovertJaguar, 2011-2019
 http://railcraft.info

 This code is the property of CovertJaguar
 and may only be used with explicit written
 permission unless otherwise specified on the
 license page at http://railcraft.info/wiki/info:license.
 -----------------------------------------------------------------------------*/
package mods.railcraft.common.plugins.ic2;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;

/**
 *
 * @author CovertJaguar <http://www.railcraft.info/>
 */
public interface IEmitterDelegate {

    double getOfferedEnergy();

    void drawEnergy(double amount);

    boolean emitsEnergyTo(Object receiver, EnumFacing direction);

    TileEntity getTile();

    int getSourceTier();

}
