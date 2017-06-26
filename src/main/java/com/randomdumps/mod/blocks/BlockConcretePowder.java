package com.randomdumps.mod.blocks;

import java.util.Random;

import com.randomdumps.mod.RandomDumps;
import com.randomdumps.mod.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.BlockColored;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.item.EntityFallingBlock;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockConcretePowder extends BlockColored {
	public static final PropertyEnum<EnumDyeColor> COLOR = PropertyEnum.<EnumDyeColor>create("color", EnumDyeColor.class);
	public static boolean fallInstantly;
	
	public BlockConcretePowder() {
		super(Material.SAND);
		setUnlocalizedName(Reference.DumpBlocks.CONCRETE_POWDER.getUnlocalizedName());
		setRegistryName(Reference.DumpBlocks.CONCRETE_POWDER.getRegistryName());
		setCreativeTab(RandomDumps.RANDOM_TAB);
		setSoundType(blockSoundType.GROUND);
		setHardness(0.6F);
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
	
	public void onBlockAdded(World worldIn, BlockPos pos, IBlockState state)
    {
        worldIn.scheduleUpdate(pos, this, this.tickRate(worldIn));
    }
	
	public void neighborChanged(IBlockState state, World worldIn, BlockPos pos, Block blockIn)
    {
        worldIn.scheduleUpdate(pos, this, this.tickRate(worldIn));
    }

    public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand)
    {
        if (!worldIn.isRemote)
        {
            this.checkFallable(worldIn, pos);
        }
    }

    private void checkFallable(World worldIn, BlockPos pos)
    {
        if ((worldIn.isAirBlock(pos.down()) || canFallThrough(worldIn.getBlockState(pos.down()))) && pos.getY() >= 0)
        {
            int i = 32;

            if (!fallInstantly && worldIn.isAreaLoaded(pos.add(-32, -32, -32), pos.add(32, 32, 32)))
            {
                if (!worldIn.isRemote)
                {
                    EntityFallingBlock entityfallingblock = new EntityFallingBlock(worldIn, (double)pos.getX() + 0.5D, (double)pos.getY(), (double)pos.getZ() + 0.5D, worldIn.getBlockState(pos));
                    this.onStartFalling(entityfallingblock);
                    worldIn.spawnEntityInWorld(entityfallingblock);
                }
            }
            else
            {
                IBlockState state = worldIn.getBlockState(pos);
                worldIn.setBlockToAir(pos);
                BlockPos blockpos;

                for (blockpos = pos.down(); (worldIn.isAirBlock(blockpos) || canFallThrough(worldIn.getBlockState(blockpos))) && blockpos.getY() > 0; blockpos = blockpos.down())
                {
                    ;
                }

                if (blockpos.getY() > 0)
                {
                    worldIn.setBlockState(blockpos.up(), state); //Forge: Fix loss of state information during world gen.
                }
            }
        }
    }
    
    protected void onStartFalling(EntityFallingBlock fallingEntity)
    {
    }
    
    public int tickRate(World worldIn)
    {
        return 2;
    }

    public static boolean canFallThrough(IBlockState state)
    {
        Block block = state.getBlock();
        Material material = state.getMaterial();
        return block == Blocks.FIRE || material == Material.AIR || material == Material.WATER || material == Material.LAVA;
    }

    public void onEndFalling(World worldIn, BlockPos pos)
    {
    }

    @SideOnly(Side.CLIENT)
    public void randomDisplayTick(IBlockState stateIn, World worldIn, BlockPos pos, Random rand)
    {
        if (rand.nextInt(16) == 0)
        {
            BlockPos blockpos = pos.down();

            if (canFallThrough(worldIn.getBlockState(blockpos)))
            {
                double d0 = (double)((float)pos.getX() + rand.nextFloat());
                double d1 = (double)pos.getY() - 0.05D;
                double d2 = (double)((float)pos.getZ() + rand.nextFloat());
                worldIn.spawnParticle(EnumParticleTypes.FALLING_DUST, d0, d1, d2, 0.0D, 0.0D, 0.0D, new int[] {Block.getStateId(stateIn)});
            }
        }
    }
}
