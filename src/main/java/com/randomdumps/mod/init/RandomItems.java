package com.randomdumps.mod.init;

import com.randomdumps.mod.blocks.BlockConcrete;
import com.randomdumps.mod.blocks.BlockConcretePowder;
import com.randomdumps.mod.blocks.BlockUnrational;
import com.randomdumps.mod.items.ItemBlockConcrete;
import com.randomdumps.mod.items.ItemBlockConcretePowder;
import com.randomdumps.mod.items.ItemBlockUnrational;
import com.randomdumps.mod.items.ItemCakeBits;
import com.randomdumps.mod.items.ItemFancyStick;
import com.randomdumps.mod.items.ItemFrosties;
import com.randomdumps.mod.items.ItemFrostiesBowl;
import com.randomdumps.mod.items.ItemRecordTest;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RandomItems extends Item {
	
	public static Item itemFrosties;
	public static Item itemFrostiesBowl;
	public static Item itemFancyStick;
	public static Item itemCakeBits;
	public static Item itemRecordTest;
	public static Item itemBlockConcretePowder;
	public static Item itemBlockConcrete;
	public static Item itemBlockUnrational;
	
	public static void init() {
		itemFrosties = new ItemFrosties();
		itemFrostiesBowl = new ItemFrostiesBowl();
		itemFancyStick = new ItemFancyStick();
		itemCakeBits = new ItemCakeBits();
		itemRecordTest = new ItemRecordTest("test", RandomSounds.RECORD_TEST);
		itemBlockConcretePowder = new ItemBlockConcretePowder(RandomBlocks.blockConcretePowder);
		itemBlockConcrete = new ItemBlockConcrete(RandomBlocks.blockConcrete);
		itemBlockUnrational = new ItemBlockUnrational(RandomBlocks.blockUnrational);
	}
	
	public static void register() {
		GameRegistry.register(itemFrosties);
		GameRegistry.register(itemFrostiesBowl);
		GameRegistry.register(itemFancyStick);
		GameRegistry.register(itemCakeBits);
		GameRegistry.register(itemRecordTest);
		GameRegistry.register(itemBlockConcretePowder);
		GameRegistry.register(itemBlockConcrete);
		GameRegistry.register(itemBlockUnrational);
		
		ModelResourceLocation itemModelResourceLocation = new ModelResourceLocation("randomdumps:ConcretePowder/BlockConcretePowder", "inventory");
	    ModelLoader.setCustomModelResourceLocation(RandomItems.itemBlockConcretePowder, BlockConcretePowder.EnumColor.WHITE.getMetadata(), itemModelResourceLocation);
	    itemModelResourceLocation = new ModelResourceLocation("randomdumps:ConcretePowder/BlockConcretePowderOrange", "inventory");
	    ModelLoader.setCustomModelResourceLocation(RandomItems.itemBlockConcretePowder, BlockConcretePowder.EnumColor.ORANGE.getMetadata(), itemModelResourceLocation);
	    itemModelResourceLocation = new ModelResourceLocation("randomdumps:ConcretePowder/BlockConcretePowderMagenta", "inventory");
	    ModelLoader.setCustomModelResourceLocation(RandomItems.itemBlockConcretePowder, BlockConcretePowder.EnumColor.MAGENTA.getMetadata(), itemModelResourceLocation);
	    itemModelResourceLocation = new ModelResourceLocation("randomdumps:ConcretePowder/BlockConcretePowderLightBlue", "inventory");
	    ModelLoader.setCustomModelResourceLocation(RandomItems.itemBlockConcretePowder, BlockConcretePowder.EnumColor.LIGHT_BLUE.getMetadata(), itemModelResourceLocation);
	    itemModelResourceLocation = new ModelResourceLocation("randomdumps:ConcretePowder/BlockConcretePowderYellow", "inventory");
	    ModelLoader.setCustomModelResourceLocation(RandomItems.itemBlockConcretePowder, BlockConcretePowder.EnumColor.YELLOW.getMetadata(), itemModelResourceLocation);
	    itemModelResourceLocation = new ModelResourceLocation("randomdumps:ConcretePowder/BlockConcretePowderLime", "inventory");
	    ModelLoader.setCustomModelResourceLocation(RandomItems.itemBlockConcretePowder, BlockConcretePowder.EnumColor.LIME.getMetadata(), itemModelResourceLocation);
	    itemModelResourceLocation = new ModelResourceLocation("randomdumps:ConcretePowder/BlockConcretePowderPink", "inventory");
	    ModelLoader.setCustomModelResourceLocation(RandomItems.itemBlockConcretePowder, BlockConcretePowder.EnumColor.PINK.getMetadata(), itemModelResourceLocation);
	    itemModelResourceLocation = new ModelResourceLocation("randomdumps:ConcretePowder/BlockConcretePowderGray", "inventory");
	    ModelLoader.setCustomModelResourceLocation(RandomItems.itemBlockConcretePowder, BlockConcretePowder.EnumColor.GRAY.getMetadata(), itemModelResourceLocation);
	    itemModelResourceLocation = new ModelResourceLocation("randomdumps:ConcretePowder/BlockConcretePowderSilver", "inventory");
	    ModelLoader.setCustomModelResourceLocation(RandomItems.itemBlockConcretePowder, BlockConcretePowder.EnumColor.SILVER.getMetadata(), itemModelResourceLocation);
	    itemModelResourceLocation = new ModelResourceLocation("randomdumps:ConcretePowder/BlockConcretePowderCyan", "inventory");
	    ModelLoader.setCustomModelResourceLocation(RandomItems.itemBlockConcretePowder, BlockConcretePowder.EnumColor.CYAN.getMetadata(), itemModelResourceLocation);
	    itemModelResourceLocation = new ModelResourceLocation("randomdumps:ConcretePowder/BlockConcretePowderPurple", "inventory");
	    ModelLoader.setCustomModelResourceLocation(RandomItems.itemBlockConcretePowder, BlockConcretePowder.EnumColor.PURPLE.getMetadata(), itemModelResourceLocation);
	    itemModelResourceLocation = new ModelResourceLocation("randomdumps:ConcretePowder/BlockConcretePowderBlue", "inventory");
	    ModelLoader.setCustomModelResourceLocation(RandomItems.itemBlockConcretePowder, BlockConcretePowder.EnumColor.BLUE.getMetadata(), itemModelResourceLocation);
	    itemModelResourceLocation = new ModelResourceLocation("randomdumps:ConcretePowder/BlockConcretePowderBrown", "inventory");
	    ModelLoader.setCustomModelResourceLocation(RandomItems.itemBlockConcretePowder, BlockConcretePowder.EnumColor.BROWN.getMetadata(), itemModelResourceLocation);
	    itemModelResourceLocation = new ModelResourceLocation("randomdumps:ConcretePowder/BlockConcretePowderGreen", "inventory");
	    ModelLoader.setCustomModelResourceLocation(RandomItems.itemBlockConcretePowder, BlockConcretePowder.EnumColor.GREEN.getMetadata(), itemModelResourceLocation);
	    itemModelResourceLocation = new ModelResourceLocation("randomdumps:ConcretePowder/BlockConcretePowderRed", "inventory");
	    ModelLoader.setCustomModelResourceLocation(RandomItems.itemBlockConcretePowder, BlockConcretePowder.EnumColor.RED.getMetadata(), itemModelResourceLocation);
	    itemModelResourceLocation = new ModelResourceLocation("randomdumps:ConcretePowder/BlockConcretePowderBlack", "inventory");
	    ModelLoader.setCustomModelResourceLocation(RandomItems.itemBlockConcretePowder, BlockConcretePowder.EnumColor.BLACK.getMetadata(), itemModelResourceLocation);
	    
	    itemModelResourceLocation = new ModelResourceLocation("randomdumps:Concrete/BlockConcrete", "inventory");
	    ModelLoader.setCustomModelResourceLocation(RandomItems.itemBlockConcrete, BlockConcrete.EnumColor.WHITE.getMetadata(), itemModelResourceLocation);
	    itemModelResourceLocation = new ModelResourceLocation("randomdumps:Concrete/BlockConcreteOrange", "inventory");
	    ModelLoader.setCustomModelResourceLocation(RandomItems.itemBlockConcrete, BlockConcrete.EnumColor.ORANGE.getMetadata(), itemModelResourceLocation);
	    itemModelResourceLocation = new ModelResourceLocation("randomdumps:Concrete/BlockConcreteMagenta", "inventory");
	    ModelLoader.setCustomModelResourceLocation(RandomItems.itemBlockConcrete, BlockConcrete.EnumColor.MAGENTA.getMetadata(), itemModelResourceLocation);
	    itemModelResourceLocation = new ModelResourceLocation("randomdumps:Concrete/BlockConcreteLightBlue", "inventory");
	    ModelLoader.setCustomModelResourceLocation(RandomItems.itemBlockConcrete, BlockConcrete.EnumColor.LIGHT_BLUE.getMetadata(), itemModelResourceLocation);
	    itemModelResourceLocation = new ModelResourceLocation("randomdumps:Concrete/BlockConcreteYellow", "inventory");
	    ModelLoader.setCustomModelResourceLocation(RandomItems.itemBlockConcrete, BlockConcrete.EnumColor.YELLOW.getMetadata(), itemModelResourceLocation);
	    itemModelResourceLocation = new ModelResourceLocation("randomdumps:Concrete/BlockConcreteLime", "inventory");
	    ModelLoader.setCustomModelResourceLocation(RandomItems.itemBlockConcrete, BlockConcrete.EnumColor.LIME.getMetadata(), itemModelResourceLocation);
	    itemModelResourceLocation = new ModelResourceLocation("randomdumps:Concrete/BlockConcretePink", "inventory");
	    ModelLoader.setCustomModelResourceLocation(RandomItems.itemBlockConcrete, BlockConcrete.EnumColor.PINK.getMetadata(), itemModelResourceLocation);
	    itemModelResourceLocation = new ModelResourceLocation("randomdumps:Concrete/BlockConcreteGray", "inventory");
	    ModelLoader.setCustomModelResourceLocation(RandomItems.itemBlockConcrete, BlockConcrete.EnumColor.GRAY.getMetadata(), itemModelResourceLocation);
	    itemModelResourceLocation = new ModelResourceLocation("randomdumps:Concrete/BlockConcreteSilver", "inventory");
	    ModelLoader.setCustomModelResourceLocation(RandomItems.itemBlockConcrete, BlockConcrete.EnumColor.SILVER.getMetadata(), itemModelResourceLocation);
	    itemModelResourceLocation = new ModelResourceLocation("randomdumps:Concrete/BlockConcreteCyan", "inventory");
	    ModelLoader.setCustomModelResourceLocation(RandomItems.itemBlockConcrete, BlockConcrete.EnumColor.CYAN.getMetadata(), itemModelResourceLocation);
	    itemModelResourceLocation = new ModelResourceLocation("randomdumps:Concrete/BlockConcretePurple", "inventory");
	    ModelLoader.setCustomModelResourceLocation(RandomItems.itemBlockConcrete, BlockConcrete.EnumColor.PURPLE.getMetadata(), itemModelResourceLocation);
	    itemModelResourceLocation = new ModelResourceLocation("randomdumps:Concrete/BlockConcreteBlue", "inventory");
	    ModelLoader.setCustomModelResourceLocation(RandomItems.itemBlockConcrete, BlockConcrete.EnumColor.BLUE.getMetadata(), itemModelResourceLocation);
	    itemModelResourceLocation = new ModelResourceLocation("randomdumps:Concrete/BlockConcreteBrown", "inventory");
	    ModelLoader.setCustomModelResourceLocation(RandomItems.itemBlockConcrete, BlockConcrete.EnumColor.BROWN.getMetadata(), itemModelResourceLocation);
	    itemModelResourceLocation = new ModelResourceLocation("randomdumps:Concrete/BlockConcreteGreen", "inventory");
	    ModelLoader.setCustomModelResourceLocation(RandomItems.itemBlockConcrete, BlockConcrete.EnumColor.GREEN.getMetadata(), itemModelResourceLocation);
	    itemModelResourceLocation = new ModelResourceLocation("randomdumps:Concrete/BlockConcreteRed", "inventory");
	    ModelLoader.setCustomModelResourceLocation(RandomItems.itemBlockConcrete, BlockConcrete.EnumColor.RED.getMetadata(), itemModelResourceLocation);
	    itemModelResourceLocation = new ModelResourceLocation("randomdumps:Concrete/BlockConcreteBlack", "inventory");
	    ModelLoader.setCustomModelResourceLocation(RandomItems.itemBlockConcrete, BlockConcrete.EnumColor.BLACK.getMetadata(), itemModelResourceLocation);
	    
	    itemModelResourceLocation = new ModelResourceLocation("randomdumps:Unrational/BlockUnrational", "inventory");
	    ModelLoader.setCustomModelResourceLocation(RandomItems.itemBlockUnrational, BlockUnrational.EnumColor.WHITE.getMetadata(), itemModelResourceLocation);
	    itemModelResourceLocation = new ModelResourceLocation("randomdumps:Unrational/BlockUnrationalOrange", "inventory");
	    ModelLoader.setCustomModelResourceLocation(RandomItems.itemBlockUnrational, BlockUnrational.EnumColor.ORANGE.getMetadata(), itemModelResourceLocation);
	    itemModelResourceLocation = new ModelResourceLocation("randomdumps:Unrational/BlockUnrationalMagenta", "inventory");
	    ModelLoader.setCustomModelResourceLocation(RandomItems.itemBlockUnrational, BlockUnrational.EnumColor.MAGENTA.getMetadata(), itemModelResourceLocation);
	    itemModelResourceLocation = new ModelResourceLocation("randomdumps:Unrational/BlockUnrationalLightBlue", "inventory");
	    ModelLoader.setCustomModelResourceLocation(RandomItems.itemBlockUnrational, BlockUnrational.EnumColor.LIGHT_BLUE.getMetadata(), itemModelResourceLocation);
	    itemModelResourceLocation = new ModelResourceLocation("randomdumps:Unrational/BlockUnrationalYellow", "inventory");
	    ModelLoader.setCustomModelResourceLocation(RandomItems.itemBlockUnrational, BlockUnrational.EnumColor.YELLOW.getMetadata(), itemModelResourceLocation);
	    itemModelResourceLocation = new ModelResourceLocation("randomdumps:Unrational/BlockUnrationalLime", "inventory");
	    ModelLoader.setCustomModelResourceLocation(RandomItems.itemBlockUnrational, BlockUnrational.EnumColor.LIME.getMetadata(), itemModelResourceLocation);
	    itemModelResourceLocation = new ModelResourceLocation("randomdumps:Unrational/BlockUnrationalPink", "inventory");
	    ModelLoader.setCustomModelResourceLocation(RandomItems.itemBlockUnrational, BlockUnrational.EnumColor.PINK.getMetadata(), itemModelResourceLocation);
	    itemModelResourceLocation = new ModelResourceLocation("randomdumps:Unrational/BlockUnrationalGray", "inventory");
	    ModelLoader.setCustomModelResourceLocation(RandomItems.itemBlockUnrational, BlockUnrational.EnumColor.GRAY.getMetadata(), itemModelResourceLocation);
	    itemModelResourceLocation = new ModelResourceLocation("randomdumps:Unrational/BlockUnrationalSilver", "inventory");
	    ModelLoader.setCustomModelResourceLocation(RandomItems.itemBlockUnrational, BlockUnrational.EnumColor.SILVER.getMetadata(), itemModelResourceLocation);
	    itemModelResourceLocation = new ModelResourceLocation("randomdumps:Unrational/BlockUnrationalCyan", "inventory");
	    ModelLoader.setCustomModelResourceLocation(RandomItems.itemBlockUnrational, BlockUnrational.EnumColor.CYAN.getMetadata(), itemModelResourceLocation);
	    itemModelResourceLocation = new ModelResourceLocation("randomdumps:Unrational/BlockUnrationalPurple", "inventory");
	    ModelLoader.setCustomModelResourceLocation(RandomItems.itemBlockUnrational, BlockUnrational.EnumColor.PURPLE.getMetadata(), itemModelResourceLocation);
	    itemModelResourceLocation = new ModelResourceLocation("randomdumps:Unrational/BlockUnrationalBlue", "inventory");
	    ModelLoader.setCustomModelResourceLocation(RandomItems.itemBlockUnrational, BlockUnrational.EnumColor.BLUE.getMetadata(), itemModelResourceLocation);
	    itemModelResourceLocation = new ModelResourceLocation("randomdumps:Unrational/BlockUnrationalBrown", "inventory");
	    ModelLoader.setCustomModelResourceLocation(RandomItems.itemBlockUnrational, BlockUnrational.EnumColor.BROWN.getMetadata(), itemModelResourceLocation);
	    itemModelResourceLocation = new ModelResourceLocation("randomdumps:Unrational/BlockUnrationalGreen", "inventory");
	    ModelLoader.setCustomModelResourceLocation(RandomItems.itemBlockUnrational, BlockUnrational.EnumColor.GREEN.getMetadata(), itemModelResourceLocation);
	    itemModelResourceLocation = new ModelResourceLocation("randomdumps:Unrational/BlockUnrationalRed", "inventory");
	    ModelLoader.setCustomModelResourceLocation(RandomItems.itemBlockUnrational, BlockUnrational.EnumColor.RED.getMetadata(), itemModelResourceLocation);
	    itemModelResourceLocation = new ModelResourceLocation("randomdumps:Unrational/BlockUnrationalBlack", "inventory");
	    ModelLoader.setCustomModelResourceLocation(RandomItems.itemBlockUnrational, BlockUnrational.EnumColor.BLACK.getMetadata(), itemModelResourceLocation);
	}
	
	public static void registerRenders() {
		registerRender(itemFrosties);
		registerRender(itemFrostiesBowl);
		registerRender(itemFancyStick);
		registerRender(itemCakeBits);
		registerRender(itemRecordTest);
		registerRender(itemBlockConcretePowder);
		registerRender(itemBlockConcrete);
		registerRender(itemBlockUnrational);
	}
	
	public static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
