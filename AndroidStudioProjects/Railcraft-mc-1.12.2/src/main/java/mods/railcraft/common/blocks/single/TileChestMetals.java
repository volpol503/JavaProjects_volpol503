/*------------------------------------------------------------------------------
 Copyright (c) CovertJaguar, 2011-2019
 http://railcraft.info

 This code is the property of CovertJaguar
 and may only be used with explicit written
 permission unless otherwise specified on the
 license page at http://railcraft.info/wiki/info:license.
 -----------------------------------------------------------------------------*/
package mods.railcraft.common.blocks.single;

import mods.railcraft.common.blocks.logic.Logic;
import mods.railcraft.common.blocks.logic.MetalsChestLogic;

/**
 * @author CovertJaguar <http://www.railcraft.info>
 */
public class TileChestMetals extends TileChestRailcraft {

    {
        setLogic(new MetalsChestLogic(Logic.Adapter.of(this)));
    }
}
