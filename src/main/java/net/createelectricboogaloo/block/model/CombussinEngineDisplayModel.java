package net.createelectricboogaloo.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.createelectricboogaloo.block.display.CombussinEngineDisplayItem;

public class CombussinEngineDisplayModel extends AnimatedGeoModel<CombussinEngineDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(CombussinEngineDisplayItem animatable) {
		return new ResourceLocation("createelectricboogaloo", "animations/modelcombussin.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CombussinEngineDisplayItem animatable) {
		return new ResourceLocation("createelectricboogaloo", "geo/modelcombussin.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CombussinEngineDisplayItem entity) {
		return new ResourceLocation("createelectricboogaloo", "textures/blocks/ctexture.png");
	}
}
