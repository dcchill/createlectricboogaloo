package net.createelectricboogaloo.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fluids.capability.IFluidHandler;
import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import java.util.concurrent.atomic.AtomicInteger;

public class CombussinEngineUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((new Object() {
			public String getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getString(tag);
				return "";
			}
		}.getValue(world, new BlockPos(x, y, z), "Direction")).equals("North")) {
			if (new Object() {
				public int drainTankSimulate(LevelAccessor level, BlockPos pos, int amount) {
					AtomicInteger _retval = new AtomicInteger(0);
					BlockEntity _ent = level.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(ForgeCapabilities.FLUID_HANDLER, null).ifPresent(capability -> _retval.set(capability.drain(amount, IFluidHandler.FluidAction.SIMULATE).getAmount()));
					return _retval.get();
				}
			}.drainTankSimulate(world, new BlockPos(x, y, z - 1), 100) >= 100) {
				{
					BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z - 1));
					int _amount = 10;
					if (_ent != null)
						_ent.getCapability(ForgeCapabilities.FLUID_HANDLER, null).ifPresent(capability -> capability.drain(_amount, IFluidHandler.FluidAction.EXECUTE));
				}
				{
					BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
					int _amount = 200;
					if (_ent != null)
						_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> capability.receiveEnergy(_amount, false));
				}
				{
					int _value = 1;
					BlockPos _pos = new BlockPos(x, y, z);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("animation") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
						world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
				}
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.CAMPFIRE_COSY_SMOKE, (x - 0.8), (y + 1.2), (z - 2), 1, 0, 0.1, 0, 0.01);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.metal_pressure_plate.click_off")), SoundSource.BLOCKS, (float) 0.1, (float) 0.1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.metal_pressure_plate.click_off")), SoundSource.BLOCKS, (float) 0.1, (float) 0.1, false);
					}
				}
			}
		}
		if ((new Object() {
			public String getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getString(tag);
				return "";
			}
		}.getValue(world, new BlockPos(x, y, z), "Direction")).equals("South")) {
			if (new Object() {
				public int drainTankSimulate(LevelAccessor level, BlockPos pos, int amount) {
					AtomicInteger _retval = new AtomicInteger(0);
					BlockEntity _ent = level.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(ForgeCapabilities.FLUID_HANDLER, null).ifPresent(capability -> _retval.set(capability.drain(amount, IFluidHandler.FluidAction.SIMULATE).getAmount()));
					return _retval.get();
				}
			}.drainTankSimulate(world, new BlockPos(x, y, z + 1), 100) >= 100) {
				{
					BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z + 1));
					int _amount = 10;
					if (_ent != null)
						_ent.getCapability(ForgeCapabilities.FLUID_HANDLER, null).ifPresent(capability -> capability.drain(_amount, IFluidHandler.FluidAction.EXECUTE));
				}
				{
					BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
					int _amount = 200;
					if (_ent != null)
						_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> capability.receiveEnergy(_amount, false));
				}
				{
					int _value = 1;
					BlockPos _pos = new BlockPos(x, y, z);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("animation") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
						world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
				}
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.CAMPFIRE_COSY_SMOKE, (x + 0.8), (y + 1.2), (z + 2), 1, 0, 0.1, 0, 0.01);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.metal_pressure_plate.click_off")), SoundSource.BLOCKS, (float) 0.1, (float) 0.1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.metal_pressure_plate.click_off")), SoundSource.BLOCKS, (float) 0.1, (float) 0.1, false);
					}
				}
			}
		}
		if ((new Object() {
			public String getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getString(tag);
				return "";
			}
		}.getValue(world, new BlockPos(x, y, z), "Direction")).equals("West")) {
			if (new Object() {
				public int drainTankSimulate(LevelAccessor level, BlockPos pos, int amount) {
					AtomicInteger _retval = new AtomicInteger(0);
					BlockEntity _ent = level.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(ForgeCapabilities.FLUID_HANDLER, null).ifPresent(capability -> _retval.set(capability.drain(amount, IFluidHandler.FluidAction.SIMULATE).getAmount()));
					return _retval.get();
				}
			}.drainTankSimulate(world, new BlockPos(x - 1, y, z), 100) >= 100) {
				{
					BlockEntity _ent = world.getBlockEntity(new BlockPos(x - 1, y, z));
					int _amount = 10;
					if (_ent != null)
						_ent.getCapability(ForgeCapabilities.FLUID_HANDLER, null).ifPresent(capability -> capability.drain(_amount, IFluidHandler.FluidAction.EXECUTE));
				}
				{
					BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
					int _amount = 200;
					if (_ent != null)
						_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> capability.receiveEnergy(_amount, false));
				}
				{
					int _value = 1;
					BlockPos _pos = new BlockPos(x, y, z);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("animation") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
						world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
				}
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.CAMPFIRE_COSY_SMOKE, (x - 2), (y + 1.2), (z + 0.8), 1, 0, 0.1, 0, 0.01);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.metal_pressure_plate.click_off")), SoundSource.BLOCKS, (float) 0.1, (float) 0.1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.metal_pressure_plate.click_off")), SoundSource.BLOCKS, (float) 0.1, (float) 0.1, false);
					}
				}
			}
		}
		if ((new Object() {
			public String getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getString(tag);
				return "";
			}
		}.getValue(world, new BlockPos(x, y, z), "Direction")).equals("East")) {
			if (new Object() {
				public int drainTankSimulate(LevelAccessor level, BlockPos pos, int amount) {
					AtomicInteger _retval = new AtomicInteger(0);
					BlockEntity _ent = level.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(ForgeCapabilities.FLUID_HANDLER, null).ifPresent(capability -> _retval.set(capability.drain(amount, IFluidHandler.FluidAction.SIMULATE).getAmount()));
					return _retval.get();
				}
			}.drainTankSimulate(world, new BlockPos(x + 1, y, z), 100) >= 100) {
				{
					BlockEntity _ent = world.getBlockEntity(new BlockPos(x + 1, y, z));
					int _amount = 10;
					if (_ent != null)
						_ent.getCapability(ForgeCapabilities.FLUID_HANDLER, null).ifPresent(capability -> capability.drain(_amount, IFluidHandler.FluidAction.EXECUTE));
				}
				{
					BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
					int _amount = 200;
					if (_ent != null)
						_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> capability.receiveEnergy(_amount, false));
				}
				{
					int _value = 1;
					BlockPos _pos = new BlockPos(x, y, z);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("animation") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
						world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
				}
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.CAMPFIRE_COSY_SMOKE, (x + 2), (y + 1.2), (z - 0.8), 1, 0, 0.1, 0, 0.01);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.metal_pressure_plate.click_off")), SoundSource.BLOCKS, (float) 0.1, (float) 0.1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.metal_pressure_plate.click_off")), SoundSource.BLOCKS, (float) 0.1, (float) 0.1, false);
					}
				}
			}
		}
	}
}
