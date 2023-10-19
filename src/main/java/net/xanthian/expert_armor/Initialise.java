package net.xanthian.expert_armor;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

import net.xanthian.expert_armor.compat.*;
import net.xanthian.expert_armor.item.ExpertArmor;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.fabricmc.fabric.api.resource.ResourcePackActivationType;

public class Initialise implements ModInitializer {

    public static final String MOD_ID = "expert_armor";

    public static final ItemGroup EXPERT = FabricItemGroup.builder(new Identifier(MOD_ID, "expert")
    ).build();

    @Override
    public void onInitialize() {

        ExpertArmor.registerModItems();
        FabricLoader.getInstance().getModContainer(MOD_ID).ifPresent(modContainer -> {
            ResourceManagerHelper.registerBuiltinResourcePack(new Identifier(MOD_ID, "eamodcompat"), modContainer, ResourcePackActivationType.ALWAYS_ENABLED);
        });
        if (FabricLoader.getInstance().isModLoaded("techreborn")) {
            TechReborn.registerModItems();
        }
        if (FabricLoader.getInstance().isModLoaded("gobber2")) {
            Gobber2.registerModItems();
        }
        if (FabricLoader.getInstance().isModLoaded("mythicmetals")) {
            MythicMetals.registerModItems();
        }
        if (FabricLoader.getInstance().isModLoaded("botania")) {
            Botania.registerModItems();
        }
        if (FabricLoader.getInstance().isModLoaded("betternether")) {
            BetterNether.registerModItems();
        }
        if (FabricLoader.getInstance().isModLoaded("betterend")) {
            BetterEnd.registerModItems();
        }
        if (FabricLoader.getInstance().isModLoaded("copperequipment")) {
            CopperEquipment.registerModItems();
        }
        if (FabricLoader.getInstance().isModLoaded("advancednetherite")) {
            AdvancedNetherite.registerModItems();
        }
        if (FabricLoader.getInstance().isModLoaded("the_aether")) {
            AetherReborn.registerModItems();
        }
        if (FabricLoader.getInstance().isModLoaded("dragonloot")) {
            DragonLoot.registerModItems();
        }
        if (FabricLoader.getInstance().isModLoaded("amethystequipment")) {
            AmethystEquipment.registerModItems();
        }
        if (FabricLoader.getInstance().isModLoaded("boneequipment")) {
            BoneEquipment.registerModItems();
        }
        if (FabricLoader.getInstance().isModLoaded("dirtmonds")) {
            Dirtmonds.registerModItems();
        }
        if (FabricLoader.getInstance().isModLoaded("emerald_tools")) {
            EmeraldTools.registerModItems();
        }
        if (FabricLoader.getInstance().isModLoaded("obsidianequipment")) {
            ObsidianEquipment.registerModItems();
        }
        if (FabricLoader.getInstance().isModLoaded("valleycraft")) {
            ValleyCraft.registerModItems();
        }
        if (FabricLoader.getInstance().isModLoaded("more_gems")) {
            MoreGems.registerModItems();
        }
        if (FabricLoader.getInstance().isModLoaded("indrev")) {
            IndustrialRevolution.registerModItems();
        }
        if (FabricLoader.getInstance().isModLoaded("mobz")) {
            MobZ.registerModItems();
        }
        if (FabricLoader.getInstance().isModLoaded("twilightforest")) {
            TwilightForest.registerModItems();
        }
        if (FabricLoader.getInstance().isModLoaded("immersive_armors")) {
            ImmersiveArmors.registerModItems();
        }
        if (FabricLoader.getInstance().isModLoaded("galosphere")) {
            Galosphere.registerModItems();
        }
        if (FabricLoader.getInstance().isModLoaded("create")) {
            Create.registerModItems();
        }
        if (FabricLoader.getInstance().isModLoaded("biomemakeover")) {
            BiomeMakeover.registerModItems();
        }
        if (FabricLoader.getInstance().isModLoaded("friendsandfoes")) {
            FriendsAndFoes.registerModItems();
        }
        if (FabricLoader.getInstance().isModLoaded("liroth")) {
            Liroth.registerModItems();
        }
        if (FabricLoader.getInstance().isModLoaded("amethyst_imbuement")) {
            Amethyst_Imbuement.registerModItems();
        }
        if (FabricLoader.getInstance().isModLoaded("netherdepthsupgrade")) {
            NetherDepthsUpgrade.registerModItems();
        }
        if (FabricLoader.getInstance().isModLoaded("sculk_worm")) {
            Sculk_Worm.registerModItems();
        }
    }
}