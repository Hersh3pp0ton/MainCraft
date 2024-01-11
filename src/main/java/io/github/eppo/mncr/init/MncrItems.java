package io.github.eppo.mncr.init;

import io.github.eppo.mncr.items.wearables.MainHelmet;
import io.github.eppo.mncr.MainCraft;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class MncrItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MainCraft.MODID);

    public static final RegistryObject<Item> MAIN_HELMET = ITEMS.register("main_helmet",
            () -> new MainHelmet(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()
            )
    );

    //Oggetti

    public static final RegistryObject<Item> VACCINE = ITEMS.register("vaccine",
            () -> new Item(new Item.Properties()
                    .stacksTo(16)
                    .rarity(Rarity.EPIC)
                    .food(new FoodProperties.Builder()
                            .fast()
                            .effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 200, 3, false, false), 100)
                            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 60, 4, false, false), 100)
                            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 500, 2, false, false), 100)

                            .build()
                    )
            )
    );
}
