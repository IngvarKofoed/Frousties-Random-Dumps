package com.randomdumps.mod.items;

import com.randomdumps.mod.RandomDumps;
import com.randomdumps.mod.Reference;

import net.minecraft.item.ItemFood;

public class ItemFrostiesBowl extends ItemFood {
	public ItemFrostiesBowl() {
		super(6, 1.0F, false);
		setUnlocalizedName(Reference.DumpItems.FROSTIES_BOWL.getUnlocalizedName());
		setRegistryName(Reference.DumpItems.FROSTIES_BOWL.getRegistryName());
		setCreativeTab(RandomDumps.RANDOM_TAB);
	}
}
