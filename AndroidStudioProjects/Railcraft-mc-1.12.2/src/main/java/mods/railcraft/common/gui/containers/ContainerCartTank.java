/*------------------------------------------------------------------------------
 Copyright (c) CovertJaguar, 2011-2019
 http://railcraft.info

 This code is the property of CovertJaguar
 and may only be used with explicit written
 permission unless otherwise specified on the
 license page at http://railcraft.info/wiki/info:license.
 -----------------------------------------------------------------------------*/
package mods.railcraft.common.gui.containers;

import mods.railcraft.common.carts.EntityCartTank;
import mods.railcraft.common.gui.slots.SlotFluidFilter;
import mods.railcraft.common.gui.slots.SlotOutput;
import mods.railcraft.common.gui.slots.SlotStackFilter;
import mods.railcraft.common.gui.widgets.FluidGaugeWidget;
import mods.railcraft.common.util.inventory.filters.StackFilters;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Slot;

public class ContainerCartTank extends RailcraftContainer {

    public ContainerCartTank(InventoryPlayer inventoryplayer, EntityCartTank cart) {
        super(cart);

        addWidget(new FluidGaugeWidget(cart.getTankManager().get(0), 35, 23, 176, 0, 16, 47));

        addSlot(new SlotFluidFilter(cart.getFilterInv(), 0, 71, 39));
        addSlot(new SlotStackFilter(StackFilters.FLUID_CONTAINER, cart.getInvLiquids(), 0, 116, 21));
        addSlot(new SlotOutput(cart.getInvLiquids(), 1, 116, 56));

        for (int i = 0; i < 3; i++) {
            for (int k = 0; k < 9; k++) {
                addSlot(new Slot(inventoryplayer, k + i * 9 + 9, 8 + k * 18, 84 + i * 18));
            }
        }

        for (int j = 0; j < 9; j++) {
            addSlot(new Slot(inventoryplayer, j, 8 + j * 18, 142));
        }
    }
}
