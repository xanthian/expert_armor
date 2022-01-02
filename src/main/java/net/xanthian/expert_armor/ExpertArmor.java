package net.xanthian.expert_armor;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.item.ItemGroup;


public class ExpertArmor implements ModInitializer {
 
    // an instance of our new item
    public static final Item DIAMOND_PLATE = new Item(new FabricItemSettings().group(ItemGroup.MISC));
	public static final Item IRON_PLATE = new Item(new FabricItemSettings().group(ItemGroup.MISC));
	public static final Item GOLD_PLATE = new Item(new FabricItemSettings().group(ItemGroup.MISC));
	public static final Item LEATHER_PLATE = new Item(new FabricItemSettings().group(ItemGroup.MISC));
 
    @Override
    public void onInitialize() {
        Registry.register(Registry.ITEM, new Identifier("expert_armor", "diamond_plate"), DIAMOND_PLATE);
		Registry.register(Registry.ITEM, new Identifier("expert_armor", "iron_plate"), IRON_PLATE);
		Registry.register(Registry.ITEM, new Identifier("expert_armor", "gold_plate"), GOLD_PLATE);
		Registry.register(Registry.ITEM, new Identifier("expert_armor", "leather_plate"), LEATHER_PLATE);
    } 
}