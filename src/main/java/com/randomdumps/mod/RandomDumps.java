package com.randomdumps.mod;

import com.randomdumps.mod.blocks.BlockConcretePowder;
import com.randomdumps.mod.init.RandomBlocks;
import com.randomdumps.mod.init.RandomCrafting;
import com.randomdumps.mod.init.RandomItems;
import com.randomdumps.mod.init.RandomLoot;
import com.randomdumps.mod.init.RandomMobs;
import com.randomdumps.mod.init.RandomSounds;
import com.randomdumps.mod.proxy.CommonProxy;
import com.randomdumps.mod.tileentity.TileEntityFirePit;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.ACCEPTED_VERSIONS)
public class RandomDumps {
	@Instance
	public static RandomDumps instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	public static final CreativeTabs RANDOM_TAB = new RandomTab();
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		System.out.println("Pre Initialization");
		
		RandomItems.init();
		RandomItems.register();
		
		RandomBlocks.init();
		RandomBlocks.register();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		System.out.println("Initialization");
		proxy.init();
		
		RandomCrafting.register();
		RandomMobs.register();
		
		ModelResourceLocation itemModelResourceLocation = new ModelResourceLocation("randomdumps:BlockConcretePowderBlue", "inventory");
	    ModelLoader.setCustomModelResourceLocation(RandomItems.itemBlockConcrete, BlockConcretePowder.EnumColor.BLUE.getMetadata(), itemModelResourceLocation);
	    itemModelResourceLocation = new ModelResourceLocation("randomdumps:BlockConcretePowderGreen", "inventory");
	    ModelLoader.setCustomModelResourceLocation(RandomItems.itemBlockConcrete, BlockConcretePowder.EnumColor.GREEN.getMetadata(), itemModelResourceLocation);
	    itemModelResourceLocation = new ModelResourceLocation("randomdumps:BlockConcretePowderRed", "inventory");
	    ModelLoader.setCustomModelResourceLocation(RandomItems.itemBlockConcrete, BlockConcretePowder.EnumColor.RED.getMetadata(), itemModelResourceLocation);
	    itemModelResourceLocation = new ModelResourceLocation("randomdumps:BlockConcretePowderYellow", "inventory");
	    ModelLoader.setCustomModelResourceLocation(RandomItems.itemBlockConcrete, BlockConcretePowder.EnumColor.YELLOW.getMetadata(), itemModelResourceLocation);
		
	    GameRegistry.registerTileEntity(TileEntityFirePit.class, Reference.MOD_ID + "TileEntityFirePit");
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		System.out.println("Post Initialization");
	}
}
