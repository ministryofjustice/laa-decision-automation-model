
package com.acme.mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CaseDeleteRQ complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CaseDeleteRQ"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://legalservices.gov.uk/Enterprise/Common/1.0/Header}HeaderRQ"/&gt;
 *         &lt;element name="CaseReferenceNumber" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}IDREF30"/&gt;
 *         &lt;element name="LinkedCaseID" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}ID30" minOccurs="0"/&gt;
 *         &lt;element name="AddressID" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}ID30" minOccurs="0"/&gt;
 *         &lt;element name="OtherPartyID" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}ID30" minOccurs="0"/&gt;
 *         &lt;element name="ExternalResourceID" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}ID30" minOccurs="0"/&gt;
 *         &lt;element name="ProceedingCaseID" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}ID30" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CaseDeleteRQ", namespace = "http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIM", propOrder = {
    "headerRQ",
    "caseReferenceNumber",
    "linkedCaseID",
    "addressID",
    "otherPartyID",
    "externalResourceID",
    "proceedingCaseID"
})
public class CaseDeleteRQ {

    @XmlElement(name = "HeaderRQ", namespace = "http://legalservices.gov.uk/Enterprise/Common/1.0/Header", required = true)
    protected HeaderRQType headerRQ;
    @XmlElement(name = "CaseReferenceNumber", required = true)
    protected String caseReferenceNumber;
    @XmlElement(name = "LinkedCaseID")
    protected String linkedCaseID;
    @XmlElement(name = "AddressID")
    protected String addressID;
    @XmlElement(name = "OtherPartyID")
    protected String otherPartyID;
    @XmlElement(name = "ExternalResourceID")
    protected String externalResourceID;
    @XmlElement(name = "ProceedingCaseID")
    protected String proceedingCaseID;

    /**
     * Gets the value of the headerRQ property.
     * 
     * @return
     *     possible object is
     *     {@link HeaderRQType }
     *     
     */
    public HeaderRQType getHeaderRQ() {
        return headerRQ;
    }

    /**
     * Sets the value of the headerRQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link HeaderRQType }
     *     
     */
    public void setHeaderRQ(HeaderRQType value) {
        this.headerRQ = value;
    }

    /**
     * Gets the value of the caseReferenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseReferenceNumber() {
        return caseReferenceNumber;
    }

    /**
     * Sets the value of the caseReferenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseReferenceNumber(String value) {
        this.caseReferenceNumber = value;
    }

    /**
     * Gets the value of the linkedCaseID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkedCaseID() {
        return linkedCaseID;
    }

    /**
     * Sets the value of the linkedCaseID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkedCaseID(String value) {
        this.linkedCaseID = value;
    }

    /**
     * Gets the value of the addressID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressID() {
        return addressID;
    }

    /**
     * Sets the value of the addressID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressID(String value) {
        this.addressID = value;
    }

    /**
     * Gets the value of the otherPartyID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherPartyID() {
        return otherPartyID;
    }

    /**
     * Sets the value of the otherPartyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherPartyID(String value) {
        this.otherPartyID = value;
    }

    /**
     * Gets the value of the externalResourceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalResourceID() {
        return externalResourceID;
    }

    /**
     * Sets the value of the externalResourceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalResourceID(String value) {
        this.externalResourceID = value;
    }

    /**
     * Gets the value of the proceedingCaseID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProceedingCaseID() {
        return proceedingCaseID;
    }

    /**
     * Sets the value of the proceedingCaseID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProceedingCaseID(String value) {
        this.proceedingCaseID = value;
    }

}
