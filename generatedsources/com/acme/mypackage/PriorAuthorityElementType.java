
package com.acme.mypackage;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PriorAuthorityElementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PriorAuthorityElementType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PriorAuthorityType" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}LOV"/&gt;
 *         &lt;element name="Description" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C150"/&gt;
 *         &lt;element name="ReasonForRequest" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C255" minOccurs="0"/&gt;
 *         &lt;element name="RequestAmount" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}Amount"/&gt;
 *         &lt;element name="DecisionStatus" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}LOV" minOccurs="0"/&gt;
 *         &lt;element name="AssessedAmount" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}Amount" minOccurs="0"/&gt;
 *         &lt;element name="Details" type="{http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIO}PriorAuthorityDetElementType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriorAuthorityElementType", propOrder = {
    "priorAuthorityType",
    "description",
    "reasonForRequest",
    "requestAmount",
    "decisionStatus",
    "assessedAmount",
    "details"
})
public class PriorAuthorityElementType {

    @XmlElement(name = "PriorAuthorityType", required = true)
    protected String priorAuthorityType;
    @XmlElement(name = "Description", required = true)
    protected String description;
    @XmlElement(name = "ReasonForRequest")
    protected String reasonForRequest;
    @XmlElement(name = "RequestAmount", required = true)
    protected BigDecimal requestAmount;
    @XmlElement(name = "DecisionStatus")
    protected String decisionStatus;
    @XmlElement(name = "AssessedAmount")
    protected BigDecimal assessedAmount;
    @XmlElement(name = "Details")
    protected PriorAuthorityDetElementType details;

    /**
     * Gets the value of the priorAuthorityType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriorAuthorityType() {
        return priorAuthorityType;
    }

    /**
     * Sets the value of the priorAuthorityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriorAuthorityType(String value) {
        this.priorAuthorityType = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the reasonForRequest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonForRequest() {
        return reasonForRequest;
    }

    /**
     * Sets the value of the reasonForRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonForRequest(String value) {
        this.reasonForRequest = value;
    }

    /**
     * Gets the value of the requestAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRequestAmount() {
        return requestAmount;
    }

    /**
     * Sets the value of the requestAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRequestAmount(BigDecimal value) {
        this.requestAmount = value;
    }

    /**
     * Gets the value of the decisionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecisionStatus() {
        return decisionStatus;
    }

    /**
     * Sets the value of the decisionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecisionStatus(String value) {
        this.decisionStatus = value;
    }

    /**
     * Gets the value of the assessedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAssessedAmount() {
        return assessedAmount;
    }

    /**
     * Sets the value of the assessedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAssessedAmount(BigDecimal value) {
        this.assessedAmount = value;
    }

    /**
     * Gets the value of the details property.
     * 
     * @return
     *     possible object is
     *     {@link PriorAuthorityDetElementType }
     *     
     */
    public PriorAuthorityDetElementType getDetails() {
        return details;
    }

    /**
     * Sets the value of the details property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriorAuthorityDetElementType }
     *     
     */
    public void setDetails(PriorAuthorityDetElementType value) {
        this.details = value;
    }

}
