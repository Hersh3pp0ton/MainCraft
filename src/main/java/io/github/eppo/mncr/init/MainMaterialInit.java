package io.github.eppo.mncr.init;

import io.github.eppo.mncr.init.tiers.MainMaterial;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.crafting.Ingredient;

public class MainMaterialInit {
    public static final MainMaterial MAIN = new MainMaterial(
            new int[] {800, 900, 800, 70},
            new int[] {3, 6, 8, 3},
            15,
            SoundEvents.ANVIL_PLACE,
            () -> Ingredient.EMPTY,
            "main",
            0.25f,
            10
    );
}
