package net.xanthian.expert_armor.compat;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.xanthian.expert_armor.Initialise;

public class Liroth {

    public static final Item ANSALUM_PLATE = registerItem("liroth/ansalum_plate",
            new Item(new FabricItemSettings()));

    public static final Item COMPRESSED_POTESTIUM_PLATE = registerItem("liroth/compressed_potestium_plate",
            new Item(new FabricItemSettings()));

    public static final Item COMPRESSED_QUANTUM_PLATE = registerItem("liroth/compressed_quantum_plate",
            new Item(new FabricItemSettings()));

    public static final Item LIROTHIAN_COBALT_PLATE = registerItem("liroth/lirothian_cobalt_plate",
            new Item(new FabricItemSettings()));

    public static final Item LIROTH_GEM_PLATE = registerItem("liroth/liroth_gem_plate",
            new Item(new FabricItemSettings()));

    public static final Item LUX_PLATE = registerItem("liroth/lux_plate",
            new Item(new FabricItemSettings()));

    public static final Item RUBY_PLATE = registerItem("liroth/ruby_plate",
            new Item(new FabricItemSettings()));

    public static final Item SALEM_PLATE = registerItem("liroth/salem_plate",
            new Item(new FabricItemSettings()));

    public static final Item TOURMALINE_PLATE = registerItem("liroth/tourmaline_plate",
            new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Initialise.MOD_ID, name), item);
    }
    public static void registerModItems() {
    }
}