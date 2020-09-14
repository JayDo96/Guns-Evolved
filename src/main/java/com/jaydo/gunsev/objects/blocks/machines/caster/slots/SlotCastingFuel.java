package com.jaydo.gunsev.objects.blocks.machines.caster.slots;

import com.jaydo.gunsev.objects.blocks.machines.caster.TileEntityCaster;

import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class SlotCastingFuel extends Slot
{

	public SlotCastingFuel(IInventory inventoryIn, int index, int x, int y) {
		super(inventoryIn, index, x, y);
	}
	@Override
	public boolean isItemValid(ItemStack stack) {

		return TileEntityCaster.isItemFuel(stack);
	}
	
	@Override
	public int getItemStackLimit(ItemStack stack) {
		return super.getItemStackLimit(stack);
	}
}
