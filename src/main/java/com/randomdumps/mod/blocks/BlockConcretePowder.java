package com.randomdumps.mod.blocks;

import com.randomdumps.mod.RandomDumps;
import com.randomdumps.mod.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockConcretePowder extends Block {
	public BlockConcretePowder() {
		super(Material.GROUND);
		setUnlocalizedName(Reference.DumpBlocks.CONCRETE_POWDER.getUnlocalizedName());
		setRegistryName(Reference.DumpBlocks.CONCRETE_POWDER.getRegistryName());
		setCreativeTab(RandomDumps.RANDOM_TAB);
		setSoundType(blockSoundType.GROUND);
	}
}
