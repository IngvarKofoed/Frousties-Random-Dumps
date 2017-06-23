package com.randomdumps.mod.init;

import com.randomdumps.mod.Reference;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;

@ObjectHolder(Reference.MOD_ID)
public class RandomSounds {
	@ObjectHolder("Reward")
	public static final SoundEvent REWARD = createSoundEvent("Reward");

	@ObjectHolder("entities.cupcake.Pweet")
	public static final SoundEvent CUPCAKE_AMBIENT = createSoundEvent("entities.cupcake.Pweet");
	@ObjectHolder("entities.cupcake.Hurt")
	public static final SoundEvent CUPCAKE_HURT = createSoundEvent("entities.cupcake.Hurt");
	@ObjectHolder("entities.cupcake.Death")
	public static final SoundEvent CUPCAKE_DEATH = createSoundEvent("entities.cupcake.Death");
	@ObjectHolder("entities.cupcake.Step")
	public static final SoundEvent CUPCAKE_STEP = createSoundEvent("entities.cupcake.Step");
	
	@ObjectHolder("entities.chocobo.Kweh")
	public static final SoundEvent CHOCOBO_AMBIENT = createSoundEvent("entities.chocobo.Kweh");
	@ObjectHolder("entities.chocobo.Hurt")
	public static final SoundEvent CHOCOBO_HURT = createSoundEvent("entities.chocobo.Hurt");
	@ObjectHolder("entities.chocobo.Death")
	public static final SoundEvent CHOCOBO_DEATH = createSoundEvent("entities.chocobo.Death");
	
	@ObjectHolder("record.Test")
	public static final SoundEvent RECORD_TEST = createSoundEvent("record.Test");


	private static SoundEvent createSoundEvent(final String soundName) {
		final ResourceLocation soundID = new ResourceLocation(Reference.MOD_ID, soundName);
		return new SoundEvent(soundID).setRegistryName(soundID);
	}

	@Mod.EventBusSubscriber
	public static class RegistrationHandler {
		@SubscribeEvent
		public static void registerSoundEvents(final RegistryEvent.Register<SoundEvent> event) {
			event.getRegistry().registerAll(
					REWARD,
					CUPCAKE_AMBIENT, CUPCAKE_HURT, CUPCAKE_DEATH,CUPCAKE_STEP,
					CHOCOBO_AMBIENT, CHOCOBO_HURT, CHOCOBO_DEATH,
					RECORD_TEST
			);
		}
	}
}