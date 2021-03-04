package com.kona.extendedcraft.util.enums;

import com.kona.extendedcraft.ExtendedCraft;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
//TODO change prot and durability numbers

public enum ArmorTiers implements IArmorMaterial {

    LEATHER(ExtendedCraft.MOD_ID+ ":leather", 1, new int[] {1, 2, 3, 1}, 1, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0f),
    CHAIN(ExtendedCraft.MOD_ID+":chain", 2, new int[] {1,3,4,1}, 2, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0f),
    IRON(ExtendedCraft.MOD_ID+":iron", 4, new int[] {2,4,6,2}, 4, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0f),
    GOLD(ExtendedCraft.MOD_ID+":gold",8, new int[] {2, 5, 7, 2}, 8, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.0f),
    DIAMOND(ExtendedCraft.MOD_ID+":diamond", 16, new int[] {3,6,9,2}, 16, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0f),
    NETHERITE(ExtendedCraft.MOD_ID+":netherite", 32, new int[] {3, 6, 9, 2}, 32, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.5f),
    KONIUM(ExtendedCraft.MOD_ID+":konium", 1024, new int[] {3,6,9,2}, 64, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 3.0f),
    FURYIUM(ExtendedCraft.MOD_ID+":furyium", 1048576, new int[] {3, 6, 9, 2}, 128, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 9.0f);


    private static final int[] MAX_DAMAGE_ARRAY = new int[] {5, 10, 15, 5};
    private final String name;
    private final int maxDamage;
    private final int[] damageReduction;
    private final int enchant;
    private final SoundEvent sound;
    private final float toughness;

    ArmorTiers(String name, int maxDamage, int [] damageReduction, int enchant, SoundEvent sound, float toughness) {
        this.name = name;
        this.maxDamage = maxDamage;
        this.damageReduction = damageReduction;
        this.enchant = enchant;
        this.sound = sound;
        this.toughness = toughness;
    }

    @Override
    public int getDurability(EquipmentSlotType slotIn) {
        return MAX_DAMAGE_ARRAY[slotIn.getIndex()] * this.maxDamage;
    }

    @Override
    public int getDamageReductionAmount(EquipmentSlotType slotIn) {
        return this.damageReduction[slotIn.getIndex()];
    }

    @Override
    public int getEnchantability() {
        return this.enchant;
    }

    @Override
    public SoundEvent getSoundEvent() {
        return this.sound;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return null;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @OnlyIn(Dist.CLIENT)
    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return 1;
    }
}
