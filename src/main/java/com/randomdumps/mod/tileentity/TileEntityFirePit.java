package com.randomdumps.mod.tileentity;

import com.randomdumps.mod.init.RandomBlocks;

import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.texture.ITickable;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.SPacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;

public class TileEntityFirePit extends TileEntity implements ITickable {
	public static int fuelCount = 0;
	private int cooldown = 0;

	public boolean addFuel() {
		if(fuelCount < 4) {
			fuelCount++;
			markDirty();
			IBlockState state = worldObj.getBlockState(pos);
			worldObj.notifyBlockUpdate(pos, state, state, 3);
			return true;
		}
		return false;
	}
	
	public void removeFuel() {
		if(fuelCount > 0) {
			worldObj.spawnEntityInWorld(new EntityItem(worldObj, pos.getX() + 0.5, pos.getY() + 1.0, pos.getZ() + 0.5, new ItemStack(RandomBlocks.blockPaper)));
			fuelCount--;
			markDirty();
			IBlockState state = worldObj.getBlockState(pos);
			worldObj.notifyBlockUpdate(pos, state, state, 3);
		}
	}
	
	
	@Override
	public void readFromNBT(NBTTagCompound compound) {
		this.fuelCount = compound.getInteger("FuelCount");
		this.cooldown = compound.getInteger("Cooldown");
		super.readFromNBT(compound);
	}
	
	@Override
	public NBTTagCompound writeToNBT(NBTTagCompound compound) {
		compound.setInteger("FuelCount", this.fuelCount);	
		compound.setInteger("Cooldown", this.cooldown);	
		return super.writeToNBT(compound);
	}
	
	@Override
	public void tick() {
		if(this.worldObj != null) {
			this.cooldown++;
			this.cooldown %= 100;
			System.out.println("Cooldown: " + this.cooldown);
		
			if(this.cooldown == 100) {
				this.fuelCount--;
			}
		}
	}
	
	@Override
	public SPacketUpdateTileEntity getUpdatePacket() {
		NBTTagCompound tag = new NBTTagCompound();
		this.writeToNBT(tag);
		return new SPacketUpdateTileEntity(this.pos, getBlockMetadata(), tag);
	}
	
	
	@Override
	public void onDataPacket(NetworkManager net, SPacketUpdateTileEntity pkt) {
		this.readFromNBT(pkt.getNbtCompound());
	}
	
	@Override
	public NBTTagCompound getUpdateTag() {
		NBTTagCompound tag = new NBTTagCompound();
		this.writeToNBT(tag);
		return tag;
	}
	
	@Override
	public void handleUpdateTag(NBTTagCompound tag) {
		this.readFromNBT(tag);
	}
	
	public NBTTagCompound getTileData() {
		NBTTagCompound tag = new NBTTagCompound();
		this.writeToNBT(tag);
		return tag;
	}
	
//	public void writeUpdateTag(NBTTagCompound tag) {
//		tag.setInteger("FuelCount", this.fuelCount);
//	}
//	
//	public void readUpdateTag(NBTTagCompound tag) {
//		this.fuelCount = tag.getInteger("FuelCount");
//	}
}
