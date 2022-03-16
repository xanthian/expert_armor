package net.xanthian.expert_armor.compat;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

import net.xanthian.expert_armor.Initialize_Mod;

import static net.xanthian.expert_armor.Initialize_Mod.LOGGER;

public class Botania {

    public static final Item ELEMENTIUM_PLATE = registerItem("botania/elementium_plate", new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT)));
    public static final Item MANASTEEL_PLATE = registerItem("botania/manasteel_plate", new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT)));
    public static final Item MANAWEAVE_PLATE = registerItem("botania/manaweave_plate", new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT)));
    public static final Item TERRASTEEL_PLATE = registerItem("botania/terrasteel_plate", new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT).rarity(Rarity.UNCOMMON)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Initialize_Mod.MOD_ID, name), item);
    }
    public static void registerModItems() {
        LOGGER.info("Botania detected, adding Armor Plates");
    }
}