package com.yeshengo.duocaoliuti.registry;

import com.yeshengo.duocaoliuti.DuoCaoliuTi;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DuoCaoliuTi.MOD_ID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> MAIN_TAB = CREATIVE_TABS.register("main",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.duocaoliuti"))
                    .icon(() -> new ItemStack(ModItems.BRONZE_FLUID_INPUT.get()))
                    .displayItems((parameters, output) -> {
                        output.accept(ModItems.BRONZE_FLUID_INPUT.get());
                        output.accept(ModItems.BRONZE_FLUID_OUTPUT.get());
                        output.accept(ModItems.STEEL_FLUID_INPUT.get());
                        output.accept(ModItems.STEEL_FLUID_OUTPUT.get());
                        output.accept(ModItems.ADVANCED_FLUID_INPUT.get());
                        output.accept(ModItems.ADVANCED_FLUID_OUTPUT.get());
                        output.accept(ModItems.TURBO_FLUID_INPUT.get());
                        output.accept(ModItems.TURBO_FLUID_OUTPUT.get());
                        output.accept(ModItems.ELITE_FLUID_INPUT.get());
                        output.accept(ModItems.ELITE_FLUID_OUTPUT.get());
                    })
                    .build()
    );
}