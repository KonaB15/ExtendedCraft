package com.kona.extendedcraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class FuryiumBricks extends Block {

    public FuryiumBricks() {
        super(Properties.create(Material.IRON)
                .hardnessAndResistance(80.0f, 100f)
                .harvestLevel(6)
                .harvestTool(ToolType.PICKAXE)
        );
    }

}
