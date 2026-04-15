package com.yeshengo.duocaoliuti.block;

import aztech.modern_industrialization.machines.MachineBlock;
import com.yeshengo.duocaoliuti.block.entity.TurboFluidOutputBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

public class TurboFluidOutputBlock extends MachineBlock {
    public TurboFluidOutputBlock(Properties properties) {
        super(TurboFluidOutputBlockEntity::new, properties);
    }

    @Override
    public TurboFluidOutputBlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new TurboFluidOutputBlockEntity(pos, state);
    }
}