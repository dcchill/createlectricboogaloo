package net.createelectricboogaloo.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.createelectricboogaloo.init.CreateelectricboogalooModBlocks;

public class CombussinEngineBlockAddedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getDirection()) == Direction.NORTH) {
			{
				BlockPos _pos = new BlockPos(x, y, z - 1);
				Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
				world.destroyBlock(_pos, false);
			}
			world.setBlock(new BlockPos(x, y, z - 1), CreateelectricboogalooModBlocks.COMBUSSIN_ENGINE_PART.get().defaultBlockState(), 3);
			if (!world.isClientSide()) {
				BlockPos _bp = new BlockPos(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putString("Direction", "North");
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
		}
		if ((entity.getDirection()) == Direction.SOUTH) {
			{
				BlockPos _pos = new BlockPos(x, y, z + 1);
				Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
				world.destroyBlock(_pos, false);
			}
			world.setBlock(new BlockPos(x, y, z + 1), CreateelectricboogalooModBlocks.COMBUSSIN_ENGINE_PART.get().defaultBlockState(), 3);
			if (!world.isClientSide()) {
				BlockPos _bp = new BlockPos(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putString("Direction", "South");
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
		}
		if ((entity.getDirection()) == Direction.WEST) {
			{
				BlockPos _pos = new BlockPos(x - 1, y, z);
				Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
				world.destroyBlock(_pos, false);
			}
			world.setBlock(new BlockPos(x - 1, y, z), CreateelectricboogalooModBlocks.COMBUSSIN_ENGINE_PART.get().defaultBlockState(), 3);
			if (!world.isClientSide()) {
				BlockPos _bp = new BlockPos(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putString("Direction", "West");
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
		}
		if ((entity.getDirection()) == Direction.EAST) {
			{
				BlockPos _pos = new BlockPos(x + 1, y, z);
				Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
				world.destroyBlock(_pos, false);
			}
			world.setBlock(new BlockPos(x + 1, y, z), CreateelectricboogalooModBlocks.COMBUSSIN_ENGINE_PART.get().defaultBlockState(), 3);
			if (!world.isClientSide()) {
				BlockPos _bp = new BlockPos(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putString("Direction", "East");
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
		}
	}
}
