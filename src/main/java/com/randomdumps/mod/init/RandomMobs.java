package com.randomdumps.mod.init;

import com.randomdumps.mod.RandomDumps;
import com.randomdumps.mod.mobs.entities.EntityChocobo;
import com.randomdumps.mod.mobs.entities.EntityCupcake;
import com.randomdumps.mod.mobs.models.ModelChocobo;
import com.randomdumps.mod.mobs.models.ModelCupcake;
import com.randomdumps.mod.mobs.renderers.RendererChocobo;
import com.randomdumps.mod.mobs.renderers.RendererCupcake;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.EnumCreatureType;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class RandomMobs {
	public static void register() {
		
		RandomMobs.registerRender();
		RandomMobs.registerEntity();
	}
	
	public static void registerRender() {
		
		RenderingRegistry.registerEntityRenderingHandler(EntityCupcake.class, new RendererCupcake(Minecraft.getMinecraft().getRenderManager(), new ModelCupcake(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityChocobo.class, new RendererChocobo(Minecraft.getMinecraft().getRenderManager(), new ModelChocobo(), 0.5F));
	}
	
	public static void registerEntity() {
		
		EntityRegistry.registerModEntity(EntityCupcake.class, "Cupcake", 212, RandomDumps.instance, 64, 5, true, 0xc4259e, 0x5e001c);
		EntityRegistry.addSpawn(EntityCupcake.class, 10, 1, 6, EnumCreatureType.CREATURE, BiomeDictionary.getBiomesForType(BiomeDictionary.Type.PLAINS));
		
		EntityRegistry.registerModEntity(EntityChocobo.class, "Chocobo", 213, RandomDumps.instance, 64, 5, true, 0xdfbe7c, 0x3a282a);
		EntityRegistry.addSpawn(EntityChocobo.class, 10, 1, 6, EnumCreatureType.CREATURE, BiomeDictionary.getBiomesForType(BiomeDictionary.Type.PLAINS));
	}
}
