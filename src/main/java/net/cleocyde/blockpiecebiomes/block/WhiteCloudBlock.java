package net.cleocyde.blockpiecebiomes.block;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;

public class WhiteCloudBlock implements ModInitializer {
    public static final Block WHITE_CLOUD_BLOCK  = new Block(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL).strength(4.0f));

    public void onInitialize() {

    }
}