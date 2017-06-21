package com.randomdumps.mod.items;

import com.randomdumps.mod.RandomDumps;
import com.randomdumps.mod.Reference;

import net.minecraft.item.Item;

public class ItemFrosties extends Item {
	public ItemFrosties() {
		setUnlocalizedName(Reference.DumpItems.FROSTIES.getUnlocalizedName());
		setRegistryName(Reference.DumpItems.FROSTIES.getRegistryName());
		setCreativeTab(RandomDumps.RANDOM_TAB);
	}
}
