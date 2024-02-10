package io.github.eppo.mncr.items.wearables.armor;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class MainHelmet extends ArmorItem {

    public MainHelmet(ArmorMaterial material, Type type, Properties properties) {
        super(material, type, properties);
    }

    @Override
    public void inventoryTick(ItemStack pStack, Level pLevel, Entity pEntity, int pSlotId, boolean pIsSelected) {
        super.inventoryTick(pStack, pLevel, pEntity, pSlotId, pIsSelected);

        if(!pLevel.isClientSide) {
            Player player;

            if(pEntity instanceof Player) {
                player = (Player)pEntity;
            } else {
                return;
            }

            if(player.getItemBySlot(EquipmentSlot.HEAD).getItem() == this) {
                player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1, false, false));
            }
        }
    }
}
