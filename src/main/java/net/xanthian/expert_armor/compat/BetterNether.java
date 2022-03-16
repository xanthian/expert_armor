package net.xanthian.expert_armor.compat;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

import net.xanthian.expert_armor.Initialize_Mod;

import static net.xanthian.expert_armor.Initialize_Mod.LOGGER;

public class BetterNether {

    public static final Item NETHER_RUBY_PLATE = registerItem("betternether/nether_ruby_plate", new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT).rarity(Rarity.RARE)));
    public static final Item CINCINNASITE_PLATE = registerItem("betternether/cincinnasite_plate", new Item(new FabricItemSettings().group(Initialize_Mod.EXPERT)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Initialize_Mod.MOD_ID, name), item);
    }
    public static void registerModItems() {
        LOGGER.info("Better Nether detected, adding Armor Plates");
    }
}