package net.xanthian.expert_armor.compat;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.xanthian.expert_armor.Initialise;

public class MobZ {

    public static final Item AMAT_PLATE = registerItem("mobz/amat_plate", new Item(new FabricItemSettings().group(Initialise.EXPERT)));
    public static final Item BEARLEATHER_PLATE = registerItem("mobz/bearleather_plate", new Item(new FabricItemSettings().group(Initialise.EXPERT)));
    public static final Item BOSS_PLATE = registerItem("mobz/boss_plate", new Item(new FabricItemSettings().group(Initialise.EXPERT)));
    public static final Item HARDENEDMETAL_PLATE = registerItem("mobz/hardenedmetal_plate", new Item(new FabricItemSettings().group(Initialise.EXPERT)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Initialise.MOD_ID, name), item);
    }
    public static void registerModItems() {
    }
}