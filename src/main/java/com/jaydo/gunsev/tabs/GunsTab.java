package com.jaydo.gunsev.tabs;

import com.jaydo.gunsev.init.ItemInit;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class GunsTab extends CreativeTabs
{
	public GunsTab(String label) 
	{
		super("gunstab");
		//this.setBackgroundImageName("texturename");		
	}

	@Override
	public ItemStack getTabIconItem() 
	{
		return new ItemStack(ItemInit.INGOT_LEAD);
	}
}
