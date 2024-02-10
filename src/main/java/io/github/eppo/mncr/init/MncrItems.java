package io.github.eppo.mncr.init;

import io.github.eppo.mncr.init.tiers.AbortoTier;
import io.github.eppo.mncr.init.tiers.PakistaniTier;
import io.github.eppo.mncr.init.tiers.SpearTier;
import io.github.eppo.mncr.items.misc.DeathNote;
import io.github.eppo.mncr.items.tools.AbortionSword;
import io.github.eppo.mncr.items.tools.InvertedSpear;
import io.github.eppo.mncr.items.tools.PakistaniPickaxe;
import io.github.eppo.mncr.items.vaccines.*;
import io.github.eppo.mncr.items.wearables.VaccineTalisman;
import io.github.eppo.mncr.items.wearables.armor.MainBoots;
import io.github.eppo.mncr.items.wearables.armor.MainChestplate;
import io.github.eppo.mncr.items.wearables.armor.MainHelmet;
import io.github.eppo.mncr.MainCraft;
import io.github.eppo.mncr.items.wearables.armor.MainLeggings;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class MncrItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MainCraft.MODID);

    //Items
    public static final RegistryObject<Item> DEATH_NOTE = ITEMS.register("death_note",
            () -> new DeathNote(new Item.Properties()
                    .stacksTo(1)
            )
    );

    public static final RegistryObject<Item> MAINITE = ITEMS.register("mainite",
            () -> new Item(new Item.Properties()
                    .stacksTo(64)));

    //Tools
    public static final RegistryObject<Item> ABORTION_SWORD = ITEMS.register("abortion_sword",
            () -> new InvertedSpear(SpearTier.SPEAR, 5, 0.5f, new Item.Properties()
                    .stacksTo(1)
            )
    );

    public static final RegistryObject<Item> INVERTED_SPEAR_OF_HEAVEN = ITEMS.register("inverted_spear_of_heaven",
            () -> new InvertedSpear(SpearTier.SPEAR, 5, 1, new Item.Properties()
                    .stacksTo(1)
            )
    );

    public static final RegistryObject<Item> PAKISTANI_PICKAXE = ITEMS.register("pakistani_pickaxe",
            () -> new PakistaniPickaxe(PakistaniTier.PAKISTANI, 1, 1, new Item.Properties()
                    .stacksTo(1)
            )
    );

    //Armor
    public static final RegistryObject<Item> MAIN_HELMET = ITEMS.register("main_helmet",
            () -> new MainHelmet(MainMaterialInit.MAIN, ArmorItem.Type.HELMET, new Item.Properties()
            )
    );

    public static final RegistryObject<Item> MAIN_CHESTPLATE = ITEMS.register("main_chestplate",
            () -> new MainChestplate(MainMaterialInit.MAIN, ArmorItem.Type.CHESTPLATE, new Item.Properties()
            )
    );

    public static final RegistryObject<Item> MAIN_LEGGINGS = ITEMS.register("main_leggings",
            () -> new MainLeggings(MainMaterialInit.MAIN, ArmorItem.Type.LEGGINGS, new Item.Properties()
            )
    );

    public static final RegistryObject<Item> MAIN_BOOTS = ITEMS.register("main_boots",
            () -> new MainBoots(MainMaterialInit.MAIN, ArmorItem.Type.BOOTS, new Item.Properties()
            )
    );

    //Wearables
    public static final RegistryObject<Item> VACCINE_TALISMAN = ITEMS.register("vaccine_talisman",
            () -> new VaccineTalisman(new Item.Properties()
                    .stacksTo(1)
                    .rarity(Rarity.EPIC)
            )
    );

    //BlockItems
    public static final RegistryObject<BlockItem> PAKISTANI_BLOCK_ITEM = ITEMS.register("pakistani_block",
            () -> new BlockItem(MncrBlocks.PAKISTANI_BLOCK.get(), new Item.Properties()
                    .stacksTo(64)
                    .rarity(Rarity.COMMON)
            )
    );

    public static final RegistryObject<BlockItem> MAINITE_ORE_ITEM = ITEMS.register("mainite_ore",
            () -> new BlockItem(MncrBlocks.MAINITE_ORE.get(), new Item.Properties()
                    .stacksTo(64)
                    .rarity(Rarity.COMMON)
            )
    );

    //Vaccines

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
