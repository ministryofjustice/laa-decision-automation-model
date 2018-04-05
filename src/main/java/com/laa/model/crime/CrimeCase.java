package com.laa.model.crime;

import com.laa.model.Case;

public class CrimeCase  extends Case{
	
	private InterestOfJustice interestOfJustice;

	private CourtType courtType;

	private CaseType caseType;

	public InterestOfJustice getInterestOfJustice() {
		return interestOfJustice;
	}

	public void setInterestOfJustice(InterestOfJustice interestOfJustice) {
		this.interestOfJustice = interestOfJustice;
	}


    public CaseType getCaseType() {
        return caseType;
    }

    public void setCaseType(CaseType caseType) {
        this.caseType = caseType;
    }

    public CourtType getCourtType() {
        return courtType;
    }

    public void setCourtType(CourtType courtType) {
        this.courtType = courtType;
    }
}
