package net.xanthian.expert_armor.item;

import com.google.common.collect.Maps;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import net.xanthian.expert_armor.Initialise;
import net.xanthian.expert_armor.item.types.PlateItem;

import java.util.Map;

public class Vanilla {

    public static Map<Identifier, Item> MOD_VANILLA_PLATES = Maps.newHashMap();

    public static final Item LEATHER_PATCH = new PlateItem();
    public static final Item SCUTE_PLATE = new PlateItem();
    public static final Item IRON_PLATE = new PlateItem();
    public static final Item GOLDEN_PLATE = new PlateItem();
    public static final Item DIAMOND_PLATE = new PlateItem();
    public static final Item NETHERITE_PLATE = new PlateItem();

    public static void registerVanillaPlateItems() {
        registerItem("leather_patch", LEATHER_PATCH);
        registerItem("scute_plate", SCUTE_PLATE);
        registerItem("iron_plate", IRON_PLATE);
        registerItem("golden_plate", GOLDEN_PLATE);
        registerItem("diamond_plate", DIAMOND_PLATE);
        registerItem("netherite_plate", NETHERITE_PLATE);
    }

    private static void registerItem(String name, Item item) {
        Identifier identifier = new Identifier(Initialise.MOD_ID, name.toLowerCase());
        MOD_VANILLA_PLATES.put(identifier, item);
        Registry.register(Registries.ITEM, new Identifier(Initialise.MOD_ID, name), item);
    }
}