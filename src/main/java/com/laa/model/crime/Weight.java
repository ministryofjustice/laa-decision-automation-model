package com.laa.model.crime;

import java.math.BigDecimal;

public class Weight {

    public static BigDecimal getWeight (int age) {

        if (age >=0 && age <=1)
            return BigDecimal.valueOf(0.15);
        if (age >=2 && age <=4)
            return BigDecimal.valueOf(0.30);
        if (age >=5 && age <=7)
            return BigDecimal.valueOf(0.34);
        if (age >=8 && age <=10)
            return BigDecimal.valueOf(0.38);
        if (age >=11 && age <=12)
            return BigDecimal.valueOf(0.41);
        if (age >=13 && age <=15)
            return BigDecimal.valueOf(0.44);
        if (age >=16 && age <=18)
            return BigDecimal.valueOf(0.59);
        return null;
    }
}
