package net.xanthian.expert_armor.compat;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registry;
import net.xanthian.expert_armor.Initialise;

public class MobZ {

    public static final Item AMAT_PLATE = registerItem("mobz/amat_plate", new Item(new FabricItemSettings()));
    public static final Item BEARLEATHER_PLATE = registerItem("mobz/bearleather_plate", new Item(new FabricItemSettings()));
    public static final Item BOSS_PLATE = registerItem("mobz/boss_plate", new Item(new FabricItemSettings()));
    public static final Item HARDENEDMETAL_PLATE = registerItem("mobz/hardenedmetal_plate", new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Initialise.MOD_ID, name), item);
    }
    private static void addItemsToItemGroup() {
        addToItemGroup(AMAT_PLATE);
        addToItemGroup(BEARLEATHER_PLATE);
        addToItemGroup(BOSS_PLATE);
        addToItemGroup(HARDENEDMETAL_PLATE);
    }

    private static void addToItemGroup(Item item) {
        ItemGroupEvents.modifyEntriesEvent(Initialise.EXPERT).register(entries -> entries.add(item));
    }

    public static void registerModItems() {
        addItemsToItemGroup();
    }
}