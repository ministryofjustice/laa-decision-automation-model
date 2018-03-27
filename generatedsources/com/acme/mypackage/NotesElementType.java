
package com.acme.mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for NotesElementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotesElementType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NotesID" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}ID15" minOccurs="0"/&gt;
 *         &lt;element name="User" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}User" minOccurs="0"/&gt;
 *         &lt;element name="Date" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}Dt" minOccurs="0"/&gt;
 *         &lt;element name="Message" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C2000"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotesElementType", propOrder = {
    "notesID",
    "user",
    "date",
    "message"
})
public class NotesElementType {

    @XmlElement(name = "NotesID")
    protected String notesID;
    @XmlElement(name = "User")
    protected User user;
    @XmlElement(name = "Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar date;
    @XmlElement(name = "Message", required = true)
    protected String message;

    /**
     * Gets the value of the notesID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotesID() {
        return notesID;
    }

    /**
     * Sets the value of the notesID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotesID(String value) {
        this.notesID = value;
    }

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setUser(User value) {
        this.user = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

}
