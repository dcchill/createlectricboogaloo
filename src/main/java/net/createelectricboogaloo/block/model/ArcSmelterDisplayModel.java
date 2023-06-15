package net.createelectricboogaloo.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.createelectricboogaloo.block.display.ArcSmelterDisplayItem;

public class ArcSmelterDisplayModel extends AnimatedGeoModel<ArcSmelterDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ArcSmelterDisplayItem animatable) {
		return new ResourceLocation("createelectricboogaloo", "animations/arcsmelter.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ArcSmelterDisplayItem animatable) {
		return new ResourceLocation("createelectricboogaloo", "geo/arcsmelter.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ArcSmelterDisplayItem entity) {
		return new ResourceLocation("createelectricboogaloo", "textures/blocks/arcsmelttexture.png");
	}
}
