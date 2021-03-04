package com.kona.extendedcraft.init;

import com.kona.extendedcraft.ExtendedCraft;
import com.kona.extendedcraft.util.enums.ToolTiers;
import com.kona.extendedcraft.util.enums.UltimateTier;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModTools {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ExtendedCraft.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }


    //Wood
    public static final RegistryObject<SwordItem> WOOD_SWORD = ITEMS.register("wooden_sword", () -> new SwordItem(ToolTiers.WOOD, 1, -3.4f, new Item.Properties().group(ExtendedCraft.T_TAB)));
    public static final RegistryObject<PickaxeItem> WOOD_PICKAXE = ITEMS.register("wooden_pickaxe", () -> new PickaxeItem(ToolTiers.WOOD, 0, -3.8f, new Item.Properties().group(ExtendedCraft.T_TAB)));
    public static final RegistryObject<AxeItem> WOOD_AXE = ITEMS.register("wooden_axe", () -> new AxeItem(ToolTiers.WOOD, 2, -3.8f, new Item.Properties().group(ExtendedCraft.T_TAB)));
    public static final RegistryObject<ShovelItem> WOOD_SHOVEL = ITEMS.register("wooden_shovel", () -> new ShovelItem(ToolTiers.WOOD, 0, -3.8f, new Item.Properties().group(ExtendedCraft.T_TAB)));
    public static final RegistryObject<HoeItem> WOOD_HOE = ITEMS.register("wooden_hoe", () -> new HoeItem(ToolTiers.WOOD, 0, -3.8f, new Item.Properties().group(ExtendedCraft.T_TAB)));

    //Stone
    public static final RegistryObject<SwordItem> STONE_SWORD = ITEMS.register("stone_sword", () -> new SwordItem(ToolTiers.STONE, 2, -3.4f, new Item.Properties().group(ExtendedCraft.T_TAB)));
    public static final RegistryObject<PickaxeItem> STONE_PICKAXE = ITEMS.register("stone_pickaxe", () -> new PickaxeItem(ToolTiers.STONE, 1, -3.6f, new Item.Properties().group(ExtendedCraft.T_TAB)));
    public static final RegistryObject<AxeItem> STONE_AXE = ITEMS.register("stone_axe", () -> new AxeItem(ToolTiers.STONE, 3, -3.6f, new Item.Properties().group(ExtendedCraft.T_TAB)));
    public static final RegistryObject<ShovelItem> STONE_SHOVEL = ITEMS.register("stone_shovel", () -> new ShovelItem(ToolTiers.STONE, 0, -3.6f, new Item.Properties().group(ExtendedCraft.T_TAB)));
    public static final RegistryObject<HoeItem> STONE_HOE = ITEMS.register("stone_hoe", () -> new HoeItem(ToolTiers.STONE, 1, -3.6f, new Item.Properties().group(ExtendedCraft.T_TAB)));

    //Iron
    public static final RegistryObject<SwordItem> IRON_SWORD = ITEMS.register("iron_sword", () -> new SwordItem(ToolTiers.IRON, 3, -3.2f, new Item.Properties().group(ExtendedCraft.T_TAB)));
    public static final RegistryObject<PickaxeItem> IRON_PICKAXE = ITEMS.register("iron_pickaxe", () -> new PickaxeItem(ToolTiers.IRON, 2, -3.4f, new Item.Properties().group(ExtendedCraft.T_TAB)));
    public static final RegistryObject<AxeItem> IRON_AXE = ITEMS.register("iron_axe", () -> new AxeItem(ToolTiers.IRON, 4, -3.4f, new Item.Properties().group(ExtendedCraft.T_TAB)));
    public static final RegistryObject<ShovelItem> IRON_SHOVEL = ITEMS.register("iron_shovel", () -> new ShovelItem(ToolTiers.IRON, 0, -3.4f, new Item.Properties().group(ExtendedCraft.T_TAB)));
    public static final RegistryObject<HoeItem> IRON_HOE = ITEMS.register("iron_hoe", () -> new HoeItem(ToolTiers.IRON, 2, -3.4f, new Item.Properties().group(ExtendedCraft.T_TAB)));

    //Gold
    public static final RegistryObject<SwordItem> GOLD_SWORD = ITEMS.register("gold_sword", () -> new SwordItem(ToolTiers.GOLD, 4, -2.8f, new Item.Properties().group(ExtendedCraft.T_TAB)));
    public static final RegistryObject<PickaxeItem> GOLD_PICKAXE = ITEMS.register("gold_pickaxe", () -> new PickaxeItem(ToolTiers.GOLD, 3, -3.0f, new Item.Properties().group(ExtendedCraft.T_TAB)));
    public static final RegistryObject<AxeItem> GOLD_AXE = ITEMS.register("gold_axe", () -> new AxeItem(ToolTiers.GOLD, 5, -3.0f, new Item.Properties().group(ExtendedCraft.T_TAB)));
    public static final RegistryObject<ShovelItem> GOLD_SHOVEL = ITEMS.register("gold_shovel", () -> new ShovelItem(ToolTiers.GOLD, 0, -3.0f, new Item.Properties().group(ExtendedCraft.T_TAB)));
    public static final RegistryObject<HoeItem> GOLD_HOE = ITEMS.register("gold_hoe", () -> new HoeItem(ToolTiers.GOLD, 3, -3.0f, new Item.Properties().group(ExtendedCraft.T_TAB)));

    //Diamond
    public static final RegistryObject<SwordItem> DIAMOND_SWORD = ITEMS.register("diamond_sword", () -> new SwordItem(ToolTiers.DIAMOND, 5, -3.0f, new Item.Properties().group(ExtendedCraft.T_TAB)));
    public static final RegistryObject<PickaxeItem> DIAMOND_PICKAXE = ITEMS.register("diamond_pickaxe", () -> new PickaxeItem(ToolTiers.DIAMOND, 4, -3.2f, new Item.Properties().group(ExtendedCraft.T_TAB)));
    public static final RegistryObject<AxeItem> DIAMOND_AXE = ITEMS.register("diamond_axe", () -> new AxeItem(ToolTiers.DIAMOND, 6, -3.2f, new Item.Properties().group(ExtendedCraft.T_TAB)));
    public static final RegistryObject<ShovelItem> DIAMOND_SHOVEL = ITEMS.register("diamond_shovel", () -> new ShovelItem(ToolTiers.DIAMOND, 0, -3.2f, new Item.Properties().group(ExtendedCraft.T_TAB)));
    public static final RegistryObject<HoeItem> DIAMOND_HOE = ITEMS.register("diamond_hoe", () -> new HoeItem(ToolTiers.DIAMOND, 4, -3.2f, new Item.Properties().group(ExtendedCraft.T_TAB)));

    //Netherite
    public static final RegistryObject<SwordItem> NETHERITE_SWORD = ITEMS.register("netherite_sword", () -> new SwordItem(ToolTiers.NETHERITE, 6, -2.8f, new Item.Properties().group(ExtendedCraft.T_TAB)));
    public static final RegistryObject<PickaxeItem> NETHERITE_PICKAXE = ITEMS.register("netherite_pickaxe", () -> new PickaxeItem(ToolTiers.NETHERITE, 4, -3.0f, new Item.Properties().group(ExtendedCraft.T_TAB)));
    public static final RegistryObject<AxeItem> NETHERITE_AXE = ITEMS.register("netherite_axe", () -> new AxeItem(ToolTiers.NETHERITE, 7, -3.0f, new Item.Properties().group(ExtendedCraft.T_TAB)));
    public static final RegistryObject<ShovelItem> NETHERITE_SHOVEL = ITEMS.register("netherite_shovel", () -> new ShovelItem(ToolTiers.NETHERITE, 0, -3.0f, new Item.Properties().group(ExtendedCraft.T_TAB)));
    public static final RegistryObject<HoeItem> NETHERITE_HOE = ITEMS.register("netherite_hoe", () -> new HoeItem(ToolTiers.NETHERITE, 5, -3.0f, new Item.Properties().group(ExtendedCraft.T_TAB)));

    //Konium
    public static final RegistryObject<SwordItem> KONIUM_SWORD = ITEMS.register("konium_sword", () -> new SwordItem(ToolTiers.KONIUM, 7, -2.4f, new Item.Properties().group(ExtendedCraft.T_TAB)));
    public static final RegistryObject<PickaxeItem> KONIUM_PICKAXE = ITEMS.register("konium_pickaxe", () -> new PickaxeItem(ToolTiers.KONIUM, 4, -2.8f, new Item.Properties().group(ExtendedCraft.T_TAB)));
    public static final RegistryObject<AxeItem> KONIUM_AXE = ITEMS.register("konium_axe", () -> new AxeItem(ToolTiers.KONIUM, 8, -2.8f, new Item.Properties().group(ExtendedCraft.T_TAB)));
    public static final RegistryObject<ShovelItem> KONIUM_SHOVEL = ITEMS.register("konium_shovel", () -> new ShovelItem(ToolTiers.KONIUM, 0, -2.8f, new Item.Properties().group(ExtendedCraft.T_TAB)));
    public static final RegistryObject<HoeItem> KONIUM_HOE = ITEMS.register("konium_hoe", () -> new HoeItem(ToolTiers.KONIUM, 4, -2.8f, new Item.Properties().group(ExtendedCraft.T_TAB)));

    //Furyium
    public static final RegistryObject<SwordItem> FURYIUM_SWORD = ITEMS.register("furyium_sword", () -> new SwordItem(ToolTiers.FURYIUM, 8, -2.2f, new Item.Properties().group(ExtendedCraft.T_TAB)));
    public static final RegistryObject<PickaxeItem> FURYIUM_PICKAXE = ITEMS.register("furyium_pickaxe", () -> new PickaxeItem(ToolTiers.FURYIUM, 5, -2.8f, new Item.Properties().group(ExtendedCraft.T_TAB)));
    public static final RegistryObject<AxeItem> FURYIUM_AXE = ITEMS.register("furyium_axe", () -> new AxeItem(ToolTiers.FURYIUM, 9, -2.8f, new Item.Properties().group(ExtendedCraft.T_TAB)));
    public static final RegistryObject<ShovelItem> FURYIUM_SHOVEL = ITEMS.register("furyium_shovel", () -> new ShovelItem(ToolTiers.FURYIUM, 0, -2.8f, new Item.Properties().group(ExtendedCraft.T_TAB)));
    public static final RegistryObject<HoeItem> FURYIUM_HOE = ITEMS.register("furyium_hoe", () -> new HoeItem(ToolTiers.FURYIUM, 5, -2.8f, new Item.Properties().group(ExtendedCraft.T_TAB)));


    //Ultimate Material
    public static final RegistryObject<SwordItem> U_SWORD = ITEMS.register("u_sword", () -> new SwordItem(UltimateTier.ULTIUM, 20, 0.0f, new Item.Properties()));

}
