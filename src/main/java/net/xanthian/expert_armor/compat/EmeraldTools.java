package net.xanthian.expert_armor.compat;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registry;
import net.xanthian.expert_armor.Initialise;

public class EmeraldTools {

    public static final Item EMERALD_PLATE = registerItem("emtools/emerald_plate", new Item(new FabricItemSettings()));
    public static final Item RUBY_PLATE = registerItem("emtools/ruby_plate", new Item(new FabricItemSettings()));
    public static final Item COPPER_PLATE = registerItem("emtools/copper_plate", new Item(new FabricItemSettings()));
    public static final Item AMETHYST_PLATE = registerItem("emtools/amethyst_plate", new Item(new FabricItemSettings()));
    public static final Item OBSIDIAN_PLATE = registerItem("emtools/obsidian_plate", new Item(new FabricItemSettings()));
    public static final Item STEEL_PLATE = registerItem("emtools/steel_plate", new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Initialise.MOD_ID, name), item);
    }
    private static void addItemsToItemGroup() {
        addToItemGroup(EMERALD_PLATE);
        addToItemGroup(RUBY_PLATE);
        addToItemGroup(COPPER_PLATE);
        addToItemGroup(AMETHYST_PLATE);
        addToItemGroup(OBSIDIAN_PLATE);
        addToItemGroup(STEEL_PLATE);
    }

    private static void addToItemGroup(Item item) {
        ItemGroupEvents.modifyEntriesEvent(Initialise.EXPERT).register(entries -> entries.add(item));
    }

    public static void registerModItems() {
        addItemsToItemGroup();
    }
}