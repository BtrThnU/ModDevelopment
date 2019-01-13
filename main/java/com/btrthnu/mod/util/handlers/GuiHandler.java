package com.btrthnu.mod.util.handlers;

import com.btrthnu.mod.containers.ContainerBlastFurnace;
import com.btrthnu.mod.objects.blocks.machines.furnace.gui.GuiBlastFurnace;
import com.btrthnu.mod.tileentitys.TileEntityBlastFurnace;
import com.btrthnu.mod.util.Reference;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler
{
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
	{
		if(ID == Reference.GUI_BLAST_FURNACE) return new ContainerBlastFurnace(player.inventory, (TileEntityBlastFurnace)world.getTileEntity(new BlockPos(x,y,z)));
		return null;
	}
	
	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
	{
		if(ID == Reference.GUI_BLAST_FURNACE) return new GuiBlastFurnace(player.inventory, (TileEntityBlastFurnace)world.getTileEntity(new BlockPos(x,y,z)));
		return null;
	}
}