package com.laa.model.crime;

import java.math.BigDecimal;
import java.util.Arrays;

public enum Weight {

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

    Weight(int lowerBound, int upperBound, BigDecimal factor) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
        this.factor = factor;
    }

    public static BigDecimal weightValue(int lower, int upper) {
       return Arrays.stream(Weight.values()).filter(weight -> weight.lowerBound == lower && weight.upperBound == upper).findFirst().get().factor;
    }

}