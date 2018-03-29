package com.laa.model;

import java.math.BigDecimal;

import com.laa.model.civil.enums.AssetType;

public class CapitalAssets {
	
	private AssetType assetType;
	
	private BigDecimal amountInPrinciple = BigDecimal.ZERO;

	public AssetType getAssetType() {
		return assetType;
	}

	public void setAssetType(AssetType assetType) {
		this.assetType = assetType;
	}

	public BigDecimal getAmountInPrinciple() {
		return amountInPrinciple;
	}

	public void setAmountInPrinciple(BigDecimal amountInPrinciple) {
		this.amountInPrinciple = amountInPrinciple;
	}

	
}
