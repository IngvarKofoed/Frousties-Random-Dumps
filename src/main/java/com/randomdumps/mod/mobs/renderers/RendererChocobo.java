package com.randomdumps.mod.mobs.renderers;

import com.randomdumps.mod.Reference;
import com.randomdumps.mod.mobs.entities.EntityChocobo;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RendererChocobo extends RenderLiving<EntityChocobo> {
	
private static final ResourceLocation tex = new ResourceLocation(Reference.MOD_ID, "textures/entity/chocobo/EntityChocobo.png");
	
	public RendererChocobo(RenderManager rendermanagerIn, ModelBase modelbaseIn, float shadowsizeIn) {
		super(rendermanagerIn, modelbaseIn, shadowsizeIn);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntityChocobo entity) {
		return tex;
	}
}
