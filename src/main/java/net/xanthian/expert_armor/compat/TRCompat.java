package net.xanthian.expert_armor.compat;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.xanthian.expert_armor.Initialize_Mod;
import net.xanthian.expert_armor.item.ExpertGroup;

public class TRCompat {

    // Plates
    public static final Item BRONZE_PLATE = registerItem("trcompat/bronze_plate", new Item(new FabricItemSettings().group(ExpertGroup.EXPERT)));
    public static final Item RUBY_PLATE = registerItem("trcompat/ruby_plate", new Item(new FabricItemSettings().group(ExpertGroup.EXPERT)));
    public static final Item SAPPHIRE_PLATE = registerItem("trcompat/sapphire_plate", new Item(new FabricItemSettings().group(ExpertGroup.EXPERT)));
    public static final Item PERIDOT_PLATE = registerItem("trcompat/peridot_plate", new Item(new FabricItemSettings().group(ExpertGroup.EXPERT)));
    public static final Item SILVER_PLATE = registerItem("trcompat/silver_plate", new Item(new FabricItemSettings().group(ExpertGroup.EXPERT)));
    public static final Item STEEL_PLATE = registerItem("trcompat/steel_plate", new Item(new FabricItemSettings().group(ExpertGroup.EXPERT)));

    //Register Items
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Initialize_Mod.MOD_ID, name), item);
    }
    public static void registerModItems() {
        System.out.println("Tech Reborn detected, registering TR compat items for "+ Initialize_Mod.MOD_ID);
    }
}