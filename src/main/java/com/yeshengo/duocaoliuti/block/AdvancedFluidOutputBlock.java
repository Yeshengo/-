package com.yeshengo.duocaoliuti.block;

import aztech.modern_industrialization.machines.MachineBlock;
import com.yeshengo.duocaoliuti.block.entity.AdvancedFluidOutputBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

public class AdvancedFluidOutputBlock extends MachineBlock {
    public AdvancedFluidOutputBlock(Properties properties) {
        super(AdvancedFluidOutputBlockEntity::new, properties);
    }

    @Override
    public AdvancedFluidOutputBlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new AdvancedFluidOutputBlockEntity(pos, state);
    }
}