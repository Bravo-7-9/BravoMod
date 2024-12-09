package com.bravo_7_9.bravomodcore.item;

import com.bravo_7_9.bravomodcore.BravoModCore;
import com.bravo_7_9.bravomodcore.item.custom.BoneBambooBareArrowItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(BravoModCore.MODID);

    // Arrowheads

    public static final DeferredItem<Item> SPRUCE_ARROWHEAD = ITEMS.register("spruce_arrowhead",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BONE_ARROWHEAD = ITEMS.register("bone_arrowhead",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FLINT_ARROWHEAD = ITEMS.register("flint_arrowhead",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> OBSIDIAN_ARROWHEAD = ITEMS.register("obsidian_arrowhead",
            () -> new Item(new Item.Properties()));

    /*
    public static final DeferredItem<Item> ALLIGATOR_GAR_SCALE_ARROWHEAD = ITEMS.register("alligator_gar_scale_arrowhead",
            () -> new Item(new Item.Properties())); // Requires Alligator Gar


    public static final DeferredItem<Item> CROSSBOW_BOLT = ITEMS.register("crossbow_bolt",
            () -> new Item(new Item.Properties())); // Short metal bolt

    public static final DeferredItem<Item> BLUNT = ITEMS.register("blunt",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> WROUGHT_IRON_BODKIN_POINT = ITEMS.register("wrought_iron_bodkin_point",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STEEL_BODKIN_POINT = ITEMS.register("steel_bodkin_point",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CASE_HARDENED_BODKIN_POINT = ITEMS.register("case_hardened_bodkin_point",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STEEL_FIXED_BLADE_BROADHEAD = ITEMS.register("steel_fixed_blade_broadhead",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CASE_HARDENED_FIXED_BLADE_BROADHEAD = ITEMS.register("case_hardened_fixed_blade_broadhead",
            () -> new Item(new Item.Properties()));


    // Modern Arrowheads
    public static final DeferredItem<Item> MECHANICAL_BROADHEAD = ITEMS.register("mechanical_broadhead",
            () -> new Item(new Item.Properties())); // Requires Springs
    public static final DeferredItem<Item> HYBRID_BROADHEAD = ITEMS.register("hybrid_broadhead",
            () -> new Item(new Item.Properties())); // Requires Springs
     */

    public static final DeferredItem<Item> FEATHER_FLETCHING = ITEMS.register("feather_fletching",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> COPPER_VANES = ITEMS.register("copper_vanes",
            () -> new Item(new Item.Properties()));

    /*
    // Modern Fletching
    public static final DeferredItem<Item> PLASTIC_VANE = ITEMS.register("plastic_vane",
            () -> new Item(new Item.Properties()));
     */

    public static final DeferredItem<Item> BAMBOO_BARE_SHAFT = ITEMS.register("bamboo_bare_shaft",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> WOOD_BARE_SHAFT = ITEMS.register("wood_bare_shaft",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BAMBOO_FEATHER_FLETCHED_SHAFT = ITEMS.register("bamboo_feather_fletched_shaft",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> WOOD_FEATHER_FLETCHED_SHAFT = ITEMS.register("wood_feather_fletched_shaft",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> WOOD_COPPER_FLETCHED_SHAFT = ITEMS.register("wood_copper_fletched_shaft",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> BONE_BAMBOO_BARE_ARROW = ITEMS.register("bone_bamboo_bare_arrow",
            () -> new BoneBambooBareArrowItem(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
