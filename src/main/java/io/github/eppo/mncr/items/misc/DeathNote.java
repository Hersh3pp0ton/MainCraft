package io.github.eppo.mncr.items.misc;

import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.WritableBookItem;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.AABB;

import java.util.ArrayList;
import java.util.List;

public class DeathNote extends WritableBookItem {
    public DeathNote(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level pLevel, Player pPlayer, InteractionHand pHand) {
        ArrayList<Player> players = new ArrayList<>();
        AABB boundingBox = new AABB(new BlockPos(pPlayer.getBlockX(), pPlayer.getBlockY(), pPlayer.getBlockZ())).inflate(1000);
        List<LivingEntity> entities = pLevel.getEntitiesOfClass(LivingEntity.class, boundingBox);

        ItemStack mano = pPlayer.getItemInHand(InteractionHand.MAIN_HAND);

        pPlayer.openItemGui(mano, InteractionHand.MAIN_HAND);

        return super.use(pLevel, pPlayer, pHand);
    }
}
