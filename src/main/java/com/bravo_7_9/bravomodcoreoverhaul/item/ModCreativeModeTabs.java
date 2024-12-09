package com.bravo_7_9.bravomodcoreoverhaul.item;

import com.bravo_7_9.bravomodcoreoverhaul.BravoModCoreOverhaul;
import net.minecraft.client.Minecraft;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BravoModCoreOverhaul.MODID);

    public static final Supplier<CreativeModeTab> ARROW_ITEMS_TAB = CREATIVE_MODE_TAB.register("arrow_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.WOOD_COPPER_FLETCHED_SHAFT.get()))
                    .title(Component.translatable("creativetab.bravomodcoreoverhaul.arrow_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.SPRUCE_ARROWHEAD);
                        output.accept(ModItems.BONE_ARROWHEAD);
                        output.accept(ModItems.FLINT_ARROWHEAD);
                        output.accept(ModItems.OBSIDIAN_ARROWHEAD);
/*
                        output.accept(ModItems.CROSSBOW_BOLT);

                        output.accept(ModItems.BLUNT);

                        output.accept(ModItems.WROUGHT_IRON_BODKIN_POINT);
                        output.accept(ModItems.STEEL_BODKIN_POINT);
                        output.accept(ModItems.CASE_HARDENED_BODKIN_POINT);
                        output.accept(ModItems.STEEL_FIXED_BLADE_BROADHEAD);
                        output.accept(ModItems.CASE_HARDENED_FIXED_BLADE_BROADHEAD);
*/
                        output.accept(ModItems.FEATHER_FLETCHING);
                        output.accept(ModItems.COPPER_VANES);

                        output.accept(ModItems.BAMBOO_BARE_SHAFT);
                        output.accept(ModItems.WOOD_BARE_SHAFT);
                        output.accept(ModItems.BAMBOO_FEATHER_FLETCHED_SHAFT);
                        output.accept(ModItems.WOOD_FEATHER_FLETCHED_SHAFT);
                        output.accept(ModItems.WOOD_COPPER_FLETCHED_SHAFT);

                        output.accept(ModItems.BONE_BAMBOO_BARE_ARROW);
                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
