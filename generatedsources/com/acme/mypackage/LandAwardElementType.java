
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
 * <p>Java class for LandAwardElementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LandAwardElementType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OrderDate" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}Dt"/&gt;
 *         &lt;element name="Description" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C50"/&gt;
 *         &lt;element name="TitleNo" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C50" minOccurs="0"/&gt;
 *         &lt;element name="PropertyAddress" type="{http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIO}ServiceAddrElementType"/&gt;
 *         &lt;element name="Valuation"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Amount" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}Amount" minOccurs="0"/&gt;
 *                   &lt;element name="Criteria" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}LOV"/&gt;
 *                   &lt;element name="Date" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}Dt" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DisputedPercentage" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}Decimal" minOccurs="0"/&gt;
 *         &lt;element name="AwardedPercentage" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}Decimal" minOccurs="0"/&gt;
 *         &lt;element name="MortgageAmountDue" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}Amount" minOccurs="0"/&gt;
 *         &lt;element name="Equity" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C50" minOccurs="0"/&gt;
 *         &lt;element name="AwardedBy" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}LOV"/&gt;
 *         &lt;element name="Recovery" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}LOV"/&gt;
 *         &lt;element name="NoRecoveryDetails" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C240" minOccurs="0"/&gt;
 *         &lt;element name="StatChargeExemptReason" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C240" minOccurs="0"/&gt;
 *         &lt;element name="LandChargeRegistration" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}LOV" minOccurs="0"/&gt;
 *         &lt;element name="RegistrationRef" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C50" minOccurs="0"/&gt;
 *         &lt;element name="OtherProprietors" minOccurs="0"&gt;
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
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LandAwardElementType", propOrder = {
    "orderDate",
    "description",
    "titleNo",
    "propertyAddress",
    "valuation",
    "disputedPercentage",
    "awardedPercentage",
    "mortgageAmountDue",
    "equity",
    "awardedBy",
    "recovery",
    "noRecoveryDetails",
    "statChargeExemptReason",
    "landChargeRegistration",
    "registrationRef",
    "otherProprietors",
    "timeRelatedAward"
})
public class LandAwardElementType {

    @XmlElement(name = "OrderDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar orderDate;
    @XmlElement(name = "Description", required = true)
    protected String description;
    @XmlElement(name = "TitleNo")
    protected String titleNo;
    @XmlElement(name = "PropertyAddress", required = true)
    protected ServiceAddrElementType propertyAddress;
    @XmlElement(name = "Valuation", required = true)
    protected LandAwardElementType.Valuation valuation;
    @XmlElement(name = "DisputedPercentage")
    protected BigDecimal disputedPercentage;
    @XmlElement(name = "AwardedPercentage")
    protected BigDecimal awardedPercentage;
    @XmlElement(name = "MortgageAmountDue")
    protected BigDecimal mortgageAmountDue;
    @XmlElement(name = "Equity")
    protected String equity;
    @XmlElement(name = "AwardedBy", required = true)
    protected String awardedBy;
    @XmlElement(name = "Recovery", required = true)
    protected String recovery;
    @XmlElement(name = "NoRecoveryDetails")
    protected String noRecoveryDetails;
    @XmlElement(name = "StatChargeExemptReason")
    protected String statChargeExemptReason;
    @XmlElement(name = "LandChargeRegistration")
    protected String landChargeRegistration;
    @XmlElement(name = "RegistrationRef")
    protected String registrationRef;
    @XmlElement(name = "OtherProprietors")
    protected LandAwardElementType.OtherProprietors otherProprietors;
    @XmlElement(name = "TimeRelatedAward")
    protected TimeRelatedElementType timeRelatedAward;

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
     * Gets the value of the titleNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitleNo() {
        return titleNo;
    }

    /**
     * Sets the value of the titleNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitleNo(String value) {
        this.titleNo = value;
    }

    /**
     * Gets the value of the propertyAddress property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceAddrElementType }
     *     
     */
    public ServiceAddrElementType getPropertyAddress() {
        return propertyAddress;
    }

    /**
     * Sets the value of the propertyAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceAddrElementType }
     *     
     */
    public void setPropertyAddress(ServiceAddrElementType value) {
        this.propertyAddress = value;
    }

    /**
     * Gets the value of the valuation property.
     * 
     * @return
     *     possible object is
     *     {@link LandAwardElementType.Valuation }
     *     
     */
    public LandAwardElementType.Valuation getValuation() {
        return valuation;
    }

    /**
     * Sets the value of the valuation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LandAwardElementType.Valuation }
     *     
     */
    public void setValuation(LandAwardElementType.Valuation value) {
        this.valuation = value;
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
     * Gets the value of the mortgageAmountDue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMortgageAmountDue() {
        return mortgageAmountDue;
    }

    /**
     * Sets the value of the mortgageAmountDue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMortgageAmountDue(BigDecimal value) {
        this.mortgageAmountDue = value;
    }

    /**
     * Gets the value of the equity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquity() {
        return equity;
    }

    /**
     * Sets the value of the equity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquity(String value) {
        this.equity = value;
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
     * Gets the value of the landChargeRegistration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLandChargeRegistration() {
        return landChargeRegistration;
    }

    /**
     * Sets the value of the landChargeRegistration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLandChargeRegistration(String value) {
        this.landChargeRegistration = value;
    }

    /**
     * Gets the value of the registrationRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationRef() {
        return registrationRef;
    }

    /**
     * Sets the value of the registrationRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationRef(String value) {
        this.registrationRef = value;
    }

    /**
     * Gets the value of the otherProprietors property.
     * 
     * @return
     *     possible object is
     *     {@link LandAwardElementType.OtherProprietors }
     *     
     */
    public LandAwardElementType.OtherProprietors getOtherProprietors() {
        return otherProprietors;
    }

    /**
     * Sets the value of the otherProprietors property.
     * 
     * @param value
     *     allowed object is
     *     {@link LandAwardElementType.OtherProprietors }
     *     
     */
    public void setOtherProprietors(LandAwardElementType.OtherProprietors value) {
        this.otherProprietors = value;
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
    public static class OtherProprietors {

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
     *         &lt;element name="Criteria" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}LOV"/&gt;
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
