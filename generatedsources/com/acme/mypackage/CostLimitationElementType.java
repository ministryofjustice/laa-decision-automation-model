
package com.acme.mypackage;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CostLimitationElementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CostLimitationElementType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CostLimitID" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}ID15" minOccurs="0"/&gt;
 *         &lt;element name="BillingProviderID" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}ID15" minOccurs="0"/&gt;
 *         &lt;element name="BillingProviderName" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C300" minOccurs="0"/&gt;
 *         &lt;element name="CostCategory" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}LOV"/&gt;
 *         &lt;element name="PaidToDate" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}Amount" minOccurs="0"/&gt;
 *         &lt;element name="Amount" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}Amount"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CostLimitationElementType", propOrder = {
    "costLimitID",
    "billingProviderID",
    "billingProviderName",
    "costCategory",
    "paidToDate",
    "amount"
})
public class CostLimitationElementType {

    @XmlElement(name = "CostLimitID")
    protected String costLimitID;
    @XmlElement(name = "BillingProviderID")
    protected String billingProviderID;
    @XmlElement(name = "BillingProviderName")
    protected String billingProviderName;
    @XmlElement(name = "CostCategory", required = true)
    protected String costCategory;
    @XmlElement(name = "PaidToDate")
    protected BigDecimal paidToDate;
    @XmlElement(name = "Amount", required = true)
    protected BigDecimal amount;

    /**
     * Gets the value of the costLimitID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCostLimitID() {
        return costLimitID;
    }

    /**
     * Sets the value of the costLimitID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCostLimitID(String value) {
        this.costLimitID = value;
    }

    /**
     * Gets the value of the billingProviderID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingProviderID() {
        return billingProviderID;
    }

    /**
     * Sets the value of the billingProviderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingProviderID(String value) {
        this.billingProviderID = value;
    }

    /**
     * Gets the value of the billingProviderName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingProviderName() {
        return billingProviderName;
    }

    /**
     * Sets the value of the billingProviderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingProviderName(String value) {
        this.billingProviderName = value;
    }

    /**
     * Gets the value of the costCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCostCategory() {
        return costCategory;
    }

    /**
     * Sets the value of the costCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCostCategory(String value) {
        this.costCategory = value;
    }

    /**
     * Gets the value of the paidToDate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPaidToDate() {
        return paidToDate;
    }

    /**
     * Sets the value of the paidToDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPaidToDate(BigDecimal value) {
        this.paidToDate = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

}
