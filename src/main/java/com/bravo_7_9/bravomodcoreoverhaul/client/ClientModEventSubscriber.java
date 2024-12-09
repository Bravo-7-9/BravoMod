package com.bravo_7_9.bravomodcoreoverhaul.client;

import com.bravo_7_9.bravomodcoreoverhaul.BravoModCoreOverhaul;
import com.bravo_7_9.bravomodcoreoverhaul.client.renderer.entity.BoneBambooBareArrowRenderer;
import com.bravo_7_9.bravomodcoreoverhaul.world.entity.ModEntityType;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;

@EventBusSubscriber(modid = BravoModCoreOverhaul.MODID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientModEventSubscriber {

    @SubscribeEvent
    public static void onClientSetup(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(ModEntityType.BONE_BAMBOO_BARE_ARROW.get(), BoneBambooBareArrowRenderer::new);
    }
}
