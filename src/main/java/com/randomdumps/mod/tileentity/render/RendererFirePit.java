package com.randomdumps.mod.tileentity.render;

import com.randomdumps.mod.init.RandomBlocks;
import com.randomdumps.mod.tileentity.TileEntityFirePit;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;

public class RendererFirePit extends TileEntitySpecialRenderer<TileEntityFirePit> {
	
	private static final EntityItem ITEM = new EntityItem(Minecraft.getMinecraft().theWorld, 0, 0, 0, new ItemStack(RandomBlocks.blockPaper));
	
	@Override
	public void renderTileEntityAt(TileEntityFirePit te, double x, double y, double z, float partialTicks, int destroyStage) {
		super.renderTileEntityAt(te, x, y, z, partialTicks, destroyStage);
		
		ITEM.hoverStart = 0F;
		
			GlStateManager.pushMatrix();
			GlStateManager.translate(0.5, -0.0625 * 2, 0.5);
			for(int i = 0; i < te.fuelCount; i++) {
				Minecraft.getMinecraft().getRenderManager().doRenderEntity(ITEM, x, y, z, 0F, 0F, false);
				GlStateManager.translate(0, 0.0625, 0);
			}
			GlStateManager.popMatrix();
	}
}
