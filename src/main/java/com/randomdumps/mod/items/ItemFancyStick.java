package com.randomdumps.mod.items;

import com.randomdumps.mod.RandomDumps;
import com.randomdumps.mod.Reference;

import net.minecraft.item.Item;

public class ItemFancyStick extends Item {
	public ItemFancyStick() {
		setUnlocalizedName(Reference.DumpItems.FANCY_STICK.getUnlocalizedName());
		setRegistryName(Reference.DumpItems.FANCY_STICK.getRegistryName());
		setCreativeTab(RandomDumps.RANDOM_TAB);
	}
}
