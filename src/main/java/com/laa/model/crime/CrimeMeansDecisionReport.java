package com.laa.model.crime;

import com.laa.model.DecisionReport;
import com.laa.model.civil.enums.EmploymentStatus;

import java.math.BigDecimal;

public class CrimeMeansDecisionReport extends DecisionReport {

    private CrimeAssessmentResult crimeAssessmentResult;

    // do we need to show partner or other dependent employmentStatus??

    private EmploymentStatus employmentStatus;

    private BigDecimal employmentIncome;

    private BigDecimal payeAndNi;

    // does this other income includes partner as well

    private BigDecimal otherIncome;

    private BigDecimal grossHouseholdIncome;

    private BigDecimal adjustedIncome;

    private BigDecimal partnerWeight;

    private BigDecimal childWeight;

    private BigDecimal totalWeight;

    private boolean adjustedIncomeBelowLowerThreshold;

    private CourtType courtType;

    private CaseType caseType;


    public CourtType getCourtType() {
        return courtType;
    }

    public void setCourtType(CourtType courtType) {
        this.courtType = courtType;
    }

    public CaseType getCaseType() {
        return caseType;
    }

    public void setCaseType(CaseType caseType) {
        this.caseType = caseType;
    }

    public boolean isAdjustedIncomeBelowLowerThreshold() {
        return adjustedIncomeBelowLowerThreshold;
    }

    public void setAdjustedIncomeBelowLowerThreshold(boolean adjustedIncomeBelowLowerThreshold) {
        this.adjustedIncomeBelowLowerThreshold = adjustedIncomeBelowLowerThreshold;
    }

    public BigDecimal getPartnerWeight() {
        return partnerWeight;
    }

    public void setPartnerWeight(BigDecimal partnerWeight) {
        this.partnerWeight = partnerWeight;
    }

    public BigDecimal getChildWeight() {
        return childWeight;
    }

    public void setChildWeight(BigDecimal childWeight) {
        this.childWeight = childWeight;
    }

    public BigDecimal getTotalWeight() {
        return totalWeight;
    }

    public void setTotalWeight(BigDecimal totalWeight) {
        this.totalWeight = totalWeight;
    }


    public CrimeAssessmentResult getCrimeAssessmentResult() {
        return crimeAssessmentResult;
    }

    public void setCrimeAssessmentResult(CrimeAssessmentResult crimeAssessmentResult) {
        this.crimeAssessmentResult = crimeAssessmentResult;
    }

    public EmploymentStatus getEmploymentStatus() {
        return employmentStatus;
    }

    public void setEmploymentStatus(EmploymentStatus employmentStatus) {
        this.employmentStatus = employmentStatus;
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

}
