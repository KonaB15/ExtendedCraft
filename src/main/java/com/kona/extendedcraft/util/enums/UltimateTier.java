package com.kona.extendedcraft.util.enums;

import com.kona.extendedcraft.init.ModItems;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum UltimateTier implements IItemTier {

    ULTIUM(8, 999999999, 22, 6, 50, () -> {
        return Ingredient.fromItems(ModItems.KONIUM.get());
    });

    private final int harvestLevel;
    private final int maxUses;
    private final int efficiency;
    private final int attackDamage;
    private final int enchantabiliby;
    private final Supplier<Ingredient> repairMaterial;

    UltimateTier(int harvestLevel, int maxUses, int efficiency, int attackDamage, int enchantabiliby, Supplier<Ingredient> repairMaterial) {
        this.harvestLevel = harvestLevel;
        this.maxUses = maxUses;
        this.efficiency = efficiency;
        this.attackDamage = attackDamage;
        this.enchantabiliby = enchantabiliby;
        this.repairMaterial = repairMaterial;

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