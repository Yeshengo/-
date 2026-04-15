package com.yeshengo.duocaoliuti.block;

import aztech.modern_industrialization.machines.MachineBlock;
import com.yeshengo.duocaoliuti.block.entity.EliteFluidOutputBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

public class EliteFluidOutputBlock extends MachineBlock {
    public EliteFluidOutputBlock(Properties properties) {
        super(EliteFluidOutputBlockEntity::new, properties);
    }

    @Override
    public EliteFluidOutputBlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new EliteFluidOutputBlockEntity(pos, state);
    }
}