package com.kona.extendedcraft.init;

import com.kona.extendedcraft.ExtendedCraft;
import com.kona.extendedcraft.items.ItemBase;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ExtendedCraft.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    //Items
    public static final RegistryObject<Item> KONIUM = ITEMS.register("konium", ItemBase::new);
    public static final RegistryObject<Item> KONIUM_R = ITEMS.register("konium_r", ItemBase::new);
    public static final RegistryObject<Item> FURYIUM_R = ITEMS.register("furyium_raw", ItemBase::new);
    public static final RegistryObject<Item> FURYIUM = ITEMS.register("furyium_ingot", ItemBase::new);
    public static final RegistryObject<Item> STAR_SHARD = ITEMS.register("star_shard", ItemBase::new);

    //Upgrades
    /*public static final RegistryObject<Item> STONE_UPGRADE = ITEMS.register("stone_upgrade", ItemBase::new);
    public static final RegistryObject<Item> GOLD_UPGRADE = ITEMS.register("gold_upgrade", ItemBase::new);
    public static final RegistryObject<Item> CHAIN_UPGRADE = ITEMS.register("chain_upgrade", ItemBase::new);
    public static final RegistryObject<Item> IRON_UPGRADE = ITEMS.register("iron_upgrade", ItemBase::new);
    public static final RegistryObject<Item> DIAMOND_UPGRADE = ITEMS.register("diamond_upgrade", ItemBase::new);
    public static final RegistryObject<Item> NETHERITE_UPGRADE = ITEMS.register("netherite_upgrade", ItemBase::new);
    public static final RegistryObject<Item> KONIUM_UPGRADE = ITEMS.register("konium_upgrade", ItemBase::new);
    public static final RegistryObject<Item> FURYIUM_UPGRADE = ITEMS.register("furyium_upgrade", ItemBase::new);*/

}
