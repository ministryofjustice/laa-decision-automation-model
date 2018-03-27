
package com.acme.mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The base type for Address
 * 
 * <p>Java class for Address complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Address"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AddressID" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}IDREF30" minOccurs="0"/&gt;
 *         &lt;element name="House" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C50" minOccurs="0"/&gt;
 *         &lt;element name="CoffName" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C50" minOccurs="0"/&gt;
 *         &lt;element name="AddressLine1" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C240"/&gt;
 *         &lt;element name="AddressLine2" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C240" minOccurs="0"/&gt;
 *         &lt;element name="AddressLine3" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C240" minOccurs="0"/&gt;
 *         &lt;element name="AddressLine4" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C240" minOccurs="0"/&gt;
 *         &lt;element name="City" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C60" minOccurs="0"/&gt;
 *         &lt;element name="Country" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}CountryCode"/&gt;
 *         &lt;element name="County" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C60" minOccurs="0"/&gt;
 *         &lt;element name="State" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C60" minOccurs="0"/&gt;
 *         &lt;element name="Province" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C60" minOccurs="0"/&gt;
 *         &lt;element name="PostalCode" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C60" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Address", namespace = "http://legalservices.gov.uk/Enterprise/Common/1.0/Common", propOrder = {
    "addressID",
    "house",
    "coffName",
    "addressLine1",
    "addressLine2",
    "addressLine3",
    "addressLine4",
    "city",
    "country",
    "county",
    "state",
    "province",
    "postalCode"
})
public class Address {

    @XmlElement(name = "AddressID")
    protected String addressID;
    @XmlElement(name = "House")
    protected String house;
    @XmlElement(name = "CoffName")
    protected String coffName;
    @XmlElement(name = "AddressLine1", required = true)
    protected String addressLine1;
    @XmlElement(name = "AddressLine2")
    protected String addressLine2;
    @XmlElement(name = "AddressLine3")
    protected String addressLine3;
    @XmlElement(name = "AddressLine4")
    protected String addressLine4;
    @XmlElement(name = "City")
    protected String city;
    @XmlElement(name = "Country", required = true)
    protected String country;
    @XmlElement(name = "County")
    protected String county;
    @XmlElement(name = "State")
    protected String state;
    @XmlElement(name = "Province")
    protected String province;
    @XmlElement(name = "PostalCode")
    protected String postalCode;

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
     * Gets the value of the house property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouse() {
        return house;
    }

    /**
     * Sets the value of the house property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouse(String value) {
        this.house = value;
    }

    /**
     * Gets the value of the coffName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoffName() {
        return coffName;
    }

    /**
     * Sets the value of the coffName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoffName(String value) {
        this.coffName = value;
    }

    /**
     * Gets the value of the addressLine1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLine1() {
        return addressLine1;
    }

    /**
     * Sets the value of the addressLine1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLine1(String value) {
        this.addressLine1 = value;
    }

    /**
     * Gets the value of the addressLine2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLine2() {
        return addressLine2;
    }

    /**
     * Sets the value of the addressLine2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLine2(String value) {
        this.addressLine2 = value;
    }

    /**
     * Gets the value of the addressLine3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLine3() {
        return addressLine3;
    }

    /**
     * Sets the value of the addressLine3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLine3(String value) {
        this.addressLine3 = value;
    }

    /**
     * Gets the value of the addressLine4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLine4() {
        return addressLine4;
    }

    /**
     * Sets the value of the addressLine4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLine4(String value) {
        this.addressLine4 = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the county property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCounty() {
        return county;
    }

    /**
     * Sets the value of the county property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCounty(String value) {
        this.county = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the province property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvince() {
        return province;
    }

    /**
     * Sets the value of the province property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvince(String value) {
        this.province = value;
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

}
