
package com.acme.mypackage;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CaseDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CaseDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ApplicationDetails" type="{http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIO}ApplicationDetails"/&gt;
 *         &lt;element name="CertificateType" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}LOV" minOccurs="0"/&gt;
 *         &lt;element name="CertificateDate" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}Dt" minOccurs="0"/&gt;
 *         &lt;element name="PreCertificateCosts" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}Amount" minOccurs="0"/&gt;
 *         &lt;element name="LegalHelpCosts" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}Amount" minOccurs="0"/&gt;
 *         &lt;element name="UndertakingAmount" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}Amount" minOccurs="0"/&gt;
 *         &lt;element name="LinkedCases" type="{http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIO}LinkedCases" minOccurs="0"/&gt;
 *         &lt;element name="Awards" type="{http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIO}AwardsElementType" minOccurs="0"/&gt;
 *         &lt;element name="PriorAuthorities" type="{http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIO}PriorAuthorities" minOccurs="0"/&gt;
 *         &lt;element name="DischargeStatus" type="{http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIO}DischargeElementType" minOccurs="0"/&gt;
 *         &lt;element name="AvailableFunctions" type="{http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIO}ActionListElementType" minOccurs="0"/&gt;
 *         &lt;element name="CaseStatus" type="{http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIO}CaseStatusElementType" minOccurs="0"/&gt;
 *         &lt;element name="RecordHistory" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}RecordHistory"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CaseDetails", propOrder = {
    "applicationDetails",
    "certificateType",
    "certificateDate",
    "preCertificateCosts",
    "legalHelpCosts",
    "undertakingAmount",
    "linkedCases",
    "awards",
    "priorAuthorities",
    "dischargeStatus",
    "availableFunctions",
    "caseStatus",
    "recordHistory"
})
public class CaseDetails {

    @XmlElement(name = "ApplicationDetails", required = true)
    protected ApplicationDetails applicationDetails;
    @XmlElement(name = "CertificateType")
    protected String certificateType;
    @XmlElement(name = "CertificateDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar certificateDate;
    @XmlElement(name = "PreCertificateCosts")
    protected BigDecimal preCertificateCosts;
    @XmlElement(name = "LegalHelpCosts")
    protected BigDecimal legalHelpCosts;
    @XmlElement(name = "UndertakingAmount")
    protected BigDecimal undertakingAmount;
    @XmlElement(name = "LinkedCases")
    protected LinkedCases linkedCases;
    @XmlElement(name = "Awards")
    protected AwardsElementType awards;
    @XmlElement(name = "PriorAuthorities")
    protected PriorAuthorities priorAuthorities;
    @XmlElement(name = "DischargeStatus")
    protected DischargeElementType dischargeStatus;
    @XmlElement(name = "AvailableFunctions")
    protected ActionListElementType availableFunctions;
    @XmlElement(name = "CaseStatus")
    protected CaseStatusElementType caseStatus;
    @XmlElement(name = "RecordHistory", required = true)
    protected RecordHistory recordHistory;

    /**
     * Gets the value of the applicationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationDetails }
     *     
     */
    public ApplicationDetails getApplicationDetails() {
        return applicationDetails;
    }

    /**
     * Sets the value of the applicationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationDetails }
     *     
     */
    public void setApplicationDetails(ApplicationDetails value) {
        this.applicationDetails = value;
    }

    /**
     * Gets the value of the certificateType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificateType() {
        return certificateType;
    }

    /**
     * Sets the value of the certificateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificateType(String value) {
        this.certificateType = value;
    }

    /**
     * Gets the value of the certificateDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCertificateDate() {
        return certificateDate;
    }

    /**
     * Sets the value of the certificateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCertificateDate(XMLGregorianCalendar value) {
        this.certificateDate = value;
    }

    /**
     * Gets the value of the preCertificateCosts property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPreCertificateCosts() {
        return preCertificateCosts;
    }

    /**
     * Sets the value of the preCertificateCosts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPreCertificateCosts(BigDecimal value) {
        this.preCertificateCosts = value;
    }

    /**
     * Gets the value of the legalHelpCosts property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLegalHelpCosts() {
        return legalHelpCosts;
    }

    /**
     * Sets the value of the legalHelpCosts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLegalHelpCosts(BigDecimal value) {
        this.legalHelpCosts = value;
    }

    /**
     * Gets the value of the undertakingAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUndertakingAmount() {
        return undertakingAmount;
    }

    /**
     * Sets the value of the undertakingAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUndertakingAmount(BigDecimal value) {
        this.undertakingAmount = value;
    }

    /**
     * Gets the value of the linkedCases property.
     * 
     * @return
     *     possible object is
     *     {@link LinkedCases }
     *     
     */
    public LinkedCases getLinkedCases() {
        return linkedCases;
    }

    /**
     * Sets the value of the linkedCases property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinkedCases }
     *     
     */
    public void setLinkedCases(LinkedCases value) {
        this.linkedCases = value;
    }

    /**
     * Gets the value of the awards property.
     * 
     * @return
     *     possible object is
     *     {@link AwardsElementType }
     *     
     */
    public AwardsElementType getAwards() {
        return awards;
    }

    /**
     * Sets the value of the awards property.
     * 
     * @param value
     *     allowed object is
     *     {@link AwardsElementType }
     *     
     */
    public void setAwards(AwardsElementType value) {
        this.awards = value;
    }

    /**
     * Gets the value of the priorAuthorities property.
     * 
     * @return
     *     possible object is
     *     {@link PriorAuthorities }
     *     
     */
    public PriorAuthorities getPriorAuthorities() {
        return priorAuthorities;
    }

    /**
     * Sets the value of the priorAuthorities property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriorAuthorities }
     *     
     */
    public void setPriorAuthorities(PriorAuthorities value) {
        this.priorAuthorities = value;
    }

    /**
     * Gets the value of the dischargeStatus property.
     * 
     * @return
     *     possible object is
     *     {@link DischargeElementType }
     *     
     */
    public DischargeElementType getDischargeStatus() {
        return dischargeStatus;
    }

    /**
     * Sets the value of the dischargeStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link DischargeElementType }
     *     
     */
    public void setDischargeStatus(DischargeElementType value) {
        this.dischargeStatus = value;
    }

    /**
     * Gets the value of the availableFunctions property.
     * 
     * @return
     *     possible object is
     *     {@link ActionListElementType }
     *     
     */
    public ActionListElementType getAvailableFunctions() {
        return availableFunctions;
    }

    /**
     * Sets the value of the availableFunctions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionListElementType }
     *     
     */
    public void setAvailableFunctions(ActionListElementType value) {
        this.availableFunctions = value;
    }

    /**
     * Gets the value of the caseStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CaseStatusElementType }
     *     
     */
    public CaseStatusElementType getCaseStatus() {
        return caseStatus;
    }

    /**
     * Sets the value of the caseStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CaseStatusElementType }
     *     
     */
    public void setCaseStatus(CaseStatusElementType value) {
        this.caseStatus = value;
    }

    /**
     * Gets the value of the recordHistory property.
     * 
     * @return
     *     possible object is
     *     {@link RecordHistory }
     *     
     */
    public RecordHistory getRecordHistory() {
        return recordHistory;
    }

    /**
     * Sets the value of the recordHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordHistory }
     *     
     */
    public void setRecordHistory(RecordHistory value) {
        this.recordHistory = value;
    }

}
