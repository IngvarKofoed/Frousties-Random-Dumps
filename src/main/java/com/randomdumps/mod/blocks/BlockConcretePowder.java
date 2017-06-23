package com.randomdumps.mod.blocks;

import java.util.List;

import com.randomdumps.mod.RandomDumps;
import com.randomdumps.mod.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.BlockColored;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

public class BlockConcretePowder extends BlockColored {
	
	public static final PropertyEnum<EnumDyeColor> COLOR = PropertyEnum.<EnumDyeColor>create("color", EnumDyeColor.class);
	
	public BlockConcretePowder() {
		super(Material.SAND);
		setUnlocalizedName(Reference.DumpBlocks.CONCRETE_POWDER.getUnlocalizedName());
		setRegistryName(Reference.DumpBlocks.CONCRETE_POWDER.getRegistryName());
		setCreativeTab(RandomDumps.RANDOM_TAB);
		setSoundType(blockSoundType.GROUND);
		
		this.setDefaultState(this.blockState.getBaseState().withProperty(COLOR, EnumDyeColor.WHITE));
	}
	
	public MapColor getMapColor(IBlockState state)
    {
        return ((EnumDyeColor)state.getValue(COLOR)).getMapColor();
    }
	
	@Override
    public int getMetaFromState(IBlockState state) {
        return state.getValue(COLOR).getDyeDamage();
    }
   
    @Override
    public IBlockState getStateFromMeta(int meta) {
        return getDefaultState().withProperty(COLOR, EnumDyeColor.byDyeDamage(meta));
    }
   
    @Override
    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, COLOR);
    }
   
    @Override
    public boolean isFullCube(IBlockState state) {
        return false;
    }
   
    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }
   
    @Override
    public BlockRenderLayer getBlockLayer() {
        return BlockRenderLayer.SOLID;
    }
}
