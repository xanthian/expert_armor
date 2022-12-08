package net.xanthian.expert_armor.compat;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import net.xanthian.expert_armor.Initialise;

public class AdvancedNetherite {

    public static final Item NETHERITE_IRON_PLATE = registerItem("advnetherite/netherite_iron_plate", new Item(new FabricItemSettings()));
    public static final Item NETHERITE_GOLD_PLATE = registerItem("advnetherite/netherite_gold_plate", new Item(new FabricItemSettings()));
    public static final Item NETHERITE_EMERALD_PLATE = registerItem("advnetherite/netherite_emerald_plate", new Item(new FabricItemSettings()));
    public static final Item NETHERITE_DIAMOND_PLATE = registerItem("advnetherite/netherite_diamond_plate", new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Initialise.MOD_ID, name), item);
    }
    public static void registerModItems() {

    }
}