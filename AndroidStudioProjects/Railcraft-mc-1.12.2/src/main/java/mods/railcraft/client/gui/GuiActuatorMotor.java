/*------------------------------------------------------------------------------
 Copyright (c) CovertJaguar, 2011-2019
 http://railcraft.info

 This code is the property of CovertJaguar
 and may only be used with explicit written
 permission unless otherwise specified on the
 license page at http://railcraft.info/wiki/info:license.
 -----------------------------------------------------------------------------*/
package mods.railcraft.client.gui;

import com.google.common.collect.Lists;
import mods.railcraft.client.gui.buttons.GuiToggleButton;
import mods.railcraft.common.blocks.machine.wayobjects.actuators.TileActuatorMotor;
import mods.railcraft.common.plugins.forge.LocalizationPlugin;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.entity.player.EntityPlayer;

public class GuiActuatorMotor extends GuiAspectAction {

    private final TileActuatorMotor switchMotor;
    private boolean shouldSwitchOnRedstone;
    private GuiToggleButton redstoneButton;

    public GuiActuatorMotor(EntityPlayer player, TileActuatorMotor switchMotor, String title) {
        super(player, switchMotor, title, "gui_basic_large.png");
        this.switchMotor = switchMotor;
        this.shouldSwitchOnRedstone = switchMotor.shouldSwitchOnRedstone();
        ySize = 113;
    }

    @Override
    public void initGui() {
        super.initGui();
        int w = (width - xSize) / 2;
        int h = (height - ySize) / 2;
        redstoneButton = new GuiToggleButton(6, w + 43, h + 80, 100, LocalizationPlugin.translate("gui.railcraft.actuator.motor.redstone"), !shouldSwitchOnRedstone);
        GuiTools.newButtonRowAuto(buttonList, w + 3, 171, Lists.newArrayList(redstoneButton));
    }

    @Override
    protected void onButtonPressed(GuiButton button) {
        super.onButtonPressed(button);
        if (button == redstoneButton) {
            shouldSwitchOnRedstone = !shouldSwitchOnRedstone;
            ((GuiToggleButton) button).active = !shouldSwitchOnRedstone;
        }
    }

    @Override
    protected void prepareForPacket() {
        super.prepareForPacket();
        switchMotor.setSwitchOnRedstone(shouldSwitchOnRedstone);
    }
}
