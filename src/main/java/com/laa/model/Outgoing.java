package com.laa.model;

import java.math.BigDecimal;

import com.laa.model.civil.enums.OutgoingType;
import com.laa.model.civil.enums.PaymentFrequency;

public class Outgoing {
	
	private OutgoingType outGoingType;
	
	private BigDecimal amount;
	
	private PaymentFrequency frequency;

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

	public PaymentFrequency getFrequency() {
		return frequency;
	}

	public void setFrequency(PaymentFrequency frequency) {
		this.frequency = frequency;
	}



}
