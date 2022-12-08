package net.xanthian.expert_armor.compat;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import net.xanthian.expert_armor.Initialise;



public class ImmersiveArmors {

    public static final Item BONE_PLATE = registerItem("immersive_armors/bone_plate", new Item(new FabricItemSettings()));
    public static final Item NETHER_BRICK_PLATE = registerItem("immersive_armors/nether_brick_plate", new Item(new FabricItemSettings()));
    public static final Item WOOLEN_PLATE = registerItem("immersive_armors/woolen_plate", new Item(new FabricItemSettings()));
    public static final Item SLIME_PLATE = registerItem("immersive_armors/slime_plate", new Item(new FabricItemSettings()));
    public static final Item PRISMARINE_PLATE = registerItem("immersive_armors/prismarine_plate", new Item(new FabricItemSettings()));
    public static final Item WOODEN_PLATE = registerItem("immersive_armors/wooden_plate", new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Initialise.MOD_ID, name), item);
    }
    public static void registerModItems() {
    }
}