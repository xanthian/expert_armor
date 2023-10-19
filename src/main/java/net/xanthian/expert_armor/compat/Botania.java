package net.xanthian.expert_armor.compat;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.registry.Registry;

import net.xanthian.expert_armor.Initialise;



public class Botania {

    public static final Item ELEMENTIUM_PLATE = registerItem("botania/elementium_plate", new Item(new FabricItemSettings()));
    public static final Item MANASTEEL_PLATE = registerItem("botania/manasteel_plate", new Item(new FabricItemSettings()));
    public static final Item MANAWEAVE_PLATE = registerItem("botania/manaweave_plate", new Item(new FabricItemSettings()));
    public static final Item TERRASTEEL_PLATE = registerItem("botania/terrasteel_plate", new Item(new FabricItemSettings().rarity(Rarity.UNCOMMON)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Initialise.MOD_ID, name), item);
    }
    private static void addItemsToItemGroup() {
        addToItemGroup(ELEMENTIUM_PLATE);
        addToItemGroup(MANASTEEL_PLATE);
        addToItemGroup(MANAWEAVE_PLATE);
        addToItemGroup(TERRASTEEL_PLATE);
    }

    private static void addToItemGroup(Item item) {
        ItemGroupEvents.modifyEntriesEvent(Initialise.EXPERT).register(entries -> entries.add(item));
    }

    public static void registerModItems() {
        addItemsToItemGroup();
    }
}