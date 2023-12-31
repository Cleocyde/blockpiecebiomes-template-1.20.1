package net.cleocyde.blockpiecebiomes.fluids;

import net.cleocyde.blockpiecebiomes.BlockPieceBiomes;
import net.minecraft.block.BlockState;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.item.Item;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;

public abstract class CloudFluid extends SkypieaWater {
    @Override
    public Fluid getStill() {
        return BlockPieceBiomes.STILL_CLOUD;
    }

    @Override
    public Fluid getFlowing() {
        return BlockPieceBiomes.FLOWING_CLOUD;
    }

    @Override
    public Item getBucketItem() {
        return BlockPieceBiomes.CLOUD_BUCKET;
    }

    @Override
    protected BlockState toBlockState(FluidState fluidState) {
        return BlockPieceBiomes.CLOUD.getDefaultState().with(Properties.LEVEL_15, getBlockStateLevel(fluidState));
    }

    @Override
    protected void tryFlow(World world, BlockPos fluidPos, FluidState state) {

    }

    public static class Flowing extends CloudFluid {
        @Override
        protected void appendProperties(StateManager.Builder<Fluid, FluidState> builder) {
            super.appendProperties(builder);
            builder.add(LEVEL);
        }

        @Override
        protected int getFlowSpeed(WorldView worldView) {
            return 0;
        }

        @Override
        protected boolean isInfinite(World world) {
            return false;
        }

        @Override
        public int getLevel(FluidState fluidState) {
            return fluidState.get(LEVEL);
        }

        @Override
        public boolean isStill(FluidState fluidState) {
            return false;
        }
    }

    public static class Still extends CloudFluid {
        @Override
        protected boolean isInfinite(World world) {
            return false;
        }

        @Override
        public int getLevel(FluidState fluidState) {
            return 8;
        }

        @Override
        public boolean isStill(FluidState fluidState) {
            return true;
        }
    }
}
