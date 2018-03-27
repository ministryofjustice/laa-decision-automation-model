
package com.acme.mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContactDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContactDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TelephoneHome" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}PhoneNum" minOccurs="0"/&gt;
 *         &lt;element name="TelephoneWork" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}PhoneNum" minOccurs="0"/&gt;
 *         &lt;element name="MobileNumber" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}PhoneNum" minOccurs="0"/&gt;
 *         &lt;element name="EmailAddress" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}EmailAddress" minOccurs="0"/&gt;
 *         &lt;element name="Fax" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}PhoneNum" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactDetails", propOrder = {
    "telephoneHome",
    "telephoneWork",
    "mobileNumber",
    "emailAddress",
    "fax"
})
public class ContactDetails {

    @XmlElement(name = "TelephoneHome")
    protected String telephoneHome;
    @XmlElement(name = "TelephoneWork")
    protected String telephoneWork;
    @XmlElement(name = "MobileNumber")
    protected String mobileNumber;
    @XmlElement(name = "EmailAddress")
    protected String emailAddress;
    @XmlElement(name = "Fax")
    protected String fax;

    /**
     * Gets the value of the telephoneHome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelephoneHome() {
        return telephoneHome;
    }

    /**
     * Sets the value of the telephoneHome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelephoneHome(String value) {
        this.telephoneHome = value;
    }

    /**
     * Gets the value of the telephoneWork property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelephoneWork() {
        return telephoneWork;
    }

    /**
     * Sets the value of the telephoneWork property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelephoneWork(String value) {
        this.telephoneWork = value;
    }

    /**
     * Gets the value of the mobileNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobileNumber() {
        return mobileNumber;
    }

    /**
     * Sets the value of the mobileNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobileNumber(String value) {
        this.mobileNumber = value;
    }

    /**
     * Gets the value of the emailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets the value of the emailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAddress(String value) {
        this.emailAddress = value;
    }

    /**
     * Gets the value of the fax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFax() {
        return fax;
    }

    /**
     * Sets the value of the fax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFax(String value) {
        this.fax = value;
    }

}
