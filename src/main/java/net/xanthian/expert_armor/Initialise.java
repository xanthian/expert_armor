package net.xanthian.expert_armor;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.xanthian.expert_armor.item.Vanilla;

import net.fabricmc.api.ModInitializer;

public class Initialise implements ModInitializer {

    public static final String MOD_ID = "expert_armor";

    @Override
    public void onInitialize() {

        Vanilla.registerVanillaPlateItems();

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(content -> {
            for (Item item : Vanilla.MOD_VANILLA_PLATES.values())
                content.add(item);
        });
    }
}