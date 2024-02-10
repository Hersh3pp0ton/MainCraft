package io.github.eppo.mncr.init;

import io.github.eppo.mncr.MainCraft;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class MncrBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MainCraft.MODID);

    public static final RegistryObject<Block> PAKISTANI_BLOCK = BLOCKS.register("pakistani_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3.5f)
                    .sound(SoundType.STONE)
                    .pushReaction(PushReaction.PUSH_ONLY)
                    .mapColor(MapColor.DIRT)
            )
    );

    public static final RegistryObject<DropExperienceBlock> MAINITE_ORE = BLOCKS.register("mainite_ore",
            () -> new DropExperienceBlock(ConstantInt.of(10),
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.TERRACOTTA_BLACK)
                            .lightLevel(state -> 10)
                            .requiresCorrectToolForDrops()
                            .strength(4.5f, 3.0F)
                            .sound(SoundType.AMETHYST)
            )
    );
}
