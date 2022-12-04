package net.xanthian.expert_armor.compat;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

import net.xanthian.expert_armor.Initialise;

public class BetterEnd {

    public static final Item AETERNIUM_PLATE = registerItem("betterend/aeternium_plate", new Item(new FabricItemSettings().group(Initialise.EXPERT)));
    public static final Item CRYSTALITE_PLATE = registerItem("betterend/crystalite_plate", new Item(new FabricItemSettings().group(Initialise.EXPERT).rarity(Rarity.RARE)));
    public static final Item TERMINITE_PLATE = registerItem("betterend/terminite_plate", new Item(new FabricItemSettings().group(Initialise.EXPERT)));
    public static final Item THALLASIUM_PLATE = registerItem("betterend/thallasium_plate", new Item(new FabricItemSettings().group(Initialise.EXPERT)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Initialise.MOD_ID, name), item);
    }
    public static void registerModItems() {
    }
}