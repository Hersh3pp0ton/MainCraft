package io.github.eppo.mncr.items.vaccines;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class ClassicVaccine extends Item {

    public ClassicVaccine(Properties pProperties) { super(pProperties); }

    @Override
    public InteractionResultHolder<ItemStack> use(Level pLevel, Player pPlayer, InteractionHand pUsedHand) {

        if(!pLevel.isClientSide) {
            pPlayer.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 200, 3, false, false));
            pPlayer.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 60, 4, false, false));
            pPlayer.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 500, 2, false, false));

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
