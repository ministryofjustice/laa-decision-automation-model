package com.laa.model.civil;

import java.time.LocalDate;
import java.util.List;

import com.laa.model.Case;
import com.laa.model.civil.enus.InvolvementType;
import com.laa.model.enums.ProceedingType;

public class CivilCase extends Case {

	private LocalDate dateBecameAwareOfProceedings;
	
	private List<ProceedingType> proceedings;
	
	private InvolvementType involvementType = InvolvementType.APPLICANT;

	private String certificateAppliedFor;

	private MeritsInformation meritsAssessment;

	
	public LocalDate getDateBecameAwareOfProceedings() {
		return dateBecameAwareOfProceedings;
	}

	public void setDateBecameAwareOfProceedings(LocalDate dateBecameAwareOfProceedings) {
		this.dateBecameAwareOfProceedings = dateBecameAwareOfProceedings;
	}

	

	public List<ProceedingType> getProceedings() {
		return proceedings;
	}

	public void setProceedings(List<ProceedingType> proceedings) {
		this.proceedings = proceedings;
	}

	public String getCertificateAppliedFor() {
		return certificateAppliedFor;
	}

	public void setCertificateAppliedFor(String certificateAppliedFor) {
		this.certificateAppliedFor = certificateAppliedFor;
	}

	public MeritsInformation getMeritsAssessment() {
		return meritsAssessment;
	}

	public void setMeritsAssessment(MeritsInformation meritsAssessment) {
		this.meritsAssessment = meritsAssessment;
	}

	public InvolvementType getInvolvementType() {
		return involvementType;
	}

	public void setInvolvementType(InvolvementType involvementType) {
		this.involvementType = involvementType;
	}

}
