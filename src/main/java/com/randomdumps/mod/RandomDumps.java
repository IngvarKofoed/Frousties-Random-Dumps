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
		
		RandomBlocks.init();
		RandomBlocks.register();
	
		RandomItems.init();
		RandomItems.register();
		
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
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		System.out.println("Initialization");
		proxy.init();
		
		RandomCrafting.register();
		RandomMobs.register();
		
	    GameRegistry.registerTileEntity(TileEntityFirePit.class, Reference.MOD_ID + "TileEntityFirePit");
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		System.out.println("Post Initialization");
	}
}
