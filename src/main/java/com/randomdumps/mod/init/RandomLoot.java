package com.randomdumps.mod.init;

import java.util.Collections;
import java.util.Set;

import com.google.common.collect.Sets;
import com.randomdumps.mod.Reference;

import net.minecraft.util.ResourceLocation;

public class RandomLoot {
	
	private static final Set<ResourceLocation> LOOT_TABLES = Sets.<ResourceLocation>newHashSet();
    private static final Set<ResourceLocation> READ_ONLY_LOOT_TABLES = Collections.<ResourceLocation>unmodifiableSet(LOOT_TABLES);
    
    public static final ResourceLocation CUPCAKE = register("entities/cupcake");
    
    private static ResourceLocation register(String name)
    {
        return register(new ResourceLocation(Reference.MOD_ID, name));
    }

    public static ResourceLocation register(ResourceLocation name)
    {
        if (LOOT_TABLES.add(name))
        {
            return name;
        }
        else
        {
            throw new IllegalArgumentException(name + " is already a registered built-in loot table");
        }
    }

    /**
     * An unmodifiable set is returned
     */
    public static Set<ResourceLocation> getAll()
    {
        return READ_ONLY_LOOT_TABLES;
    }
}
