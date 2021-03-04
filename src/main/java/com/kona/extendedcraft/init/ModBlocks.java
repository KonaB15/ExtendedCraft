package com.kona.extendedcraft.init;

import com.kona.extendedcraft.ExtendedCraft;
import com.kona.extendedcraft.blocks.*;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ExtendedCraft.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ExtendedCraft.MOD_ID);


    public static void init() {
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    //Blocks
    public static final RegistryObject<Block> KONIUM_BLOCK = BLOCKS.register("konium_block", KoniumBlock::new);
    public static final RegistryObject<Block> KONIUM_ORE = BLOCKS.register("konium_ore", KoniumOre::new);
    public static final RegistryObject<Block> FURYIUM_ORE = BLOCKS.register("furyium_ore", FuryiumOre::new);
    public static final RegistryObject<Block> RAW_FURYIUM_BLOCK = BLOCKS.register("raw_furyium_block", RFuryiumBlock::new);
    public static final RegistryObject<Block> RAW_FURYIUM_BRICKS = BLOCKS.register("raw_furyium_bricks", RFuryiumBricks::new);
    public static final RegistryObject<Block> FURYIUM_BLOCK = BLOCKS.register("furyium_block", FuryiumBlock::new);
    public static final RegistryObject<Block> FURYIUM_BRICKS = BLOCKS.register("furyium_bricks", FuryiumBricks::new);


    //Block Items
    public static final RegistryObject<Item> KONIUM_BLOCK_ITEM = ITEMS.register("konium_block", () -> new BlockItemBase(KONIUM_BLOCK.get()));
    public static final RegistryObject<Item> Konium_ORE_ITEM = ITEMS.register("konium_ore", () -> new BlockItemBase(KONIUM_ORE.get()));
    public static final RegistryObject<Item> FURYIUM_ORE_ITEM = ITEMS.register("furyium_ore", () -> new BlockItemBase(FURYIUM_ORE.get()));
    public static final RegistryObject<Item> RAW_FURYIUM_BLOCK_ITEM = ITEMS.register("raw_furyium_block", () -> new BlockItemBase(RAW_FURYIUM_BLOCK.get()));
    public static final RegistryObject<Item> RAW_FURYIUM_BRICKS_ITEM = ITEMS.register("raw_furyium_bricks", () -> new BlockItemBase(RAW_FURYIUM_BRICKS.get()));
    public static final RegistryObject<Item> FURYIUM_BLOCK_ITEM = ITEMS.register("furyium_block", () -> new BlockItemBase(FURYIUM_BLOCK.get()));
    public static final RegistryObject<Item> FURYIUM_BRICKS_ITEM = ITEMS.register("furyium_bricks", () -> new BlockItemBase(FURYIUM_BRICKS.get()));

}
