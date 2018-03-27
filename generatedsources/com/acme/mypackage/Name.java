
package com.acme.mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The base type for Name
 * 
 * <p>Java class for Name complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Name"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Title" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}NamePrefix" minOccurs="0"/&gt;
 *         &lt;element name="Surname" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C35"/&gt;
 *         &lt;element name="FirstName" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C35"/&gt;
 *         &lt;element name="MiddleName" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C35" minOccurs="0"/&gt;
 *         &lt;element name="SurnameAtBirth" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C35" minOccurs="0"/&gt;
 *         &lt;element name="FullName" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C35" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Name", namespace = "http://legalservices.gov.uk/Enterprise/Common/1.0/Common", propOrder = {
    "title",
    "surname",
    "firstName",
    "middleName",
    "surnameAtBirth",
    "fullName"
})
public class Name {

    @XmlElement(name = "Title")
    protected String title;
    @XmlElement(name = "Surname", required = true)
    protected String surname;
    @XmlElement(name = "FirstName", required = true)
    protected String firstName;
    @XmlElement(name = "MiddleName")
    protected String middleName;
    @XmlElement(name = "SurnameAtBirth")
    protected String surnameAtBirth;
    @XmlElement(name = "FullName")
    protected String fullName;

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the surname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Sets the value of the surname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurname(String value) {
        this.surname = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the middleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Sets the value of the middleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleName(String value) {
        this.middleName = value;
    }

    /**
     * Gets the value of the surnameAtBirth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurnameAtBirth() {
        return surnameAtBirth;
    }

    /**
     * Sets the value of the surnameAtBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurnameAtBirth(String value) {
        this.surnameAtBirth = value;
    }

    /**
     * Gets the value of the fullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Sets the value of the fullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullName(String value) {
        this.fullName = value;
    }

}
