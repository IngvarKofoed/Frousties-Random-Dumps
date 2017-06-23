package com.randomdumps.mod.blocks;

import com.randomdumps.mod.RandomDumps;
import com.randomdumps.mod.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockConcrete extends Block {
	public BlockConcrete() {
		super(Material.ROCK);
		setUnlocalizedName(Reference.DumpBlocks.CONCRETE.getUnlocalizedName());
		setRegistryName(Reference.DumpBlocks.CONCRETE.getRegistryName());
		setCreativeTab(RandomDumps.RANDOM_TAB);
		setSoundType(blockSoundType.STONE);
	}
}
