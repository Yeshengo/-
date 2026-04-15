package com.yeshengo.duocaoliuti.block;

import aztech.modern_industrialization.machines.MachineBlock;
import com.yeshengo.duocaoliuti.block.entity.EliteFluidInputBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

public class EliteFluidInputBlock extends MachineBlock {
    public EliteFluidInputBlock(Properties properties) {
        super(EliteFluidInputBlockEntity::new, properties);
    }

    @Override
    public EliteFluidInputBlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new EliteFluidInputBlockEntity(pos, state);
    }
}