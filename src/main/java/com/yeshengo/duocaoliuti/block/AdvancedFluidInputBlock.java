package com.yeshengo.duocaoliuti.block;

import aztech.modern_industrialization.machines.MachineBlock;
import com.yeshengo.duocaoliuti.block.entity.AdvancedFluidInputBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

public class AdvancedFluidInputBlock extends MachineBlock {
    public AdvancedFluidInputBlock(Properties properties) {
        super(AdvancedFluidInputBlockEntity::new, properties);
    }

    @Override
    public AdvancedFluidInputBlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new AdvancedFluidInputBlockEntity(pos, state);
    }
}