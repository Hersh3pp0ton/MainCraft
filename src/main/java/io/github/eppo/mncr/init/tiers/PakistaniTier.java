package io.github.eppo.mncr.init.tiers;

import io.github.eppo.mncr.init.MncrTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class PakistaniTier {
    public static final ForgeTier PAKISTANI = new ForgeTier(
                    1,
                    700,
                    10,
                    0,
                    10,
                    MncrTags.NEEDS_PAKISTANI_TOOL,
                    () -> Ingredient.EMPTY
    );
}
