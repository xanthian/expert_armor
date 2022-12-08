package net.xanthian.expert_armor.compat;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;


import net.xanthian.expert_armor.Initialise;

public class BetterEnd {

    public static final Item AETERNIUM_PLATE = registerItem("betterend/aeternium_plate", new Item(new FabricItemSettings()));
    public static final Item CRYSTALITE_PLATE = registerItem("betterend/crystalite_plate", new Item(new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item TERMINITE_PLATE = registerItem("betterend/terminite_plate", new Item(new FabricItemSettings()));
    public static final Item THALLASIUM_PLATE = registerItem("betterend/thallasium_plate", new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Initialise.MOD_ID, name), item);
    }
    public static void registerModItems() {
    }
}