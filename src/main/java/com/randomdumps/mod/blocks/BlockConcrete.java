package com.randomdumps.mod.blocks;

import com.randomdumps.mod.RandomDumps;
import com.randomdumps.mod.Reference;

import net.minecraft.block.BlockColored;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.util.IStringSerializable;

public class BlockConcrete extends BlockColored {
	public static final PropertyEnum<EnumDyeColor> COLOR = PropertyEnum.<EnumDyeColor>create("color", EnumDyeColor.class);

	public BlockConcrete() {
		super(Material.ROCK);
		setUnlocalizedName(Reference.DumpBlocks.CONCRETE.getUnlocalizedName());
		setRegistryName(Reference.DumpBlocks.CONCRETE.getRegistryName());
		setCreativeTab(RandomDumps.RANDOM_TAB);
		setSoundType(blockSoundType.STONE);
	}
	
	public static enum EnumColor implements IStringSerializable
	{
		WHITE(0, "white"),
		ORANGE(1, "orange"),
		MAGENTA(2, "magenta"),
		LIGHT_BLUE(3, "light_blue"),
		YELLOW(4, "yellow"),
		LIME(5, "lime"),
		PINK(6, "pink"),
		GRAY(7, "gray"),
		SILVER(8, "silver"),
	    CYAN(9, "cyan"),
	    PURPLE(10, "purple"),
	    BLUE(11, "blue"),
		BROWN(12, "brown"),
	    GREEN(13, "green"),
	    RED(14, "red"),
	    BLACK(15, "black");

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
