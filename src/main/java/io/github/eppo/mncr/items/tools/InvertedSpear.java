package io.github.eppo.mncr.items.tools;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

public class InvertedSpear extends SwordItem {
    public InvertedSpear(Tier pTier, int pAttackDamageModifier, float pAttackSpeedModifier, Properties pProperties) {
        super(pTier, pAttackDamageModifier, pAttackSpeedModifier, pProperties);
    }

    @Override
    public boolean hurtEnemy(ItemStack pStack, LivingEntity pTarget, LivingEntity pAttacker) {
        Player attacker = (Player)pAttacker;

        if(!attacker.getCooldowns().isOnCooldown(this)) {

            pTarget.removeAllEffects();

            attacker.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 140, 2, false, false));

            attacker.getCooldowns().addCooldown(this, 200);
        }

        return super.hurtEnemy(pStack, pTarget, pAttacker);
    }
}
