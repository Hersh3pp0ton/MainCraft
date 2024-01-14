package io.github.eppo.mncr.items.tools;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

public class PakistaniStick extends SwordItem {

    public PakistaniStick(Tier pTier, int pAttack, float attackSpeed, Properties properties) {
        super(pTier, pAttack, attackSpeed, properties);
    }

    @Override
    public boolean hurtEnemy(ItemStack pStack, LivingEntity pTarget, LivingEntity pAttacker) {

        return super.hurtEnemy(pStack, pTarget, pAttacker);
    }
}
