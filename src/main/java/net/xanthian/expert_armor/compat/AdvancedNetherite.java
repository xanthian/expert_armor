package net.xanthian.expert_armor.compat;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import net.xanthian.expert_armor.Initialise;

public class AdvancedNetherite {

    public static final Item NETHERITE_IRON_PLATE = registerItem("advnetherite/netherite_iron_plate", new Item(new FabricItemSettings().group(Initialise.EXPERT)));
    public static final Item NETHERITE_GOLD_PLATE = registerItem("advnetherite/netherite_gold_plate", new Item(new FabricItemSettings().group(Initialise.EXPERT)));
    public static final Item NETHERITE_EMERALD_PLATE = registerItem("advnetherite/netherite_emerald_plate", new Item(new FabricItemSettings().group(Initialise.EXPERT)));
    public static final Item NETHERITE_DIAMOND_PLATE = registerItem("advnetherite/netherite_diamond_plate", new Item(new FabricItemSettings().group(Initialise.EXPERT)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Initialise.MOD_ID, name), item);
    }
    public static void registerModItems() {

    }
}