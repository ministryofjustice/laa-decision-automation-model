
package com.acme.mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This type represents a username token per Section 4.1
 * 
 * <p>Java class for UsernameTokenType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UsernameTokenType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Username" type="{http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd}AttributedString"/&gt;
 *         &lt;element name="Password" type="{http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd}PasswordString"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UsernameTokenType", namespace = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", propOrder = {
    "username",
    "password"
})
public class UsernameTokenType {

    @XmlElement(name = "Username", required = true)
    protected AttributedString username;
    @XmlElement(name = "Password", required = true)
    protected PasswordString password;

    /**
     * Gets the value of the username property.
     * 
     * @return
     *     possible object is
     *     {@link AttributedString }
     *     
     */
    public AttributedString getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributedString }
     *     
     */
    public void setUsername(AttributedString value) {
        this.username = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link PasswordString }
     *     
     */
    public PasswordString getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link PasswordString }
     *     
     */
    public void setPassword(PasswordString value) {
        this.password = value;
    }

}
