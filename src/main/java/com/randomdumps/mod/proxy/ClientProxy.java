package com.randomdumps.mod.proxy;

import com.randomdumps.mod.init.RandomBlocks;
import com.randomdumps.mod.init.RandomItems;
import com.randomdumps.mod.tileentity.TileEntityFirePit;
import com.randomdumps.mod.tileentity.render.RendererFirePit;

import net.minecraftforge.fml.client.registry.ClientRegistry;

public class ClientProxy implements CommonProxy {
	@Override
	public void init() {
		RandomItems.registerRenders();
		RandomBlocks.registerRenders();
		
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFirePit.class, new RendererFirePit());
	}	
}
