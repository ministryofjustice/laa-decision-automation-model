package com.laa.model.crime;

import com.laa.model.Dependent;

public class CrimeDependent extends Dependent{

    private int lowerAgeRange;
    private int upperAgeRange;
    private int numberOfChildren;

    public int getUpperAgeRange() {
        return upperAgeRange;
    }

    public void setUpperAgeRange(int upperAgeRange) {
        this.upperAgeRange = upperAgeRange;
    }

    public int getNumberOfChildren() {
        return numberOfChildren;
    }


    public int getLowerAgeRange() {
        return lowerAgeRange;
    }

    public void setLowerAgeRange(int lowerAgeRange) {
        this.lowerAgeRange = lowerAgeRange;
    }

    public void setNumberOfChildren(int numberOfChildren) {
        this.numberOfChildren = numberOfChildren;
    }
}
