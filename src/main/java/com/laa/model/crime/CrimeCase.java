package com.laa.model.crime;

import com.laa.model.Case;

public class CrimeCase  extends Case{
	
	private InterestOfJustice interestOfJustice;

	private Court court;

	private CaseType caseType;

	public InterestOfJustice getInterestOfJustice() {
		return interestOfJustice;
	}

	public void setInterestOfJustice(InterestOfJustice interestOfJustice) {
		this.interestOfJustice = interestOfJustice;
	}

    public Court getCourt() {
        return court;
    }

    public void setCourt(Court court) {
        this.court = court;
    }

    public CaseType getCaseType() {
        return caseType;
    }

    public void setCaseType(CaseType caseType) {
        this.caseType = caseType;
    }
}
