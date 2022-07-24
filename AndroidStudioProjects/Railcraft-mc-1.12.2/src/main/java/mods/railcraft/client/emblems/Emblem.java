/*------------------------------------------------------------------------------
 Copyright (c) CovertJaguar, 2011-2019
 http://railcraft.info

 This code is the property of CovertJaguar
 and may only be used with explicit written
 permission unless otherwise specified on the
 license page at http://railcraft.info/wiki/info:license.
 -----------------------------------------------------------------------------*/
package mods.railcraft.client.emblems;

import net.minecraft.item.EnumRarity;

/**
 *
 * @author CovertJaguar <http://www.railcraft.info/>
 */
public class Emblem {

    public final String textureFile;
    public final String identifier;
    public final String displayName;
    public final EnumRarity rarity;
    public final boolean hasEffect;

    public Emblem(String ident, String text, String display, EnumRarity rarity, boolean hasEffect) {
        this.identifier = ident;
        this.textureFile = text;
        this.displayName = display;
        this.rarity = rarity;
        this.hasEffect = hasEffect;
    }

    @Override
    public String toString() {
        return String.format("Emblem - \"%s\" - %s", displayName, identifier);
    }

}
