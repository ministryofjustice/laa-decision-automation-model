package com.laa.model;

import java.util.List;

public class Applicant {
	
	private List<EmployedIncome> employedIncomeHistory;

	private OtherIncome otherIncome;

	private CapitalAssets capitalAssets;


	public List<EmployedIncome> getEmployedIncomeHistory() {
		return employedIncomeHistory;
	}

	public void setEmployedIncomeHistory(List<EmployedIncome> employedIncomeHistory) {
		this.employedIncomeHistory = employedIncomeHistory;
	}

	public OtherIncome getOtherIncome() {
		return otherIncome;
	}

	public void setOtherIncome(OtherIncome otherIncome) {
		this.otherIncome = otherIncome;
	}

	public CapitalAssets getCapitalAssets() {
		return capitalAssets;
	}

	public void setCapitalAssets(CapitalAssets capitalAssets) {
		this.capitalAssets = capitalAssets;
	}

}
