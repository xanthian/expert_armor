package net.xanthian.expert_armor;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.util.Identifier;
import net.xanthian.expert_armor.compat.Gobber2Compat;
import net.xanthian.expert_armor.compat.MMCompat;
import net.xanthian.expert_armor.compat.TRCompat;
import net.xanthian.expert_armor.item.ExpertArmor;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.fabricmc.fabric.api.resource.ResourcePackActivationType;

public class Initialize_Mod implements ModInitializer {

    public static final String MOD_ID = "expert_armor";

    @Override
    public void onInitialize() {

        ExpertArmor.registerModItems();

        if (FabricLoader.getInstance().isModLoaded("techreborn")) {
            TRCompat.registerModItems();
            ResourceManagerHelper.registerBuiltinResourcePack(new Identifier("trcompat"), FabricLoader.getInstance().getModContainer(Initialize_Mod.MOD_ID).orElseThrow(), ResourcePackActivationType.ALWAYS_ENABLED);
        }
        if (FabricLoader.getInstance().isModLoaded("gobber2")) {
            Gobber2Compat.registerModItems();
            ResourceManagerHelper.registerBuiltinResourcePack(new Identifier("gobcompat"), FabricLoader.getInstance().getModContainer(Initialize_Mod.MOD_ID).orElseThrow(), ResourcePackActivationType.ALWAYS_ENABLED);
        }
        if (FabricLoader.getInstance().isModLoaded("mythicmetals")) {
            MMCompat.registerModItems();
            ResourceManagerHelper.registerBuiltinResourcePack(new Identifier("mmcompat"), FabricLoader.getInstance().getModContainer(Initialize_Mod.MOD_ID).orElseThrow(), ResourcePackActivationType.ALWAYS_ENABLED);
        }
    }
}