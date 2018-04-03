package com.laa.model;

import java.util.List;

public class Applicant {
	
	private List<EmployedIncome> employedIncomeHistory;

	private List<OtherIncome> otherIncome;

	private List<CapitalAssets> capitalAssets;


	public List<EmployedIncome> getEmployedIncomeHistory() {
		return employedIncomeHistory;
	}

	public void setEmployedIncomeHistory(List<EmployedIncome> employedIncomeHistory) {
		this.employedIncomeHistory = employedIncomeHistory;
	}

	public List<OtherIncome> getOtherIncome() {
		return otherIncome;
	}

	public void setOtherIncome(List<OtherIncome> otherIncome) {
		this.otherIncome = otherIncome;
	}

	public List<CapitalAssets> getCapitalAssets() {
		return capitalAssets;
	}

	public void setCapitalAssets(List<CapitalAssets> capitalAssets) {
		this.capitalAssets = capitalAssets;
	}

	

}
