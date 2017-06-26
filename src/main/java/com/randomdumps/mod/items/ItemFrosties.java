package com.randomdumps.mod.items;

import com.randomdumps.mod.RandomDumps;
import com.randomdumps.mod.Reference;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

public class ItemFrosties extends Item {
	public ItemFrosties() {
		setUnlocalizedName(Reference.DumpItems.FROSTIES.getUnlocalizedName());
		setRegistryName(Reference.DumpItems.FROSTIES.getRegistryName());
		setCreativeTab(RandomDumps.RANDOM_TAB);
	}
	
//	@Override
//	public boolean hasContainerItem() { return true; }
//	
//	public ItemStack getContainerItemStack(ItemStack itemStack)
//	{
//		ItemStack returnItem = new ItemStack(itemStack.getItem(), 1, itemStack.getItemDamage()+1);
//		
//		if (itemStack.isItemEnchanted())
//		{
//			NBTTagCompound nbtcompound = itemStack.getTagCompound();
//			returnItem.setTagCompound(nbtcompound);
//		}
//	return returnItem;
//	}
}
