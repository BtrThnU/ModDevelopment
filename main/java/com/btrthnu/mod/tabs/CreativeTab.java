package com.btrthnu.mod.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class CreativeTab extends CreativeTabs
{
	public CreativeTab(String label) 
	{
		super("items");
		this.setBackgroundImageName("items");
	}

	@Override
	public ItemStack getTabIconItem() 
	{
	    return new ItemStack(Item.getByNameOrId("md:ingot_copper"));
	}
}