package io.github.eppo.mncr.items.tools;

import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

public class AbortionSword extends SwordItem {
    public AbortionSword(Tier tier, int AttackDamage, float AttackSpeed, Properties properties) {
        super(tier, AttackDamage, AttackSpeed, properties);
    }

    @Override
    public boolean hurtEnemy(ItemStack pStack, LivingEntity pTarget, LivingEntity pAttacker) {

        Player attacker = (Player) pAttacker;

        if (attacker.getCooldowns().isOnCooldown(this)) {
            return false;
        }

        String aborto = "L'ABORTO È MORTO!";
        String cooldown = "Effect in cooldown...";

        pTarget.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 300, 50, false, false));

        attacker.displayClientMessage(Component.literal(aborto), false);
        attacker.displayClientMessage(Component.literal(cooldown), false);

        if (pTarget instanceof Player) {
            Player target = (Player) pTarget;
            target.displayClientMessage(Component.literal(aborto), false);
        }

        attacker.getCooldowns().addCooldown(this, 500);

        return super.hurtEnemy(pStack, pTarget, pAttacker);
    }
}
