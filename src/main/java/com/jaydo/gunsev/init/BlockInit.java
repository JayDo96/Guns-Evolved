package com.jaydo.gunsev.init;

import java.util.ArrayList;
import java.util.List;

import com.jaydo.gunsev.objects.blocks.BlockBase;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockInit 
{
	 public static final List<Block> BLOCKS = new ArrayList<Block>();
	 
	 public static final Block BLOCK_COPPER = new BlockBase("block_copper", Material.IRON);
	 public static final Block BLOCK_ZINC = new BlockBase("block_zinc", Material.IRON);
	 public static final Block BLOCK_STEEL = new BlockBase("block_steel", Material.IRON);
	 public static final Block BLOCK_MERCURY = new BlockBase("block_mercury", Material.IRON);
	 public static final Block BLOCK_BRASS = new BlockBase("block_brass", Material.IRON);
	 public static final Block BLOCK_LEAD = new BlockBase("block_lead", Material.IRON);
}
