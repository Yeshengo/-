package com.yeshengo.duocaoliuti.registry;

import com.yeshengo.duocaoliuti.DuoCaoliuTi;
import com.yeshengo.duocaoliuti.block.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(DuoCaoliuTi.MOD_ID);

    // 青铜
    public static final DeferredBlock<Block> BRONZE_FLUID_INPUT = register("bronze_fluid_input", BronzeFluidInputBlock::new);
    public static final DeferredBlock<Block> BRONZE_FLUID_OUTPUT = register("bronze_fluid_output", BronzeFluidOutputBlock::new);
    // 钢
    public static final DeferredBlock<Block> STEEL_FLUID_INPUT = register("steel_fluid_input", SteelFluidInputBlock::new);
    public static final DeferredBlock<Block> STEEL_FLUID_OUTPUT = register("steel_fluid_output", SteelFluidOutputBlock::new);
    // 进阶
    public static final DeferredBlock<Block> ADVANCED_FLUID_INPUT = register("advanced_fluid_input", AdvancedFluidInputBlock::new);
    public static final DeferredBlock<Block> ADVANCED_FLUID_OUTPUT = register("advanced_fluid_output", AdvancedFluidOutputBlock::new);
    // 涡轮
    public static final DeferredBlock<Block> TURBO_FLUID_INPUT = register("turbo_fluid_input", TurboFluidInputBlock::new);
    public static final DeferredBlock<Block> TURBO_FLUID_OUTPUT = register("turbo_fluid_output", TurboFluidOutputBlock::new);
    // 高级
    public static final DeferredBlock<Block> ELITE_FLUID_INPUT = register("elite_fluid_input", EliteFluidInputBlock::new);
    public static final DeferredBlock<Block> ELITE_FLUID_OUTPUT = register("elite_fluid_output", EliteFluidOutputBlock::new);

    private static DeferredBlock<Block> register(String name, java.util.function.Function<BlockBehaviour.Properties, ? extends Block> factory) {
        return BLOCKS.registerBlock(name, factory, BlockBehaviour.Properties.of().mapColor(MapColor.METAL).strength(2.0f, 6.0f).requiresCorrectToolForDrops());
    }
}