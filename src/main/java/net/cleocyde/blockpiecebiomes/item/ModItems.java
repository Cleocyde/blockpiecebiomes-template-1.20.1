package net.cleocyde.blockpiecebiomes.item;

import net.cleocyde.blockpiecebiomes.BlockPieceBiomes;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import static net.cleocyde.blockpiecebiomes.BlockPieceBiomes.CLOUD_BUCKET;
import static net.cleocyde.blockpiecebiomes.block.BlackCloudBlock.BLACK_CLOUD_BLOCK;
import static net.cleocyde.blockpiecebiomes.block.LeavesCarpet.LEAVES_CARPET;
import static net.cleocyde.blockpiecebiomes.block.OrangeLeaves.ORANGE_LEAVES;
import static net.cleocyde.blockpiecebiomes.block.RedLeaves.RED_LEAVES;
import static net.cleocyde.blockpiecebiomes.block.WhiteCloudBlock.WHITE_CLOUD_BLOCK;
import static net.cleocyde.blockpiecebiomes.block.YellowLeaves.YELLOW_LEAVES;

public class ModItems {

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(BlockPieceBiomes.MOD_ID, name), item);
    }

    public static final Item RUBY = registerItem("ruby",new Item(new FabricItemSettings()));

    public static final ItemGroup ITEM_GROUP = FabricItemGroup.builder()
            .icon(() -> new ItemStack(RUBY))
            .displayName(Text.translatable("itemGroup.blockpiecebiomes.test_group"))
            .entries((context, entries) -> {
                entries.add(RUBY);
                entries.add(RED_LEAVES);
                entries.add(ORANGE_LEAVES);
                entries.add(YELLOW_LEAVES);
                entries.add(BLACK_CLOUD_BLOCK);
                entries.add(LEAVES_CARPET);
                entries.add(WHITE_CLOUD_BLOCK);
                entries.add(CLOUD_BUCKET);
            })
            .build();



}

