package net.xanthian.expert_armor.compat;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registry;

import net.xanthian.expert_armor.Initialise;



public class CopperEquipment {

    public static final Item COMPRESSED_COPPER_PLATE = registerItem("coppereq/compressed_copper_plate", new Item(new FabricItemSettings()));
    public static final Item COMPRESSED_WAXED_COPPER_PLATE = registerItem("coppereq/compressed_waxed_copper_plate", new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Initialise.MOD_ID, name), item);
    }
    private static void addItemsToItemGroup() {
        addToItemGroup(COMPRESSED_COPPER_PLATE);
        addToItemGroup(COMPRESSED_WAXED_COPPER_PLATE);
    }

    private static void addToItemGroup(Item item) {
        ItemGroupEvents.modifyEntriesEvent(Initialise.EXPERT).register(entries -> entries.add(item));
    }

    public static void registerModItems() {
        addItemsToItemGroup();
    }
}