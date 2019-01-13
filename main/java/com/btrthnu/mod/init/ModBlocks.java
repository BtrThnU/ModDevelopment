package com.btrthnu.mod.init;

import java.util.ArrayList;
import java.util.List;

import com.btrthnu.mod.objects.blocks.CopperBlock;
import com.btrthnu.mod.objects.blocks.machines.furnace.BlockBlastFurnace;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//Furnace
	public static final Block BLAST_FURNACE = new BlockBlastFurnace("blast_furnace");
	
	//Blocks
	public static final Block COPPER_BLOCK = new CopperBlock("copper_block", Material.IRON);
}