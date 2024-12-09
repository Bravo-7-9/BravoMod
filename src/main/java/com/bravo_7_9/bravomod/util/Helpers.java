package com.bravo_7_9.bravomod.util;

import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class Helpers {
    @SuppressWarnings("deprecation")
    public static boolean isItem(Item item, TagKey<Item> tag) {
        return item.builtInRegistryHolder().is(tag);
    }
}
