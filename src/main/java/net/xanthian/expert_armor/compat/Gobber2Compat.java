package net.xanthian.expert_armor.compat;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.xanthian.expert_armor.Initialize_Mod;
import net.xanthian.expert_armor.item.ExpertGroup;

public class Gobber2Compat {

    // Plates
    public static final Item GOBBER_NETHER_PLATE = registerItem("gobcompat/gobber2_nether_plate", new Item(new FabricItemSettings().group(ExpertGroup.EXPERT)));
    public static final Item GOBBER_PLATE = registerItem("gobcompat/gobber2_plate", new Item(new FabricItemSettings().group(ExpertGroup.EXPERT)));
    public static final Item GOBBER_REINFORCED_END_LINKS = registerItem("gobcompat/gobber2_reinforced_end_links", new Item(new FabricItemSettings().group(ExpertGroup.EXPERT)));


    //Register Items
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Initialize_Mod.MOD_ID, name), item);
    }
    public static void registerModItems() {
        System.out.println("Gobber2 detected, registering Gobber2 compat items for "+ Initialize_Mod.MOD_ID);
    }
}