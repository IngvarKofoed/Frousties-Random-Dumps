package com.randomdumps.mod.items;

import com.randomdumps.mod.Reference;
import com.randomdumps.mod.blocks.BlockConcretePowder;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemCloth;
import net.minecraft.item.ItemStack;

public class ItemBlockConcrete extends ItemCloth {

	public ItemBlockConcrete(Block block) {
		super(block);
	    this.setMaxDamage(0);
	    this.setHasSubtypes(true);
	    
		setRegistryName(Reference.DumpItems.CONCRETE_POWDER.getRegistryName());
	}
	
	@Override
	public int getMetadata(int metadata)
	{
		return metadata;
	}
	
	@Override
	public String getUnlocalizedName(ItemStack stack)
	{
		BlockConcretePowder.EnumColor color = BlockConcretePowder.EnumColor.byMetadata(stack.getMetadata());
		return super.getUnlocalizedName() + "." + color.toString();
	}
}
