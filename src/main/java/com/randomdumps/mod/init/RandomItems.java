package com.randomdumps.mod.init;

import com.randomdumps.mod.blocks.BlockConcretePowder;
import com.randomdumps.mod.items.ItemBlockConcrete;
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
	public static Item itemBlockConcrete;
	
	public static void init() {
		itemFrosties = new ItemFrosties();
		itemFrostiesBowl = new ItemFrostiesBowl();
		itemFancyStick = new ItemFancyStick();
		itemCakeBits = new ItemCakeBits();
		itemRecordTest = new ItemRecordTest("test", RandomSounds.RECORD_TEST);
		itemBlockConcrete = new ItemBlockConcrete(RandomBlocks.blockConcretePowder);
	}
	
	public static void register() {
		GameRegistry.register(itemFrosties);
		GameRegistry.register(itemFrostiesBowl);
		GameRegistry.register(itemFancyStick);
		GameRegistry.register(itemCakeBits);
		GameRegistry.register(itemRecordTest);
		GameRegistry.register(itemBlockConcrete);
		
		ModelResourceLocation itemModelResourceLocation = new ModelResourceLocation("randomdumps:BlockConcretePowder", "inventory");
	    ModelLoader.setCustomModelResourceLocation(RandomItems.itemBlockConcrete, BlockConcretePowder.EnumColor.WHITE.getMetadata(), itemModelResourceLocation);
	    itemModelResourceLocation = new ModelResourceLocation("randomdumps:BlockConcretePowderOrange", "inventory");
	    ModelLoader.setCustomModelResourceLocation(RandomItems.itemBlockConcrete, BlockConcretePowder.EnumColor.ORANGE.getMetadata(), itemModelResourceLocation);
	    itemModelResourceLocation = new ModelResourceLocation("randomdumps:BlockConcretePowderMagenta", "inventory");
	    ModelLoader.setCustomModelResourceLocation(RandomItems.itemBlockConcrete, BlockConcretePowder.EnumColor.MAGENTA.getMetadata(), itemModelResourceLocation);
	    itemModelResourceLocation = new ModelResourceLocation("randomdumps:BlockConcretePowderLightBlue", "inventory");
	    ModelLoader.setCustomModelResourceLocation(RandomItems.itemBlockConcrete, BlockConcretePowder.EnumColor.LIGHT_BLUE.getMetadata(), itemModelResourceLocation);
	    itemModelResourceLocation = new ModelResourceLocation("randomdumps:BlockConcretePowderYellow", "inventory");
	    ModelLoader.setCustomModelResourceLocation(RandomItems.itemBlockConcrete, BlockConcretePowder.EnumColor.YELLOW.getMetadata(), itemModelResourceLocation);
	    itemModelResourceLocation = new ModelResourceLocation("randomdumps:BlockConcretePowderLime", "inventory");
	    ModelLoader.setCustomModelResourceLocation(RandomItems.itemBlockConcrete, BlockConcretePowder.EnumColor.LIME.getMetadata(), itemModelResourceLocation);
	    itemModelResourceLocation = new ModelResourceLocation("randomdumps:BlockConcretePowderPink", "inventory");
	    ModelLoader.setCustomModelResourceLocation(RandomItems.itemBlockConcrete, BlockConcretePowder.EnumColor.PINK.getMetadata(), itemModelResourceLocation);
	    itemModelResourceLocation = new ModelResourceLocation("randomdumps:BlockConcretePowderGray", "inventory");
	    ModelLoader.setCustomModelResourceLocation(RandomItems.itemBlockConcrete, BlockConcretePowder.EnumColor.GRAY.getMetadata(), itemModelResourceLocation);
	    itemModelResourceLocation = new ModelResourceLocation("randomdumps:BlockConcretePowderSilver", "inventory");
	    ModelLoader.setCustomModelResourceLocation(RandomItems.itemBlockConcrete, BlockConcretePowder.EnumColor.SILVER.getMetadata(), itemModelResourceLocation);
	    itemModelResourceLocation = new ModelResourceLocation("randomdumps:BlockConcretePowderCyan", "inventory");
	    ModelLoader.setCustomModelResourceLocation(RandomItems.itemBlockConcrete, BlockConcretePowder.EnumColor.CYAN.getMetadata(), itemModelResourceLocation);
	    itemModelResourceLocation = new ModelResourceLocation("randomdumps:BlockConcretePowderPurple", "inventory");
	    ModelLoader.setCustomModelResourceLocation(RandomItems.itemBlockConcrete, BlockConcretePowder.EnumColor.PURPLE.getMetadata(), itemModelResourceLocation);
	    itemModelResourceLocation = new ModelResourceLocation("randomdumps:BlockConcretePowderBlue", "inventory");
	    ModelLoader.setCustomModelResourceLocation(RandomItems.itemBlockConcrete, BlockConcretePowder.EnumColor.BLUE.getMetadata(), itemModelResourceLocation);
	    itemModelResourceLocation = new ModelResourceLocation("randomdumps:BlockConcretePowderBrown", "inventory");
	    ModelLoader.setCustomModelResourceLocation(RandomItems.itemBlockConcrete, BlockConcretePowder.EnumColor.BROWN.getMetadata(), itemModelResourceLocation);
	    itemModelResourceLocation = new ModelResourceLocation("randomdumps:BlockConcretePowderGreen", "inventory");
	    ModelLoader.setCustomModelResourceLocation(RandomItems.itemBlockConcrete, BlockConcretePowder.EnumColor.GREEN.getMetadata(), itemModelResourceLocation);
	    itemModelResourceLocation = new ModelResourceLocation("randomdumps:BlockConcretePowderRed", "inventory");
	    ModelLoader.setCustomModelResourceLocation(RandomItems.itemBlockConcrete, BlockConcretePowder.EnumColor.RED.getMetadata(), itemModelResourceLocation);
	    itemModelResourceLocation = new ModelResourceLocation("randomdumps:BlockConcretePowderBlack", "inventory");
	    ModelLoader.setCustomModelResourceLocation(RandomItems.itemBlockConcrete, BlockConcretePowder.EnumColor.BLACK.getMetadata(), itemModelResourceLocation);
	}
	
	public static void registerRenders() {
		registerRender(itemFrosties);
		registerRender(itemFrostiesBowl);
		registerRender(itemFancyStick);
		registerRender(itemCakeBits);
		registerRender(itemRecordTest);
		registerRender(itemBlockConcrete);
	}
	
	public static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
