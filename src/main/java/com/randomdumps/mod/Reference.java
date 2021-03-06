package com.randomdumps.mod;

public class Reference {
	public static final String MOD_ID = "randomdumps";
	public static final String NAME = "Frousties' Random Dumps";
	public static final String VERSION = "0.0.1-Alpha";
	public static final String ACCEPTED_VERSIONS = "[1.10,1.10.2]";
	
	public static final String CLIENT_PROXY_CLASS = "com.randomdumps.mod.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "com.randomdumps.mod.proxy.ServerProxy";
	
	public static enum DumpBlocks {
		
		PAPER("blockPaper", "BlockPaper"),
		FIREPIT("firePit", "FirePit"),
		ARROW_LEFT("blockArrowLeft", "BlockArrowLeft"),
		ARROW_RIGHT("blockArrowRight", "BlockArrowRight"),
		CONCRETE_POWDER("blockConcretePowder", "BlockConcretePowder"),
		CONCRETE("blockConcrete", "BlockConcrete"),
		UNRATIONAL("blockUnrational", "BlockUnrational"),
		FANCY_TORCH("blockFancyTorch", "BlockFancyTorch");
		
		private String unlocalizedName;
		private String registryName;
		
		DumpBlocks(String unlocalizedName, String regitryName) {
			this.unlocalizedName = unlocalizedName;
			this.registryName = regitryName;
			
		}
		
		public String getUnlocalizedName() {
			return unlocalizedName;
		}
		
		public String getRegistryName() {
			return registryName;
		}
		
		public String getName() {
			return getRegistryName();
		}
	}
	
	public static enum DumpItems {
		FROSTIES("itemFrosties", "ItemFrosties"),
		FROSTIES_BOWL("itemFrostiesBowl", "ItemFrostiesBowl"),
		CAKE_BITS("itemCakeBits", "ItemCakeBits"),
		FANCY_STICK("itemFancyStick", "ItemFancyStick"),
		CONCRETE_POWDER("itemBlockConcretePowder", "ItemBlockConcretePowder"),
		CONCRETE("itemBlockConcrete", "ItemBlockConcrete"),
		UNRATIONAL("itemBlockUnrational", "ItemBlockUnrational"),
		FOUR_IN_ONE("toolFourInOne", "ToolFourInOne"),
		RECORD_TEST("itemRecordTest", "ItemRecordTest");
		
		private String unlocalizedName;
		private String registryName;
		
		DumpItems(String unlocalizedName, String regitryName) {
			this.unlocalizedName = unlocalizedName;
			this.registryName = regitryName;
			
		}
		
		public String getUnlocalizedName() {
			return unlocalizedName;
		}
		
		public String getRegistryName() {
			return registryName;
		}
		
		public String getName() {
			return getRegistryName();
		}
	}
}
