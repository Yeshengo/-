package com.yeshengo.duocaoliuti.block.entity;

import aztech.modern_industrialization.inventory.ConfigurableFluidStack;
import aztech.modern_industrialization.inventory.MIInventory;
import aztech.modern_industrialization.inventory.SlotPositions;
import aztech.modern_industrialization.machines.BEP;
import aztech.modern_industrialization.machines.components.IsActiveComponent;
import aztech.modern_industrialization.machines.components.OrientationComponent;
import aztech.modern_industrialization.machines.gui.MachineGuiParameters;
import aztech.modern_industrialization.machines.guicomponents.AutoExtract;
import aztech.modern_industrialization.machines.guicomponents.ReiSlotLocking;
import aztech.modern_industrialization.machines.models.MachineCasing;
import aztech.modern_industrialization.machines.models.MachineModelClientData;
import aztech.modern_industrialization.machines.multiblocks.HatchBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.fluids.capability.IFluidHandler;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseMultiSlotFluidHatchBlockEntity extends HatchBlockEntity {
    protected final MIInventory inventory;
    protected final int slotCount = 4;
    protected final long capacityPerSlot;
    protected final IsActiveComponent isActiveComponent = new IsActiveComponent();

    public BaseMultiSlotFluidHatchBlockEntity(BEP bep, MachineGuiParameters guiParams, boolean isInput, long capacityPerSlot) {
        super(bep, guiParams, OrientationComponent.Params.noFacing(false, true));
        this.capacityPerSlot = capacityPerSlot;

        List<ConfigurableFluidStack> fluidStacks = new ArrayList<>();
        for (int i = 0; i < slotCount; i++) {
            if (isInput) {
                fluidStacks.add(ConfigurableFluidStack.standardInputSlot(capacityPerSlot));
            } else {
                fluidStacks.add(ConfigurableFluidStack.standardOutputSlot(capacityPerSlot));
            }
        }

        SlotPositions.Builder builder = new SlotPositions.Builder();
        int startX = 52;
        int y = 31;
        for (int i = 0; i < slotCount; i++) {
            builder.addSlot(startX + i * 18, y);
        }
        SlotPositions fluidPositions = builder.build();

        this.inventory = new MIInventory(new ArrayList<>(), fluidStacks, SlotPositions.empty(), fluidPositions);
        registerComponents(inventory, isActiveComponent);
        registerGuiComponent(new AutoExtract(orientation, isInput));
        registerGuiComponent(new ReiSlotLocking((recipeId, inv) -> {}, () -> true));
    }

    @Override
    public MIInventory getInventory() {
        return inventory;
    }

    @Override
    public boolean upgradesToSteel() {
        return false;
    }

    public IFluidHandler getFluidHandler() {
        return inventory.fluidStorage.fluidHandler;
    }

    @Override
    public MachineModelClientData getMachineModelData() {
        // 先获取父类模型数据（如果已匹配多方块结构，casing 不为 null）
        MachineModelClientData data = super.getMachineModelData();
        if (data.casing == null) {
            // 未匹配时使用默认外壳
            data = new MachineModelClientData(getDefaultCasing());
            orientation.writeModelData(data);
            data.isActive = isActiveComponent.isActive;
        }
        return data;
    }

    protected abstract MachineCasing getDefaultCasing();
}