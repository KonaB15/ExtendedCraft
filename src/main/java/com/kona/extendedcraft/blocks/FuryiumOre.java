package com.kona.extendedcraft.blocks;

import net.minecraft.block.OreBlock;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class FuryiumOre extends OreBlock {
    public FuryiumOre() {
        super(Properties.create(Material.IRON)
                .hardnessAndResistance(50.0f, 60f)
                .harvestLevel(5)
                .harvestTool(ToolType.PICKAXE)
        );
    }
}
