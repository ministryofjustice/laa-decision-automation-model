package com.laa.model.civil;

import java.math.BigDecimal;

import com.laa.model.DecisionReport;
import com.laa.model.civil.enums.EmploymentStatus;

public class CivilDecisionReport extends DecisionReport {

	private EmploymentStatus emplyomentStatus;

	private BigDecimal employmentIncome;

	private BigDecimal disposableIncome;
	
	private Boolean exceedsThreshold;
	
	private boolean domesticViolenceWaiver;

	

	public EmploymentStatus getEmplyomentStatus() {
		return emplyomentStatus;
	}

	public void setEmplyomentStatus(EmploymentStatus emplyomentStatus) {
		this.emplyomentStatus = emplyomentStatus;
	}

	public BigDecimal getEmploymentIncome() {
		return employmentIncome;
	}

	public void setEmploymentIncome(BigDecimal employmentIncome) {
		this.employmentIncome = employmentIncome;
	}

	public BigDecimal getDisposableIncome() {
		return disposableIncome;
	}

	public void setDisposableIncome(BigDecimal disposableIncome) {
		this.disposableIncome = disposableIncome;
	}
	
	public Boolean getExceedsThreshold() {
		return exceedsThreshold;
	}

	public void setExceedsThreshold(Boolean exceedsThreshold) {
		this.exceedsThreshold = exceedsThreshold;
	}

	public boolean isDomesticViolenceWaiver() {
		return domesticViolenceWaiver;
	}

	public void setDomesticViolenceWaiver(boolean domesticViolenceWaiver) {
		this.domesticViolenceWaiver = domesticViolenceWaiver;
	}
	
	

}
