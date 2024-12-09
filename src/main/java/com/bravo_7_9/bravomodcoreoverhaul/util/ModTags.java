package com.bravo_7_9.bravomodcoreoverhaul.util;

import com.bravo_7_9.bravomodcoreoverhaul.BravoModCoreOverhaul;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class ModTags {
    public static class Items {
        public static final TagKey<Item> FLINT_KNAPPABLE = createTag("flint_knappable");

        private static TagKey<Item> createTag(String name) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(BravoModCoreOverhaul.MODID, name));
        }
    }
}
