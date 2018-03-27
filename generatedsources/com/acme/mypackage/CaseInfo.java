
package com.acme.mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CaseInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CaseInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CaseReferenceNumber" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}IDREF30" minOccurs="0"/&gt;
 *         &lt;element name="ClientSurname" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C50" minOccurs="0"/&gt;
 *         &lt;element name="ProviderCaseReferenceNumber" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}IDREF35" minOccurs="0"/&gt;
 *         &lt;element name="FeeEarnerContactID" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}ID15" minOccurs="0"/&gt;
 *         &lt;element name="OfficeID" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}ID15" minOccurs="0"/&gt;
 *         &lt;element name="CaseStatus" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}LOV" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CaseInfo", propOrder = {
    "caseReferenceNumber",
    "clientSurname",
    "providerCaseReferenceNumber",
    "feeEarnerContactID",
    "officeID",
    "caseStatus"
})
public class CaseInfo {

    @XmlElement(name = "CaseReferenceNumber")
    protected String caseReferenceNumber;
    @XmlElement(name = "ClientSurname")
    protected String clientSurname;
    @XmlElement(name = "ProviderCaseReferenceNumber")
    protected String providerCaseReferenceNumber;
    @XmlElement(name = "FeeEarnerContactID")
    protected String feeEarnerContactID;
    @XmlElement(name = "OfficeID")
    protected String officeID;
    @XmlElement(name = "CaseStatus")
    protected String caseStatus;

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
     * Gets the value of the clientSurname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientSurname() {
        return clientSurname;
    }

    /**
     * Sets the value of the clientSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientSurname(String value) {
        this.clientSurname = value;
    }

    /**
     * Gets the value of the providerCaseReferenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderCaseReferenceNumber() {
        return providerCaseReferenceNumber;
    }

    /**
     * Sets the value of the providerCaseReferenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderCaseReferenceNumber(String value) {
        this.providerCaseReferenceNumber = value;
    }

    /**
     * Gets the value of the feeEarnerContactID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeeEarnerContactID() {
        return feeEarnerContactID;
    }

    /**
     * Sets the value of the feeEarnerContactID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeeEarnerContactID(String value) {
        this.feeEarnerContactID = value;
    }

    /**
     * Gets the value of the officeID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfficeID() {
        return officeID;
    }

    /**
     * Sets the value of the officeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfficeID(String value) {
        this.officeID = value;
    }

    /**
     * Gets the value of the caseStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseStatus() {
        return caseStatus;
    }

    /**
     * Sets the value of the caseStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseStatus(String value) {
        this.caseStatus = value;
    }

}
