package net.xanthian.expert_armor.compat;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import net.xanthian.expert_armor.Initialize_Mod;

import static net.xanthian.expert_armor.Initialize_Mod.LOGGER;

public class CopperEquipment {

    public static final Item COMPRESSED_COPPER_PLATE = registerItem("coppereq/compressed_copper_plate", new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT)));
    public static final Item COMPRESSED_WAXED_COPPER_PLATE = registerItem("coppereq/compressed_waxed_copper_plate", new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Initialize_Mod.MOD_ID, name), item);
    }
    public static void registerModItems() {
        LOGGER.debug("Copper Equipment detected, adding Armor Plates");
    }
}