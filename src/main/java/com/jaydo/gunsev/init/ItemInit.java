package com.jaydo.gunsev.init;

import java.util.ArrayList;
import java.util.List;

import com.jaydo.gunsev.objects.items.ItemBase;

import net.minecraft.item.Item;

public class ItemInit
{
	public static final List<Item> ITEMS = new ArrayList<Item>();	
	
	public static final Item INGOT_COPPER = new ItemBase("ingot_copper");
	public static final Item INGOT_ZINC = new ItemBase("ingot_zinc");
	public static final Item INGOT_STEEL = new ItemBase("ingot_steel");
	public static final Item INGOT_MERCURY = new ItemBase("ingot_mercury");
	public static final Item INGOT_BRASS = new ItemBase("ingot_brass");
	public static final Item INGOT_LEAD = new ItemBase("ingot_lead");
	
	
}
