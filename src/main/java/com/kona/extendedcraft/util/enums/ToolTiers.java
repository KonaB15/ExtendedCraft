package com.kona.extendedcraft.util.enums;

import com.kona.extendedcraft.init.ModItems;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

import java.util.function.Supplier;

//TODO change durability and speed tiers

public enum ToolTiers implements IItemTier {


    WOOD(0, 20, 1, 0.0f, 1),
    STONE(1, 40, 2, 0.0f, 2),
    IRON(2, 80, 4, 0.0f, 4),
    GOLD(3, 160, 6, 0.0f, 8 ),
    DIAMOND(4, 320, 8, 0.0f, 16),
    NETHERITE(5, 640, 10, 0.0f, 32),
    KONIUM(6, 409600, 15, 1.0f, 64),
    FURYIUM(6, 1638400, 25, 1.5f, 128);

    private final int harvestLevel;
    private final int maxUses;
    private final int efficiency;
    private final float attackDamage;
    private final int enchantabiliby;


    ToolTiers(int harvestLevel, int maxUses, int efficiency, float attackDamage, int enchantabiliby) {
        this.harvestLevel = harvestLevel;
        this.maxUses = maxUses;
        this.efficiency = efficiency;
        this.attackDamage = attackDamage;
        this.enchantabiliby = enchantabiliby;


    }

    @Override
    public int getMaxUses() {
        return maxUses;
    }

    @Override
    public float getEfficiency() {
        return efficiency;
    }

    @Override
    public float getAttackDamage() {
        return attackDamage;
    }

    @Override
    public int getHarvestLevel() {
        return harvestLevel;
    }

    @Override
    public int getEnchantability() {
        return enchantabiliby;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return null;
    }
}
