package com.jaydo.gunsev.objects.items;

import com.jaydo.gunsev.Main;
import com.jaydo.gunsev.init.ItemInit;
import com.jaydo.gunsev.util.IHasModel;
import com.jaydo.gunsev.util.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

public class ItemBase extends Item implements IHasModel
{

	public ItemBase(String name) 
	{
		ResourceLocation resource = new ResourceLocation(Reference.MODID, name);
		setUnlocalizedName(name);
		setRegistryName(resource);
		setCreativeTab(CreativeTabs.MATERIALS);
		ItemInit.ITEMS.add(this);
	}

	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
		
	}

}
