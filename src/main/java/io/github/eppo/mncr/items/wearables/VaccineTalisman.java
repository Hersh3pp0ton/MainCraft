package io.github.eppo.mncr.items.wearables;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class VaccineTalisman extends Item {
    public VaccineTalisman(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public void inventoryTick(ItemStack pStack, Level pLevel, Entity pEntity, int pSlotId, boolean pIsSelected) {
        Player player;

        if(!(pLevel.isClientSide)) {
            if(pEntity instanceof Player) {
                player = (Player)pEntity;
            } else {
                return;
            }

            if((player.getItemInHand(InteractionHand.OFF_HAND).getItem()) == this ||
                    (player.getItemInHand(InteractionHand.MAIN_HAND).getItem() == this)) {

                player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 0, false, false));
                player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 0, false, false));
            }

        }

        super.inventoryTick(pStack, pLevel, pEntity, pSlotId, pIsSelected);
    }
}
