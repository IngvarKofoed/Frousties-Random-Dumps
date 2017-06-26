package com.randomdumps.mod.init;

import com.randomdumps.mod.Reference;
import com.randomdumps.mod.tileentity.TileEntityFirePit;

import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RandomTileEntities extends TileEntity {
	public static void registerTileEntities() {
		GameRegistry.registerTileEntity(TileEntityFirePit.class, Reference.MOD_ID + ":TileEntityFirePit");
	}
}
