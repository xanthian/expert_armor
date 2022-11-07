package net.xanthian.expert_armor.compat;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import net.xanthian.expert_armor.Initialize_Mod;

import static net.xanthian.expert_armor.Initialize_Mod.LOGGER;

public class AdvancedNetherite {

    public static final Item NETHERITE_IRON_PLATE = registerItem("advnetherite/netherite_iron_plate", new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT)));
    public static final Item NETHERITE_GOLD_PLATE = registerItem("advnetherite/netherite_gold_plate", new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT)));
    public static final Item NETHERITE_EMERALD_PLATE = registerItem("advnetherite/netherite_emerald_plate", new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT)));
    public static final Item NETHERITE_DIAMOND_PLATE = registerItem("advnetherite/netherite_diamond_plate", new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Initialize_Mod.MOD_ID, name), item);
    }
    public static void registerModItems() {
        LOGGER.debug("Advanced Netherite detected, adding Armor Plates");
    }
}