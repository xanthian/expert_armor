package net.xanthian.expert_armor.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.advancement.criterion.InventoryChangedCriterion;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.xanthian.expert_armor.item.Vanilla;

import java.util.function.Consumer;

public class RecipeGenerator extends FabricRecipeProvider {
    public RecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {

        offerPlateRecipe(exporter, Vanilla.LEATHER_PATCH, Items.LEATHER);
        offerPlateRecipe(exporter, Vanilla.SCUTE_PLATE, Items.SCUTE);
        offerPlateRecipe(exporter, Vanilla.IRON_PLATE, Items.IRON_INGOT);
        offerPlateRecipe(exporter, Vanilla.GOLDEN_PLATE, Items.GOLD_INGOT);
        offerPlateRecipe(exporter, Vanilla.DIAMOND_PLATE, Items.DIAMOND);
        offerPlateRecipe(exporter, Vanilla.NETHERITE_PLATE, Items.NETHERITE_INGOT);

        offerUncraftingRecipe(exporter, Items.LEATHER, Vanilla.LEATHER_PATCH);
        offerUncraftingRecipe(exporter, Items.SCUTE, Vanilla.SCUTE_PLATE);
        offerUncraftingRecipe(exporter, Items.IRON_INGOT, Vanilla.IRON_PLATE);
        offerUncraftingRecipe(exporter, Items.GOLD_INGOT, Vanilla.GOLDEN_PLATE);
        offerUncraftingRecipe(exporter, Items.DIAMOND, Vanilla.DIAMOND_PLATE);
        offerUncraftingRecipe(exporter, Items.NETHERITE_INGOT, Vanilla.NETHERITE_PLATE);

    }
    
    public static void offerPlateRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible plate, ItemConvertible input) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, plate, 1)
                .input('X', input)
                .pattern("X X")
                .pattern("   ")
                .pattern("X X")
                .criterion("has_base_item", InventoryChangedCriterion.Conditions.items(input))
                .offerTo(exporter);
    }
    public static void offerUncraftingRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible output, ItemConvertible plate) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, output, 4)
                .input(plate)
                .criterion("has_plate", InventoryChangedCriterion.Conditions.items(plate))
                .offerTo(exporter);
    }
}