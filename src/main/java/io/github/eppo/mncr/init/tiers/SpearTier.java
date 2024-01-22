package io.github.eppo.mncr.init.tiers;

import io.github.eppo.mncr.init.MncrTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class SpearTier {

    public static final ForgeTier SPEAR = new ForgeTier(
            4,
            700,
            1,
            1,
            20,
            MncrTags.NEEDS_SPEAR_TOOL,
            ()-> Ingredient.EMPTY
    );
}
