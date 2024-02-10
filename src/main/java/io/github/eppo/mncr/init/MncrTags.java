package io.github.eppo.mncr.init;

import io.github.eppo.mncr.MainCraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class MncrTags {
    public static final TagKey<Block> NEEDS_ABORTO_TOOL = tag("needs_aborto_tool");

    public static final TagKey<Block> NEEDS_SPEAR_TOOL = tag("needs_spear_tool");

    public static final TagKey<Block> NEEDS_PAKISTANI_TOOL = tag("needs_pakistani_tool.json");
    private static TagKey<Block> tag(String name) {
        return BlockTags.create(new ResourceLocation(MainCraft.MODID, name));
    }
}
