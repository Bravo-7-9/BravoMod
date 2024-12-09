package com.bravo_7_9.bravomod;

import com.bravo_7_9.bravomod.item.ModItems;
import com.bravo_7_9.bravomod.util.Helpers;
import com.bravo_7_9.bravomod.util.ModTags;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.Containers;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;

import javax.annotation.Nullable;

public class EventHandler {

    @Nullable
    public static InteractionResult onRightClickBlock(Level level, BlockPos pos, Player player, InteractionHand hand, ItemStack stack, @Nullable Direction targetedFace) {
        final BlockState state = level.getBlockState(pos);
        if (Helpers.isItem(stack.getItem(), ModTags.Items.FLINT_KNAPPABLE) && state.getSoundType() == SoundType.STONE) {
            if (!level.isClientSide) {
                Direction face = targetedFace == null ? Direction.UP : targetedFace;
                Containers.dropItemStack(level, pos.getX() + 0.5 + face.getStepX() * 0.5, pos.getY() + 0.5 + face.getStepY() * 0.5, pos.getZ() + 0.5 + face.getStepZ() * 0.5, new ItemStack(ModItems.FLINT_ARROWHEAD.get(), 2));
                stack.shrink(1);
                player.setItemInHand(hand, stack);
            }
            return InteractionResult.SUCCESS;
        }
        return null;
    }
}
