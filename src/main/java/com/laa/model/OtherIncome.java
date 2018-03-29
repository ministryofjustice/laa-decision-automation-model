package com.laa.model;

import java.math.BigDecimal;

import com.laa.model.civil.enums.IncomeType;
import com.laa.model.civil.enums.PaymentFrequency;

public class OtherIncome {
	
	private IncomeType incomeType;
	private BigDecimal amount = BigDecimal.ZERO;
	private PaymentFrequency frequency;
	public IncomeType getIncomeType() {
		return incomeType;
	}
	public void setIncomeType(IncomeType incomeType) {
		this.incomeType = incomeType;
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
