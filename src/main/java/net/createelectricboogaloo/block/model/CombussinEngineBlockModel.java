package net.createelectricboogaloo.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.createelectricboogaloo.block.entity.CombussinEngineTileEntity;

public class CombussinEngineBlockModel extends AnimatedGeoModel<CombussinEngineTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(CombussinEngineTileEntity animatable) {
		return new ResourceLocation("createelectricboogaloo", "animations/modelcombussin.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CombussinEngineTileEntity animatable) {
		return new ResourceLocation("createelectricboogaloo", "geo/modelcombussin.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CombussinEngineTileEntity entity) {
		return new ResourceLocation("createelectricboogaloo", "textures/blocks/ctexture.png");
	}
}
