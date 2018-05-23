package com.laa.model;

import java.time.LocalDate;
import java.util.List;

public class Partner {
	
	private LocalDate dob;
	
	private EmployedIncome employedIncome;
	
	private List<OtherIncome> otherIncome;

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public EmployedIncome getEmployedIncome() {
		return employedIncome;
	}

	public void setEmployedIncomeHistory(EmployedIncome employedIncome) {
		this.employedIncome = employedIncome;
	}


	public List<OtherIncome> getOtherIncome() {
		return otherIncome;
	}

	public void setOtherIncome(List<OtherIncome> otherIncome) {
		this.otherIncome = otherIncome;
	}
}
