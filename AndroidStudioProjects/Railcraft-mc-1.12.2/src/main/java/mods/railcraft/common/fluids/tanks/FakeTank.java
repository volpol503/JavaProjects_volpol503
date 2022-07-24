/*------------------------------------------------------------------------------
 Copyright (c) CovertJaguar, 2011-2019
 http://railcraft.info

 This code is the property of CovertJaguar
 and may only be used with explicit written
 permission unless otherwise specified on the
 license page at http://railcraft.info/wiki/info:license.
 -----------------------------------------------------------------------------*/
package mods.railcraft.common.fluids.tanks;

import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fluids.FluidTank;
import net.minecraftforge.fluids.FluidTankInfo;
import net.minecraftforge.fluids.IFluidTank;
import net.minecraftforge.fluids.capability.FluidTankProperties;

/**
 * @author CovertJaguar <http://www.railcraft.info>
 */
public final class FakeTank extends FluidTank {

    public static final IFluidTank INSTANCE = new FakeTank();
    public static final IFluidTank[] ARRAY = {INSTANCE};
    public static final FluidTankInfo[] INFO = {INSTANCE.getInfo()};
    public static final FluidTankProperties[] PROPERTIES = {new FluidTankProperties(null, 0, false, false)};

    private FakeTank() {
        super(1);
    }

    @Override
    public int fill(FluidStack resource, boolean doFill) {
        return 0;
    }

    @Override
    public FluidStack drain(int maxDrain, boolean doDrain) {
        return null;
    }

}
