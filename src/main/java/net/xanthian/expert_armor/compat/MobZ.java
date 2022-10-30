package net.xanthian.expert_armor.compat;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.xanthian.expert_armor.Initialize_Mod;

import static net.xanthian.expert_armor.Initialize_Mod.LOGGER;

public class MobZ {

    public static final Item AMAT_PLATE = registerItem("mobz/amat_plate", new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT)));
    public static final Item BEARLEATHER_PLATE = registerItem("mobz/bearleather_plate", new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT)));
    public static final Item BOSS_PLATE = registerItem("mobz/boss_plate", new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT)));
    public static final Item HARDENEDMETAL_PLATE = registerItem("mobz/hardenedmetal_plate", new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Initialize_Mod.MOD_ID, name), item);
    }
    public static void registerModItems() {
        LOGGER.info("MobZ detected, adding Armor Plates");
    }
}