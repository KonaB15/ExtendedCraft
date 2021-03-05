package com.kona.extendedcraft.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class CommonConfig {

    public final ForgeConfigSpec.BooleanValue spawnOres;

    public CommonConfig(final ForgeConfigSpec.Builder builder) {
        builder.push("ores");
        spawnOres = buildBoolean(builder, "spawnOres", "all", true, "Spawn custom ores.");
    }
    private static ForgeConfigSpec.BooleanValue buildBoolean(ForgeConfigSpec.Builder builder, String name, String catagory, boolean defaultValue, String comment) {
        return builder.comment(comment).translation(name).define(name, defaultValue);
    }

}
