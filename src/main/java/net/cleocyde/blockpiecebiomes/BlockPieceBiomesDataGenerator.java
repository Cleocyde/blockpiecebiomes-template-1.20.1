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


	}
}
