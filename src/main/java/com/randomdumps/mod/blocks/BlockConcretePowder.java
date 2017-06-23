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
	}
	
	public static enum EnumColor implements IStringSerializable
	{
		BLUE(0, "blue"),
	    RED(1, "red"),
	    GREEN(2, "green"),
	    YELLOW(3, "yellow");

		public int getMetadata()
		{
			return this.meta;
		}

	    @Override
	    public String toString()
	    {
	    	return this.name;
	    }

	    public static EnumColor byMetadata(int meta)
	    {
	    	if (meta < 0 || meta >= META_LOOKUP.length)
	    	{
	    		meta = 0;
	    	}

	    	return META_LOOKUP[meta];
	    }

	    public String getName()
	    {
	    	return this.name;
	    }

	    private final int meta;
	    private final String name;
	    private static final EnumColor[] META_LOOKUP = new EnumColor[values().length];

	    private EnumColor(int i_meta, String i_name)
	    {
	    	this.meta = i_meta;
	    	this.name = i_name;
	    }

	    static
	    {
	    	for (EnumColor color : values()) {
	    		META_LOOKUP[color.getMetadata()] = color;
	    	}
	    }
	}
}
