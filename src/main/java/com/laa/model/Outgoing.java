package com.laa.model;

import java.math.BigDecimal;

import com.laa.model.civil.enums.OutgoingType;

public class Outgoing {
	
	private OutgoingType outGoingType;
	
	private BigDecimal amount;
	
	private String frequency;

	public OutgoingType getOutGoingType() {
		return outGoingType;
	}

	public void setOutGoingType(OutgoingType outGoingType) {
		this.outGoingType = outGoingType;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getFrequency() {
		return frequency;
	}

	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}
	
	

}
