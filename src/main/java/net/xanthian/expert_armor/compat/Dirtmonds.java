package net.xanthian.expert_armor.compat;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.xanthian.expert_armor.Initialize_Mod;

import static net.xanthian.expert_armor.Initialize_Mod.LOGGER;

public class Dirtmonds {

    public static final Item DIRTMOND_PLATE = registerItem("dirtmonds/dirtmond_plate", new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Initialize_Mod.MOD_ID, name), item);
    }
    public static void registerModItems() {
        LOGGER.info("Dirtmonds detected, adding Armor Plates");
    }
}