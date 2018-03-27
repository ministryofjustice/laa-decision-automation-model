
package com.acme.mypackage;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OtherAssetElementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OtherAssetElementType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OrderDate" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}Dt"/&gt;
 *         &lt;element name="Description" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C240"/&gt;
 *         &lt;element name="Valuation" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Amount" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}Amount" minOccurs="0"/&gt;
 *                   &lt;element name="Criteria" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C240"/&gt;
 *                   &lt;element name="Date" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}Dt" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AwardedAmount" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}Amount" minOccurs="0"/&gt;
 *         &lt;element name="AwardedPercentage" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}Decimal" minOccurs="0"/&gt;
 *         &lt;element name="RecoveredAmount" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}Amount" minOccurs="0"/&gt;
 *         &lt;element name="RecoveredPercentage" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}Decimal" minOccurs="0"/&gt;
 *         &lt;element name="DisputedAmount" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}Amount" minOccurs="0"/&gt;
 *         &lt;element name="DisputedPercentage" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}Decimal" minOccurs="0"/&gt;
 *         &lt;element name="AwardedBy" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}LOV"/&gt;
 *         &lt;element name="Recovery" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}LOV"/&gt;
 *         &lt;element name="NoRecoveryDetails" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C240" minOccurs="0"/&gt;
 *         &lt;element name="HeldBy" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="OtherPartyID" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}ID15" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TimeRelatedAward" type="{http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIO}TimeRelatedElementType" minOccurs="0"/&gt;
 *         &lt;element name="StatChargeExemptReason" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C240" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OtherAssetElementType", propOrder = {
    "orderDate",
    "description",
    "valuation",
    "awardedAmount",
    "awardedPercentage",
    "recoveredAmount",
    "recoveredPercentage",
    "disputedAmount",
    "disputedPercentage",
    "awardedBy",
    "recovery",
    "noRecoveryDetails",
    "heldBy",
    "timeRelatedAward",
    "statChargeExemptReason"
})
public class OtherAssetElementType {

    @XmlElement(name = "OrderDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar orderDate;
    @XmlElement(name = "Description", required = true)
    protected String description;
    @XmlElement(name = "Valuation")
    protected OtherAssetElementType.Valuation valuation;
    @XmlElement(name = "AwardedAmount")
    protected BigDecimal awardedAmount;
    @XmlElement(name = "AwardedPercentage")
    protected BigDecimal awardedPercentage;
    @XmlElement(name = "RecoveredAmount")
    protected BigDecimal recoveredAmount;
    @XmlElement(name = "RecoveredPercentage")
    protected BigDecimal recoveredPercentage;
    @XmlElement(name = "DisputedAmount")
    protected BigDecimal disputedAmount;
    @XmlElement(name = "DisputedPercentage")
    protected BigDecimal disputedPercentage;
    @XmlElement(name = "AwardedBy", required = true)
    protected String awardedBy;
    @XmlElement(name = "Recovery", required = true)
    protected String recovery;
    @XmlElement(name = "NoRecoveryDetails")
    protected String noRecoveryDetails;
    @XmlElement(name = "HeldBy")
    protected OtherAssetElementType.HeldBy heldBy;
    @XmlElement(name = "TimeRelatedAward")
    protected TimeRelatedElementType timeRelatedAward;
    @XmlElement(name = "StatChargeExemptReason")
    protected String statChargeExemptReason;

    /**
     * Gets the value of the orderDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrderDate() {
        return orderDate;
    }

    /**
     * Sets the value of the orderDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrderDate(XMLGregorianCalendar value) {
        this.orderDate = value;
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
     * Gets the value of the valuation property.
     * 
     * @return
     *     possible object is
     *     {@link OtherAssetElementType.Valuation }
     *     
     */
    public OtherAssetElementType.Valuation getValuation() {
        return valuation;
    }

    /**
     * Sets the value of the valuation property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherAssetElementType.Valuation }
     *     
     */
    public void setValuation(OtherAssetElementType.Valuation value) {
        this.valuation = value;
    }

    /**
     * Gets the value of the awardedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAwardedAmount() {
        return awardedAmount;
    }

    /**
     * Sets the value of the awardedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAwardedAmount(BigDecimal value) {
        this.awardedAmount = value;
    }

    /**
     * Gets the value of the awardedPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAwardedPercentage() {
        return awardedPercentage;
    }

    /**
     * Sets the value of the awardedPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAwardedPercentage(BigDecimal value) {
        this.awardedPercentage = value;
    }

    /**
     * Gets the value of the recoveredAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRecoveredAmount() {
        return recoveredAmount;
    }

    /**
     * Sets the value of the recoveredAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRecoveredAmount(BigDecimal value) {
        this.recoveredAmount = value;
    }

    /**
     * Gets the value of the recoveredPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRecoveredPercentage() {
        return recoveredPercentage;
    }

    /**
     * Sets the value of the recoveredPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRecoveredPercentage(BigDecimal value) {
        this.recoveredPercentage = value;
    }

    /**
     * Gets the value of the disputedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDisputedAmount() {
        return disputedAmount;
    }

    /**
     * Sets the value of the disputedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDisputedAmount(BigDecimal value) {
        this.disputedAmount = value;
    }

    /**
     * Gets the value of the disputedPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDisputedPercentage() {
        return disputedPercentage;
    }

    /**
     * Sets the value of the disputedPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDisputedPercentage(BigDecimal value) {
        this.disputedPercentage = value;
    }

    /**
     * Gets the value of the awardedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAwardedBy() {
        return awardedBy;
    }

    /**
     * Sets the value of the awardedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAwardedBy(String value) {
        this.awardedBy = value;
    }

    /**
     * Gets the value of the recovery property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecovery() {
        return recovery;
    }

    /**
     * Sets the value of the recovery property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecovery(String value) {
        this.recovery = value;
    }

    /**
     * Gets the value of the noRecoveryDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoRecoveryDetails() {
        return noRecoveryDetails;
    }

    /**
     * Sets the value of the noRecoveryDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoRecoveryDetails(String value) {
        this.noRecoveryDetails = value;
    }

    /**
     * Gets the value of the heldBy property.
     * 
     * @return
     *     possible object is
     *     {@link OtherAssetElementType.HeldBy }
     *     
     */
    public OtherAssetElementType.HeldBy getHeldBy() {
        return heldBy;
    }

    /**
     * Sets the value of the heldBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherAssetElementType.HeldBy }
     *     
     */
    public void setHeldBy(OtherAssetElementType.HeldBy value) {
        this.heldBy = value;
    }

    /**
     * Gets the value of the timeRelatedAward property.
     * 
     * @return
     *     possible object is
     *     {@link TimeRelatedElementType }
     *     
     */
    public TimeRelatedElementType getTimeRelatedAward() {
        return timeRelatedAward;
    }

    /**
     * Sets the value of the timeRelatedAward property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeRelatedElementType }
     *     
     */
    public void setTimeRelatedAward(TimeRelatedElementType value) {
        this.timeRelatedAward = value;
    }

    /**
     * Gets the value of the statChargeExemptReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatChargeExemptReason() {
        return statChargeExemptReason;
    }

    /**
     * Sets the value of the statChargeExemptReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatChargeExemptReason(String value) {
        this.statChargeExemptReason = value;
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
     *         &lt;element name="OtherPartyID" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}ID15" maxOccurs="unbounded"/&gt;
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
        "otherPartyID"
    })
    public static class HeldBy {

        @XmlElement(name = "OtherPartyID", required = true)
        protected List<String> otherPartyID;

        /**
         * Gets the value of the otherPartyID property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the otherPartyID property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOtherPartyID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getOtherPartyID() {
            if (otherPartyID == null) {
                otherPartyID = new ArrayList<String>();
            }
            return this.otherPartyID;
        }

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
     *         &lt;element name="Amount" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}Amount" minOccurs="0"/&gt;
     *         &lt;element name="Criteria" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C240"/&gt;
     *         &lt;element name="Date" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}Dt" minOccurs="0"/&gt;
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
        "amount",
        "criteria",
        "date"
    })
    public static class Valuation {

        @XmlElement(name = "Amount")
        protected BigDecimal amount;
        @XmlElement(name = "Criteria", required = true)
        protected String criteria;
        @XmlElement(name = "Date")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar date;

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

        /**
         * Gets the value of the criteria property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCriteria() {
            return criteria;
        }

        /**
         * Sets the value of the criteria property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCriteria(String value) {
            this.criteria = value;
        }

        /**
         * Gets the value of the date property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDate() {
            return date;
        }

        /**
         * Sets the value of the date property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDate(XMLGregorianCalendar value) {
            this.date = value;
        }

    }

}
