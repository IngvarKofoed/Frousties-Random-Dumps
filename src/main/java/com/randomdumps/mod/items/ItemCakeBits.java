package com.randomdumps.mod.items;

import com.randomdumps.mod.RandomDumps;
import com.randomdumps.mod.Reference;

import net.minecraft.item.ItemFood;

public class ItemCakeBits extends ItemFood {

	public ItemCakeBits() {
		super(2, 0.1F, false);
		setUnlocalizedName(Reference.DumpItems.CAKE_BITS.getUnlocalizedName());
		setRegistryName(Reference.DumpItems.CAKE_BITS.getRegistryName());
		setCreativeTab(RandomDumps.RANDOM_TAB);
	}
}
