
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
 * <p>Java class for FinancialAwardElementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FinancialAwardElementType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OrderDate" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}Dt"/&gt;
 *         &lt;element name="Amount" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}Amount"/&gt;
 *         &lt;element name="InterimAward" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}Amount"/&gt;
 *         &lt;element name="AwardedBy" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C50"/&gt;
 *         &lt;element name="AwardJustifications" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C240" minOccurs="0"/&gt;
 *         &lt;element name="StatutoryChangeReason" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C240" minOccurs="0"/&gt;
 *         &lt;element name="OtherDetails" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C240" minOccurs="0"/&gt;
 *         &lt;element name="LiableParties" minOccurs="0"&gt;
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
 *         &lt;element name="OrderDateServed" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}Dt" minOccurs="0"/&gt;
 *         &lt;element name="ServiceAddress" type="{http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIO}ServiceAddrElementType" minOccurs="0"/&gt;
 *         &lt;element name="Recovery" type="{http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIO}RecoveryElementType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialAwardElementType", propOrder = {
    "orderDate",
    "amount",
    "interimAward",
    "awardedBy",
    "awardJustifications",
    "statutoryChangeReason",
    "otherDetails",
    "liableParties",
    "orderDateServed",
    "serviceAddress",
    "recovery"
})
public class FinancialAwardElementType {

    @XmlElement(name = "OrderDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar orderDate;
    @XmlElement(name = "Amount", required = true)
    protected BigDecimal amount;
    @XmlElement(name = "InterimAward", required = true)
    protected BigDecimal interimAward;
    @XmlElement(name = "AwardedBy", required = true)
    protected String awardedBy;
    @XmlElement(name = "AwardJustifications")
    protected String awardJustifications;
    @XmlElement(name = "StatutoryChangeReason")
    protected String statutoryChangeReason;
    @XmlElement(name = "OtherDetails")
    protected String otherDetails;
    @XmlElement(name = "LiableParties")
    protected FinancialAwardElementType.LiableParties liableParties;
    @XmlElement(name = "OrderDateServed")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar orderDateServed;
    @XmlElement(name = "ServiceAddress")
    protected ServiceAddrElementType serviceAddress;
    @XmlElement(name = "Recovery")
    protected RecoveryElementType recovery;

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
     * Gets the value of the interimAward property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInterimAward() {
        return interimAward;
    }

    /**
     * Sets the value of the interimAward property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInterimAward(BigDecimal value) {
        this.interimAward = value;
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
     * Gets the value of the awardJustifications property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAwardJustifications() {
        return awardJustifications;
    }

    /**
     * Sets the value of the awardJustifications property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAwardJustifications(String value) {
        this.awardJustifications = value;
    }

    /**
     * Gets the value of the statutoryChangeReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatutoryChangeReason() {
        return statutoryChangeReason;
    }

    /**
     * Sets the value of the statutoryChangeReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatutoryChangeReason(String value) {
        this.statutoryChangeReason = value;
    }

    /**
     * Gets the value of the otherDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherDetails() {
        return otherDetails;
    }

    /**
     * Sets the value of the otherDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherDetails(String value) {
        this.otherDetails = value;
    }

    /**
     * Gets the value of the liableParties property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialAwardElementType.LiableParties }
     *     
     */
    public FinancialAwardElementType.LiableParties getLiableParties() {
        return liableParties;
    }

    /**
     * Sets the value of the liableParties property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAwardElementType.LiableParties }
     *     
     */
    public void setLiableParties(FinancialAwardElementType.LiableParties value) {
        this.liableParties = value;
    }

    /**
     * Gets the value of the orderDateServed property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrderDateServed() {
        return orderDateServed;
    }

    /**
     * Sets the value of the orderDateServed property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrderDateServed(XMLGregorianCalendar value) {
        this.orderDateServed = value;
    }

    /**
     * Gets the value of the serviceAddress property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceAddrElementType }
     *     
     */
    public ServiceAddrElementType getServiceAddress() {
        return serviceAddress;
    }

    /**
     * Sets the value of the serviceAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceAddrElementType }
     *     
     */
    public void setServiceAddress(ServiceAddrElementType value) {
        this.serviceAddress = value;
    }

    /**
     * Gets the value of the recovery property.
     * 
     * @return
     *     possible object is
     *     {@link RecoveryElementType }
     *     
     */
    public RecoveryElementType getRecovery() {
        return recovery;
    }

    /**
     * Sets the value of the recovery property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecoveryElementType }
     *     
     */
    public void setRecovery(RecoveryElementType value) {
        this.recovery = value;
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
    public static class LiableParties {

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

}
