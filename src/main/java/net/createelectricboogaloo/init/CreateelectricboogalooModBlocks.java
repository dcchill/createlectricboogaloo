
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.createelectricboogaloo.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.createelectricboogaloo.block.CombussinEnginePartBlock;
import net.createelectricboogaloo.block.CombussinEngineBlock;
import net.createelectricboogaloo.CreateelectricboogalooMod;

public class CreateelectricboogalooModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, CreateelectricboogalooMod.MODID);
	public static final RegistryObject<Block> COMBUSSIN_ENGINE_PART = REGISTRY.register("combussin_engine_part", () -> new CombussinEnginePartBlock());
	public static final RegistryObject<Block> COMBUSSIN_ENGINE = REGISTRY.register("combussin_engine", () -> new CombussinEngineBlock());
}
