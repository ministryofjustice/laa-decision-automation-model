package com.laa.model;

import java.math.BigDecimal;

import com.laa.model.civil.enums.AssetType;

public class CapitalAssets {
	
	private AssetType assetType;
	
	private BigDecimal amount = BigDecimal.ZERO;

	public AssetType getAssetType() {
		return assetType;
	}

	public void setAssetType(AssetType assetType) {
		this.assetType = assetType;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	

	
}
