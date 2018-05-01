package com.laa.model.civil;

import java.math.BigDecimal;

import com.laa.model.DecisionReport;
import com.laa.model.civil.enums.EmploymentStatus;

public class CivilDecisionReport extends DecisionReport {

	private EmploymentStatus emplyomentStatus;

	private BigDecimal employmentIncome;
	
	private BigDecimal payeAndNi;
	
	private BigDecimal otherIncome;
	
	private BigDecimal grossIncome;
	
	private BigDecimal totalOutgoings;

	private BigDecimal disposableIncome;
	
	private BigDecimal capitalAssessment;
	
	private BigDecimal contributionRate;
	
	private BigDecimal contributionAmount;
	
	private BigDecimal capitalContribution = BigDecimal.ZERO;
	
	private boolean withinGrossIncomeLimit;
	
	private boolean withinDisposableIncomeLimit;
	
	private boolean withinCapitalAssetsLimit;
	
	private boolean exceedsThreshold;
	
	private boolean domesticViolenceWaiver;
	
	private boolean meansPassed;

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

	public BigDecimal getPayeAndNi() {
		return payeAndNi;
	}

	public void setPayeAndNi(BigDecimal payeAndNi) {
		this.payeAndNi = payeAndNi;
	}

	public BigDecimal getOtherIncome() {
		return otherIncome;
	}

	public void setOtherIncome(BigDecimal otherIncome) {
		this.otherIncome = otherIncome;
	}

	public BigDecimal getGrossIncome() {
		return grossIncome;
	}

	public void setGrossIncome(BigDecimal grossIncome) {
		this.grossIncome = grossIncome;
	}

	public BigDecimal getTotalOutgoings() {
		return totalOutgoings;
	}

	public void setTotalOutgoings(BigDecimal totalOutgoings) {
		this.totalOutgoings = totalOutgoings;
	}

	public BigDecimal getDisposableIncome() {
		return disposableIncome;
	}

	public void setDisposableIncome(BigDecimal disposableIncome) {
		this.disposableIncome = disposableIncome;
	}

	public BigDecimal getCapitalAssessment() {
		return capitalAssessment;
	}

	public void setCapitalAssessment(BigDecimal capitalAssessment) {
		this.capitalAssessment = capitalAssessment;
	}

	public BigDecimal getContributionRate() {
		return contributionRate;
	}

	public void setContributionRate(BigDecimal contributionRate) {
		this.contributionRate = contributionRate;
	}

	public BigDecimal getContributionAmount() {
		return contributionAmount;
	}

	public void setContributionAmount(BigDecimal contributionAmount) {
		this.contributionAmount = contributionAmount;
	}

	public BigDecimal getCapitalContribution() {
		return capitalContribution;
	}

	public void setCapitalContribution(BigDecimal capitalContribution) {
		this.capitalContribution = capitalContribution;
	}

	public boolean isWithinGrossIncomeLimit() {
		return withinGrossIncomeLimit;
	}

	public void setWithinGrossIncomeLimit(boolean withinGrossIncomeLimit) {
		this.withinGrossIncomeLimit = withinGrossIncomeLimit;
	}

	public boolean isWithinDisposableIncomeLimit() {
		return withinDisposableIncomeLimit;
	}

	public void setWithinDisposableIncomeLimit(boolean withinDisposableIncomeLimit) {
		this.withinDisposableIncomeLimit = withinDisposableIncomeLimit;
	}

	
	public boolean isWithinCapitalAssetsLimit() {
		return withinCapitalAssetsLimit;
	}

	public void setWithinCapitalAssetsLimit(boolean withinCapitalAssetsLimit) {
		this.withinCapitalAssetsLimit = withinCapitalAssetsLimit;
	}

	public boolean isExceedsThreshold() {
		return exceedsThreshold;
	}

	public void setExceedsThreshold(boolean exceedsThreshold) {
		this.exceedsThreshold = exceedsThreshold;
	}

	public boolean isDomesticViolenceWaiver() {
		return domesticViolenceWaiver;
	}

	public void setDomesticViolenceWaiver(boolean domesticViolenceWaiver) {
		this.domesticViolenceWaiver = domesticViolenceWaiver;
	}

	public boolean isMeansPassed() {
		return meansPassed;
	}

	public void setMeansPassed(boolean meansPassed) {
		this.meansPassed = meansPassed;
	}

	

}
