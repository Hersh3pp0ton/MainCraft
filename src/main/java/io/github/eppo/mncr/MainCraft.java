package io.github.eppo.mncr;

import io.github.eppo.mncr.init.MncrItems;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(MainCraft.MODID)
public class MainCraft {

    public static final String MODID = "mncr";

    public MainCraft() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        MncrItems.ITEMS.register(bus);
    }
}
