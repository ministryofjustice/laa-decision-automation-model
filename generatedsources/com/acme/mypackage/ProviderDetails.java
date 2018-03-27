
package com.acme.mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProviderDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProviderDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ProviderCaseReferenceNumber" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}IDREF35" minOccurs="0"/&gt;
 *         &lt;element name="ProviderFirmID" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}ID15"/&gt;
 *         &lt;element name="ProviderOfficeID" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}ID15"/&gt;
 *         &lt;element name="ContactUserID" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}User" minOccurs="0"/&gt;
 *         &lt;element name="ContactDetails" type="{http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIO}ContactDetails" minOccurs="0"/&gt;
 *         &lt;element name="SupervisorContactID" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}ID15" minOccurs="0"/&gt;
 *         &lt;element name="FeeEarnerContactID" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}ID15" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProviderDetails", propOrder = {
    "providerCaseReferenceNumber",
    "providerFirmID",
    "providerOfficeID",
    "contactUserID",
    "contactDetails",
    "supervisorContactID",
    "feeEarnerContactID"
})
public class ProviderDetails {

    @XmlElement(name = "ProviderCaseReferenceNumber")
    protected String providerCaseReferenceNumber;
    @XmlElement(name = "ProviderFirmID", required = true)
    protected String providerFirmID;
    @XmlElement(name = "ProviderOfficeID", required = true)
    protected String providerOfficeID;
    @XmlElement(name = "ContactUserID")
    protected User contactUserID;
    @XmlElement(name = "ContactDetails")
    protected ContactDetails contactDetails;
    @XmlElement(name = "SupervisorContactID")
    protected String supervisorContactID;
    @XmlElement(name = "FeeEarnerContactID")
    protected String feeEarnerContactID;

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
     * Gets the value of the providerFirmID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderFirmID() {
        return providerFirmID;
    }

    /**
     * Sets the value of the providerFirmID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderFirmID(String value) {
        this.providerFirmID = value;
    }

    /**
     * Gets the value of the providerOfficeID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderOfficeID() {
        return providerOfficeID;
    }

    /**
     * Sets the value of the providerOfficeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderOfficeID(String value) {
        this.providerOfficeID = value;
    }

    /**
     * Gets the value of the contactUserID property.
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getContactUserID() {
        return contactUserID;
    }

    /**
     * Sets the value of the contactUserID property.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setContactUserID(User value) {
        this.contactUserID = value;
    }

    /**
     * Gets the value of the contactDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ContactDetails }
     *     
     */
    public ContactDetails getContactDetails() {
        return contactDetails;
    }

    /**
     * Sets the value of the contactDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactDetails }
     *     
     */
    public void setContactDetails(ContactDetails value) {
        this.contactDetails = value;
    }

    /**
     * Gets the value of the supervisorContactID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupervisorContactID() {
        return supervisorContactID;
    }

    /**
     * Sets the value of the supervisorContactID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupervisorContactID(String value) {
        this.supervisorContactID = value;
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

}
