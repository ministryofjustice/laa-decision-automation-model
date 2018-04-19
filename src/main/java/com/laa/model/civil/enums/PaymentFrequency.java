package com.laa.model.civil.enums;

public enum PaymentFrequency {
	
	MONTHLY(12),
	WEEKLY(52),
	BIWEEKLY(26),
	ANNUAL(1);

    public int getAnnualMultiplier() {
        return annualMultiplier;
    }

    private int annualMultiplier;

    PaymentFrequency(int annualMultiplier) {
        this.annualMultiplier = annualMultiplier;
    }
}
