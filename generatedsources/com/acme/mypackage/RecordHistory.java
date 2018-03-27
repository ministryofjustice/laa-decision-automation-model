
package com.acme.mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Record History
 * 
 * <p>Java class for RecordHistory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecordHistory"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CreatedBy" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}User" minOccurs="0"/&gt;
 *         &lt;element name="DateCreated" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}DtTm"/&gt;
 *         &lt;element name="LastUpdatedBy" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}User" minOccurs="0"/&gt;
 *         &lt;element name="DateLastUpdated" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}DtTm"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecordHistory", namespace = "http://legalservices.gov.uk/Enterprise/Common/1.0/Common", propOrder = {
    "createdBy",
    "dateCreated",
    "lastUpdatedBy",
    "dateLastUpdated"
})
public class RecordHistory {

    @XmlElement(name = "CreatedBy")
    protected User createdBy;
    @XmlElement(name = "DateCreated", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateCreated;
    @XmlElement(name = "LastUpdatedBy")
    protected User lastUpdatedBy;
    @XmlElement(name = "DateLastUpdated", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateLastUpdated;

    /**
     * Gets the value of the createdBy property.
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getCreatedBy() {
        return createdBy;
    }

    /**
     * Sets the value of the createdBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setCreatedBy(User value) {
        this.createdBy = value;
    }

    /**
     * Gets the value of the dateCreated property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateCreated() {
        return dateCreated;
    }

    /**
     * Sets the value of the dateCreated property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateCreated(XMLGregorianCalendar value) {
        this.dateCreated = value;
    }

    /**
     * Gets the value of the lastUpdatedBy property.
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    /**
     * Sets the value of the lastUpdatedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setLastUpdatedBy(User value) {
        this.lastUpdatedBy = value;
    }

    /**
     * Gets the value of the dateLastUpdated property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateLastUpdated() {
        return dateLastUpdated;
    }

    /**
     * Sets the value of the dateLastUpdated property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateLastUpdated(XMLGregorianCalendar value) {
        this.dateLastUpdated = value;
    }

}
