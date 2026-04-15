package com.yeshengo.duocaoliuti;

import com.yeshengo.duocaoliuti.registry.ModBlockEntities;
import com.yeshengo.duocaoliuti.registry.ModBlocks;
import com.yeshengo.duocaoliuti.registry.ModCreativeTabs;
import com.yeshengo.duocaoliuti.registry.ModItems;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Mod(DuoCaoliuTi.MOD_ID)
public class DuoCaoliuTi {
    public static final String MOD_ID = "duocaoliuti";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public DuoCaoliuTi(IEventBus modEventBus) {
        ModBlocks.BLOCKS.register(modEventBus);
        ModItems.ITEMS.register(modEventBus);
        ModBlockEntities.BLOCK_ENTITIES.register(modEventBus);
        ModCreativeTabs.CREATIVE_TABS.register(modEventBus);
        modEventBus.addListener(this::registerCapabilities);
        LOGGER.info("多槽流体仓模组加载完成");
    }

    private void registerCapabilities(RegisterCapabilitiesEvent event) {
        // 输入仓
        event.registerBlockEntity(Capabilities.FluidHandler.BLOCK, ModBlockEntities.BRONZE_FLUID_INPUT_BE.get(), (be, dir) -> be.getFluidHandler());
        event.registerBlockEntity(Capabilities.FluidHandler.BLOCK, ModBlockEntities.STEEL_FLUID_INPUT_BE.get(), (be, dir) -> be.getFluidHandler());
        event.registerBlockEntity(Capabilities.FluidHandler.BLOCK, ModBlockEntities.ADVANCED_FLUID_INPUT_BE.get(), (be, dir) -> be.getFluidHandler());
        event.registerBlockEntity(Capabilities.FluidHandler.BLOCK, ModBlockEntities.TURBO_FLUID_INPUT_BE.get(), (be, dir) -> be.getFluidHandler());
        event.registerBlockEntity(Capabilities.FluidHandler.BLOCK, ModBlockEntities.ELITE_FLUID_INPUT_BE.get(), (be, dir) -> be.getFluidHandler());
        // 输出仓
        event.registerBlockEntity(Capabilities.FluidHandler.BLOCK, ModBlockEntities.BRONZE_FLUID_OUTPUT_BE.get(), (be, dir) -> be.getFluidHandler());
        event.registerBlockEntity(Capabilities.FluidHandler.BLOCK, ModBlockEntities.STEEL_FLUID_OUTPUT_BE.get(), (be, dir) -> be.getFluidHandler());
        event.registerBlockEntity(Capabilities.FluidHandler.BLOCK, ModBlockEntities.ADVANCED_FLUID_OUTPUT_BE.get(), (be, dir) -> be.getFluidHandler());
        event.registerBlockEntity(Capabilities.FluidHandler.BLOCK, ModBlockEntities.TURBO_FLUID_OUTPUT_BE.get(), (be, dir) -> be.getFluidHandler());
        event.registerBlockEntity(Capabilities.FluidHandler.BLOCK, ModBlockEntities.ELITE_FLUID_OUTPUT_BE.get(), (be, dir) -> be.getFluidHandler());
    }
}