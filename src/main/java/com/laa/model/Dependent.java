package com.laa.model;

import java.time.LocalDate;

import com.laa.model.civil.enums.RelationToApplicant;

public class Dependent {
	
	private String name;
	
	private RelationToApplicant relationToApplicant;
	
	private LocalDate dob;


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public RelationToApplicant getRelationToApplicant() {
		return relationToApplicant;
	}

	public void setRelationToApplicant(RelationToApplicant relationToApplicant) {
		this.relationToApplicant = relationToApplicant;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	
	

}
