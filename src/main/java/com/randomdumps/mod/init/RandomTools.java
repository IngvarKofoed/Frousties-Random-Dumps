package com.randomdumps.mod.init;

import com.randomdumps.mod.items.tools.ToolFourInOne;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RandomTools {
	
	public static Item toolFourInOne;
	
	public static void init() {
		toolFourInOne = new ToolFourInOne(ToolMaterial.DIAMOND);
	}
	
	public static void register() {
		GameRegistry.register(toolFourInOne);
	}
	
	public static void registerRenders() {
		registerRender(toolFourInOne);
	}
	
	public static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
