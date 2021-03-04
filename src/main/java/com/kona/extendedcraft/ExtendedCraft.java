package com.kona.extendedcraft;


import com.kona.extendedcraft.init.*;

import com.kona.extendedcraft.world.OreGeneration;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@Mod("extc")
public class ExtendedCraft {




    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "extc";


    //public static final ResourceLocation FURIOUS_CAVES = new ResourceLocation("extc:furious");
    //public static final RegistryKey<World> FURIOUS_DIM = RegistryKey.getOrCreateKey(Registry.WORLD_KEY, new ResourceLocation("extc:furious"));


    public ExtendedCraft() {

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);
        //MinecraftForge.EVENT_BUS.addListener(EventPriority.HIGH, OreGeneration::addFeaturesToBiomes);
        ModItems.init();
        ModBlocks.init();
        ModTools.init();
        ModArmor.init();

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) { }

    private void doClientStuff(final FMLClientSetupEvent event) {
    }



        public static final ItemGroup TAB = new ItemGroup("extcTab") {

        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.KONIUM_R.get());
        }
    };
    public static final ItemGroup A_TAB = new ItemGroup("exctArmor") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModArmor.KONIUM_HELMET.get());
        }
    };
    public static final ItemGroup T_TAB = new ItemGroup("exctTools") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModTools.KONIUM_SWORD.get());
        }
    };
}
