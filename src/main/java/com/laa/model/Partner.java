package com.laa.model;

import java.time.LocalDate;
import java.util.List;

public class Partner {
	
	
	private LocalDate dob;
	
	private List<EmployedIncome> employedIncomeHistory;
	
	private List<OtherIncome> otherIncome;
	

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

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
}
