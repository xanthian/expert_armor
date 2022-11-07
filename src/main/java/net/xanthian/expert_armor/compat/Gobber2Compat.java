package net.xanthian.expert_armor.compat;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import net.xanthian.expert_armor.Initialize_Mod;

import static net.xanthian.expert_armor.Initialize_Mod.LOGGER;

public class Gobber2Compat {

    public static final Item GOBBER_NETHER_PLATE = registerItem("gobcompat/gobber2_nether_plate", new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT)));
    public static final Item GOBBER_PLATE = registerItem("gobcompat/gobber2_plate", new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT)));
    public static final Item GOBBER_REINFORCED_END_LINKS = registerItem("gobcompat/gobber2_reinforced_end_links", new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Initialize_Mod.MOD_ID, name), item);
    }
    public static void registerModItems() {
        LOGGER.debug("Gobber2 detected, adding Armor Plates");
    }
}