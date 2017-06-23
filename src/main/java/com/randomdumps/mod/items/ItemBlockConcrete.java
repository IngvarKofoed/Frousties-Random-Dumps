package com.randomdumps.mod.items;

import com.randomdumps.mod.Reference;
import com.randomdumps.mod.blocks.BlockConcrete;

import net.minecraft.block.Block;
import net.minecraft.item.ItemCloth;
import net.minecraft.item.ItemStack;

public class ItemBlockConcrete extends ItemCloth {

	public ItemBlockConcrete(Block block) {
		super(block);
	    this.setMaxDamage(0);
	    this.setHasSubtypes(true);
	    
		setRegistryName(Reference.DumpItems.CONCRETE.getRegistryName());
	}
	
	@Override
	public int getMetadata(int metadata)
	{
		return metadata;
	}
	
	@Override
	public String getUnlocalizedName(ItemStack stack)
	{
		BlockConcrete.EnumColor color = BlockConcrete.EnumColor.byMetadata(stack.getMetadata());
		return super.getUnlocalizedName() + "." + color.toString();
	}
}
