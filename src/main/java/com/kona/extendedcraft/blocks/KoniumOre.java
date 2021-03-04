package com.kona.extendedcraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.OreBlock;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class KoniumOre extends OreBlock {
    public KoniumOre() {
        super(Block.Properties.create(Material.IRON)
                .hardnessAndResistance(35.0f, 40f)
                .harvestLevel(4)
                .harvestTool(ToolType.PICKAXE)
        );
    }
}
