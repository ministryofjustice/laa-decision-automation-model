
package com.acme.mypackage;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CostCeilingElementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CostCeilingElementType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CurrentAmount" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}Amount"/&gt;
 *         &lt;element name="RemainingAmount" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}Amount"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CostCeilingElementType", namespace = "http://legalservices.gov.uk/CCMS/Finance/Payables/1.0/BillingBIO", propOrder = {
    "currentAmount",
    "remainingAmount"
})
public class CostCeilingElementType {

    @XmlElement(name = "CurrentAmount", required = true)
    protected BigDecimal currentAmount;
    @XmlElement(name = "RemainingAmount", required = true)
    protected BigDecimal remainingAmount;

    /**
     * Gets the value of the currentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCurrentAmount() {
        return currentAmount;
    }

    /**
     * Sets the value of the currentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCurrentAmount(BigDecimal value) {
        this.currentAmount = value;
    }

    /**
     * Gets the value of the remainingAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRemainingAmount() {
        return remainingAmount;
    }

    /**
     * Sets the value of the remainingAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRemainingAmount(BigDecimal value) {
        this.remainingAmount = value;
    }

}
