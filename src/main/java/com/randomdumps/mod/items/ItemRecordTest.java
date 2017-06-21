package com.randomdumps.mod.items;

import com.randomdumps.mod.RandomDumps;
import com.randomdumps.mod.Reference;

import net.minecraft.item.ItemRecord;
import net.minecraft.util.SoundEvent;

/**
 * A record.
 * <p>
 * Test for this thread:
 * http://www.minecraftforum.net/forums/mapping-and-modding/minecraft-mods/modification-development/2408066-try-creating-a-music-disc-in-my-1-8-mod-please
 *
 * @author Choonster
 */
public class ItemRecordTest extends ItemRecord {
	public ItemRecordTest(final String recordName, final SoundEvent soundEvent) {
		super(recordName, soundEvent);
		setUnlocalizedName(Reference.DumpItems.RECORD_TEST.getUnlocalizedName());
		setRegistryName(Reference.DumpItems.RECORD_TEST.getRegistryName());
		setCreativeTab(RandomDumps.RANDOM_TAB);
	}
}