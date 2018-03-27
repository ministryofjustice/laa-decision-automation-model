
package com.acme.mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OtherPartyOrgType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OtherPartyOrgType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OrganizationName" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C360"/&gt;
 *         &lt;element name="OrganizationType" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}LOV"/&gt;
 *         &lt;element name="CurrentlyTrading" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}LOV" minOccurs="0"/&gt;
 *         &lt;element name="RelationToClient" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}LOV"/&gt;
 *         &lt;element name="RelationToCase" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}LOV"/&gt;
 *         &lt;element name="Address" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}Address" minOccurs="0"/&gt;
 *         &lt;element name="ContactName" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C150"/&gt;
 *         &lt;element name="ContactDetails" type="{http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIO}ContactDetails" minOccurs="0"/&gt;
 *         &lt;element name="OtherInformation" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C240" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OtherPartyOrgType", propOrder = {
    "organizationName",
    "organizationType",
    "currentlyTrading",
    "relationToClient",
    "relationToCase",
    "address",
    "contactName",
    "contactDetails",
    "otherInformation"
})
public class OtherPartyOrgType {

    @XmlElement(name = "OrganizationName", required = true)
    protected String organizationName;
    @XmlElement(name = "OrganizationType", required = true)
    protected String organizationType;
    @XmlElement(name = "CurrentlyTrading")
    protected String currentlyTrading;
    @XmlElement(name = "RelationToClient", required = true)
    protected String relationToClient;
    @XmlElement(name = "RelationToCase", required = true)
    protected String relationToCase;
    @XmlElement(name = "Address")
    protected Address address;
    @XmlElement(name = "ContactName", required = true)
    protected String contactName;
    @XmlElement(name = "ContactDetails")
    protected ContactDetails contactDetails;
    @XmlElement(name = "OtherInformation")
    protected String otherInformation;

    /**
     * Gets the value of the organizationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationName() {
        return organizationName;
    }

    /**
     * Sets the value of the organizationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationName(String value) {
        this.organizationName = value;
    }

    /**
     * Gets the value of the organizationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationType() {
        return organizationType;
    }

    /**
     * Sets the value of the organizationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationType(String value) {
        this.organizationType = value;
    }

    /**
     * Gets the value of the currentlyTrading property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentlyTrading() {
        return currentlyTrading;
    }

    /**
     * Sets the value of the currentlyTrading property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentlyTrading(String value) {
        this.currentlyTrading = value;
    }

    /**
     * Gets the value of the relationToClient property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelationToClient() {
        return relationToClient;
    }

    /**
     * Sets the value of the relationToClient property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelationToClient(String value) {
        this.relationToClient = value;
    }

    /**
     * Gets the value of the relationToCase property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelationToCase() {
        return relationToCase;
    }

    /**
     * Sets the value of the relationToCase property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelationToCase(String value) {
        this.relationToCase = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setAddress(Address value) {
        this.address = value;
    }

    /**
     * Gets the value of the contactName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactName() {
        return contactName;
    }

    /**
     * Sets the value of the contactName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactName(String value) {
        this.contactName = value;
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
     * Gets the value of the otherInformation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherInformation() {
        return otherInformation;
    }

    /**
     * Sets the value of the otherInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherInformation(String value) {
        this.otherInformation = value;
    }

}
