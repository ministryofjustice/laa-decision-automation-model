
package com.acme.mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for User complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="User"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UserLoginID" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}ID100" minOccurs="0"/&gt;
 *         &lt;element name="UserName" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C100" minOccurs="0"/&gt;
 *         &lt;element name="UserType" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C25" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "User", namespace = "http://legalservices.gov.uk/Enterprise/Common/1.0/Common", propOrder = {
    "userLoginID",
    "userName",
    "userType"
})
public class User {

    @XmlElement(name = "UserLoginID")
    protected String userLoginID;
    @XmlElement(name = "UserName")
    protected String userName;
    @XmlElement(name = "UserType")
    protected String userType;

    /**
     * Gets the value of the userLoginID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserLoginID() {
        return userLoginID;
    }

    /**
     * Sets the value of the userLoginID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserLoginID(String value) {
        this.userLoginID = value;
    }

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * Gets the value of the userType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserType() {
        return userType;
    }

    /**
     * Sets the value of the userType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserType(String value) {
        this.userType = value;
    }

}
