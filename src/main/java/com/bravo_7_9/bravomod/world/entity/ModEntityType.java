package com.bravo_7_9.bravomod.world.entity;

import com.bravo_7_9.bravomod.BravoMod;
import com.bravo_7_9.bravomod.world.entity.projectile.BoneBambooBareArrow;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModEntityType {

    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(BuiltInRegistries.ENTITY_TYPE, com.bravo_7_9.bravomod.BravoMod.MODID);

    /*
    public static final EntityType<Arrow> ARROW = register(
        "arrow", EntityType.Builder.<Arrow>of(Arrow::new, MobCategory.MISC).sized(0.5F, 0.5F).eyeHeight(0.13F).clientTrackingRange(4).updateInterval(20)
    );
     */

    public static final DeferredHolder<EntityType<?>, EntityType<BoneBambooBareArrow>> BONE_BAMBOO_BARE_ARROW = ENTITIES.register(
            "bone_bamboo_bare_arrow", () -> EntityType.Builder.<BoneBambooBareArrow>of(BoneBambooBareArrow::new, MobCategory.MISC).sized(0.5F,0.5F).eyeHeight(0.13F).clientTrackingRange(4).updateInterval(20).build(ResourceLocation.fromNamespaceAndPath(BravoMod.MODID, "bone_bamboo_bare_arrow").toString())
    );

    public static void register(IEventBus eventBus) {
        ENTITIES.register(eventBus);
    }
}
