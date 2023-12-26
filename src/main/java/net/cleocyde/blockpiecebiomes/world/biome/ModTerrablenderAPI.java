package net.cleocyde.blockpiecebiomes.world.biome;

import net.cleocyde.blockpiecebiomes.BlockPieceBiomes;
import net.cleocyde.blockpiecebiomes.world.biome.surface.ModMaterialRules;
import net.minecraft.util.Identifier;
import terrablender.api.Regions;
import terrablender.api.SurfaceRuleManager;
import terrablender.api.TerraBlenderApi;


public class ModTerrablenderAPI implements TerraBlenderApi {
    @Override
    public void onTerraBlenderInitialized() {
        Regions.register(new ModOverWorldRegion(new Identifier(BlockPieceBiomes.MOD_ID, "overworld"), 4));

        SurfaceRuleManager.addSurfaceRules(SurfaceRuleManager.RuleCategory.OVERWORLD, BlockPieceBiomes.MOD_ID, ModMaterialRules.makeRules());
    }
}
