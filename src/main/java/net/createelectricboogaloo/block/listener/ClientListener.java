package net.createelectricboogaloo.block.listener;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.createelectricboogaloo.init.CreateelectricboogalooModBlockEntities;
import net.createelectricboogaloo.block.renderer.CombussinEngineTileRenderer;
import net.createelectricboogaloo.block.renderer.ArcSmelterTileRenderer;
import net.createelectricboogaloo.CreateelectricboogalooMod;

@Mod.EventBusSubscriber(modid = CreateelectricboogalooMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientListener {
	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent
	public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerBlockEntityRenderer(CreateelectricboogalooModBlockEntities.COMBUSSIN_ENGINE.get(), CombussinEngineTileRenderer::new);
		event.registerBlockEntityRenderer(CreateelectricboogalooModBlockEntities.ARC_SMELTER.get(), ArcSmelterTileRenderer::new);
	}
}
