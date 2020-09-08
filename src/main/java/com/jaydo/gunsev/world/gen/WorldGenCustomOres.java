package com.jaydo.gunsev.world.gen;

import java.util.Random;

import com.jaydo.gunsev.init.BlockInit;
import com.jaydo.gunsev.objects.blocks.BlockOres;
import com.jaydo.gunsev.util.handlers.EnumHandler;

import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class WorldGenCustomOres implements IWorldGenerator
{
	private WorldGenerator ore_nether_copper, ore_overworld_copper,ore_nether_lead,ore_overworld_lead,ore_nether_mercury,
	ore_overworld_mercury,ore_nether_saltpeter,ore_overworld_saltpeter,ore_nether_sulfur,ore_overworld_sulfur,ore_nether_zinc,ore_overworld_zinc;
	
	public WorldGenCustomOres()
	{
		ore_nether_copper = new WorldGenMinable(BlockInit.ORE_NETHER.getDefaultState().withProperty(BlockOres.VARIANT, EnumHandler.EnumType.COPPER),12,BlockMatcher.forBlock(Blocks.NETHERRACK));
		ore_overworld_copper = new WorldGenMinable(BlockInit.ORE_OVERWORLD.getDefaultState().withProperty(BlockOres.VARIANT, EnumHandler.EnumType.COPPER),6,BlockMatcher.forBlock(Blocks.STONE));
		
		ore_nether_lead= new WorldGenMinable(BlockInit.ORE_NETHER.getDefaultState().withProperty(BlockOres.VARIANT, EnumHandler.EnumType.LEAD),8,BlockMatcher.forBlock(Blocks.NETHERRACK));
		ore_overworld_lead = new WorldGenMinable(BlockInit.ORE_OVERWORLD.getDefaultState().withProperty(BlockOres.VARIANT, EnumHandler.EnumType.LEAD),4,BlockMatcher.forBlock(Blocks.STONE));
		
		ore_nether_mercury= new WorldGenMinable(BlockInit.ORE_NETHER.getDefaultState().withProperty(BlockOres.VARIANT, EnumHandler.EnumType.MERCURY),4,BlockMatcher.forBlock(Blocks.NETHERRACK));
		ore_overworld_mercury = new WorldGenMinable(BlockInit.ORE_OVERWORLD.getDefaultState().withProperty(BlockOres.VARIANT, EnumHandler.EnumType.MERCURY),4,BlockMatcher.forBlock(Blocks.STONE));
		
		ore_nether_saltpeter= new WorldGenMinable(BlockInit.ORE_NETHER.getDefaultState().withProperty(BlockOres.VARIANT, EnumHandler.EnumType.SALTPETER),15,BlockMatcher.forBlock(Blocks.NETHERRACK));
		ore_overworld_saltpeter = new WorldGenMinable(BlockInit.ORE_OVERWORLD.getDefaultState().withProperty(BlockOres.VARIANT, EnumHandler.EnumType.SALTPETER),10,BlockMatcher.forBlock(Blocks.STONE));
		
		ore_nether_sulfur= new WorldGenMinable(BlockInit.ORE_NETHER.getDefaultState().withProperty(BlockOres.VARIANT, EnumHandler.EnumType.SULFUR),15,BlockMatcher.forBlock(Blocks.NETHERRACK));
		ore_overworld_sulfur = new WorldGenMinable(BlockInit.ORE_OVERWORLD.getDefaultState().withProperty(BlockOres.VARIANT, EnumHandler.EnumType.SULFUR),10,BlockMatcher.forBlock(Blocks.STONE));
		
		ore_nether_zinc= new WorldGenMinable(BlockInit.ORE_NETHER.getDefaultState().withProperty(BlockOres.VARIANT, EnumHandler.EnumType.ZINC),5,BlockMatcher.forBlock(Blocks.NETHERRACK));
		ore_overworld_zinc = new WorldGenMinable(BlockInit.ORE_OVERWORLD.getDefaultState().withProperty(BlockOres.VARIANT, EnumHandler.EnumType.ZINC),5,BlockMatcher.forBlock(Blocks.STONE));
	}
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator,
			IChunkProvider chunkProvider)
	{
		switch(world.provider.getDimension())
		{	
		case -1:
			runGenerator(ore_nether_copper,world,random, chunkX, chunkZ ,10,0,128);
			runGenerator(ore_nether_lead,world,random, chunkX, chunkZ ,6,0,128);
			runGenerator(ore_nether_mercury,world,random, chunkX, chunkZ ,5,0,128);
			runGenerator(ore_nether_saltpeter,world,random, chunkX, chunkZ ,10,0,31);
			runGenerator(ore_nether_sulfur,world,random, chunkX, chunkZ ,10,0,31);
			runGenerator(ore_nether_zinc,world,random, chunkX, chunkZ ,6,0,128);
			break;
		case 0:
			runGenerator(ore_overworld_copper,world,random, chunkX, chunkZ ,20,0,80);
			runGenerator(ore_overworld_lead,world,random, chunkX, chunkZ ,12,0,60);
			runGenerator(ore_overworld_mercury,world,random, chunkX, chunkZ ,5,0,16);
			runGenerator(ore_overworld_saltpeter,world,random, chunkX, chunkZ ,8,0,32);
			runGenerator(ore_overworld_sulfur,world,random, chunkX, chunkZ ,8,0,16);
			runGenerator(ore_overworld_zinc,world,random, chunkX, chunkZ ,5,0,60);
			break;
		}
	}
	
	private void runGenerator(WorldGenerator gen, World world, Random rand, int chunkX, int chunkZ, int chance, int minHeight, int maxHeight)
	{
		if(minHeight > maxHeight || minHeight < 0 || maxHeight > 256) throw new IllegalArgumentException("Ore generated out of bounds");
		
		int heightDiff = maxHeight - minHeight +1;
		for(int i = 0; i<chance; i++)
		{
			int x = chunkX * 16 + rand.nextInt(16);
			int y = minHeight + rand.nextInt(heightDiff);
			int z = chunkZ * 16 + rand.nextInt(16);
			
			gen.generate(world, rand, new BlockPos(x,y,z));
		}
	}
}
