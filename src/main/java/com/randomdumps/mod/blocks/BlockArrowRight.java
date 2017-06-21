package com.randomdumps.mod.blocks;
 
import com.randomdumps.mod.RandomDumps;
import com.randomdumps.mod.Reference;

import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
 
public class BlockArrowRight extends BlockHorizontal {
   
    //Tried to set a variable for vertical values
    //public static final PropertyDirection ORIENT = PropertyDirection.create("orient", EnumFacing.Plane.VERTICAL);
   
    private static AxisAlignedBB BOUNDING_BOX_EAST_WALL = new AxisAlignedBB(1, 0.0625*7, 0, 0.0625 * 14, 0.0625 * 15, 1);
    private static AxisAlignedBB BOUNDING_BOX_SOUTH_WALL = new AxisAlignedBB(0, 0.0625*7, 1, 1, 0.0625 * 15, 0.0625 * 14);
    private static AxisAlignedBB BOUNDING_BOX_WEST_WALL = new AxisAlignedBB(0, 0.0625*7, 0, 0.0625 * 2, 1, 1);
    private static AxisAlignedBB BOUNDING_BOX_NORTH_WALL = new AxisAlignedBB(0, 0.0625*7, 0, 1, 0.0625 * 15, 0.0625 * 2);
   
    private static AxisAlignedBB BOUNDING_BOX_EAST = new AxisAlignedBB(0.0625 * 11, 0, 0, 0.0625 * 8, 1, 1);
    private static AxisAlignedBB BOUNDING_BOX_SOUTH = new AxisAlignedBB(0, 0, 0.0625 * 11, 1, 1, 0.0625 * 8);
    private static AxisAlignedBB BOUNDING_BOX_WEST = new AxisAlignedBB(0.0625 * 8, 0, 0, 0.0625 * 5, 1, 1);
    private static AxisAlignedBB BOUNDING_BOX_NORTH = new AxisAlignedBB(0, 0, 0.0625 * 8, 1, 1, 0.0625 * 5);
   
    public BlockArrowRight() {
        super(Material.WOOD);
        setUnlocalizedName(Reference.DumpBlocks.ARROW_RIGHT.getUnlocalizedName());
        setRegistryName(Reference.DumpBlocks.ARROW_RIGHT.getRegistryName());
        setCreativeTab(RandomDumps.RANDOM_TAB);
        setHardness(0.8F);
        setSoundType(blockSoundType.WOOD);
        setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.EAST));
    }
 
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
        //Detect if the block is facing up, if not, consider it's fixed to a wall
        //if((EnumFacing)state.getValue(FACING) != EnumFacing.UP) {
            switch ((EnumFacing)state.getValue(FACING)) {
                case NORTH:
                    return BOUNDING_BOX_NORTH;
                case SOUTH:
                    return BOUNDING_BOX_SOUTH;
                case WEST:
                    return BOUNDING_BOX_WEST;
                case EAST:
                default:
                    return BOUNDING_BOX_EAST;
            }
        //} else { switch ((EnumFacing)state.getValue(FACING)) {
//                case NORTH:
//                    return BOUNDING_BOX_NORTH;
//                case SOUTH:
//                    return BOUNDING_BOX_SOUTH;
//                case WEST:
//                    return BOUNDING_BOX_WEST;
//                case EAST:
//                default:
//                    return BOUNDING_BOX_EAST;
//            }
//        }
    }
   
    @Override
    public IBlockState onBlockPlaced(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer) {
        IBlockState state = super.onBlockPlaced(worldIn, pos, facing, hitX, hitY, hitZ, meta, placer);
        return state.withProperty(FACING, placer.getHorizontalFacing());
    }
   
    @Override
    public int getMetaFromState(IBlockState state) {
        return state.getValue(FACING).getHorizontalIndex();
    }
   
    @Override
    public IBlockState getStateFromMeta(int meta) {
        return getDefaultState().withProperty(FACING, EnumFacing.getHorizontal(meta));
    }
   
    @Override
    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, FACING);
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