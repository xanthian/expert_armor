package net.xanthian.expert_armor.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;

import net.minecraft.data.client.*;
import net.minecraft.item.Item;

import net.xanthian.expert_armor.item.Vanilla;


public class ModelGenerator extends FabricModelProvider {
    public ModelGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        for (Item item : Vanilla.MOD_VANILLA_PLATES.values()) {
            itemModelGenerator.register(item, Models.GENERATED);
        }
    }
}