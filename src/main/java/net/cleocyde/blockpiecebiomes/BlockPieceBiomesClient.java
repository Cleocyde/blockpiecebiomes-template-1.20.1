package net.cleocyde.blockpiecebiomes;

import net.cleocyde.blockpiecebiomes.block.LeavesCarpet;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry;
import net.fabricmc.fabric.api.client.render.fluid.v1.SimpleFluidRenderHandler;
import net.minecraft.client.particle.SnowflakeParticle;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.screen.PlayerScreenHandler;
import net.minecraft.util.Identifier;

import static net.cleocyde.blockpiecebiomes.BlockPieceBiomes.MOD_ID;

public class BlockPieceBiomesClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        FluidRenderHandlerRegistry.INSTANCE.register(BlockPieceBiomes.STILL_CLOUD, BlockPieceBiomes.FLOWING_CLOUD, new SimpleFluidRenderHandler(
                new Identifier("minecraft:block/water_still"),
                new Identifier("minecraft:block/water_flow"),
                0xffffff
        ));

        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), BlockPieceBiomes.STILL_CLOUD, BlockPieceBiomes.FLOWING_CLOUD);
        BlockRenderLayerMap.INSTANCE.putBlock(LeavesCarpet.LEAVES_CARPET, RenderLayer.getTranslucent());


        ParticleFactoryRegistry.getInstance().register(BlockPieceBiomes.SAND_PARTICLE, SnowflakeParticle.Factory::new);

    }
}
