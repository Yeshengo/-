package com.yeshengo.duocaoliuti.registry;

import com.yeshengo.duocaoliuti.DuoCaoliuTi;
import com.yeshengo.duocaoliuti.block.entity.*;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, DuoCaoliuTi.MOD_ID);

    // 输入仓实体类型
    public static final Supplier<BlockEntityType<BronzeFluidInputBlockEntity>> BRONZE_FLUID_INPUT_BE = register("bronze_fluid_input", BronzeFluidInputBlockEntity::new, ModBlocks.BRONZE_FLUID_INPUT);
    public static final Supplier<BlockEntityType<SteelFluidInputBlockEntity>> STEEL_FLUID_INPUT_BE = register("steel_fluid_input", SteelFluidInputBlockEntity::new, ModBlocks.STEEL_FLUID_INPUT);
    public static final Supplier<BlockEntityType<AdvancedFluidInputBlockEntity>> ADVANCED_FLUID_INPUT_BE = register("advanced_fluid_input", AdvancedFluidInputBlockEntity::new, ModBlocks.ADVANCED_FLUID_INPUT);
    public static final Supplier<BlockEntityType<TurboFluidInputBlockEntity>> TURBO_FLUID_INPUT_BE = register("turbo_fluid_input", TurboFluidInputBlockEntity::new, ModBlocks.TURBO_FLUID_INPUT);
    public static final Supplier<BlockEntityType<EliteFluidInputBlockEntity>> ELITE_FLUID_INPUT_BE = register("elite_fluid_input", EliteFluidInputBlockEntity::new, ModBlocks.ELITE_FLUID_INPUT);
    // 输出仓实体类型
    public static final Supplier<BlockEntityType<BronzeFluidOutputBlockEntity>> BRONZE_FLUID_OUTPUT_BE = register("bronze_fluid_output", BronzeFluidOutputBlockEntity::new, ModBlocks.BRONZE_FLUID_OUTPUT);
    public static final Supplier<BlockEntityType<SteelFluidOutputBlockEntity>> STEEL_FLUID_OUTPUT_BE = register("steel_fluid_output", SteelFluidOutputBlockEntity::new, ModBlocks.STEEL_FLUID_OUTPUT);
    public static final Supplier<BlockEntityType<AdvancedFluidOutputBlockEntity>> ADVANCED_FLUID_OUTPUT_BE = register("advanced_fluid_output", AdvancedFluidOutputBlockEntity::new, ModBlocks.ADVANCED_FLUID_OUTPUT);
    public static final Supplier<BlockEntityType<TurboFluidOutputBlockEntity>> TURBO_FLUID_OUTPUT_BE = register("turbo_fluid_output", TurboFluidOutputBlockEntity::new, ModBlocks.TURBO_FLUID_OUTPUT);
    public static final Supplier<BlockEntityType<EliteFluidOutputBlockEntity>> ELITE_FLUID_OUTPUT_BE = register("elite_fluid_output", EliteFluidOutputBlockEntity::new, ModBlocks.ELITE_FLUID_OUTPUT);

    private static <T extends BaseMultiSlotFluidHatchBlockEntity> Supplier<BlockEntityType<T>> register(String name, BlockEntityType.BlockEntitySupplier<T> factory, Supplier<? extends Block> block) {
        return BLOCK_ENTITIES.register(name, () -> BlockEntityType.Builder.of(factory, block.get()).build(null));
    }
}