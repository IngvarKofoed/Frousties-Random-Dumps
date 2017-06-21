package com.randomdumps.mod;

import com.randomdumps.mod.init.RandomItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class RandomTab extends CreativeTabs {

	public RandomTab() {
		super("tabRandom");
	}

	@Override
	public Item getTabIconItem() {
		return RandomItems.itemFrosties;
	}
	
}
