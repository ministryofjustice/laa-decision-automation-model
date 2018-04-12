package com.laa.model.crime;

import java.math.BigDecimal;

public enum AgeRange {

    ZERO_TO_ONE(0, 1, BigDecimal.valueOf(0.15)),
    TWO_TO_FOUR(2, 4, BigDecimal.valueOf(0.30)),
    FIVE_TO_SEVEN(5, 7, BigDecimal.valueOf(0.34)),
    EIGHT_TO_TEN(8, 10, BigDecimal.valueOf(0.38)),
    ELEVEN_TO_TWELVE(11, 12, BigDecimal.valueOf(0.41)),
    THIRTEEN_TO_FIFTEEN(13, 15, BigDecimal.valueOf(0.44)),
    SIXTEEN_TO_EIGHTEEN(16, 18, BigDecimal.valueOf(0.59));

    private int lowerBound;
    private int upperBound;
    private BigDecimal factor;

    AgeRange(int lowerBound, int upperBound, BigDecimal factor) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
        this.factor = factor;
    }

    public BigDecimal weightValue(int lower, int upper) {

        if (lower >= 0 && upper <= 1) {
            return ZERO_TO_ONE.factor;
        } else if (lower >= 2 && upper <= 4) {
            return TWO_TO_FOUR.factor;
        }
        else if (lower >= 5 && upper <= 7) {
            return FIVE_TO_SEVEN.factor;
        }
        else if (lower >= 8 && upper <= 10) {
            return EIGHT_TO_TEN.factor;
        }
        else if (lower >= 11 && upper <= 12) {
            return ELEVEN_TO_TWELVE.factor;
        }
        else if (lower >= 13 && upper <= 15) {
            return THIRTEEN_TO_FIFTEEN.factor;
        }
        else if (lower >= 16 && upper <= 18) {
            return SIXTEEN_TO_EIGHTEEN.factor;
        }
        return null;
    }

}