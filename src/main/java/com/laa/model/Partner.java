package com.laa.model;

import java.time.LocalDate;

public class Partner {
	
	private LocalDate dob;
	
	private EmployedIncome employedIncome;
	
	private OtherIncome otherIncome;

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public EmployedIncome getEmployedIncome() {
		return employedIncome;
	}

	public void setEmployedIncome(EmployedIncome employedIncome) {
		this.employedIncome = employedIncome;
	}

	public OtherIncome getOtherIncome() {
		return otherIncome;
	}

	public void setOtherIncome(OtherIncome otherIncome) {
		this.otherIncome = otherIncome;
	}
	

}
