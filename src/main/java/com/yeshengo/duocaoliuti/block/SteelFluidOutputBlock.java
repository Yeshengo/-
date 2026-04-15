package com.yeshengo.duocaoliuti.block;

import aztech.modern_industrialization.machines.MachineBlock;
import com.yeshengo.duocaoliuti.block.entity.SteelFluidOutputBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

public class SteelFluidOutputBlock extends MachineBlock {
    public SteelFluidOutputBlock(Properties properties) {
        super(SteelFluidOutputBlockEntity::new, properties);
    }

    @Override
    public SteelFluidOutputBlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new SteelFluidOutputBlockEntity(pos, state);
    }
}