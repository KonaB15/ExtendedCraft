package com.kona.extendedcraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class KoniumBlock extends Block {

    public KoniumBlock() {
        super(Block.Properties.create(Material.IRON)
                .hardnessAndResistance(50.0f, 60f)
                .harvestLevel(5)
                .harvestTool(ToolType.PICKAXE)
        );
    }

}
