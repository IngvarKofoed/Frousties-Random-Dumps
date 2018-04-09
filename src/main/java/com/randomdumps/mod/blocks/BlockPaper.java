package com.randomdumps.mod.blocks;

import java.util.Random;

import com.randomdumps.mod.RandomDumps;
import com.randomdumps.mod.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

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
