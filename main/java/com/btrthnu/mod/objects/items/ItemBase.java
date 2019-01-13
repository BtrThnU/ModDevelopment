package com.btrthnu.mod.objects.items;

import com.btrthnu.mod.Main;
import com.btrthnu.mod.init.ModItems;
import com.btrthnu.mod.util.IHasModel;

import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel 
{
	public ItemBase(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.CREATIVE_TAB);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
