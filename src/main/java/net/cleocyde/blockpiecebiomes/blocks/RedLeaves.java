package net.cleocyde.blockpiecebiomes.blocks;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;

public class RedLeaves implements ModInitializer {
    public static final Block RED_LEAVES  = new Block(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).strength(4.0f).nonOpaque());

    public void onInitialize() {

    }
}