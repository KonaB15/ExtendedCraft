package com.kona.extendedcraft;




import com.kona.extendedcraft.config.CommonConfig;
import com.kona.extendedcraft.config.ConfigHandeler;
import com.kona.extendedcraft.init.*;

import com.kona.extendedcraft.world.OreGeneration;
import net.minecraft.entity.boss.dragon.EnderDragonEntity;
import net.minecraft.entity.monster.EndermanEntity;
import net.minecraft.entity.monster.SkeletonEntity;
import net.minecraft.entity.monster.SpiderEntity;
import net.minecraft.entity.monster.ZombieEntity;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

import net.minecraft.item.Items;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.Hand;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLPaths;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import net.minecraftforge.fml.ModLoadingContext;

@Mod("extc")
public class ExtendedCraft {




    private static final Logger LOG = LogManager.getLogger();
    public static final String MOD_ID = "extc";



    //public static final ResourceLocation FURIOUS_CAVES = new ResourceLocation("extc:furious");
    //public static final RegistryKey<World> FURIOUS_DIM = RegistryKey.getOrCreateKey(Registry.WORLD_KEY, new ResourceLocation("extc:furious"));


    public ExtendedCraft() {



        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);
        final ModLoadingContext modLoadingContext = ModLoadingContext.get();
        modLoadingContext.registerConfig(ModConfig.Type.COMMON, ConfigHandeler.COMMON_SPEC, "ExtendedCraft.toml");

        MinecraftForge.EVENT_BUS.addListener(EventPriority.HIGH, OreGeneration::addFeaturesToBiomes);
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


    @SubscribeEvent
    public void buffZombie(EntityJoinWorldEvent event) {
        if (!(event.getEntity() instanceof ZombieEntity)) {
            return;
        }
        ZombieEntity zombie = (ZombieEntity) event.getEntity();

        zombie.setHealth(100.0f);
        zombie.addPotionEffect(new EffectInstance(Effects.SPEED, 1000000000, 2));
        zombie.addPotionEffect(new EffectInstance(Effects.JUMP_BOOST, 1000000000, 2));
        zombie.addPotionEffect(new EffectInstance(Effects.STRENGTH, 1000000000, 2));
        zombie.addPotionEffect(new EffectInstance(Effects.FIRE_RESISTANCE, 1000000000, 10));
        zombie.addPotionEffect(new EffectInstance(Effects.WATER_BREATHING, 1000000000, 10));
    }

    @SubscribeEvent
    public void buffSkeleton(EntityJoinWorldEvent event) {
        if (!(event.getEntity() instanceof SkeletonEntity)) {
            return;
        }
        SkeletonEntity skel = (SkeletonEntity) event.getEntity();


        skel.setHealth(100.0f);
        skel.addPotionEffect(new EffectInstance(Effects.SPEED, 1000000000, 2));
        skel.addPotionEffect(new EffectInstance(Effects.JUMP_BOOST, 1000000000, 1));
        skel.addPotionEffect(new EffectInstance(Effects.STRENGTH, 1000000000, 2));
        skel.addPotionEffect(new EffectInstance(Effects.FIRE_RESISTANCE, 1000000000, 10));
        skel.addPotionEffect(new EffectInstance(Effects.WATER_BREATHING, 1000000000, 10));
    }

    @SubscribeEvent
    public void buffSpider(EntityJoinWorldEvent event) {
        if (!(event.getEntity() instanceof SpiderEntity)) {
            return;
        }
        SpiderEntity spid = (SpiderEntity) event.getEntity();


        spid.setHealth(70.0f);
        spid.addPotionEffect(new EffectInstance(Effects.SPEED, 1000000000, 4));
        spid.addPotionEffect(new EffectInstance(Effects.JUMP_BOOST, 1000000000, 2));
        spid.addPotionEffect(new EffectInstance(Effects.STRENGTH, 1000000000, 2));
        spid.addPotionEffect(new EffectInstance(Effects.FIRE_RESISTANCE, 1000000000, 10));
        spid.addPotionEffect(new EffectInstance(Effects.WATER_BREATHING, 1000000000, 10));
    }


    @SubscribeEvent
    public void buffEnderMan(EntityJoinWorldEvent event) {
        if (!(event.getEntity() instanceof EndermanEntity)) {
            return;
        }
        EndermanEntity man = (EndermanEntity) event.getEntity();


        man.setHealth(200.0f);
        man.addPotionEffect(new EffectInstance(Effects.SPEED, 1000000000, 2));
        man.addPotionEffect(new EffectInstance(Effects.JUMP_BOOST, 1000000000, 2));
        man.addPotionEffect(new EffectInstance(Effects.STRENGTH, 1000000000, 2));
        man.addPotionEffect(new EffectInstance(Effects.FIRE_RESISTANCE, 1000000000, 10));
        man.addPotionEffect(new EffectInstance(Effects.WATER_BREATHING, 1000000000, 10));
    }

}
