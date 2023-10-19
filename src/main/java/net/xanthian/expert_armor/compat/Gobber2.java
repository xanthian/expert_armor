package net.xanthian.expert_armor.compat;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registry;

import net.xanthian.expert_armor.Initialise;

public class Gobber2 {

    public static final Item GOBBER_NETHER_PLATE = registerItem("gobcompat/gobber2_nether_plate", new Item(new FabricItemSettings()));
    public static final Item GOBBER_PLATE = registerItem("gobcompat/gobber2_plate", new Item(new FabricItemSettings()));
    public static final Item GOBBER_REINFORCED_END_LINKS = registerItem("gobcompat/gobber2_reinforced_end_links", new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Initialise.MOD_ID, name), item);
    }
    private static void addItemsToItemGroup() {
        addToItemGroup(GOBBER_NETHER_PLATE);
        addToItemGroup(GOBBER_PLATE);
        addToItemGroup(GOBBER_REINFORCED_END_LINKS);
    }

    private static void addToItemGroup(Item item) {
        ItemGroupEvents.modifyEntriesEvent(Initialise.EXPERT).register(entries -> entries.add(item));
    }

    public static void registerModItems() {
        addItemsToItemGroup();
    }
}