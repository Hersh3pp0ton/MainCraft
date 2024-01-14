package io.github.eppo.mncr.init.tiers;

import io.github.eppo.mncr.init.MncrTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class AbortoTier {
    public static final ForgeTier ABORTO = new ForgeTier(
            4,
            500,
            1,
            1,
            20,
            MncrTags.NEEDS_ABORTO_TOOL,
            () -> Ingredient.EMPTY
            );
}
