package net.cleocyde.blockpiecebiomes;

import net.cleocyde.blockpiecebiomes.datagen.ModWorldGenerator;
import net.cleocyde.blockpiecebiomes.world.biome.*;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;

public class BlockPieceBiomesDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModWorldGenerator::new);
	}

	@Override
	public void buildRegistry(RegistryBuilder registryBuilder) {

		registryBuilder.addRegistry(RegistryKeys.BIOME, PunkHazardIce::boostrap);
		registryBuilder.addRegistry(RegistryKeys.BIOME, PunkHazardLava::boostrap);
		registryBuilder.addRegistry(RegistryKeys.BIOME, DawnIsland::boostrap);
		registryBuilder.addRegistry(RegistryKeys.BIOME, Shimotsuki::boostrap);
		registryBuilder.addRegistry(RegistryKeys.BIOME, ShellsTown::boostrap);
		registryBuilder.addRegistry(RegistryKeys.BIOME, Syrup::boostrap);
		registryBuilder.addRegistry(RegistryKeys.BIOME, LogueTown::boostrap);
		registryBuilder.addRegistry(RegistryKeys.BIOME, ArchipelKonomi::boostrap);
		registryBuilder.addRegistry(RegistryKeys.BIOME, EastBlue::boostrap);
		registryBuilder.addRegistry(RegistryKeys.BIOME, CactusIsland::boostrap);
		registryBuilder.addRegistry(RegistryKeys.BIOME, LittleGarden::boostrap);
		registryBuilder.addRegistry(RegistryKeys.BIOME, DrumIsland::boostrap);
		registryBuilder.addRegistry(RegistryKeys.BIOME, RedLine::boostrap);
		registryBuilder.addRegistry(RegistryKeys.BIOME, CapJumeaux::boostrap);
		registryBuilder.addRegistry(RegistryKeys.BIOME, KyukaIsland::boostrap);
		registryBuilder.addRegistry(RegistryKeys.BIOME, Alabasta::boostrap);
		registryBuilder.addRegistry(RegistryKeys.BIOME, Jaya::boostrap);
		registryBuilder.addRegistry(RegistryKeys.BIOME, LongRingLongLand::boostrap);
		registryBuilder.addRegistry(RegistryKeys.BIOME, WaterSeven::boostrap);
		registryBuilder.addRegistry(RegistryKeys.BIOME, EniesLobby::boostrap);
		registryBuilder.addRegistry(RegistryKeys.BIOME, Lulusia::boostrap);
		registryBuilder.addRegistry(RegistryKeys.BIOME, Banaro::boostrap);
		registryBuilder.addRegistry(RegistryKeys.BIOME, ArchipelSabaody::boostrap);
		registryBuilder.addRegistry(RegistryKeys.BIOME, Balgimoa::boostrap);
		registryBuilder.addRegistry(RegistryKeys.BIOME, Kedetrav::boostrap);
		registryBuilder.addRegistry(RegistryKeys.BIOME, Harahettania::boostrap);
		registryBuilder.addRegistry(RegistryKeys.BIOME, Kuraigana::boostrap);
		registryBuilder.addRegistry(RegistryKeys.BIOME, Kenzan::boostrap);
		registryBuilder.addRegistry(RegistryKeys.BIOME, MarineFord::boostrap);
		registryBuilder.addRegistry(RegistryKeys.BIOME, Foolshout::boostrap);
		registryBuilder.addRegistry(RegistryKeys.BIOME, Nanimonai::boostrap);
		registryBuilder.addRegistry(RegistryKeys.BIOME, Petit::boostrap);
		registryBuilder.addRegistry(RegistryKeys.BIOME, Guanhao::boostrap);
		registryBuilder.addRegistry(RegistryKeys.BIOME, SaintPoplar::boostrap);
		registryBuilder.addRegistry(RegistryKeys.BIOME, GrandLineParadise::boostrap);
		registryBuilder.addRegistry(RegistryKeys.BIOME, ReverseMountain::boostrap);


	}
}
