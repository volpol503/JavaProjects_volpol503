/*------------------------------------------------------------------------------
 Copyright (c) CovertJaguar, 2011-2019
 http://railcraft.info

 This code is the property of CovertJaguar
 and may only be used with explicit written
 permission unless otherwise specified on the
 license page at http://railcraft.info/wiki/info:license.
 -----------------------------------------------------------------------------*/

package mods.railcraft.common.worldgen;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraftforge.event.terraingen.OreGenEvent;
import net.minecraftforge.fml.common.IWorldGenerator;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.Random;

/**
 * Created by CovertJaguar on 6/10/2016 for Railcraft.
 *
 * @author CovertJaguar <http://www.railcraft.info>
 */
public abstract class Generator implements IWorldGenerator {
    protected Generator() {
    }

    @SubscribeEvent
    public final void generate(OreGenEvent.Post event) {
        World world = event.getWorld();
        Random rand = event.getRand();
        _generate(rand, event.getPos(), world);
    }

    @Override
    public final void generate(Random rand, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
        _generate(rand, new BlockPos((chunkX << 4) + 8, 0, (chunkZ << 4) + 8), world);
    }

    private void _generate(Random rand, BlockPos pos, World world) {
        Biome biome = world.getBiome(pos);
        if (canGen(world, rand, pos, biome)) {
            generate(world, rand, pos, biome);
        }
    }

    /**
     * Actually generate to the world.
     *
     * Note: The target position is in the middle of the chunk! Minus 8 in both x and z for regular
     * positions.
     *
     * @param world the world
     * @param rand the seed
     * @param targetPos the target pos, in the middle of the chunk
     * @param biome the biome
     */
    public abstract void generate(World world, Random rand, BlockPos targetPos, Biome biome);

    /**
     * Test if the generation should happen.
     *
     * Note: The target position is in the middle of the chunk! Minus 8 in both x and z for regular
     * positions.
     *
     * @param world the world
     * @param rand the seed
     * @param targetPos the target pos, in the middle of the chunk
     * @param biome the biome
     */
    public abstract boolean canGen(World world, Random rand, BlockPos targetPos, Biome biome);
}
