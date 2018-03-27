
package com.acme.mypackage;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for POASummaryElementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="POASummaryElementType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AmountRecouped" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}Amount"/&gt;
 *         &lt;element name="AmountAuthorized" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}Amount"/&gt;
 *         &lt;element name="AmountUnRecouped" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}Amount"/&gt;
 *         &lt;element name="AmountSubmitted" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}Amount"/&gt;
 *         &lt;element name="TotalAmount" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}Amount"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "POASummaryElementType", namespace = "http://legalservices.gov.uk/CCMS/Finance/Payables/1.0/BillingBIO", propOrder = {
    "amountRecouped",
    "amountAuthorized",
    "amountUnRecouped",
    "amountSubmitted",
    "totalAmount"
})
public class POASummaryElementType {

    @XmlElement(name = "AmountRecouped", required = true)
    protected BigDecimal amountRecouped;
    @XmlElement(name = "AmountAuthorized", required = true)
    protected BigDecimal amountAuthorized;
    @XmlElement(name = "AmountUnRecouped", required = true)
    protected BigDecimal amountUnRecouped;
    @XmlElement(name = "AmountSubmitted", required = true)
    protected BigDecimal amountSubmitted;
    @XmlElement(name = "TotalAmount", required = true)
    protected BigDecimal totalAmount;

    /**
     * Gets the value of the amountRecouped property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmountRecouped() {
        return amountRecouped;
    }

    /**
     * Sets the value of the amountRecouped property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmountRecouped(BigDecimal value) {
        this.amountRecouped = value;
    }

    /**
     * Gets the value of the amountAuthorized property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmountAuthorized() {
        return amountAuthorized;
    }

    /**
     * Sets the value of the amountAuthorized property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmountAuthorized(BigDecimal value) {
        this.amountAuthorized = value;
    }

    /**
     * Gets the value of the amountUnRecouped property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmountUnRecouped() {
        return amountUnRecouped;
    }

    /**
     * Sets the value of the amountUnRecouped property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmountUnRecouped(BigDecimal value) {
        this.amountUnRecouped = value;
    }

    /**
     * Gets the value of the amountSubmitted property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmountSubmitted() {
        return amountSubmitted;
    }

    /**
     * Sets the value of the amountSubmitted property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmountSubmitted(BigDecimal value) {
        this.amountSubmitted = value;
    }

    /**
     * Gets the value of the totalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    /**
     * Sets the value of the totalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalAmount(BigDecimal value) {
        this.totalAmount = value;
    }

}
