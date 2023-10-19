package net.xanthian.expert_armor.compat;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registry;

import net.xanthian.expert_armor.Initialise;



public class TechReborn {

    public static final Item BRONZE_PLATE = registerItem("trcompat/bronze_plate", new Item(new FabricItemSettings()));
    public static final Item RUBY_PLATE = registerItem("trcompat/ruby_plate", new Item(new FabricItemSettings()));
    public static final Item SAPPHIRE_PLATE = registerItem("trcompat/sapphire_plate", new Item(new FabricItemSettings()));
    public static final Item PERIDOT_PLATE = registerItem("trcompat/peridot_plate", new Item(new FabricItemSettings()));
    public static final Item SILVER_PLATE = registerItem("trcompat/silver_plate", new Item(new FabricItemSettings()));
    public static final Item STEEL_PLATE = registerItem("trcompat/steel_plate", new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Initialise.MOD_ID, name), item);
    }
    private static void addItemsToItemGroup() {
        addToItemGroup(BRONZE_PLATE);
        addToItemGroup(RUBY_PLATE);
        addToItemGroup(SAPPHIRE_PLATE);
        addToItemGroup(PERIDOT_PLATE);
        addToItemGroup(SILVER_PLATE);
        addToItemGroup(STEEL_PLATE);
    }

    private static void addToItemGroup(Item item) {
        ItemGroupEvents.modifyEntriesEvent(Initialise.EXPERT).register(entries -> entries.add(item));
    }

    public static void registerModItems() {
        addItemsToItemGroup();
    }
}