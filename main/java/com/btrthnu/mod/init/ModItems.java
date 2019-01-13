package com.btrthnu.mod.init;

import java.util.ArrayList;
import java.util.List;

import com.btrthnu.mod.objects.items.ItemBase;

import net.minecraft.item.Item;

public class ModItems 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Lump
	public static final Item COPPER_LUMP = new ItemBase("copper_lump");
	
	//Ingot
	public static final Item COPPER_INGOT = new ItemBase("copper_ingot");
}
