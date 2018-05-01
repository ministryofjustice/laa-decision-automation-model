package com.laa.model;

import java.math.BigDecimal;

import com.laa.model.civil.enums.PaymentFrequency;
import com.laa.model.enums.EmploymentType;

public class EmployedIncome {
	
	private BigDecimal pay = BigDecimal.ZERO;
	private BigDecimal incomeTax = BigDecimal.ZERO;
	private BigDecimal nationalInsurance =BigDecimal.ZERO;
	private PaymentFrequency frequency;
	private EmploymentType employmentType;
	public BigDecimal getPay() {
		return pay;
	}
	public void setPay(BigDecimal pay) {
		this.pay = pay;
	}
	public BigDecimal getIncomeTax() {
		return incomeTax;
	}
	public void setIncomeTax(BigDecimal incomeTax) {
		this.incomeTax = incomeTax;
	}
	public BigDecimal getNationalInsurance() {
		return nationalInsurance;
	}
	public void setNationalInsurance(BigDecimal nationalInsurance) {
		this.nationalInsurance = nationalInsurance;
	}
	public PaymentFrequency getFrequency() {
		return frequency;
	}
	public void setFrequency(PaymentFrequency frequency) {
		this.frequency = frequency;
	}
	public EmploymentType getEmploymentType() {
		return employmentType;
	}
	public void setEmploymentType(EmploymentType employmentType) {
		this.employmentType = employmentType;
	}
	
	

	
}
