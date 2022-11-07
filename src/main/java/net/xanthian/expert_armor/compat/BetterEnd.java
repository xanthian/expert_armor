package net.xanthian.expert_armor.compat;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

import net.xanthian.expert_armor.Initialize_Mod;

import static net.xanthian.expert_armor.Initialize_Mod.LOGGER;

public class BetterEnd {

    public static final Item AETERNIUM_PLATE = registerItem("betterend/aeternium_plate", new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT)));
    public static final Item CRYSTALITE_PLATE = registerItem("betterend/crystalite_plate", new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT).rarity(Rarity.RARE)));
    public static final Item TERMINITE_PLATE = registerItem("betterend/terminite_plate", new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT)));
    public static final Item THALLASIUM_PLATE = registerItem("betterend/thallasium_plate", new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Initialize_Mod.MOD_ID, name), item);
    }
    public static void registerModItems() {
        LOGGER.debug("Better End detected, adding Armor Plates");
    }
}