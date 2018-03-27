
package com.acme.mypackage;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UndertakingElementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UndertakingElementType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MaxAmount" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}Amount"/&gt;
 *         &lt;element name="EnteredAmount" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}Amount"/&gt;
 *         &lt;element name="Details" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Detail" type="{http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIO}UndertakingDetailsElementType" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UndertakingElementType", propOrder = {
    "maxAmount",
    "enteredAmount",
    "details"
})
public class UndertakingElementType {

    @XmlElement(name = "MaxAmount", required = true)
    protected BigDecimal maxAmount;
    @XmlElement(name = "EnteredAmount", required = true)
    protected BigDecimal enteredAmount;
    @XmlElement(name = "Details")
    protected UndertakingElementType.Details details;

    /**
     * Gets the value of the maxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxAmount() {
        return maxAmount;
    }

    /**
     * Sets the value of the maxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxAmount(BigDecimal value) {
        this.maxAmount = value;
    }

    /**
     * Gets the value of the enteredAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEnteredAmount() {
        return enteredAmount;
    }

    /**
     * Sets the value of the enteredAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEnteredAmount(BigDecimal value) {
        this.enteredAmount = value;
    }

    /**
     * Gets the value of the details property.
     * 
     * @return
     *     possible object is
     *     {@link UndertakingElementType.Details }
     *     
     */
    public UndertakingElementType.Details getDetails() {
        return details;
    }

    /**
     * Sets the value of the details property.
     * 
     * @param value
     *     allowed object is
     *     {@link UndertakingElementType.Details }
     *     
     */
    public void setDetails(UndertakingElementType.Details value) {
        this.details = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Detail" type="{http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIO}UndertakingDetailsElementType" maxOccurs="unbounded"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "detail"
    })
    public static class Details {

        @XmlElement(name = "Detail", required = true)
        protected List<UndertakingDetailsElementType> detail;

        /**
         * Gets the value of the detail property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the detail property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDetail().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link UndertakingDetailsElementType }
         * 
         * 
         */
        public List<UndertakingDetailsElementType> getDetail() {
            if (detail == null) {
                detail = new ArrayList<UndertakingDetailsElementType>();
            }
            return this.detail;
        }

    }

}
