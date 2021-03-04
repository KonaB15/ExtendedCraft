package com.kona.extendedcraft.init;

import com.kona.extendedcraft.ExtendedCraft;
import com.kona.extendedcraft.util.enums.ArmorTiers;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModArmor {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ExtendedCraft.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    //Leather
    public static final RegistryObject<ArmorItem> LEATHER_HELMET = ITEMS.register("leather_helmet", () -> new ArmorItem(ArmorTiers.LEATHER, EquipmentSlotType.HEAD, new Item.Properties().group(ExtendedCraft.A_TAB)));
    public static final RegistryObject<ArmorItem> LEATHER_CHESTPLATE = ITEMS.register("leather_chestplate", () -> new ArmorItem(ArmorTiers.LEATHER, EquipmentSlotType.CHEST, new Item.Properties().group(ExtendedCraft.A_TAB)));
    public static final RegistryObject<ArmorItem> LEATHER_LEGGINGS = ITEMS.register("leather_leggings", () -> new ArmorItem(ArmorTiers.LEATHER, EquipmentSlotType.LEGS, new Item.Properties().group(ExtendedCraft.A_TAB)));
    public static final RegistryObject<ArmorItem> LEATHER_BOOTS = ITEMS.register("leather_boots", () -> new ArmorItem(ArmorTiers.LEATHER, EquipmentSlotType.FEET, new Item.Properties().group(ExtendedCraft.A_TAB)));

    //Chain
    public static final RegistryObject<ArmorItem> CHAIN_HELMET = ITEMS.register("chain_helmet", () -> new ArmorItem(ArmorTiers.CHAIN, EquipmentSlotType.HEAD, new Item.Properties().group(ExtendedCraft.A_TAB)));
    public static final RegistryObject<ArmorItem> CHAIN_CHESTPLATE = ITEMS.register("chain_chestplate", () -> new ArmorItem(ArmorTiers.CHAIN, EquipmentSlotType.CHEST, new Item.Properties().group(ExtendedCraft.A_TAB)));
    public static final RegistryObject<ArmorItem> CHAIN_LEGGINGS = ITEMS.register("chain_leggings", () -> new ArmorItem(ArmorTiers.CHAIN, EquipmentSlotType.LEGS, new Item.Properties().group(ExtendedCraft.A_TAB)));
    public static final RegistryObject<ArmorItem> CHAIN_BOOTS = ITEMS.register("chain_boots", () -> new ArmorItem(ArmorTiers.CHAIN, EquipmentSlotType.FEET, new Item.Properties().group(ExtendedCraft.A_TAB)));

    //Iron
    public static final RegistryObject<ArmorItem> IRON_HELMET = ITEMS.register("iron_helmet", () -> new ArmorItem(ArmorTiers.IRON, EquipmentSlotType.HEAD, new Item.Properties().group(ExtendedCraft.A_TAB)));
    public static final RegistryObject<ArmorItem> IRON_CHESTPLATE = ITEMS.register("iron_chestplate", () -> new ArmorItem(ArmorTiers.IRON, EquipmentSlotType.CHEST, new Item.Properties().group(ExtendedCraft.A_TAB)));
    public static final RegistryObject<ArmorItem> IRON_LEGGINGS = ITEMS.register("iron_leggings", () -> new ArmorItem(ArmorTiers.IRON, EquipmentSlotType.LEGS, new Item.Properties().group(ExtendedCraft.A_TAB)));
    public static final RegistryObject<ArmorItem> IRON_BOOTS = ITEMS.register("iron_boots", () -> new ArmorItem(ArmorTiers.IRON, EquipmentSlotType.FEET, new Item.Properties().group(ExtendedCraft.A_TAB)));

    //Gold
    public static final RegistryObject<ArmorItem> GOLD_HELMET = ITEMS.register("gold_helmet", () -> new ArmorItem(ArmorTiers.GOLD, EquipmentSlotType.HEAD, new Item.Properties().group(ExtendedCraft.A_TAB)));
    public static final RegistryObject<ArmorItem> GOLD_CHESTPLATE = ITEMS.register("gold_chestplate", () -> new ArmorItem(ArmorTiers.GOLD, EquipmentSlotType.CHEST, new Item.Properties().group(ExtendedCraft.A_TAB)));
    public static final RegistryObject<ArmorItem> GOLD_LEGGINGS = ITEMS.register("gold_leggings", () -> new ArmorItem(ArmorTiers.GOLD, EquipmentSlotType.LEGS, new Item.Properties().group(ExtendedCraft.A_TAB)));
    public static final RegistryObject<ArmorItem> GOLD_BOOTS = ITEMS.register("gold_boots", () -> new ArmorItem(ArmorTiers.GOLD, EquipmentSlotType.FEET, new Item.Properties().group(ExtendedCraft.A_TAB)));

    //Diamond
    public static final RegistryObject<ArmorItem> DIAMOND_HELM = ITEMS.register("diamond_helm", () -> new ArmorItem(ArmorTiers.DIAMOND, EquipmentSlotType.HEAD, new Item.Properties().group(ExtendedCraft.A_TAB)));
    public static final RegistryObject<ArmorItem> DIAMOND_CHESTPLATE = ITEMS.register("diamond_chestplate", () -> new ArmorItem(ArmorTiers.DIAMOND, EquipmentSlotType.CHEST, new Item.Properties().group(ExtendedCraft.A_TAB)));
    public static final RegistryObject<ArmorItem> DIAMOND_LEGGINGS = ITEMS.register("diamond_leggings", () -> new ArmorItem(ArmorTiers.DIAMOND, EquipmentSlotType.LEGS, new Item.Properties().group(ExtendedCraft.A_TAB)));
    public static final RegistryObject<ArmorItem> DIAMOND_BOOTS = ITEMS.register("diamond_boots", () -> new ArmorItem(ArmorTiers.DIAMOND, EquipmentSlotType.FEET, new Item.Properties().group(ExtendedCraft.A_TAB)));

    //Netherite
    public static final RegistryObject<ArmorItem> NETHERITE_HELMET = ITEMS.register("netherite_helmet", () -> new ArmorItem(ArmorTiers.NETHERITE, EquipmentSlotType.HEAD, new Item.Properties().group(ExtendedCraft.A_TAB)));
    public static final RegistryObject<ArmorItem> NETHERITE_CHESTPLATE = ITEMS.register("netherite_chestplate", () -> new ArmorItem(ArmorTiers.NETHERITE, EquipmentSlotType.CHEST, new Item.Properties().group(ExtendedCraft.A_TAB)));
    public static final RegistryObject<ArmorItem> NETHERITE_LEGGINGS = ITEMS.register("netherite_leggings", () -> new ArmorItem(ArmorTiers.NETHERITE, EquipmentSlotType.LEGS, new Item.Properties().group(ExtendedCraft.A_TAB)));
    public static final RegistryObject<ArmorItem> NETHERITE_BOOTS = ITEMS.register("netherite_boots", () -> new ArmorItem(ArmorTiers.NETHERITE, EquipmentSlotType.FEET, new Item.Properties().group(ExtendedCraft.A_TAB)));

    //Konium
    public static final RegistryObject<ArmorItem> KONIUM_HELMET = ITEMS.register("konium_helmet", () -> new ArmorItem(ArmorTiers.KONIUM, EquipmentSlotType.HEAD, new Item.Properties().group(ExtendedCraft.A_TAB)));
    public static final RegistryObject<ArmorItem> KONIUM_CHESTPLATE = ITEMS.register("konium_chestplate", () -> new ArmorItem(ArmorTiers.KONIUM, EquipmentSlotType.CHEST, new Item.Properties().group(ExtendedCraft.A_TAB)));
    public static final RegistryObject<ArmorItem> KONIUM_LEGGINGS = ITEMS.register("konium_leggings", () -> new ArmorItem(ArmorTiers.KONIUM, EquipmentSlotType.LEGS, new Item.Properties().group(ExtendedCraft.A_TAB)));
    public static final RegistryObject<ArmorItem> KONIUM_BOOTS = ITEMS.register("konium_boots", () -> new ArmorItem(ArmorTiers.KONIUM, EquipmentSlotType.FEET, new Item.Properties().group(ExtendedCraft.A_TAB)));

    //Furyium
    public static final RegistryObject<ArmorItem> FURYIUM_HELMET = ITEMS.register("furyium_helmet", () -> new ArmorItem(ArmorTiers.FURYIUM, EquipmentSlotType.HEAD, new Item.Properties().group(ExtendedCraft.A_TAB)));
    public static final RegistryObject<ArmorItem> FURYIUM_CHESTPLATE = ITEMS.register("furyium_chestplate", () -> new ArmorItem(ArmorTiers.FURYIUM, EquipmentSlotType.CHEST, new Item.Properties().group(ExtendedCraft.A_TAB)));
    public static final RegistryObject<ArmorItem> FURYIUM_LEGGINGS = ITEMS.register("furyium_leggings", () -> new ArmorItem(ArmorTiers.FURYIUM, EquipmentSlotType.LEGS, new Item.Properties().group(ExtendedCraft.A_TAB)));
    public static final RegistryObject<ArmorItem> FURYIUM_BOOTS = ITEMS.register("furyium_boots", () -> new ArmorItem(ArmorTiers.FURYIUM, EquipmentSlotType.FEET, new Item.Properties().group(ExtendedCraft.A_TAB)));



}
