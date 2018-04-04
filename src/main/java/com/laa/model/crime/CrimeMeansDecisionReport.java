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

    public void setCrimeAssessmentResult(CrimeAssessmentResult crimeAssessmentResult) {
        this.crimeAssessmentResult = crimeAssessmentResult;
    }

    public EmploymentStatus getEmplyomentStatus() {
        return emplyomentStatus;
    }

    public void setEmplyomentStatus(EmploymentStatus emplyomentStatus) {
        this.emplyomentStatus = emplyomentStatus;
    }

    public BigDecimal getEmploymentIncome() {
        return employmentIncome;
    }

    public void setEmploymentIncome(BigDecimal employmentIncome) {
        this.employmentIncome = employmentIncome;
    }

    public BigDecimal getPayeAndNi() {
        return payeAndNi;
    }

    public void setPayeAndNi(BigDecimal payeAndNi) {
        this.payeAndNi = payeAndNi;
    }

    public BigDecimal getOtherIncome() {
        return otherIncome;
    }

    public void setOtherIncome(BigDecimal otherIncome) {
        this.otherIncome = otherIncome;
    }

    public BigDecimal getGrossHouseholdIncome() {
        return grossHouseholdIncome;
    }

    public void setGrossHouseholdIncome(BigDecimal grossHouseholdIncome) {
        this.grossHouseholdIncome = grossHouseholdIncome;
    }

    public BigDecimal getAdjustedIncome() {
        return adjustedIncome;
    }

    public void setAdjustedIncome(BigDecimal adjustedIncome) {
        this.adjustedIncome = adjustedIncome;
    }

    public BigDecimal getWeighting() {
        return weighting;
    }

    public void setWeighting(BigDecimal weighting) {
        this.weighting = weighting;
    }
}
