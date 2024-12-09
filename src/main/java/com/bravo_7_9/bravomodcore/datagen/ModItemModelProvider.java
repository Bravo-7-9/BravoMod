package com.bravo_7_9.bravomodcore.datagen;

import com.bravo_7_9.bravomodcore.BravoModCore;
import com.bravo_7_9.bravomodcore.item.ModItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {

    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, BravoModCore.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.SPRUCE_ARROWHEAD.get());
        basicItem(ModItems.BONE_ARROWHEAD.get());
        basicItem(ModItems.FLINT_ARROWHEAD.get());
        basicItem(ModItems.OBSIDIAN_ARROWHEAD.get());

        basicItem(ModItems.FEATHER_FLETCHING.get());
        basicItem(ModItems.COPPER_VANES.get());

        basicItem(ModItems.WOOD_BARE_SHAFT.get());
        basicItem(ModItems.BAMBOO_BARE_SHAFT.get());
        basicItem(ModItems.WOOD_FEATHER_FLETCHED_SHAFT.get());
        basicItem(ModItems.BAMBOO_FEATHER_FLETCHED_SHAFT.get());
        basicItem(ModItems.WOOD_COPPER_FLETCHED_SHAFT.get());

        basicItem(ModItems.BONE_BAMBOO_BARE_ARROW.get());
    }
}
