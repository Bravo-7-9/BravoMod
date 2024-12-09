package com.bravo_7_9.bravomod.client;

import com.bravo_7_9.bravomod.BravoMod;
import com.bravo_7_9.bravomod.client.renderer.entity.BoneBambooBareArrowRenderer;
import com.bravo_7_9.bravomod.world.entity.ModEntityType;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;

@EventBusSubscriber(modid = BravoMod.MODID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientModEventSubscriber {

    @SubscribeEvent
    public static void onClientSetup(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(ModEntityType.BONE_BAMBOO_BARE_ARROW.get(), BoneBambooBareArrowRenderer::new);
    }
}
