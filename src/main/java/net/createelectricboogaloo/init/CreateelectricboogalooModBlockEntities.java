
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.createelectricboogaloo.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.createelectricboogaloo.CreateelectricboogalooMod;

public class CreateelectricboogalooModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, CreateelectricboogalooMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> COMBUSSIN_ENGINE_PART = register("combussin_engine_part", CreateelectricboogalooModBlocks.COMBUSSIN_ENGINE_PART, CombussinEnginePartBlockEntity::new);
	public static final RegistryObject<BlockEntityType<CombussinEngineTileEntity>> COMBUSSIN_ENGINE = REGISTRY.register("combussin_engine",
			() -> BlockEntityType.Builder.of(CombussinEngineTileEntity::new, CreateelectricboogalooModBlocks.COMBUSSIN_ENGINE.get()).build(null));

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
