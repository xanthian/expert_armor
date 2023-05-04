package net.xanthian.expert_armor.compat;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.registry.Registry;

import net.xanthian.expert_armor.Initialise;

public class MythicMetals {

    public static final Item ADAMANTITE_PLATE = registerItem("mmcompat/adamantite_plate", new Item(new FabricItemSettings()));
    public static final Item AQUARIUM_PLATE = registerItem("mmcompat/aquarium_plate", new Item(new FabricItemSettings()));
    public static final Item BANGLUM_PLATE = registerItem("mmcompat/banglum_plate", new Item(new FabricItemSettings()));
    public static final Item BRONZE_PLATE = registerItem("mmcompat/bronze_plate", new Item(new FabricItemSettings()));
    public static final Item CARMOT_PLATE = registerItem("mmcompat/carmot_plate", new Item(new FabricItemSettings()));
    public static final Item CELESTIUM_PLATE = registerItem("mmcompat/celestium_plate", new Item(new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item COPPER_PLATE = registerItem("mmcompat/copper_plate", new Item(new FabricItemSettings()));
    public static final Item DURASTEEL_PLATE = registerItem("mmcompat/durasteel_plate", new Item(new FabricItemSettings()));
    public static final Item HALLOWED_PLATE = registerItem("mmcompat/hallowed_plate", new Item(new FabricItemSettings()));
    public static final Item KYBER_PLATE = registerItem("mmcompat/kyber_plate", new Item(new FabricItemSettings()));
    public static final Item LEGENDARY_BANGLUM_PLATE = registerItem("mmcompat/legendary_banglum_plate", new Item(new FabricItemSettings()));
    public static final Item METALLURGIUM_PLATE = registerItem("mmcompat/metallurgium_plate", new Item(new FabricItemSettings()));
    public static final Item MIDAS_GOLD_PLATE = registerItem("mmcompat/midas_gold_plate", new Item(new FabricItemSettings()));
    public static final Item MYTHRIL_PLATE = registerItem("mmcompat/mythril_plate", new Item(new FabricItemSettings()));
    public static final Item ORICHALCUM_PLATE = registerItem("mmcompat/orichalcum_plate", new Item(new FabricItemSettings()));
    public static final Item OSMIUM_PLATE = registerItem("mmcompat/osmium_plate", new Item(new FabricItemSettings()));
    public static final Item PALLADIUM_PLATE = registerItem("mmcompat/palladium_plate", new Item(new FabricItemSettings()));
    public static final Item PROMETHEUM_PLATE = registerItem("mmcompat/prometheum_plate", new Item(new FabricItemSettings()));
    public static final Item RUNITE_PLATE = registerItem("mmcompat/runite_plate", new Item(new FabricItemSettings()));
    public static final Item SILVER_PLATE = registerItem("mmcompat/silver_plate", new Item(new FabricItemSettings()));
    public static final Item STAR_PLATINUM_PLATE = registerItem("mmcompat/star_platinum_plate", new Item(new FabricItemSettings()));
    public static final Item STEEL_PLATE = registerItem("mmcompat/steel_plate", new Item(new FabricItemSettings()));
    public static final Item STORMYX_PLATE = registerItem("mmcompat/stormyx_plate", new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Initialise.MOD_ID, name), item);
    }
    private static void addItemsToItemGroup() {
        addToItemGroup(ADAMANTITE_PLATE);
        addToItemGroup(AQUARIUM_PLATE);
        addToItemGroup(BANGLUM_PLATE);
        addToItemGroup(BRONZE_PLATE);
        addToItemGroup(CARMOT_PLATE);
        addToItemGroup(CELESTIUM_PLATE);
        addToItemGroup(COPPER_PLATE);
        addToItemGroup(DURASTEEL_PLATE);
        addToItemGroup(HALLOWED_PLATE);
        addToItemGroup(KYBER_PLATE);
        addToItemGroup(LEGENDARY_BANGLUM_PLATE);
        addToItemGroup(METALLURGIUM_PLATE);
        addToItemGroup(MIDAS_GOLD_PLATE);
        addToItemGroup(MYTHRIL_PLATE);
        addToItemGroup(ORICHALCUM_PLATE);
        addToItemGroup(OSMIUM_PLATE);
        addToItemGroup(PALLADIUM_PLATE);
        addToItemGroup(PROMETHEUM_PLATE);
        addToItemGroup(RUNITE_PLATE);
        addToItemGroup(SILVER_PLATE);
        addToItemGroup(STAR_PLATINUM_PLATE);
        addToItemGroup(STEEL_PLATE);
        addToItemGroup(STORMYX_PLATE);
    }

    private static void addToItemGroup(Item item) {
        ItemGroupEvents.modifyEntriesEvent(Initialise.EXPERT).register(entries -> entries.add(item));
    }

    public static void registerModItems() {
        addItemsToItemGroup();
    }
}