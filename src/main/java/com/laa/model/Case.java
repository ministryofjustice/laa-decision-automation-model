package com.laa.model;

import java.time.LocalDate;

public abstract class Case {

	private String firstName;
	private String lastname;
	private LocalDate dob;
	private MeansInformation meansInformation;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public MeansInformation getMeansInformation() {
		return meansInformation;
	}

	public void setMeansInformation(MeansInformation meansInformation) {
		this.meansInformation = meansInformation;
	}
	
	

}
