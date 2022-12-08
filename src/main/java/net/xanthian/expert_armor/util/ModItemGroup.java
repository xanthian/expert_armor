package net.xanthian.expert_armor.util;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.xanthian.expert_armor.Initialise;
import net.xanthian.expert_armor.item.VanillaPlates;


import java.util.Comparator;

public class ModItemGroup {

    public static void registerGroup() {
    }

    public static final ItemGroup EXPERT_ARMOR =
            FabricItemGroup.builder(new Identifier(Initialise.MOD_ID, "expert_armor"))
                    .displayName(Text.literal("Expert Armor Plates"))
                    .icon(() -> new ItemStack(VanillaPlates.NETHERITE_PLATE))
                    .entries((enabledFeatures, entries, operatorEnabled) -> {
                        entries.addAll(Registries.ITEM.getIds().stream()
                                .filter(identifier -> identifier.getNamespace().matches(Initialise.MOD_ID))
                                .sorted(Comparator.comparing(Identifier::getPath))
                                .map(Registries.ITEM::get)
                                .map(ItemStack::new)
                                .filter(input -> !input.isEmpty())
                                .toList());
                    })
                    .build();

}