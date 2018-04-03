package com.laa.model;

import java.math.BigDecimal;

import com.laa.model.civil.enums.OwnershipType;
import com.laa.model.civil.enums.PropertyType;

public class Property {
	
	private PropertyType propertyType;
	
	private OwnershipType ownershipType;

	private BigDecimal marketValue;
	
	private boolean chargeOnProperty;

	private boolean mortgaged;
	
	private BigDecimal amountInPrinciple;


	public PropertyType getPropertyType() {
		return propertyType;
	}

	public void setPropertyType(PropertyType propertyType) {
		this.propertyType = propertyType;
	}

	public OwnershipType getOwnershipType() {
		return ownershipType;
	}

	public void setOwnershipType(OwnershipType ownershipType) {
		this.ownershipType = ownershipType;
	}

	public BigDecimal getMarketValue() {
		return marketValue;
	}

	public void setMarketValue(BigDecimal marketValue) {
		this.marketValue = marketValue;
	}

	public boolean isChargeOnProperty() {
		return chargeOnProperty;
	}

	public void setChargeOnProperty(boolean chargeOnProperty) {
		this.chargeOnProperty = chargeOnProperty;
	}

	public boolean isMortgaged() {
		return mortgaged;
	}

	public void setMortgaged(boolean mortgaged) {
		this.mortgaged = mortgaged;
	}

	public BigDecimal getAmountInPrinciple() {
		return amountInPrinciple;
	}

	public void setAmountInPrinciple(BigDecimal amountInPrinciple) {
		this.amountInPrinciple = amountInPrinciple;
	}
	
	
}
