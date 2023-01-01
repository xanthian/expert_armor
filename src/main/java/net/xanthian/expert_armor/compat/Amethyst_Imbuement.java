package net.xanthian.expert_armor.compat;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.xanthian.expert_armor.Initialise;

public class Amethyst_Imbuement {

    public static final Item AMETRINE_PLATE = registerItem("amethyst_imbuement/ametrine_plate",
            new Item(new FabricItemSettings()));

    public static final Item STEEL_PLATE = registerItem("amethyst_imbuement/steel_plate",
            new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Initialise.MOD_ID, name), item);
    }
    public static void registerModItems() {
    }
}