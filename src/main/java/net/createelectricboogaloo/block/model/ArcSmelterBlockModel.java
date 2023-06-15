package net.createelectricboogaloo.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.createelectricboogaloo.block.entity.ArcSmelterTileEntity;

public class ArcSmelterBlockModel extends AnimatedGeoModel<ArcSmelterTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ArcSmelterTileEntity animatable) {
		return new ResourceLocation("createelectricboogaloo", "animations/arcsmelter.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ArcSmelterTileEntity animatable) {
		return new ResourceLocation("createelectricboogaloo", "geo/arcsmelter.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ArcSmelterTileEntity entity) {
		return new ResourceLocation("createelectricboogaloo", "textures/blocks/arcsmelttexture.png");
	}
}
