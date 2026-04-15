package com.yeshengo.duocaoliuti.block;

import aztech.modern_industrialization.machines.MachineBlock;
import com.yeshengo.duocaoliuti.block.entity.BronzeFluidInputBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

public class BronzeFluidInputBlock extends MachineBlock {
    public BronzeFluidInputBlock(Properties properties) {
        super(BronzeFluidInputBlockEntity::new, properties);
    }

    @Override
    public BronzeFluidInputBlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new BronzeFluidInputBlockEntity(pos, state);
    }
}