package net.xanthian.expert_armor.compat;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.xanthian.expert_armor.Initialize_Mod;

import static net.xanthian.expert_armor.Initialize_Mod.LOGGER;

public class IndustrialRevolution {

    public static final Item BRONZE_PLATE = registerItem("ircompat/bronze_plate", new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT)));
    public static final Item COPPER_PLATE = registerItem("ircompat/copper_plate", new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT)));
    public static final Item LEAD_PLATE = registerItem("ircompat/lead_plate", new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT)));
    public static final Item SILVER_PLATE = registerItem("ircompat/silver_plate", new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT)));
    public static final Item STEEL_PLATE = registerItem("ircompat/steel_plate", new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT)));
    public static final Item TIN_PLATE = registerItem("ircompat/tin_plate", new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Initialize_Mod.MOD_ID, name), item);
    }
    public static void registerModItems() {
        LOGGER.info("Industrial Revolution detected, adding Armor Plates");
    }
}