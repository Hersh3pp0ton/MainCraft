package io.github.eppo.mncr.init;

import io.github.eppo.mncr.MainCraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.ForgeHooks;
import org.jetbrains.annotations.Nullable;

public class MncrTags {
    public static final TagKey<Block> NEEDS_ABORTO_TOOL = tag("needs_aborto_tool");

    private static TagKey<Block> tag(String name) {
        return BlockTags.create(new ResourceLocation(MainCraft.MODID, name));
    }
}
