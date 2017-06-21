package com.randomdumps.mod.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RandomCrafting {
	public static void register() {
		GameRegistry.addShapedRecipe(new ItemStack(RandomBlocks.blockPaper), "PPP", "PPP", "PPP", 'P', Items.PAPER);
		GameRegistry.addShapedRecipe(new ItemStack(RandomBlocks.firePit), " S ", " S ", "CCC", 'C', Blocks.COBBLESTONE, 'S', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(RandomBlocks.blockArrowLeft), " CW", "CCC", " CW", 'C', Blocks.STAINED_HARDENED_CLAY, 'W', Blocks.LOG);
		GameRegistry.addShapedRecipe(new ItemStack(RandomItems.itemFrostiesBowl), "F", "B", 'F', RandomItems.itemFrosties, 'B', Items.BOWL);
		GameRegistry.addShapelessRecipe(new ItemStack(Items.PAPER, 9), RandomBlocks.blockPaper);
	}
}
