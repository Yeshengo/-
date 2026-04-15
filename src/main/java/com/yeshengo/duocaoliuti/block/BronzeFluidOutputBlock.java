package com.yeshengo.duocaoliuti.block;

import aztech.modern_industrialization.machines.MachineBlock;
import com.yeshengo.duocaoliuti.block.entity.BronzeFluidOutputBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

public class BronzeFluidOutputBlock extends MachineBlock {
    public BronzeFluidOutputBlock(Properties properties) {
        super(BronzeFluidOutputBlockEntity::new, properties);
    }

    @Override
    public BronzeFluidOutputBlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new BronzeFluidOutputBlockEntity(pos, state);
    }
}
