package net.xanthian.expert_armor.compat;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registry;
import net.xanthian.expert_armor.Initialise;

public class MoreGems {

    public static final Item ALEXANDRITE_PLATE = registerItem("more_gems/alexandrite_plate", new Item(new FabricItemSettings()));
    public static final Item CARBONADO_PLATE = registerItem("more_gems/carbonado_plate", new Item(new FabricItemSettings()));
    public static final Item CITRINE_PLATE = registerItem("more_gems/citrine_plate", new Item(new FabricItemSettings()));
    public static final Item CORUNDUM_PLATE = registerItem("more_gems/corundum_plate", new Item(new FabricItemSettings()));
    public static final Item KUNZITE_PLATE = registerItem("more_gems/kunzite_plate", new Item(new FabricItemSettings()));
    public static final Item MOISSANITE_PLATE = registerItem("more_gems/moissanite_plate", new Item(new FabricItemSettings()));
    public static final Item SAPPHIRE_PLATE = registerItem("more_gems/sapphire_plate", new Item(new FabricItemSettings()));
    public static final Item SPINEL_PLATE = registerItem("more_gems/spinel_plate", new Item(new FabricItemSettings()));
    public static final Item TOPAZ_PLATE = registerItem("more_gems/topaz_plate", new Item(new FabricItemSettings()));
    public static final Item TOURMALINE_PLATE = registerItem("more_gems/tourmaline_plate", new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Initialise.MOD_ID, name), item);
    }
    private static void addItemsToItemGroup() {
        addToItemGroup(ALEXANDRITE_PLATE);
        addToItemGroup(CARBONADO_PLATE);
        addToItemGroup(CITRINE_PLATE);
        addToItemGroup(CORUNDUM_PLATE);
        addToItemGroup(KUNZITE_PLATE);
        addToItemGroup(MOISSANITE_PLATE);
        addToItemGroup(SAPPHIRE_PLATE);
        addToItemGroup(SPINEL_PLATE);
        addToItemGroup(TOPAZ_PLATE);
        addToItemGroup(TOURMALINE_PLATE);
    }

    private static void addToItemGroup(Item item) {
        ItemGroupEvents.modifyEntriesEvent(Initialise.EXPERT).register(entries -> entries.add(item));
    }

    public static void registerModItems() {
        addItemsToItemGroup();
    }
}