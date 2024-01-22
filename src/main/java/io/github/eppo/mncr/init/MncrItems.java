package io.github.eppo.mncr.init;

import io.github.eppo.mncr.init.tiers.AbortoTier;
import io.github.eppo.mncr.init.tiers.PakistaniTier;
import io.github.eppo.mncr.init.tiers.SpearTier;
import io.github.eppo.mncr.items.misc.DeathNote;
import io.github.eppo.mncr.items.tools.AbortionSword;
import io.github.eppo.mncr.items.tools.InvertedSpear;
import io.github.eppo.mncr.items.tools.PakistaniPickaxe;
import io.github.eppo.mncr.items.vaccines.*;
import io.github.eppo.mncr.items.wearables.MainHelmet;
import io.github.eppo.mncr.MainCraft;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.lwjgl.opengl.INTELPerformanceQuery;

public class MncrItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MainCraft.MODID);

    //Items
    public static final RegistryObject<Item> DEATH_NOTE = ITEMS.register("death_note",
            () -> new DeathNote(new Item.Properties()
                    .stacksTo(1)
            )
    );

    //Tools
    public static final RegistryObject<Item> ABORTION_SWORD = ITEMS.register("abortion_sword",
            () -> new AbortionSword(AbortoTier.ABORTO, 1, -100f, new Item.Properties()
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


    //BlockItems
    public static final RegistryObject<BlockItem> PAKISTANI_BLOCK_ITEM = ITEMS.register("pakistani_block",
            () -> new BlockItem(MncrBlocks.PAKISTANI_BLOCK.get(), new Item.Properties()
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

    public static final RegistryObject<Item> GOLDEN_VACCINE = ITEMS.register("golden_vaccine.json",
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
