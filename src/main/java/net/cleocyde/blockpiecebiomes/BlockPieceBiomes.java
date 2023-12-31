package net.cleocyde.blockpiecebiomes;


import net.cleocyde.blockpiecebiomes.fluids.CloudFluid;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FluidBlock;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.item.BlockItem;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static net.cleocyde.blockpiecebiomes.block.BlackCloudBlock.BLACK_CLOUD_BLOCK;
import static net.cleocyde.blockpiecebiomes.block.LeavesCarpet.LEAVES_CARPET;
import static net.cleocyde.blockpiecebiomes.block.OrangeLeaves.ORANGE_LEAVES;
import static net.cleocyde.blockpiecebiomes.block.RedLeaves.RED_LEAVES;
import static net.cleocyde.blockpiecebiomes.block.TestBlock.TEST_BLOCK;
import static net.cleocyde.blockpiecebiomes.block.WhiteCloudBlock.WHITE_CLOUD_BLOCK;
import static net.cleocyde.blockpiecebiomes.block.YellowLeaves.YELLOW_LEAVES;
import static net.cleocyde.blockpiecebiomes.item.ModItems.*;


public class BlockPieceBiomes implements ModInitializer {
	public static final String MOD_ID = "blockpiecebiomes";
	public static FlowableFluid STILL_CLOUD;
	public static FlowableFluid FLOWING_CLOUD;
	public static Item CLOUD_BUCKET;
	public static Block CLOUD;
	@Override
	public void onInitialize() {
		//REGISTERING

		Registry.register(Registries.ITEM_GROUP, new Identifier(MOD_ID, "test_group"), ITEM_GROUP);


		//BLOCKS
		Registry.register(Registries.BLOCK, new Identifier(MOD_ID, "test_block"), TEST_BLOCK);
		Registry.register(Registries.BLOCK, new Identifier(MOD_ID, "white_cloud_block"), WHITE_CLOUD_BLOCK);
		Registry.register(Registries.BLOCK, new Identifier(MOD_ID, "black_cloud_block"), BLACK_CLOUD_BLOCK);
		Registry.register(Registries.BLOCK, new Identifier(MOD_ID, "orange_leaves"), ORANGE_LEAVES);
		Registry.register(Registries.BLOCK, new Identifier(MOD_ID, "red_leaves"), RED_LEAVES);
		Registry.register(Registries.BLOCK, new Identifier(MOD_ID, "yellow_leaves"), YELLOW_LEAVES);
		Registry.register(Registries.BLOCK, new Identifier(MOD_ID, "leaves_carpet"), LEAVES_CARPET);



		//BLOCK ITEMS
		Registry.register(Registries.ITEM, new Identifier(BlockPieceBiomes.MOD_ID, "example_block"), new BlockItem(TEST_BLOCK, new FabricItemSettings()));
		Registry.register(Registries.ITEM, new Identifier(BlockPieceBiomes.MOD_ID, "white_cloud_block"), new BlockItem(WHITE_CLOUD_BLOCK, new FabricItemSettings()));
		Registry.register(Registries.ITEM, new Identifier(BlockPieceBiomes.MOD_ID, "black_cloud_block"), new BlockItem(BLACK_CLOUD_BLOCK, new FabricItemSettings()));
		Registry.register(Registries.ITEM, new Identifier(BlockPieceBiomes.MOD_ID, "orange_leaves"), new BlockItem(ORANGE_LEAVES, new FabricItemSettings()));
		Registry.register(Registries.ITEM, new Identifier(BlockPieceBiomes.MOD_ID, "red_leaves"), new BlockItem(RED_LEAVES, new FabricItemSettings()));
		Registry.register(Registries.ITEM, new Identifier(BlockPieceBiomes.MOD_ID, "yellow_leaves"), new BlockItem(YELLOW_LEAVES, new FabricItemSettings()));
		Registry.register(Registries.ITEM, new Identifier(BlockPieceBiomes.MOD_ID, "leaves_carpet"), new BlockItem(LEAVES_CARPET, new FabricItemSettings()));



		//FLUIDS
		STILL_CLOUD = Registry.register(Registries.FLUID, new Identifier(MOD_ID, "still_cloud_fluid"), new CloudFluid.Still());
		FLOWING_CLOUD = Registry.register(Registries.FLUID, new Identifier(MOD_ID, "flowing_cloud_fluid"), new CloudFluid.Flowing());
		CLOUD_BUCKET = Registry.register(Registries.ITEM, new Identifier(MOD_ID, "cloud_bucket"),
				new BucketItem(STILL_CLOUD, new Item.Settings().recipeRemainder(Items.BUCKET).maxCount(1)));
		CLOUD = Registry.register(Registries.BLOCK, new Identifier(MOD_ID, "cloud_water_block"), new FluidBlock(STILL_CLOUD, FabricBlockSettings.copy(Blocks.WATER)){});
	}


}