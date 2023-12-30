package net.cleocyde.blockpiecebiomes.block;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.LeavesBlock;

public class RedLeaves implements ModInitializer {
    public static final Block RED_LEAVES  = new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).strength(4.0f).nonOpaque());

    public void onInitialize() {

    }
}