package io.github.eppo.mncr.items.vaccines;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class VortexVaccine extends Item {

    public VortexVaccine(Properties pProperties) { super(pProperties); }

    @Override
    public InteractionResultHolder<ItemStack> use(Level pLevel, Player pPlayer, InteractionHand pUsedHand) {

        if(!pLevel.isClientSide) {
            pPlayer.addEffect(new MobEffectInstance(MobEffects.POISON, 300, 1, false, false));
            pPlayer.addEffect(new MobEffectInstance(MobEffects.WITHER, 300, 2, false, false));
            pPlayer.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 300, 2, false, false));

            ItemStack item;

            if(pPlayer.getItemInHand(InteractionHand.MAIN_HAND).getItem() == this) {
                item = pPlayer.getItemInHand(InteractionHand.MAIN_HAND);
            } else {
                item = pPlayer.getItemInHand(InteractionHand.OFF_HAND);
            }

            item.shrink(1);

        }

        return super.use(pLevel, pPlayer, pUsedHand);
    }
}
