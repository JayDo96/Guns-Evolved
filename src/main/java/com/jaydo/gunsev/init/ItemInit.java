package com.jaydo.gunsev.init;

import java.util.ArrayList;
import java.util.List;

import com.jaydo.gunsev.objects.items.ItemBase;

import net.minecraft.item.Item;

public class ItemInit
{
	//list of all items to be registered
	public static final List<Item> ITEMS = new ArrayList<Item>();	
	//ingot declaration
	public static final Item INGOT_COPPER = new ItemBase("ingot_copper");
	public static final Item INGOT_ZINC = new ItemBase("ingot_zinc");
	public static final Item INGOT_STEEL = new ItemBase("ingot_steel");
	public static final Item INGOT_MERCURY = new ItemBase("ingot_mercury");
	public static final Item INGOT_BRASS = new ItemBase("ingot_brass");
	public static final Item INGOT_LEAD = new ItemBase("ingot_lead");
	//dust declaration
	public static final Item DUST_SALTPETER = new ItemBase("dust_saltpeter");
	public static final Item DUST_SULFUR = new ItemBase("dust_sulfur");
	public static final Item DUST_SMOKELESS = new ItemBase("dust_smokeless");
	public static final Item DUST_SMOKELESS_CHARGE = new ItemBase("dust_smokeless_charge");
	public static final Item DUST_GUNPOWDER_CHARGE = new ItemBase("dust_gunpowder_charge");
	public static final Item DUST_PRIMER = new ItemBase("dust_primer");
	//nug declaration
	public static final Item NUGGET_COPPER = new ItemBase("nugget_copper");
	public static final Item NUGGET_ZINC = new ItemBase("nugget_zinc");
	public static final Item NUGGET_STEEL = new ItemBase("nugget_steel");
	public static final Item NUGGET_BRASS = new ItemBase("nugget_brass");
	public static final Item NUGGET_LEAD = new ItemBase("nugget_lead");
	//misc item decleration
	public static final Item ITEM_PERCUSSION_CAP = new ItemBase("item_percussion_cap");
	//cast item declartion
	public static final Item CAST_SMALL_BALL = new ItemBase("cast_small_ball");
	public static final Item CAST_MEDIUM_BALL = new ItemBase("cast_medium_ball");
	public static final Item CAST_LARGE_BALL = new ItemBase("cast_large_ball");
	// ammo item declaration
	public static final Item AMMO_BALL_LEAD_SMALL = new ItemBase("ammo_ball_lead_small");
	public static final Item AMMO_BALL_LEAD_MEDIUM = new ItemBase("ammo_ball_lead_medium");
	public static final Item AMMO_BALL_LEAD_LARGE = new ItemBase("ammo_ball_lead_large");
	
	
	
}
