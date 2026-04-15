package com.yeshengo.duocaoliuti.block;

import aztech.modern_industrialization.machines.MachineBlock;
import com.yeshengo.duocaoliuti.block.entity.TurboFluidInputBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

public class TurboFluidInputBlock extends MachineBlock {
    public TurboFluidInputBlock(Properties properties) {
        super(TurboFluidInputBlockEntity::new, properties);
    }

    @Override
    public TurboFluidInputBlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new TurboFluidInputBlockEntity(pos, state);
    }
}