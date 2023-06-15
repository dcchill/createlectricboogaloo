package net.createelectricboogaloo.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.createelectricboogaloo.block.display.CombusinEngineDisplayItem;

public class CombusinEngineDisplayModel extends AnimatedGeoModel<CombusinEngineDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(CombusinEngineDisplayItem animatable) {
		return new ResourceLocation("createelectricboogaloo", "animations/modelcombussin.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CombusinEngineDisplayItem animatable) {
		return new ResourceLocation("createelectricboogaloo", "geo/modelcombussin.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CombusinEngineDisplayItem entity) {
		return new ResourceLocation("createelectricboogaloo", "textures/blocks/ctexture.png");
	}
}
