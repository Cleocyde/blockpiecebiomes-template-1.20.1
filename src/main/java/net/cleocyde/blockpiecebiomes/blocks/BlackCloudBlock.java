package net.cleocyde.blockpiecebiomes.blocks;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;

public class BlackCloudBlock implements ModInitializer {
    public static final Block BLACK_CLOUD_BLOCK  = new Block(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL).strength(4.0f).nonOpaque());

    public void onInitialize() {

    }
}