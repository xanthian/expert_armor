package net.xanthian.expert_armor.compat;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.xanthian.expert_armor.Initialize_Mod;

import static net.xanthian.expert_armor.Initialize_Mod.LOGGER;

public class More_Gems {

    public static final Item ALEXANDRITE_PLATE = registerItem("more_gems/alexandrite_plate", new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT)));
    public static final Item CARBONADO_PLATE = registerItem("more_gems/carbonado_plate", new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT)));
    public static final Item CITRINE_PLATE = registerItem("more_gems/citrine_plate", new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT)));
    public static final Item CORUNDUM_PLATE = registerItem("more_gems/corundum_plate", new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT)));
    public static final Item KUNZITE_PLATE = registerItem("more_gems/kunzite_plate", new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT)));
    public static final Item MOISSANITE_PLATE = registerItem("more_gems/moissanite_plate", new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT)));
    public static final Item SAPPHIRE_PLATE = registerItem("more_gems/sapphire_plate", new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT)));
    public static final Item SPINEL_PLATE = registerItem("more_gems/spinel_plate", new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT)));
    public static final Item TOPAZ_PLATE = registerItem("more_gems/topaz_plate", new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT)));
    public static final Item TOURMALINE_PLATE = registerItem("more_gems/tourmaline_plate", new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Initialize_Mod.MOD_ID, name), item);
    }
    public static void registerModItems() {
        LOGGER.debug("More Gems detected, adding Armor Plates");
    }
}