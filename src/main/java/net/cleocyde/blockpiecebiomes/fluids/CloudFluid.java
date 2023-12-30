package net.cleocyde.blockpiecebiomes.fluids;

import net.cleocyde.blockpiecebiomes.BlockPieceBiomes;
import net.minecraft.block.BlockState;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.item.Item;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.Properties;
import net.minecraft.world.World;

public abstract class CloudFluid extends SkypieaWater {
    @Override
    public Fluid getStill() {
        return BlockPieceBiomes.STILL_ACID;
    }

    @Override
    public Fluid getFlowing() {
        return BlockPieceBiomes.FLOWING_ACID;
    }

    @Override
    public Item getBucketItem() {
        return BlockPieceBiomes.ACID_BUCKET;
    }

    @Override
    protected BlockState toBlockState(FluidState fluidState) {
        return BlockPieceBiomes.ACID.getDefaultState().with(Properties.LEVEL_15, getBlockStateLevel(fluidState));
    }

    public static class Flowing extends CloudFluid {
        @Override
        protected void appendProperties(StateManager.Builder<Fluid, FluidState> builder) {
            super.appendProperties(builder);
            builder.add(LEVEL);
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
