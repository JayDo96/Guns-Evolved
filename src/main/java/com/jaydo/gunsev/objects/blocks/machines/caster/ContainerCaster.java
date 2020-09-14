package com.jaydo.gunsev.objects.blocks.machines.caster;

import com.jaydo.gunsev.objects.blocks.machines.caster.slots.SlotCastingFuel;
import com.jaydo.gunsev.objects.blocks.machines.caster.slots.SlotCastingOutput;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;

public class ContainerCaster extends Container
{
	private final TileEntityCaster tileentity;
	private int cookTime, totalCookTime, burnTime, currentBurnTime;
	
	public ContainerCaster(InventoryPlayer player, TileEntityCaster tileentity) 
	{
		this.tileentity = tileentity;
		this.addSlotToContainer(new Slot(tileentity, 0, 26, 11));
		this.addSlotToContainer(new Slot(tileentity, 1, 26, 59));
		this.addSlotToContainer(new SlotCastingFuel(tileentity, 2, 7, 35));
		this.addSlotToContainer(new SlotCastingOutput(player.player, tileentity, 3, 81, 36));
		
		for(int y = 0; y<3; y++)
		{
			for(int x = 0; x <9; x++)
			{
				this.addSlotToContainer(new Slot(player, x+y*9+9, 8+x*18, 84+y*18));
			}
		}
		for(int x = 0; x<9; x++)
		{
			this.addSlotToContainer(new Slot(player,x,8+x*18,142));
		}
	}
	
	
	
}
