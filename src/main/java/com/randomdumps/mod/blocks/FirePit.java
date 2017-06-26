package com.randomdumps.mod.blocks;

import java.util.List;

import com.randomdumps.mod.RandomDumps;
import com.randomdumps.mod.Reference;
import com.randomdumps.mod.init.RandomBlocks;
import com.randomdumps.mod.init.RandomSounds;
import com.randomdumps.mod.tileentity.TileEntityFirePit;

import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class FirePit extends Block implements ITileEntityProvider {
	
	//1/16 = 0.0625
	
	private static final AxisAlignedBB BOUNDING_BOX = new AxisAlignedBB(0, 0, 0, 1, 0.0625 * 2, 1);
	private static final AxisAlignedBB COLLISION_BOX = new AxisAlignedBB(0, 0, 0, 1, 0.0625 * 2, 1);
	
	public FirePit() {
		super(Material.WOOD);
		setUnlocalizedName(Reference.DumpBlocks.FIREPIT.getUnlocalizedName());
		setRegistryName(Reference.DumpBlocks.FIREPIT.getRegistryName());
		setCreativeTab(RandomDumps.RANDOM_TAB);
		setHardness(0.8F);
		setSoundType(blockSoundType.WOOD);
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
		return BlockRenderLayer.CUTOUT;
	}
	
	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
		return BOUNDING_BOX;
	}
	
	@Override
	public void addCollisionBoxToList(IBlockState state, World worldIn, BlockPos pos, AxisAlignedBB entityBox, List<AxisAlignedBB> collidingBoxes, Entity entityIn) {
		super.addCollisionBoxToList(pos, entityBox, collidingBoxes, COLLISION_BOX);
	}

	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, ItemStack heldItem, EnumFacing side, float hitX, float hitY, float hitZ) {
		if(!worldIn.isRemote) {
			TileEntity tileEntity = worldIn.getTileEntity(pos);
			if(tileEntity instanceof TileEntityFirePit) {
				TileEntityFirePit firePit = (TileEntityFirePit) tileEntity;
				if(heldItem != null) {
					if(heldItem.getItem() == Item.getItemFromBlock(RandomBlocks.blockPaper)) {
						if(firePit.addFuel() && TileEntityFirePit.fuelCount <= 4) {
							heldItem.stackSize--;
							return true;
						} else { return true; }
					}
				}
				firePit.removeFuel();
				Item.getItemFromBlock(RandomBlocks.blockPaper);
			}
		}
		return true;
	}
	
	public TileEntity createTileEntity(World world, IBlockState state) {
		return new TileEntityFirePit();
	}
	
	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return new TileEntityFirePit();
	}
	
	@Override
	public void breakBlock(World worldIn, BlockPos pos, IBlockState state) {
	    if (!worldIn.isRemote){
	        TileEntity tileEntity = worldIn.getTileEntity(pos);
	           
	        if (tileEntity instanceof TileEntityFirePit){
	        	TileEntityFirePit firePit = (TileEntityFirePit) tileEntity;
	               
	            while (TileEntityFirePit.fuelCount > 0) {
	            	firePit.removeFuel();
	            }
	        }
	    }
	    super.breakBlock(worldIn, pos, state);
	}
}
