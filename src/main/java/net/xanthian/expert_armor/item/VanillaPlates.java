package net.xanthian.expert_armor.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import net.xanthian.expert_armor.Initialise;

public class VanillaPlates {

    // Plates
    public static final Item LEATHER_PLATE = registerItem("leather_plate",
            new Item(new FabricItemSettings()));

    public static final Item TURTLE_PLATE = registerItem("turtle_plate",
            new Item(new FabricItemSettings()));

    public static final Item IRON_PLATE = registerItem("iron_plate",
            new Item(new FabricItemSettings()));

    public static final Item GOLD_PLATE = registerItem("gold_plate",
            new Item(new FabricItemSettings()));

    public static final Item DIAMOND_PLATE = registerItem("diamond_plate",
            new Item(new FabricItemSettings()));

    public static final Item NETHERITE_PLATE = registerItem("netherite_plate",
            new Item(new FabricItemSettings()));

    //Register Items
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Initialise.MOD_ID, name), item);
}
    public static void registerModItems() {
    }
}