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

public class EliteFluidInputBlockEntity extends BaseMultiSlotFluidHatchBlockEntity {
    private static final long CAPACITY_PER_SLOT = 64000;

    public EliteFluidInputBlockEntity(BlockPos pos, BlockState state) {
        super(new BEP(ModBlockEntities.ELITE_FLUID_INPUT_BE.get(), pos, state),
                new MachineGuiParameters.Builder("elite_fluid_input", true).build(),
                true, CAPACITY_PER_SLOT);
    }

    @Override
    public HatchType getHatchType() {
        return HatchTypes.FLUID_INPUT;
    }

    @Override
    public void appendFluidInputs(List<ConfigurableFluidStack> list) {
        list.addAll(inventory.getFluidStacks());
    }

    @Override
    protected void tickTransfer() {
        if (orientation.extractFluids) {
            inventory.autoInsertFluids(level, worldPosition, orientation.outputDirection);
        }
    }

    @Override
    protected MachineCasing getDefaultCasing() {
        return MachineCasings.get("ev");
    }
}