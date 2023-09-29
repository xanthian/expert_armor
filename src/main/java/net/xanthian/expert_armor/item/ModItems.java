package net.xanthian.expert_armor.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import net.xanthian.expert_armor.Initialise;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Initialise.MOD_ID);

    public static final RegistryObject<Item> LEATHER_PATCH = ITEMS.register("leather_patch",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SCUTE_PLATE = ITEMS.register("scute_plate",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> IRON_PLATE = ITEMS.register("iron_plate",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GOLDEN_PLATE = ITEMS.register("golden_plate",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_PLATE = ITEMS.register("diamond_plate",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NETHERITE_PLATE = ITEMS.register("netherite_plate",
            () -> new Item(new Item.Properties()));

}