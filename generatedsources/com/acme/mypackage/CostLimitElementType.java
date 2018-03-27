
package com.acme.mypackage;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CostLimitElementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CostLimitElementType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CertificateAmount" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}Amount"/&gt;
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
@XmlType(name = "CostLimitElementType", namespace = "http://legalservices.gov.uk/CCMS/Finance/Payables/1.0/BillingBIO", propOrder = {
    "certificateAmount",
    "remainingAmount"
})
public class CostLimitElementType {

    @XmlElement(name = "CertificateAmount", required = true)
    protected BigDecimal certificateAmount;
    @XmlElement(name = "RemainingAmount", required = true)
    protected BigDecimal remainingAmount;

    /**
     * Gets the value of the certificateAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCertificateAmount() {
        return certificateAmount;
    }

    /**
     * Sets the value of the certificateAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCertificateAmount(BigDecimal value) {
        this.certificateAmount = value;
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
