package com.randomdumps.mod.init;

import com.randomdumps.mod.items.ItemBlockConcrete;
import com.randomdumps.mod.items.ItemCakeBits;
import com.randomdumps.mod.items.ItemFancyStick;
import com.randomdumps.mod.items.ItemFrosties;
import com.randomdumps.mod.items.ItemFrostiesBowl;
import com.randomdumps.mod.items.ItemRecordTest;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
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
