
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
 * <p>Java class for CostAwardElementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CostAwardElementType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OrderDate" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}Dt"/&gt;
 *         &lt;element name="CourtAssessmentStatus" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C50"/&gt;
 *         &lt;element name="PreCertificateAwardLSC" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}Amount" minOccurs="0"/&gt;
 *         &lt;element name="PreCertificateAwardOth" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}Amount" minOccurs="0"/&gt;
 *         &lt;element name="CertificateCostRateLSC" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}Amount" minOccurs="0"/&gt;
 *         &lt;element name="CertificateCostRateMarket" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}Amount" minOccurs="0"/&gt;
 *         &lt;element name="AwardedBy" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C50" minOccurs="0"/&gt;
 *         &lt;element name="InterestAwardedRate" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}Amount" minOccurs="0"/&gt;
 *         &lt;element name="InterestAwardedStartDate" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}Dt" minOccurs="0"/&gt;
 *         &lt;element name="OtherDetails" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C240" minOccurs="0"/&gt;
 *         &lt;element name="LiableParties" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="OtherParyID" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}ID15" maxOccurs="unbounded"/&gt;
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
@XmlType(name = "CostAwardElementType", propOrder = {
    "orderDate",
    "courtAssessmentStatus",
    "preCertificateAwardLSC",
    "preCertificateAwardOth",
    "certificateCostRateLSC",
    "certificateCostRateMarket",
    "awardedBy",
    "interestAwardedRate",
    "interestAwardedStartDate",
    "otherDetails",
    "liableParties",
    "orderDateServed",
    "serviceAddress",
    "recovery"
})
public class CostAwardElementType {

    @XmlElement(name = "OrderDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar orderDate;
    @XmlElement(name = "CourtAssessmentStatus", required = true)
    protected String courtAssessmentStatus;
    @XmlElement(name = "PreCertificateAwardLSC")
    protected BigDecimal preCertificateAwardLSC;
    @XmlElement(name = "PreCertificateAwardOth")
    protected BigDecimal preCertificateAwardOth;
    @XmlElement(name = "CertificateCostRateLSC")
    protected BigDecimal certificateCostRateLSC;
    @XmlElement(name = "CertificateCostRateMarket")
    protected BigDecimal certificateCostRateMarket;
    @XmlElement(name = "AwardedBy")
    protected String awardedBy;
    @XmlElement(name = "InterestAwardedRate")
    protected BigDecimal interestAwardedRate;
    @XmlElement(name = "InterestAwardedStartDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar interestAwardedStartDate;
    @XmlElement(name = "OtherDetails")
    protected String otherDetails;
    @XmlElement(name = "LiableParties")
    protected CostAwardElementType.LiableParties liableParties;
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
     * Gets the value of the courtAssessmentStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourtAssessmentStatus() {
        return courtAssessmentStatus;
    }

    /**
     * Sets the value of the courtAssessmentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourtAssessmentStatus(String value) {
        this.courtAssessmentStatus = value;
    }

    /**
     * Gets the value of the preCertificateAwardLSC property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPreCertificateAwardLSC() {
        return preCertificateAwardLSC;
    }

    /**
     * Sets the value of the preCertificateAwardLSC property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPreCertificateAwardLSC(BigDecimal value) {
        this.preCertificateAwardLSC = value;
    }

    /**
     * Gets the value of the preCertificateAwardOth property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPreCertificateAwardOth() {
        return preCertificateAwardOth;
    }

    /**
     * Sets the value of the preCertificateAwardOth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPreCertificateAwardOth(BigDecimal value) {
        this.preCertificateAwardOth = value;
    }

    /**
     * Gets the value of the certificateCostRateLSC property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCertificateCostRateLSC() {
        return certificateCostRateLSC;
    }

    /**
     * Sets the value of the certificateCostRateLSC property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCertificateCostRateLSC(BigDecimal value) {
        this.certificateCostRateLSC = value;
    }

    /**
     * Gets the value of the certificateCostRateMarket property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCertificateCostRateMarket() {
        return certificateCostRateMarket;
    }

    /**
     * Sets the value of the certificateCostRateMarket property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCertificateCostRateMarket(BigDecimal value) {
        this.certificateCostRateMarket = value;
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
     * Gets the value of the interestAwardedRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInterestAwardedRate() {
        return interestAwardedRate;
    }

    /**
     * Sets the value of the interestAwardedRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInterestAwardedRate(BigDecimal value) {
        this.interestAwardedRate = value;
    }

    /**
     * Gets the value of the interestAwardedStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInterestAwardedStartDate() {
        return interestAwardedStartDate;
    }

    /**
     * Sets the value of the interestAwardedStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInterestAwardedStartDate(XMLGregorianCalendar value) {
        this.interestAwardedStartDate = value;
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
     *     {@link CostAwardElementType.LiableParties }
     *     
     */
    public CostAwardElementType.LiableParties getLiableParties() {
        return liableParties;
    }

    /**
     * Sets the value of the liableParties property.
     * 
     * @param value
     *     allowed object is
     *     {@link CostAwardElementType.LiableParties }
     *     
     */
    public void setLiableParties(CostAwardElementType.LiableParties value) {
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
     *         &lt;element name="OtherParyID" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}ID15" maxOccurs="unbounded"/&gt;
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
        "otherParyID"
    })
    public static class LiableParties {

        @XmlElement(name = "OtherParyID", required = true)
        protected List<String> otherParyID;

        /**
         * Gets the value of the otherParyID property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the otherParyID property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOtherParyID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getOtherParyID() {
            if (otherParyID == null) {
                otherParyID = new ArrayList<String>();
            }
            return this.otherParyID;
        }

    }

}
