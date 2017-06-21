package com.randomdumps.mod.blocks;

import com.randomdumps.mod.RandomDumps;
import com.randomdumps.mod.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.BlockRenderLayer;

public class BlockPaper extends Block {

	public BlockPaper() {
		super(Material.CLOTH);
		setUnlocalizedName(Reference.DumpBlocks.PAPER.getUnlocalizedName());
		setRegistryName(Reference.DumpBlocks.PAPER.getRegistryName());
		setCreativeTab(RandomDumps.RANDOM_TAB);
		setHardness(0.1F);
		setSoundType(blockSoundType.PLANT);
	}
	
	@Override
	public BlockRenderLayer getBlockLayer() {
		return BlockRenderLayer.SOLID;
	}
}
