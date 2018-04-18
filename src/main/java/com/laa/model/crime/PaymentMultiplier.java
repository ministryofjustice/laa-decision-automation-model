package com.laa.model.crime;

public enum PaymentMultiplier
{
	
	MONTHLY(12),
	WEEKLY(52),
	BIWEEKLY(26);

    public int getMultiplier() {
        return multiplier;
    }

    private int multiplier;

	PaymentMultiplier(int multiplier) {
	    this.multiplier = multiplier;
	}
}
