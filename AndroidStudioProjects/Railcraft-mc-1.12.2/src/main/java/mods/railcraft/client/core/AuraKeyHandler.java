/*------------------------------------------------------------------------------
 Copyright (c) CovertJaguar, 2011-2019
 http://railcraft.info

 This code is the property of CovertJaguar
 and may only be used with explicit written
 permission unless otherwise specified on the
 license page at http://railcraft.info/wiki/info:license.
 -----------------------------------------------------------------------------*/
package mods.railcraft.client.core;

import mods.railcraft.common.core.Railcraft;
import mods.railcraft.common.items.ItemGoggles.GoggleAura;
import mods.railcraft.common.plugins.forge.ChatPlugin;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiChat;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import org.lwjgl.input.Keyboard;

import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;

/**
 * @author CovertJaguar <http://www.railcraft.info>
 */
public class AuraKeyHandler {
    public static final AuraKeyHandler INSTANCE = new AuraKeyHandler();
    private static EnumSet<GoggleAura> activeAuras = EnumSet.noneOf(GoggleAura.class);
    private static EnumMap<GoggleAura, KeyBinding> keyBindings;

    private AuraKeyHandler() {
        keyBindings = new EnumMap<>(GoggleAura.class);
        keyBindings.put(GoggleAura.WORLDSPIKE, new KeyBinding("railcraft.keybind.aura.worldspike", Keyboard.KEY_F9, Railcraft.MOD_ID));
        keyBindings.put(GoggleAura.TUNING, new KeyBinding("railcraft.keybind.aura.tuning", Keyboard.KEY_P, Railcraft.MOD_ID));
        keyBindings.put(GoggleAura.SURVEYING, new KeyBinding("railcraft.keybind.aura.surveying", Keyboard.KEY_O, Railcraft.MOD_ID));
        keyBindings.put(GoggleAura.SIGNALLING, new KeyBinding("railcraft.keybind.aura.signalling", Keyboard.KEY_I, Railcraft.MOD_ID));

        keyBindings.values().forEach(ClientRegistry::registerKeyBinding);
    }

    public static boolean isAuraEnabled(GoggleAura aura) {
        return activeAuras.contains(aura);
    }

    @SubscribeEvent
    public void tick(TickEvent.ClientTickEvent event) {
        if (Minecraft.getMinecraft().currentScreen instanceof GuiChat)
            return;
        EntityPlayer player = Minecraft.getMinecraft().player;
        for (Map.Entry<GoggleAura, KeyBinding> keyBinding : keyBindings.entrySet()) {
            if (keyBinding.getValue().isPressed()) {
                GoggleAura aura = keyBinding.getKey();
                if (isAuraEnabled(aura)) {
                    activeAuras.remove(aura);
                    ChatPlugin.sendLocalizedChat(player, "gui.railcraft.aura.disable", "\u00A75" + aura + "\u00A77");
                } else {
                    activeAuras.add(aura);
                    ChatPlugin.sendLocalizedChat(player, "gui.railcraft.aura.enable", "\u00A75" + aura + "\u00A77");
                }
            }
        }
    }
}
