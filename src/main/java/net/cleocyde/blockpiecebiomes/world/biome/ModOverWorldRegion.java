package net.cleocyde.blockpiecebiomes.world.biome;

import com.mojang.datafixers.util.Pair;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.biome.source.util.MultiNoiseUtil;
import terrablender.api.Region;
import terrablender.api.RegionType;

import java.util.function.Consumer;

public class ModOverWorldRegion extends Region {
    public ModOverWorldRegion(Identifier name, int weight) {
        super(name, RegionType.OVERWORLD, weight);
    }

    @Override
    public void addBiomes(Registry<Biome> registry, Consumer<Pair<MultiNoiseUtil.NoiseHypercube,
                RegistryKey<Biome>>> mapper) {
        this.addModifiedVanillaOverworldBiomes(mapper, modifiedVanillaOverworldBuilder -> modifiedVanillaOverworldBuilder.replaceBiome(BiomeKeys.BAMBOO_JUNGLE, PunkHazardIce.PUNK_HAZARD_ICE));
        this.addModifiedVanillaOverworldBiomes(mapper, modifiedVanillaOverworldBuilder -> modifiedVanillaOverworldBuilder.replaceBiome(BiomeKeys.FOREST, ArchipelKonomi.KONOMI));
        this.addModifiedVanillaOverworldBiomes(mapper, modifiedVanillaOverworldBuilder -> modifiedVanillaOverworldBuilder.replaceBiome(BiomeKeys.FOREST, DawnIsland.DAWN_ISLAND));
        this.addModifiedVanillaOverworldBiomes(mapper, modifiedVanillaOverworldBuilder -> modifiedVanillaOverworldBuilder.replaceBiome(BiomeKeys.FOREST, LogueTown.LOGUETOWN));
        this.addModifiedVanillaOverworldBiomes(mapper, modifiedVanillaOverworldBuilder -> modifiedVanillaOverworldBuilder.replaceBiome(BiomeKeys.FOREST, ShellsTown.SHELLSTOWN));
        this.addModifiedVanillaOverworldBiomes(mapper, modifiedVanillaOverworldBuilder -> modifiedVanillaOverworldBuilder.replaceBiome(BiomeKeys.FOREST, Shimotsuki.SHIMOTSUKI));
        this.addModifiedVanillaOverworldBiomes(mapper, modifiedVanillaOverworldBuilder -> modifiedVanillaOverworldBuilder.replaceBiome(BiomeKeys.FOREST, Syrup.SYRUP));
        this.addModifiedVanillaOverworldBiomes(mapper, modifiedVanillaOverworldBuilder -> modifiedVanillaOverworldBuilder.replaceBiome(BiomeKeys.FOREST, EastBlue.EASTBLUE));
        this.addModifiedVanillaOverworldBiomes(mapper, modifiedVanillaOverworldBuilder -> modifiedVanillaOverworldBuilder.replaceBiome(BiomeKeys.FOREST, CactusIsland.CACTUSISLAND));
        this.addModifiedVanillaOverworldBiomes(mapper, modifiedVanillaOverworldBuilder -> modifiedVanillaOverworldBuilder.replaceBiome(BiomeKeys.FOREST, LittleGarden.LITTLE_GARDEN));
        this.addModifiedVanillaOverworldBiomes(mapper, modifiedVanillaOverworldBuilder -> modifiedVanillaOverworldBuilder.replaceBiome(BiomeKeys.FOREST, DrumIsland.DRUM_ISLAND));
        this.addModifiedVanillaOverworldBiomes(mapper, modifiedVanillaOverworldBuilder -> modifiedVanillaOverworldBuilder.replaceBiome(BiomeKeys.FOREST, RedLine.REDLINE));
        this.addModifiedVanillaOverworldBiomes(mapper, modifiedVanillaOverworldBuilder -> modifiedVanillaOverworldBuilder.replaceBiome(BiomeKeys.FOREST, CapJumeaux.CAP_JUMEAUX));
        this.addModifiedVanillaOverworldBiomes(mapper, modifiedVanillaOverworldBuilder -> modifiedVanillaOverworldBuilder.replaceBiome(BiomeKeys.FOREST, KyukaIsland.KYUKA_ISLAND));
        this.addModifiedVanillaOverworldBiomes(mapper, modifiedVanillaOverworldBuilder -> modifiedVanillaOverworldBuilder.replaceBiome(BiomeKeys.FOREST, Alabasta.ALABASTA));
        this.addModifiedVanillaOverworldBiomes(mapper, modifiedVanillaOverworldBuilder -> modifiedVanillaOverworldBuilder.replaceBiome(BiomeKeys.FOREST, Jaya.JAYA));
        this.addModifiedVanillaOverworldBiomes(mapper, modifiedVanillaOverworldBuilder -> modifiedVanillaOverworldBuilder.replaceBiome(BiomeKeys.FOREST, LongRingLongLand.LONG_RING_LONG_LAND));
        this.addModifiedVanillaOverworldBiomes(mapper, modifiedVanillaOverworldBuilder -> modifiedVanillaOverworldBuilder.replaceBiome(BiomeKeys.FOREST, WaterSeven.WATER_SEVEN));
        this.addModifiedVanillaOverworldBiomes(mapper, modifiedVanillaOverworldBuilder -> modifiedVanillaOverworldBuilder.replaceBiome(BiomeKeys.FOREST, EniesLobby.ENIES_LOBBY));
        this.addModifiedVanillaOverworldBiomes(mapper, modifiedVanillaOverworldBuilder -> modifiedVanillaOverworldBuilder.replaceBiome(BiomeKeys.FOREST, Baltigo.BALTIGO));
        this.addModifiedVanillaOverworldBiomes(mapper, modifiedVanillaOverworldBuilder -> modifiedVanillaOverworldBuilder.replaceBiome(BiomeKeys.FOREST, Banaro.BANARO));
        this.addModifiedVanillaOverworldBiomes(mapper, modifiedVanillaOverworldBuilder -> modifiedVanillaOverworldBuilder.replaceBiome(BiomeKeys.FOREST, ArchipelSabaody.ARCHIPEL_SABAODY));
        this.addModifiedVanillaOverworldBiomes(mapper, modifiedVanillaOverworldBuilder -> modifiedVanillaOverworldBuilder.replaceBiome(BiomeKeys.FOREST, Balgimoa.BALGIMOA));
        this.addModifiedVanillaOverworldBiomes(mapper, modifiedVanillaOverworldBuilder -> modifiedVanillaOverworldBuilder.replaceBiome(BiomeKeys.FOREST, Kedetrav.KEDETRAV));
        this.addModifiedVanillaOverworldBiomes(mapper, modifiedVanillaOverworldBuilder -> modifiedVanillaOverworldBuilder.replaceBiome(BiomeKeys.FOREST, Harahettania.HARAHETTANIA));
        this.addModifiedVanillaOverworldBiomes(mapper, modifiedVanillaOverworldBuilder -> modifiedVanillaOverworldBuilder.replaceBiome(BiomeKeys.FOREST, Kuraigana.KURAIGANA));
        this.addModifiedVanillaOverworldBiomes(mapper, modifiedVanillaOverworldBuilder -> modifiedVanillaOverworldBuilder.replaceBiome(BiomeKeys.FOREST, Kenzan.KENZAN));
        this.addModifiedVanillaOverworldBiomes(mapper, modifiedVanillaOverworldBuilder -> modifiedVanillaOverworldBuilder.replaceBiome(BiomeKeys.FOREST, MarineFord.MARINE_FORD));
        this.addModifiedVanillaOverworldBiomes(mapper, modifiedVanillaOverworldBuilder -> modifiedVanillaOverworldBuilder.replaceBiome(BiomeKeys.FOREST, Foolshout.FOOLSHOUT));
        this.addModifiedVanillaOverworldBiomes(mapper, modifiedVanillaOverworldBuilder -> modifiedVanillaOverworldBuilder.replaceBiome(BiomeKeys.FOREST, Nanimonai.NANIMONAI));
        this.addModifiedVanillaOverworldBiomes(mapper, modifiedVanillaOverworldBuilder -> modifiedVanillaOverworldBuilder.replaceBiome(BiomeKeys.FOREST, Petit.PETIT));
        this.addModifiedVanillaOverworldBiomes(mapper, modifiedVanillaOverworldBuilder -> modifiedVanillaOverworldBuilder.replaceBiome(BiomeKeys.FOREST, Guanhao.GUANHAO));
        this.addModifiedVanillaOverworldBiomes(mapper, modifiedVanillaOverworldBuilder -> modifiedVanillaOverworldBuilder.replaceBiome(BiomeKeys.FOREST, SaintPoplar.SAINT_POPLAR));
        this.addModifiedVanillaOverworldBiomes(mapper, modifiedVanillaOverworldBuilder -> modifiedVanillaOverworldBuilder.replaceBiome(BiomeKeys.FOREST, GrandLineParadise.GRAND_LINE_PARADISE));

        }
}
