package net.createelectricboogaloo.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.createelectricboogaloo.block.model.ArcSmelterDisplayModel;
import net.createelectricboogaloo.block.display.ArcSmelterDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class ArcSmelterDisplayItemRenderer extends GeoItemRenderer<ArcSmelterDisplayItem> {
	public ArcSmelterDisplayItemRenderer() {
		super(new ArcSmelterDisplayModel());
	}

	@Override
	public RenderType getRenderType(ArcSmelterDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
