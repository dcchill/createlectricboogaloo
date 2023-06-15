package net.createelectricboogaloo.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.createelectricboogaloo.block.model.CombusinEngineDisplayModel;
import net.createelectricboogaloo.block.display.CombusinEngineDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class CombusinEngineDisplayItemRenderer extends GeoItemRenderer<CombusinEngineDisplayItem> {
	public CombusinEngineDisplayItemRenderer() {
		super(new CombusinEngineDisplayModel());
	}

	@Override
	public RenderType getRenderType(CombusinEngineDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
