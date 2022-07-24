/*------------------------------------------------------------------------------
 Copyright (c) CovertJaguar, 2011-2019
 http://railcraft.info

 This code is the property of CovertJaguar
 and may only be used with explicit written
 permission unless otherwise specified on the
 license page at http://railcraft.info/wiki/info:license.
 -----------------------------------------------------------------------------*/
package mods.railcraft.client.gui;

import mods.railcraft.common.blocks.machine.equipment.TileRollingMachine;
import mods.railcraft.common.gui.containers.ContainerRollingMachine;
import net.minecraft.entity.player.InventoryPlayer;

public class GuiRollingMachine extends GuiTitled {

    private final TileRollingMachine tile;
    private final int ay;

    public GuiRollingMachine(InventoryPlayer inventoryplayer, TileRollingMachine tile) {
        this(tile, new ContainerRollingMachine(inventoryplayer, tile), "gui_rolling_manual.png", 45);
    }

    protected GuiRollingMachine(TileRollingMachine tile, ContainerRollingMachine container, String texture, int ay) {
        super(tile, container, texture);
        this.tile = tile;
        this.ay = ay;
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float f, int i, int j) {
        super.drawGuiContainerBackgroundLayer(f, i, j);
        int x = (width - xSize) / 2;
        int y = (height - ySize) / 2;
        if (tile.getProgress() > 0) {
            int progress = tile.getProgressScaled(23);
            drawTexturedModalRect(x + 89, y + ay, 176, 0, progress + 1, 12);
        }
    }
}
