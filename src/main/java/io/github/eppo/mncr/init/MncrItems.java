package io.github.eppo.mncr.init;

import io.github.eppo.mncr.items.vaccines.*;
import io.github.eppo.mncr.items.wearables.MainHelmet;
import io.github.eppo.mncr.MainCraft;
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

    //Vaccini

    public static final RegistryObject<Item> CLASSIC_VACCINE = ITEMS.register("classic_vaccine",
            () -> new ClassicVaccine(new Item.Properties()
                    .stacksTo(64)
                    .rarity(Rarity.EPIC)
            )
    );

    public static final RegistryObject<Item> GOLDEN_VACCINE = ITEMS.register("golden_vaccine",
            () -> new GoldenVaccine(new Item.Properties()
                    .stacksTo(64)
                    .rarity(Rarity.EPIC)
            )
    );

    public static final RegistryObject<Item> DAMAGE_VACCINE = ITEMS.register("damage_vaccine",
            () -> new DamageVaccine(new Item.Properties()
                    .stacksTo(64)
                    .rarity(Rarity.EPIC)
            )
    );

    public static final RegistryObject<Item> POISON_VACCINE = ITEMS.register("poison_vaccine",
            () -> new PoisonVaccine(new Item.Properties()
                    .stacksTo(64)
                    .rarity(Rarity.EPIC)
            )
    );

    public static final RegistryObject<Item> VORTEX_VACCINE = ITEMS.register("vortex_vaccine",
            () -> new VortexVaccine(new Item.Properties()
                    .stacksTo(64)
                    .rarity(Rarity.EPIC)
            )
    );
}
