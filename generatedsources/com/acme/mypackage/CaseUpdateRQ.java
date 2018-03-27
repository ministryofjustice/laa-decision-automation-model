
package com.acme.mypackage;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CaseUpdateRQ complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CaseUpdateRQ"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://legalservices.gov.uk/Enterprise/Common/1.0/Header}HeaderRQ"/&gt;
 *         &lt;element name="CaseReferenceNumber" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}IDREF30"/&gt;
 *         &lt;element name="UpdateMsgType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ApplicationDetails" type="{http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIO}UpdateApplicationDetails" minOccurs="0"/&gt;
 *         &lt;element name="PreCertificateCosts" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}Amount" minOccurs="0"/&gt;
 *         &lt;element name="LegalHelpCosts" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}Amount" minOccurs="0"/&gt;
 *         &lt;element name="ActualCaseStatus" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}IDREF30" minOccurs="0"/&gt;
 *         &lt;element name="Messages" type="{http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIO}Messages" minOccurs="0"/&gt;
 *         &lt;element name="Notifications" type="{http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIO}Notifications" minOccurs="0"/&gt;
 *         &lt;element name="LinkedCases" type="{http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIO}LinkedCasesUpdate" minOccurs="0"/&gt;
 *         &lt;element name="Awards" type="{http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIO}AwardsElementType" minOccurs="0"/&gt;
 *         &lt;element name="PriorAuthorities" type="{http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIO}PriorAuthorities" minOccurs="0"/&gt;
 *         &lt;element name="DischargeStatus" type="{http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIO}DischargeElementType" minOccurs="0"/&gt;
 *         &lt;element name="Undertakings" type="{http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIO}UndertakingElementType" minOccurs="0"/&gt;
 *         &lt;element name="Outcomes" type="{http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIO}Outcomes" minOccurs="0"/&gt;
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
@XmlType(name = "CaseUpdateRQ", namespace = "http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIM", propOrder = {
    "headerRQ",
    "caseReferenceNumber",
    "updateMsgType",
    "applicationDetails",
    "preCertificateCosts",
    "legalHelpCosts",
    "actualCaseStatus",
    "messages",
    "notifications",
    "linkedCases",
    "awards",
    "priorAuthorities",
    "dischargeStatus",
    "undertakings",
    "outcomes",
    "recordHistory"
})
public class CaseUpdateRQ {

    @XmlElement(name = "HeaderRQ", namespace = "http://legalservices.gov.uk/Enterprise/Common/1.0/Header", required = true)
    protected HeaderRQType headerRQ;
    @XmlElement(name = "CaseReferenceNumber", required = true)
    protected String caseReferenceNumber;
    @XmlElement(name = "UpdateMsgType", required = true)
    protected String updateMsgType;
    @XmlElement(name = "ApplicationDetails")
    protected UpdateApplicationDetails applicationDetails;
    @XmlElement(name = "PreCertificateCosts")
    protected BigDecimal preCertificateCosts;
    @XmlElement(name = "LegalHelpCosts")
    protected BigDecimal legalHelpCosts;
    @XmlElement(name = "ActualCaseStatus")
    protected String actualCaseStatus;
    @XmlElement(name = "Messages")
    protected Messages messages;
    @XmlElement(name = "Notifications")
    protected Notifications notifications;
    @XmlElement(name = "LinkedCases")
    protected LinkedCasesUpdate linkedCases;
    @XmlElement(name = "Awards")
    protected AwardsElementType awards;
    @XmlElement(name = "PriorAuthorities")
    protected PriorAuthorities priorAuthorities;
    @XmlElement(name = "DischargeStatus")
    protected DischargeElementType dischargeStatus;
    @XmlElement(name = "Undertakings")
    protected UndertakingElementType undertakings;
    @XmlElement(name = "Outcomes")
    protected Outcomes outcomes;
    @XmlElement(name = "RecordHistory", required = true)
    protected RecordHistory recordHistory;

    /**
     * Gets the value of the headerRQ property.
     * 
     * @return
     *     possible object is
     *     {@link HeaderRQType }
     *     
     */
    public HeaderRQType getHeaderRQ() {
        return headerRQ;
    }

    /**
     * Sets the value of the headerRQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link HeaderRQType }
     *     
     */
    public void setHeaderRQ(HeaderRQType value) {
        this.headerRQ = value;
    }

    /**
     * Gets the value of the caseReferenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseReferenceNumber() {
        return caseReferenceNumber;
    }

    /**
     * Sets the value of the caseReferenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseReferenceNumber(String value) {
        this.caseReferenceNumber = value;
    }

    /**
     * Gets the value of the updateMsgType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdateMsgType() {
        return updateMsgType;
    }

    /**
     * Sets the value of the updateMsgType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdateMsgType(String value) {
        this.updateMsgType = value;
    }

    /**
     * Gets the value of the applicationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateApplicationDetails }
     *     
     */
    public UpdateApplicationDetails getApplicationDetails() {
        return applicationDetails;
    }

    /**
     * Sets the value of the applicationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateApplicationDetails }
     *     
     */
    public void setApplicationDetails(UpdateApplicationDetails value) {
        this.applicationDetails = value;
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
     * Gets the value of the actualCaseStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActualCaseStatus() {
        return actualCaseStatus;
    }

    /**
     * Sets the value of the actualCaseStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActualCaseStatus(String value) {
        this.actualCaseStatus = value;
    }

    /**
     * Gets the value of the messages property.
     * 
     * @return
     *     possible object is
     *     {@link Messages }
     *     
     */
    public Messages getMessages() {
        return messages;
    }

    /**
     * Sets the value of the messages property.
     * 
     * @param value
     *     allowed object is
     *     {@link Messages }
     *     
     */
    public void setMessages(Messages value) {
        this.messages = value;
    }

    /**
     * Gets the value of the notifications property.
     * 
     * @return
     *     possible object is
     *     {@link Notifications }
     *     
     */
    public Notifications getNotifications() {
        return notifications;
    }

    /**
     * Sets the value of the notifications property.
     * 
     * @param value
     *     allowed object is
     *     {@link Notifications }
     *     
     */
    public void setNotifications(Notifications value) {
        this.notifications = value;
    }

    /**
     * Gets the value of the linkedCases property.
     * 
     * @return
     *     possible object is
     *     {@link LinkedCasesUpdate }
     *     
     */
    public LinkedCasesUpdate getLinkedCases() {
        return linkedCases;
    }

    /**
     * Sets the value of the linkedCases property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinkedCasesUpdate }
     *     
     */
    public void setLinkedCases(LinkedCasesUpdate value) {
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
     * Gets the value of the undertakings property.
     * 
     * @return
     *     possible object is
     *     {@link UndertakingElementType }
     *     
     */
    public UndertakingElementType getUndertakings() {
        return undertakings;
    }

    /**
     * Sets the value of the undertakings property.
     * 
     * @param value
     *     allowed object is
     *     {@link UndertakingElementType }
     *     
     */
    public void setUndertakings(UndertakingElementType value) {
        this.undertakings = value;
    }

    /**
     * Gets the value of the outcomes property.
     * 
     * @return
     *     possible object is
     *     {@link Outcomes }
     *     
     */
    public Outcomes getOutcomes() {
        return outcomes;
    }

    /**
     * Sets the value of the outcomes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Outcomes }
     *     
     */
    public void setOutcomes(Outcomes value) {
        this.outcomes = value;
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
