package com.randomdumps.mod.init;

import com.randomdumps.mod.blocks.BlockArrowLeft;
import com.randomdumps.mod.blocks.BlockArrowRight;
import com.randomdumps.mod.blocks.BlockConcrete;
import com.randomdumps.mod.blocks.BlockConcretePowder;
import com.randomdumps.mod.blocks.BlockFancyTorch;
import com.randomdumps.mod.blocks.BlockPaper;
import com.randomdumps.mod.blocks.BlockUnrational;
import com.randomdumps.mod.blocks.FirePit;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RandomBlocks {
	
	public static Block blockPaper;
	public static Block firePit;
	public static Block blockArrowLeft;
	public static Block blockArrowRight;
	public static Block blockFancyTorch;
	public static Block blockConcretePowder;
	public static Block blockConcrete;
	public static Block blockUnrational;
	
	public static void init() {
		blockPaper = new BlockPaper();
		firePit = new FirePit();
		blockArrowLeft = new BlockArrowLeft();
		blockArrowRight = new BlockArrowRight();
		blockFancyTorch = new BlockFancyTorch();
		blockConcretePowder = new BlockConcretePowder();
		blockConcrete = new BlockConcrete();
		blockUnrational = new BlockUnrational();
	}
	
	public static void register() {
		registerBlock(blockPaper); 
		registerBlock(firePit);
		registerBlock(blockArrowLeft);
		registerBlock(blockArrowRight);
		registerBlock(blockFancyTorch);
		registerColorBlock(blockConcretePowder);
		registerColorBlock(blockConcrete);
		registerColorBlock(blockUnrational);
	}
	
	public static void registerBlock(Block block) {
		GameRegistry.register(block);
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		GameRegistry.register(item);
	}
	
	public static void registerColorBlock(Block block) {
		GameRegistry.register(block);
		//ItemBlock item = new ItemBlock(block);
		//item.setRegistryName(block.getRegistryName());
		//GameRegistry.register(item);
	}
	
	public static void registerRenders() {
		registerRender(blockPaper);
		registerRender(firePit);
		registerRender(blockArrowLeft);
		registerRender(blockArrowRight);
		registerRender(blockFancyTorch);
		registerRender(blockConcretePowder);
		registerRender(blockConcrete);
		registerRender(blockUnrational);
	}
	
	public static void registerRender(Block block) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}
}
