package wehavecookies56.kk.worldgen;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;
import wehavecookies56.kk.block.AddedBlocks;
import wehavecookies56.kk.lib.ConfigBooleans;
import wehavecookies56.kk.lib.ints;

public class WorldGenBlox implements IWorldGenerator
{

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch(world.provider.dimensionId){
		case 0:  generateOverworld   (world, random, chunkX * 16, chunkZ * 16);
		case 1:  generateEnd		 (world, random, chunkX * 16, chunkZ * 16);
		case -1: generateNether      (world, random, chunkX * 16, chunkZ * 16);
		}
	}

	/**
	 * OVERWORLD GENERATION
	 */

		public void generateOverworld (World world, Random random, int chunkX, int chunkZ){
			if(ConfigBooleans.enableOverworld){
		    String s = world.getBiomeGenForCoords(chunkX + 8, chunkZ + 8).biomeName;
			this.spawnOres(AddedBlocks.LucidOre, Blocks.stone, world, random, chunkX, chunkZ, 16, 16, 6, ints.LucidOreChance, 0, 70);
			this.spawnOres(AddedBlocks.SerenityOre, Blocks.stone, world, random, chunkX, chunkZ, 16, 16, 5, ints.SerenityOreChance, 60, 128);
			this.spawnOres(AddedBlocks.TranquilOre, Blocks.stone, world, random, chunkX, chunkZ, 16, 16, 6, ints.TranquilOreChance, 70, 128);
			this.spawnOres(AddedBlocks.BrightOre, Blocks.stone, world, random, chunkX, chunkZ, 16, 16, 5, ints.BrightOreChance, 10, 128);
			this.spawnOres(AddedBlocks.DarkOre, Blocks.stone, world, random, chunkX, chunkZ, 16, 16, 4, ints.DarkOreChance, 0, 12);
			this.spawnOres(AddedBlocks.DenseOre, Blocks.stone, world, random, chunkX, chunkZ, 16, 16, 5, ints.DenseOreChance, 0, 15);
			this.spawnOres(AddedBlocks.LightningOre, Blocks.stone, world, random, chunkX, chunkZ, 16, 16, 5, ints.LightningOreChance, 40, 60);
			this.spawnOres(AddedBlocks.BlazingOre, Blocks.stone, world, random, chunkX, chunkZ, 16, 16, 5, ints.BlazingOreChance, 0, 20);
			this.spawnOres(AddedBlocks.PrizeBlox, Blocks.dirt, world, random, chunkX, chunkZ, 16, 16, 3, ints.PrizeBlox, 0, 128);
			this.spawnOres(AddedBlocks.RarePrizeBlox, Blocks.dirt, world, random, chunkX, chunkZ, 16, 16, 3, ints.RarePrizeBlox, 0, 128);
			
			if (s.startsWith("Taiga") || s.startsWith("Ice Plains") || s.startsWith("Ice Mountains") || s.startsWith("Frozen Ocean") || s.startsWith("Frozen River") || s.startsWith("TaigaHills"))
			{
					this.spawnOres(AddedBlocks.FrostOre, Blocks.stone, world, random, chunkX, chunkZ, 16, 16, 6, ints.FrostOreChance, 25, 40);
			}

			this.spawnOres(AddedBlocks.EnergyOre, Blocks.stone, world, random, chunkX, chunkZ, 16, 16, 6, ints.EnergyOreChance, 0, 128);
			this.spawnOres(AddedBlocks.RemembranceOre, Blocks.stone, world, random, chunkX, chunkZ, 16, 16, 4, ints.RemembranceOreChance, 0, 128);
			this.spawnOres(AddedBlocks.TwilightOre, Blocks.stone, world, random, chunkX, chunkZ, 16, 16, 8, ints.TwilightOreChance, 0, 128);
			
			this.spawnOres(AddedBlocks.DangerBlox, Blocks.grass, world, random, chunkX, chunkZ, 1, 1, 3, 20, ints.DangerBlox, 200);
			this.spawnOres(AddedBlocks.NormalBlox, Blocks.grass, world, random, chunkX, chunkZ, 1, 1, 3, 20, ints.NormalBlox, 200);
			this.spawnOres(AddedBlocks.HardBlox, Blocks.grass, world, random, chunkX, chunkZ, 1, 1, 3, 20, ints.HardBlox, 200);
			this.spawnOres(AddedBlocks.MetalBlox, Blocks.grass, world, random, chunkX, chunkZ, 1, 1, 3, 20, ints.MetalBlox, 200);
			//Spawns BaseBlocks randomly in a 1x1 wide chunk, in vains of 3, with a 20 spawnchance, between levels 50 and 200
			this.spawnOres(AddedBlocks.DangerBlox, Blocks.sand, world, random, chunkX, chunkZ, 1, 1, 3, 20, ints.DangerBlox, 200);
			this.spawnOres(AddedBlocks.NormalBlox, Blocks.sand, world, random, chunkX, chunkZ, 1, 1, 3, 20, ints.NormalBlox, 200);
			this.spawnOres(AddedBlocks.HardBlox, Blocks.sand, world, random, chunkX, chunkZ, 1, 1, 3, 20, ints.HardBlox, 200);
			this.spawnOres(AddedBlocks.MetalBlox, Blocks.sand, world, random, chunkX, chunkZ, 1, 1, 3, 20, ints.MetalBlox, 200);
			
			this.spawnOres(AddedBlocks.DangerBlox, Blocks.tallgrass, world, random, chunkX, chunkZ, 1, 1, 3, 20, ints.DangerBlox, 200);
			this.spawnOres(AddedBlocks.NormalBlox, Blocks.tallgrass, world, random, chunkX, chunkZ, 1, 1, 3, 20, ints.NormalBlox, 200);
			this.spawnOres(AddedBlocks.HardBlox, Blocks.tallgrass, world, random, chunkX, chunkZ, 1, 1, 3, 20, ints.HardBlox, 200);
			this.spawnOres(AddedBlocks.MetalBlox, Blocks.tallgrass, world, random, chunkX, chunkZ, 1, 1, 3, 20, ints.MetalBlox, 200);
			
			this.spawnOres(AddedBlocks.DangerBlox, Blocks.deadbush, world, random, chunkX, chunkZ, 1, 1, 3, 20, ints.DangerBlox, 200);
			this.spawnOres(AddedBlocks.NormalBlox, Blocks.deadbush, world, random, chunkX, chunkZ, 1, 1, 3, 20, ints.NormalBlox, 200);
			this.spawnOres(AddedBlocks.HardBlox, Blocks.deadbush, world, random, chunkX, chunkZ, 1, 1, 3, 20, ints.HardBlox, 200);
			this.spawnOres(AddedBlocks.MetalBlox, Blocks.deadbush, world, random, chunkX, chunkZ, 1, 1, 3, 20, ints.MetalBlox, 200);
			
			}
		}

	
	/** 
	 * END GENERATION
	 */
	public void generateEnd (World world, Random random, int chunkX, int chunkZ){
		if(ConfigBooleans.enableGenerate){
			this.spawnOres(AddedBlocks.DangerBlox, Blocks.end_stone, world, random, chunkX, chunkZ, 16, 16, 6, ints.DangerBloxE, 0, 128);
			this.spawnOres(AddedBlocks.NormalBlox, Blocks.end_stone, world, random, chunkX, chunkZ, 16, 16, 10, ints.NormalBloxE, 0, 128);
			this.spawnOres(AddedBlocks.HardBlox, Blocks.end_stone, world, random, chunkX, chunkZ, 16, 16, 9, ints.HardBloxE, 0, 128);
			this.spawnOres(AddedBlocks.MetalBlox, Blocks.end_stone, world, random, chunkX, chunkZ, 16, 16, 8, ints.MetalBloxE, 0, 128);
			this.spawnOres(AddedBlocks.RarePrizeBlox, Blocks.end_stone, world, random, chunkX, chunkZ, 16, 16, 3, ints.RarePrizeBloxE, 0, 128);
			this.spawnOres(AddedBlocks.DarkOreE, Blocks.end_stone, world, random, chunkX, chunkZ, 16, 16, 6, ints.DarkOreEChance, 0, 128);
			this.spawnOres(AddedBlocks.PowerOreE, Blocks.end_stone, world, random, chunkX, chunkZ, 16, 16, 7, ints.PowerOreEChance, 0, 128);
		}
	}

	/** 
	 * NETHER GENERATION
	 */
	public void generateNether (World world, Random random, int chunkX, int chunkZ){



	}

	/**
	 * 
	 * This Method adds ore generation. See below what all params mean
	 * @param dirt 
	 * 
	 * @param Block which you want to spawn
	 * @param World where you want it to spawn
	 * @param Randomizer used for spawning
	 * @param Start of the Chunk in X-Direction
	 * @param Start of the Chunk in Z-Direction
	 * @param Max X-Size where the block can spawn, normal = 16
	 * @param Max Z-Size where the block can spawn, normal = 16
	 * @param The vein size
	 * @param The chance to spawn a block
	 * @param Minimum Y-level to spawn block
	 * @param Maximum Y-level to spawn block
	 * 
	 */

	public void spawnOres(Block block, Block blockReplaced, World world, Random random, int chunkX, int chunkZ, int XMax, int ZMax, int vainSize, int spawnChance, int YMin, int YMax){
		for(int i = 0; i < spawnChance; i ++){
			int posX = chunkX + random.nextInt(XMax);
			int posZ = chunkZ + random.nextInt(ZMax);
			int posY = YMin + random.nextInt(YMax-YMin);
			(new WorldGenMinable(block, vainSize, blockReplaced)).generate(world, random, posX, posY, posZ);
		}
	}


}