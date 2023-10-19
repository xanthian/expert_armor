package net.xanthian.expert_armor.compat;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registry;
import net.xanthian.expert_armor.Initialise;



public class ObsidianEquipment {

    public static final Item OBSIDIAN_PLATE = registerItem(new Item(new FabricItemSettings()));

    private static Item registerItem(Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Initialise.MOD_ID, "obsidianeq/obsidian_plate"), item);
    }
    private static void addItemsToItemGroup() {
        addToItemGroup();
    }

    private static void addToItemGroup() {
        ItemGroupEvents.modifyEntriesEvent(Initialise.EXPERT).register(entries -> entries.add(ObsidianEquipment.OBSIDIAN_PLATE));
    }

    public static void registerModItems() {
        addItemsToItemGroup();
    }
}