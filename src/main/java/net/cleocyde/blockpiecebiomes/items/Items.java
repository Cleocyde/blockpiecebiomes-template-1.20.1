package net.cleocyde.blockpiecebiomes.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;

public class Items {

    public static final Item CUSTOM_ITEM = new Item(new FabricItemSettings());

    public static final ItemGroup ITEM_GROUP = FabricItemGroup.builder()
            .icon(() -> new ItemStack(CUSTOM_ITEM))
            .displayName(Text.translatable("itemGroup.blockpiecebiomes.test_group"))
            .entries((context, entries) -> {
                entries.add(CUSTOM_ITEM);
            })
            .build();
}
