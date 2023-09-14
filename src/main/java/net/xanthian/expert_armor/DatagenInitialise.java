package net.xanthian.expert_armor;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.xanthian.expert_armor.datagen.LangFileGenerator;
import net.xanthian.expert_armor.datagen.ModelGenerator;
import net.xanthian.expert_armor.datagen.RecipeGenerator;

public class DatagenInitialise implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        pack.addProvider(RecipeGenerator::new);
        pack.addProvider(LangFileGenerator::new);
        pack.addProvider(ModelGenerator::new);
    }
}
