package net.xanthian.expert_armor.compat;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import net.xanthian.expert_armor.Initialise;

public class Gobber2 {

    public static final Item GOBBER_NETHER_PLATE = registerItem("gobcompat/gobber2_nether_plate", new Item(new FabricItemSettings().group(Initialise.EXPERT)));
    public static final Item GOBBER_PLATE = registerItem("gobcompat/gobber2_plate", new Item(new FabricItemSettings().group(Initialise.EXPERT)));
    public static final Item GOBBER_REINFORCED_END_LINKS = registerItem("gobcompat/gobber2_reinforced_end_links", new Item(new FabricItemSettings().group(Initialise.EXPERT)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Initialise.MOD_ID, name), item);
    }
    public static void registerModItems() {
    }
}