package com.laa.model.crime;

import com.laa.model.DecisionReport;
import com.laa.model.civil.enums.EmploymentStatus;

import java.math.BigDecimal;

public class CrimeMeansDecisionReport extends DecisionReport {

    private CrimeAssessmentResult crimeAssessmentResult;

    // do we need to show partner or other dependent emplyomentStatus??

    private EmploymentStatus emplyomentStatus;

    private BigDecimal employmentIncome;

    private BigDecimal payeAndNi;

    // does this other income includes partner as well

    private BigDecimal otherIncome;

    private BigDecimal grossHouseholdIncome;

    private BigDecimal adjustedIncome;

    private BigDecimal weighting;


    public CrimeAssessmentResult getCrimeAssessmentResult() {
        return crimeAssessmentResult;
    }

    public CrimeMeansDecisionReport setCrimeAssessmentResult(CrimeAssessmentResult crimeAssessmentResult) {
        this.crimeAssessmentResult = crimeAssessmentResult;
        return this;
    }

    public EmploymentStatus getEmplyomentStatus() {
        return emplyomentStatus;
    }

    public CrimeMeansDecisionReport setEmplyomentStatus(EmploymentStatus emplyomentStatus) {
        this.emplyomentStatus = emplyomentStatus;
        return this;
    }

    public BigDecimal getEmploymentIncome() {
        return employmentIncome;
    }

    public CrimeMeansDecisionReport setEmploymentIncome(BigDecimal employmentIncome) {
        this.employmentIncome = employmentIncome;
        return this;
    }

    public BigDecimal getPayeAndNi() {
        return payeAndNi;
    }

    public CrimeMeansDecisionReport setPayeAndNi(BigDecimal payeAndNi) {
        this.payeAndNi = payeAndNi;
        return this;
    }

    public BigDecimal getOtherIncome() {
        return otherIncome;
    }

    public CrimeMeansDecisionReport setOtherIncome(BigDecimal otherIncome) {
        this.otherIncome = otherIncome;
        return this;
    }

    public BigDecimal getGrossHouseholdIncome() {
        return grossHouseholdIncome;
    }

    public CrimeMeansDecisionReport setGrossHouseholdIncome(BigDecimal grossHouseholdIncome) {
        this.grossHouseholdIncome = grossHouseholdIncome;
        return this;
    }

    public BigDecimal getAdjustedIncome() {
        return adjustedIncome;
    }

    public CrimeMeansDecisionReport setAdjustedIncome(BigDecimal adjustedIncome) {
        this.adjustedIncome = adjustedIncome;
        return this;
    }

    public BigDecimal getWeighting() {
        return weighting;
    }

    public void setWeighting(BigDecimal weighting) {
        this.weighting = weighting;
    }
}
