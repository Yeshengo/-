package com.yeshengo.duocaoliuti.block;

import aztech.modern_industrialization.machines.MachineBlock;
import com.yeshengo.duocaoliuti.block.entity.SteelFluidInputBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

public class SteelFluidInputBlock extends MachineBlock {
    public SteelFluidInputBlock(Properties properties) {
        super(SteelFluidInputBlockEntity::new, properties);
    }

    @Override
    public SteelFluidInputBlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new SteelFluidInputBlockEntity(pos, state);
    }
}
