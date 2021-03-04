package com.kona.extendedcraft.items;

import com.kona.extendedcraft.ExtendedCraft;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ItemBase extends Item {
    public ItemBase() {
        super(new Item.Properties().group(ExtendedCraft.TAB));
    }
}
