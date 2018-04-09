package com.randomdumps.mod.blocks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import com.randomdumps.mod.RandomDumps;
import com.randomdumps.mod.Reference;
import com.randomdumps.mod.blocks.BlockConcrete.EnumColor;

import net.minecraft.block.BlockColored;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.BakedQuad;
import net.minecraft.client.renderer.block.model.IBakedModel;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms;
import net.minecraft.client.renderer.block.model.ItemOverride;
import net.minecraft.client.renderer.block.model.ItemOverrideList;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.renderer.vertex.VertexFormat;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.client.model.pipeline.UnpackedBakedQuad;

public class BlockUnrational extends BlockColored
{
	private static VertexFormat format;
	private static TextureAtlasSprite base, overlay;
	private static String unrationalDesc;
	
	public static final PropertyEnum<EnumDyeColor> COLOR = PropertyEnum.<EnumDyeColor>create("color", EnumDyeColor.class);

	public BlockUnrational() {
		super(Material.ROCK);
		setUnlocalizedName(Reference.DumpBlocks.UNRATIONAL.getUnlocalizedName());
		setRegistryName(Reference.DumpBlocks.UNRATIONAL.getRegistryName());
		setCreativeTab(RandomDumps.RANDOM_TAB);
		setSoundType(blockSoundType.STONE);
		setHardness(1.5F);
	}
	
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par2List, boolean par4)
	{
		par2List.add("\u00a7a" + I18n.format("unrational.desc"));
	}
	//"Even the name is ÅòkUnrationalÅòr !"
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
