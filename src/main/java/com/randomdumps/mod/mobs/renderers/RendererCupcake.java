package com.randomdumps.mod.mobs.renderers;

import com.randomdumps.mod.Reference;
import com.randomdumps.mod.mobs.entities.EntityCupcake;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RendererCupcake extends RenderLiving<EntityCupcake> {
	
	private static final ResourceLocation tex = new ResourceLocation(Reference.MOD_ID, "textures/entity/cupcake/EntityCupcake.png");
	
	public RendererCupcake(RenderManager rendermanagerIn, ModelBase modelbaseIn, float shadowsizeIn) {
		super(rendermanagerIn, modelbaseIn, shadowsizeIn);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntityCupcake entity) {
		return tex;
	}
}
