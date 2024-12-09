package com.bravo_7_9.bravomodcoreoverhaul.world.entity.projectile;

import com.bravo_7_9.bravomodcoreoverhaul.item.ModItems;
import com.bravo_7_9.bravomodcoreoverhaul.world.entity.ModEntityType;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

public class BoneBambooBareArrow extends AbstractArrow {

    public BoneBambooBareArrow(EntityType<? extends AbstractArrow> entityType, Level level) {
        super(entityType, level);
    }

    public BoneBambooBareArrow(Level level, LivingEntity shooter, ItemStack itemStack, ItemStack weapon) {
        super(ModEntityType.BONE_BAMBOO_BARE_ARROW.get(), shooter, level, itemStack, weapon);
    }

    public BoneBambooBareArrow(Level level, double x, double y, double z, ItemStack itemStack, Object o) {
        super(ModEntityType.BONE_BAMBOO_BARE_ARROW.get(), x, y, z, level, itemStack, null);
    }

    @Override
    public ItemStack getDefaultPickupItem() {
        return new ItemStack(ModItems.BONE_BAMBOO_BARE_ARROW.get());
    }
}
