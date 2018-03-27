
package com.acme.mypackage;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The base type for VAT Codes
 * 
 * <p>Java class for VATCode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VATCode"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="Exempt" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}VATExempt"/&gt;
 *         &lt;element name="Percentage" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}VATPercentage"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VATCode", namespace = "http://legalservices.gov.uk/Enterprise/Common/1.0/Common", propOrder = {
    "exempt",
    "percentage"
})
public class VATCode {

    @XmlElement(name = "Exempt")
    protected String exempt;
    @XmlElement(name = "Percentage")
    protected BigDecimal percentage;

    /**
     * Gets the value of the exempt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExempt() {
        return exempt;
    }

    /**
     * Sets the value of the exempt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExempt(String value) {
        this.exempt = value;
    }

    /**
     * Gets the value of the percentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercentage() {
        return percentage;
    }

    /**
     * Sets the value of the percentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercentage(BigDecimal value) {
        this.percentage = value;
    }

}
