package net.xanthian.expert_armor.compat;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.registry.Registry;

import net.xanthian.expert_armor.Initialise;

public class BetterNether {

    public static final Item NETHER_RUBY_PLATE = registerItem("betternether/nether_ruby_plate", new Item(new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item CINCINNASITE_PLATE = registerItem("betternether/cincinnasite_plate", new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Initialise.MOD_ID, name), item);
    }
    private static void addItemsToItemGroup() {
        addToItemGroup(NETHER_RUBY_PLATE);
        addToItemGroup(CINCINNASITE_PLATE);
    }

    private static void addToItemGroup(Item item) {
        ItemGroupEvents.modifyEntriesEvent(Initialise.EXPERT).register(entries -> entries.add(item));
    }

    public static void registerModItems() {
        addItemsToItemGroup();
    }
}