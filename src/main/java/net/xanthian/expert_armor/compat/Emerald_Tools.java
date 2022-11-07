package net.xanthian.expert_armor.compat;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.xanthian.expert_armor.Initialize_Mod;

import static net.xanthian.expert_armor.Initialize_Mod.LOGGER;

public class Emerald_Tools {


    public static final Item EMERALD_PLATE = registerItem("emtools/emerald_plate", new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT)));
    public static final Item RUBY_PLATE = registerItem("emtools/ruby_plate", new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT)));
    public static final Item COPPER_PLATE = registerItem("emtools/copper_plate", new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT)));
    public static final Item AMETHYST_PLATE = registerItem("emtools/amethyst_plate", new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT)));
    public static final Item OBSIDIAN_PLATE = registerItem("emtools/obsidian_plate", new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT)));
    public static final Item STEEL_PLATE = registerItem("emtools/steel_plate", new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Initialize_Mod.MOD_ID, name), item);
    }
    public static void registerModItems() {
        LOGGER.debug("Emerald Tools detected, adding Armor Plates");
    }
}