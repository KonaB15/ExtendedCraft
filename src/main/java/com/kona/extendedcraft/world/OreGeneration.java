package com.kona.extendedcraft.world;



import com.kona.extendedcraft.ExtendedCraft;
import com.kona.extendedcraft.config.CommonConfig;
import com.kona.extendedcraft.init.ModBlocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.TopSolidRangeConfig;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.fml.common.Mod;



@Mod.EventBusSubscriber(modid = ExtendedCraft.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class OreGeneration {



    public static void addFeaturesToBiomes(BiomeLoadingEvent event) {
        if (!event.getCategory().equals(Biome.Category.THEEND) && !event.getCategory().equals(Biome.Category.NETHER)) {
            event.getGeneration().withFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
                    Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, ModBlocks.KONIUM_ORE.get().getDefaultState(), 4)).withPlacement(Placement.RANGE.configure(new TopSolidRangeConfig(1, 60, 65))).square().func_242731_b(16));
        }
        if (!event.getCategory().equals(Biome.Category.THEEND) && !event.getCategory().equals(Biome.Category.BEACH) && !event.getCategory().equals(Biome.Category.DESERT) && !event.getCategory().equals(Biome.Category.EXTREME_HILLS) && !event.getCategory().equals(Biome.Category.FOREST) && !event.getCategory().equals(Biome.Category.ICY) && !event.getCategory().equals(Biome.Category.JUNGLE) && !event.getCategory().equals(Biome.Category.MESA) && !event.getCategory().equals(Biome.Category.MUSHROOM) && !event.getCategory().equals(Biome.Category.OCEAN) && !event.getCategory().equals(Biome.Category.PLAINS) && !event.getCategory().equals(Biome.Category.RIVER) && !event.getCategory().equals(Biome.Category.SAVANNA) && !event.getCategory().equals(Biome.Category.SWAMP) && !event.getCategory().equals(Biome.Category.TAIGA)) {
            event.getGeneration().withFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
            Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, ModBlocks.FURYIUM_ORE.get().getDefaultState(), 1)).withPlacement(Placement.RANGE.configure(new TopSolidRangeConfig(1, 60, 65))).square().func_242731_b(8));

        }
    }
}

