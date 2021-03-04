package com.kona.extendedcraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class RFuryiumBricks extends Block {

    public RFuryiumBricks() {
        super(Properties.create(Material.IRON)
                .hardnessAndResistance(40.0f, 100f)
                .harvestLevel(5)
                .harvestTool(ToolType.PICKAXE)
        );
    }

}
