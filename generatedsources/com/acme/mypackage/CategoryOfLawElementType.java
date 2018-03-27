
package com.acme.mypackage;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CategoryOfLawElementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CategoryOfLawElementType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CategoryOfLawCode" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}IDREF15"/&gt;
 *         &lt;element name="CategoryOfLawDescription" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C50" minOccurs="0"/&gt;
 *         &lt;element name="RequestedAmount" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}Amount" minOccurs="0"/&gt;
 *         &lt;element name="GrantedAmount" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}Amount" minOccurs="0"/&gt;
 *         &lt;element name="TotalPaidToDate" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}Amount" minOccurs="0"/&gt;
 *         &lt;element name="CostLimitations" type="{http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIO}CostLimitations" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CategoryOfLawElementType", propOrder = {
    "categoryOfLawCode",
    "categoryOfLawDescription",
    "requestedAmount",
    "grantedAmount",
    "totalPaidToDate",
    "costLimitations"
})
public class CategoryOfLawElementType {

    @XmlElement(name = "CategoryOfLawCode", required = true)
    protected String categoryOfLawCode;
    @XmlElement(name = "CategoryOfLawDescription")
    protected String categoryOfLawDescription;
    @XmlElement(name = "RequestedAmount")
    protected BigDecimal requestedAmount;
    @XmlElement(name = "GrantedAmount")
    protected BigDecimal grantedAmount;
    @XmlElement(name = "TotalPaidToDate")
    protected BigDecimal totalPaidToDate;
    @XmlElement(name = "CostLimitations")
    protected CostLimitations costLimitations;

    /**
     * Gets the value of the categoryOfLawCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryOfLawCode() {
        return categoryOfLawCode;
    }

    /**
     * Sets the value of the categoryOfLawCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryOfLawCode(String value) {
        this.categoryOfLawCode = value;
    }

    /**
     * Gets the value of the categoryOfLawDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryOfLawDescription() {
        return categoryOfLawDescription;
    }

    /**
     * Sets the value of the categoryOfLawDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryOfLawDescription(String value) {
        this.categoryOfLawDescription = value;
    }

    /**
     * Gets the value of the requestedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRequestedAmount() {
        return requestedAmount;
    }

    /**
     * Sets the value of the requestedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRequestedAmount(BigDecimal value) {
        this.requestedAmount = value;
    }

    /**
     * Gets the value of the grantedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGrantedAmount() {
        return grantedAmount;
    }

    /**
     * Sets the value of the grantedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGrantedAmount(BigDecimal value) {
        this.grantedAmount = value;
    }

    /**
     * Gets the value of the totalPaidToDate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalPaidToDate() {
        return totalPaidToDate;
    }

    /**
     * Sets the value of the totalPaidToDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalPaidToDate(BigDecimal value) {
        this.totalPaidToDate = value;
    }

    /**
     * Gets the value of the costLimitations property.
     * 
     * @return
     *     possible object is
     *     {@link CostLimitations }
     *     
     */
    public CostLimitations getCostLimitations() {
        return costLimitations;
    }

    /**
     * Sets the value of the costLimitations property.
     * 
     * @param value
     *     allowed object is
     *     {@link CostLimitations }
     *     
     */
    public void setCostLimitations(CostLimitations value) {
        this.costLimitations = value;
    }

}
