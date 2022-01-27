package net.xanthian.expert_armor.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.xanthian.expert_armor.Initialize_Mod;


public class ExpertArmor {

    // Plates
    public static final Item LEATHER_PLATE = registerItem("leather_plate", new Item(new FabricItemSettings().group(ExpertGroup.EXPERT)));
    public static final Item IRON_PLATE = registerItem("iron_plate", new Item(new FabricItemSettings().group(ExpertGroup.EXPERT)));
    public static final Item GOLD_PLATE = registerItem("gold_plate", new Item(new FabricItemSettings().group(ExpertGroup.EXPERT)));
    public static final Item DIAMOND_PLATE = registerItem("diamond_plate", new Item(new FabricItemSettings().group(ExpertGroup.EXPERT)));
    public static final Item NETHERITE_PLATE = registerItem("netherite_plate", new Item(new FabricItemSettings().group(ExpertGroup.EXPERT)));


    //Register Items
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Initialize_Mod.MOD_ID, name), item);
}
    public static void registerModItems() {
        System.out.println("Registering items for "+ Initialize_Mod.MOD_ID);
    }
}