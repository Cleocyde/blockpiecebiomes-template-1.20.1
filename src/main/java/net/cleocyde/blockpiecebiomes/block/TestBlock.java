package net.cleocyde.blockpiecebiomes.block;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;

public class TestBlock implements ModInitializer {
    public static final Block TEST_BLOCK  = new Block(FabricBlockSettings.create().strength(4.0f));

    public void onInitialize() {

    }
}