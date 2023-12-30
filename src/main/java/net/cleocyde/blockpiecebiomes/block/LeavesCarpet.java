package net.cleocyde.blockpiecebiomes.block;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.CarpetBlock;

public class LeavesCarpet implements ModInitializer {
    public static final Block LEAVES_CARPET  = new CarpetBlock(FabricBlockSettings.create().nonOpaque());

    public void onInitialize() {

    }
}
