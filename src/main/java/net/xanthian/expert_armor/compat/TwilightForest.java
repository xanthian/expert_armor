package net.xanthian.expert_armor.compat;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.registry.Registry;
import net.xanthian.expert_armor.Initialise;



public class TwilightForest {

    public static final Item ALPHA_YETI_PLATE = registerItem("twilightforest/alpha_yeti_fur_plate", new Item(new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item ARCTIC_FUR_PLATE = registerItem("twilightforest/arctic_fur_plate", new Item(new FabricItemSettings()));
    public static final Item FIERY_PLATE = registerItem("twilightforest/fiery_plate", new Item(new FabricItemSettings()));
    public static final Item IRONWOOD_PLATE = registerItem("twilightforest/ironwood_plate", new Item(new FabricItemSettings()));
    public static final Item KNIGHTMETAL_PLATE = registerItem("twilightforest/knightmetal_plate", new Item(new FabricItemSettings()));
    public static final Item NAGA_SCALE_PLATE = registerItem("twilightforest/naga_scale_plate", new Item(new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item STEELEAF_PLATE = registerItem("twilightforest/steeleaf_plate", new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Initialise.MOD_ID, name), item);
    }
    private static void addItemsToItemGroup() {
        addToItemGroup(ALPHA_YETI_PLATE);
        addToItemGroup(ARCTIC_FUR_PLATE);
        addToItemGroup(FIERY_PLATE);
        addToItemGroup(IRONWOOD_PLATE);
        addToItemGroup(KNIGHTMETAL_PLATE);
        addToItemGroup(NAGA_SCALE_PLATE);
        addToItemGroup(STEELEAF_PLATE);
    }

    private static void addToItemGroup(Item item) {
        ItemGroupEvents.modifyEntriesEvent(Initialise.EXPERT).register(entries -> entries.add(item));
    }

    public static void registerModItems() {
        addItemsToItemGroup();
    }
}