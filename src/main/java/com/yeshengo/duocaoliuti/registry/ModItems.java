package com.yeshengo.duocaoliuti.registry;

import com.yeshengo.duocaoliuti.DuoCaoliuTi;
import net.minecraft.world.item.BlockItem;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(DuoCaoliuTi.MOD_ID);

    public static final DeferredItem<BlockItem> BRONZE_FLUID_INPUT = ITEMS.registerSimpleBlockItem("bronze_fluid_input", ModBlocks.BRONZE_FLUID_INPUT);
    public static final DeferredItem<BlockItem> BRONZE_FLUID_OUTPUT = ITEMS.registerSimpleBlockItem("bronze_fluid_output", ModBlocks.BRONZE_FLUID_OUTPUT);
    public static final DeferredItem<BlockItem> STEEL_FLUID_INPUT = ITEMS.registerSimpleBlockItem("steel_fluid_input", ModBlocks.STEEL_FLUID_INPUT);
    public static final DeferredItem<BlockItem> STEEL_FLUID_OUTPUT = ITEMS.registerSimpleBlockItem("steel_fluid_output", ModBlocks.STEEL_FLUID_OUTPUT);
    public static final DeferredItem<BlockItem> ADVANCED_FLUID_INPUT = ITEMS.registerSimpleBlockItem("advanced_fluid_input", ModBlocks.ADVANCED_FLUID_INPUT);
    public static final DeferredItem<BlockItem> ADVANCED_FLUID_OUTPUT = ITEMS.registerSimpleBlockItem("advanced_fluid_output", ModBlocks.ADVANCED_FLUID_OUTPUT);
    public static final DeferredItem<BlockItem> TURBO_FLUID_INPUT = ITEMS.registerSimpleBlockItem("turbo_fluid_input", ModBlocks.TURBO_FLUID_INPUT);
    public static final DeferredItem<BlockItem> TURBO_FLUID_OUTPUT = ITEMS.registerSimpleBlockItem("turbo_fluid_output", ModBlocks.TURBO_FLUID_OUTPUT);
    public static final DeferredItem<BlockItem> ELITE_FLUID_INPUT = ITEMS.registerSimpleBlockItem("elite_fluid_input", ModBlocks.ELITE_FLUID_INPUT);
    public static final DeferredItem<BlockItem> ELITE_FLUID_OUTPUT = ITEMS.registerSimpleBlockItem("elite_fluid_output", ModBlocks.ELITE_FLUID_OUTPUT);
}