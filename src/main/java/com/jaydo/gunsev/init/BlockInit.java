package com.jaydo.gunsev.init;

import java.util.ArrayList;
import java.util.List;

import com.jaydo.gunsev.objects.blocks.BlockBase;
import com.jaydo.gunsev.objects.blocks.BlockOres;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockInit 
{
	//list full of all blocks to be registered
	 public static final List<Block> BLOCKS = new ArrayList<Block>();
	 // Ore block declaration
	 public static final Block ORE_OVERWORLD = new BlockOres("ore_overworld", "overworld");
	 public static final Block ORE_NETHER = new BlockOres("ore_nether", "nether");
	 
	 // ingot block declaration
	 public static final Block BLOCK_COPPER = new BlockBase("block_copper", Material.IRON);
	 public static final Block BLOCK_ZINC = new BlockBase("block_zinc", Material.IRON);
	 public static final Block BLOCK_STEEL = new BlockBase("block_steel", Material.IRON);
	 public static final Block BLOCK_MERCURY = new BlockBase("block_mercury", Material.IRON);
	 public static final Block BLOCK_BRASS = new BlockBase("block_brass", Material.IRON);
	 public static final Block BLOCK_LEAD = new BlockBase("block_lead", Material.IRON);
	 // dust block declaration
	 public static final Block BLOCK_SALTPETER = new BlockBase("block_saltpeter", Material.ROCK);
	 public static final Block BLOCK_SULFUR = new BlockBase("block_sulfur", Material.ROCK);
}
