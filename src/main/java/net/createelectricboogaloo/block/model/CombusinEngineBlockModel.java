package net.createelectricboogaloo.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.createelectricboogaloo.block.entity.CombusinEngineTileEntity;

public class CombusinEngineBlockModel extends AnimatedGeoModel<CombusinEngineTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(CombusinEngineTileEntity animatable) {
		return new ResourceLocation("createelectricboogaloo", "animations/modelcombussin.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CombusinEngineTileEntity animatable) {
		return new ResourceLocation("createelectricboogaloo", "geo/modelcombussin.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CombusinEngineTileEntity entity) {
		return new ResourceLocation("createelectricboogaloo", "textures/blocks/ctexture.png");
	}
}
