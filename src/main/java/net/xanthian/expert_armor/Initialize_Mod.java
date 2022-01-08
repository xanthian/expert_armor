package net.xanthian.expert_armor;

import net.fabricmc.api.ModInitializer;
import net.xanthian.expert_armor.item.ExpertArmor;

public class Initialize_Mod implements ModInitializer {

    public static final String MOD_ID = "expert_armor";

    @Override
    public void onInitialize() {

        ExpertArmor.registerModItems();

    }
}