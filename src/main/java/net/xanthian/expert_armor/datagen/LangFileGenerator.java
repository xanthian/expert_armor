package net.xanthian.expert_armor.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

import net.xanthian.expert_armor.item.Vanilla;

public class LangFileGenerator extends FabricLanguageProvider {
    public LangFileGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {

        translationBuilder.add(Vanilla.LEATHER_PATCH, "Leather Patch");
        translationBuilder.add(Vanilla.SCUTE_PLATE, "Scute Plate");
        translationBuilder.add(Vanilla.IRON_PLATE, "Iron Plate");
        translationBuilder.add(Vanilla.GOLDEN_PLATE, "Golden Plate");
        translationBuilder.add(Vanilla.DIAMOND_PLATE, "Diamond Plate");
        translationBuilder.add(Vanilla.NETHERITE_PLATE, "Netherite Plate");
    }
}