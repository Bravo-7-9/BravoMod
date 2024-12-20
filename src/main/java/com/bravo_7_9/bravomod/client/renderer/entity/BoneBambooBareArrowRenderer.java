package com.bravo_7_9.bravomod.client.renderer.entity;

import com.bravo_7_9.bravomod.BravoMod;
import com.bravo_7_9.bravomod.world.entity.projectile.BoneBambooBareArrow;
import net.minecraft.client.renderer.entity.ArrowRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class BoneBambooBareArrowRenderer extends ArrowRenderer<BoneBambooBareArrow> {
    public BoneBambooBareArrowRenderer(EntityRendererProvider.Context context) {
        super(context);
    }

    @Override
    public ResourceLocation getTextureLocation(BoneBambooBareArrow entity) {
        return ResourceLocation.fromNamespaceAndPath(BravoMod.MODID, "textures/entity/projectiles/bone_bamboo_bare_arrow.png");
    }
}
