package com.yeshengo.duocaoliuti.block.entity;

import aztech.modern_industrialization.inventory.ConfigurableFluidStack;
import aztech.modern_industrialization.machines.BEP;
import aztech.modern_industrialization.machines.gui.MachineGuiParameters;
import aztech.modern_industrialization.machines.models.MachineCasing;
import aztech.modern_industrialization.machines.models.MachineCasings;
import aztech.modern_industrialization.machines.multiblocks.HatchType;
import aztech.modern_industrialization.machines.multiblocks.HatchTypes;
import com.yeshengo.duocaoliuti.registry.ModBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;
import java.util.List;

public class BronzeFluidOutputBlockEntity extends BaseMultiSlotFluidHatchBlockEntity {
    private static final long CAPACITY_PER_SLOT = 4000;

    public BronzeFluidOutputBlockEntity(BlockPos pos, BlockState state) {
        super(new BEP(ModBlockEntities.BRONZE_FLUID_OUTPUT_BE.get(), pos, state),
                new MachineGuiParameters.Builder("bronze_fluid_output", true).build(),
                false, CAPACITY_PER_SLOT);
    }

    @Override
    public HatchType getHatchType() {
        return HatchTypes.FLUID_OUTPUT;
    }

    @Override
    public void appendFluidOutputs(List<ConfigurableFluidStack> list) {
        list.addAll(inventory.getFluidStacks());
    }

    @Override
    protected void tickTransfer() {
        if (orientation.extractFluids) {
            inventory.autoExtractFluids(level, worldPosition, orientation.outputDirection);
        }
    }

    @Override
    protected MachineCasing getDefaultCasing() {
        return MachineCasings.BRONZE;
    }
}