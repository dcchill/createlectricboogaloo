
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.createelectricboogaloo.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.createelectricboogaloo.block.display.CombussinEngineDisplayItem;
import net.createelectricboogaloo.block.display.ArcSmelterDisplayItem;
import net.createelectricboogaloo.CreateelectricboogalooMod;

public class CreateelectricboogalooModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, CreateelectricboogalooMod.MODID);
	public static final RegistryObject<Item> COMBUSSIN_ENGINE_PART = block(CreateelectricboogalooModBlocks.COMBUSSIN_ENGINE_PART, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> COMBUSSIN_ENGINE = REGISTRY.register(CreateelectricboogalooModBlocks.COMBUSSIN_ENGINE.getId().getPath(),
			() -> new CombussinEngineDisplayItem(CreateelectricboogalooModBlocks.COMBUSSIN_ENGINE.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
	public static final RegistryObject<Item> ARC_SMELTER = REGISTRY.register(CreateelectricboogalooModBlocks.ARC_SMELTER.getId().getPath(),
			() -> new ArcSmelterDisplayItem(CreateelectricboogalooModBlocks.ARC_SMELTER.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
