package net.xanthian.expert_armor.compat;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import net.xanthian.expert_armor.Initialize_Mod;

import static net.xanthian.expert_armor.Initialize_Mod.LOGGER;

public class TRCompat {

    public static final Item BRONZE_PLATE = registerItem("trcompat/bronze_plate", new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT)));
    public static final Item RUBY_PLATE = registerItem("trcompat/ruby_plate", new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT)));
    public static final Item SAPPHIRE_PLATE = registerItem("trcompat/sapphire_plate", new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT)));
    public static final Item PERIDOT_PLATE = registerItem("trcompat/peridot_plate", new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT)));
    public static final Item SILVER_PLATE = registerItem("trcompat/silver_plate", new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT)));
    public static final Item STEEL_PLATE = registerItem("trcompat/steel_plate", new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Initialize_Mod.MOD_ID, name), item);
    }
    public static void registerModItems() {
        LOGGER.info("Tech Reborn detected, adding Armor Plates");
    }
}