package net.xanthian.expert_armor.compat;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.xanthian.expert_armor.Initialize_Mod;
import net.xanthian.expert_armor.item.ExpertGroup;

public class MMCompat {

    // Plates
    public static final Item ADAMANTITE_PLATE = registerItem("mmcompat/adamantite_plate", new Item(new FabricItemSettings().group(ExpertGroup.EXPERT)));
    public static final Item AQUARIUM_PLATE = registerItem("mmcompat/aquarium_plate", new Item(new FabricItemSettings().group(ExpertGroup.EXPERT)));
    public static final Item BANGLUM_PLATE = registerItem("mmcompat/banglum_plate", new Item(new FabricItemSettings().group(ExpertGroup.EXPERT)));
    public static final Item BRONZE_PLATE = registerItem("mmcompat/bronze_plate", new Item(new FabricItemSettings().group(ExpertGroup.EXPERT)));
    public static final Item CARMOT_PLATE = registerItem("mmcompat/carmot_plate", new Item(new FabricItemSettings().group(ExpertGroup.EXPERT)));
    public static final Item CELESTIUM_PLATE = registerItem("mmcompat/celestium_plate", new Item(new FabricItemSettings().group(ExpertGroup.EXPERT)));
    public static final Item COPPER_PLATE = registerItem("mmcompat/copper_plate", new Item(new FabricItemSettings().group(ExpertGroup.EXPERT)));
    public static final Item DURASTEEL_PLATE = registerItem("mmcompat/durasteel_plate", new Item(new FabricItemSettings().group(ExpertGroup.EXPERT)));
    public static final Item HALLOWED_PLATE = registerItem("mmcompat/hallowed_plate", new Item(new FabricItemSettings().group(ExpertGroup.EXPERT)));
    public static final Item KYBER_PLATE = registerItem("mmcompat/kyber_plate", new Item(new FabricItemSettings().group(ExpertGroup.EXPERT)));
    public static final Item METALLURGIUM_PLATE = registerItem("mmcompat/metallurgium_plate", new Item(new FabricItemSettings().group(ExpertGroup.EXPERT)));
    public static final Item MIDAS_GOLD_PLATE = registerItem("mmcompat/midas_gold_plate", new Item(new FabricItemSettings().group(ExpertGroup.EXPERT)));
    public static final Item MYTHRIL_PLATE = registerItem("mmcompat/mythril_plate", new Item(new FabricItemSettings().group(ExpertGroup.EXPERT)));
    public static final Item ORICHALCUM_PLATE = registerItem("mmcompat/orichalcum_plate", new Item(new FabricItemSettings().group(ExpertGroup.EXPERT)));
    public static final Item OSMIUM_PLATE = registerItem("mmcompat/osmium_plate", new Item(new FabricItemSettings().group(ExpertGroup.EXPERT)));
    public static final Item PALLADIUM_PLATE = registerItem("mmcompat/palladium_plate", new Item(new FabricItemSettings().group(ExpertGroup.EXPERT)));
    public static final Item PROMETHEUM_PLATE = registerItem("mmcompat/prometheum_plate", new Item(new FabricItemSettings().group(ExpertGroup.EXPERT)));
    public static final Item RUNITE_PLATE = registerItem("mmcompat/runite_plate", new Item(new FabricItemSettings().group(ExpertGroup.EXPERT)));
    public static final Item SILVER_PLATE = registerItem("mmcompat/silver_plate", new Item(new FabricItemSettings().group(ExpertGroup.EXPERT)));
    public static final Item STAR_PLATINUM_PLATE = registerItem("mmcompat/star_platinum_plate", new Item(new FabricItemSettings().group(ExpertGroup.EXPERT)));
    public static final Item STORMYX_PLATE = registerItem("mmcompat/stormyx_plate", new Item(new FabricItemSettings().group(ExpertGroup.EXPERT)));

    //Register Items
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Initialize_Mod.MOD_ID, name), item);
    }
    public static void registerModItems() {
        System.out.println("Mythic Metals detected, registering MM compat items for "+ Initialize_Mod.MOD_ID);
    }
}
