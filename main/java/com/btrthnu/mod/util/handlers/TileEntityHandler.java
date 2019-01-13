package com.btrthnu.mod.util.handlers;

import com.btrthnu.mod.tileentitys.TileEntityBlastFurnace;
import com.btrthnu.mod.util.Reference;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TileEntityHandler 
{
	public static void registerTileEntities()
	{
		GameRegistry.registerTileEntity(TileEntityBlastFurnace.class, "blast_furnace");
	}
}