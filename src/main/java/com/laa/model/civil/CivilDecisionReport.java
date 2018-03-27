package com.laa.model.civil;

import com.laa.model.DecisionReport;

public class CivilDecisionReport extends DecisionReport {
	
	private boolean passportedBenefit;
	
	private boolean incomelessThanThreshold;
	
	private boolean meansAccepted;

	public boolean isPassportedBenefit() {
		return passportedBenefit;
	}

	public void setPassportedBenefit(boolean passportedBenefit) {
		this.passportedBenefit = passportedBenefit;
	}

	public boolean isIncomelessThanThreshold() {
		return incomelessThanThreshold;
	}

	public void setIncomelessThanThreshold(boolean incomelessThanThreshold) {
		this.incomelessThanThreshold = incomelessThanThreshold;
	}

	public boolean isMeansAccepted() {
		return meansAccepted;
	}

	public void setMeansAccepted(boolean meansAccepted) {
		this.meansAccepted = meansAccepted;
	}

	
}
