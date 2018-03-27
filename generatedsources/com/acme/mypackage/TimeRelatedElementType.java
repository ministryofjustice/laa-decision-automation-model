
package com.acme.mypackage;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TimeRelatedElementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimeRelatedElementType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AwardType" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C50" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C240" minOccurs="0"/&gt;
 *         &lt;element name="Amount" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}Amount"/&gt;
 *         &lt;element name="AwardTrigeringEvent" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C240"/&gt;
 *         &lt;element name="AwardDate" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}Dt" minOccurs="0"/&gt;
 *         &lt;element name="OtherDetails" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C240" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeRelatedElementType", propOrder = {
    "awardType",
    "description",
    "amount",
    "awardTrigeringEvent",
    "awardDate",
    "otherDetails"
})
public class TimeRelatedElementType {

    @XmlElement(name = "AwardType")
    protected String awardType;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Amount", required = true)
    protected BigDecimal amount;
    @XmlElement(name = "AwardTrigeringEvent", required = true)
    protected String awardTrigeringEvent;
    @XmlElement(name = "AwardDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar awardDate;
    @XmlElement(name = "OtherDetails")
    protected String otherDetails;

    /**
     * Gets the value of the awardType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAwardType() {
        return awardType;
    }

    /**
     * Sets the value of the awardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAwardType(String value) {
        this.awardType = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

    /**
     * Gets the value of the awardTrigeringEvent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAwardTrigeringEvent() {
        return awardTrigeringEvent;
    }

    /**
     * Sets the value of the awardTrigeringEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAwardTrigeringEvent(String value) {
        this.awardTrigeringEvent = value;
    }

    /**
     * Gets the value of the awardDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAwardDate() {
        return awardDate;
    }

    /**
     * Sets the value of the awardDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAwardDate(XMLGregorianCalendar value) {
        this.awardDate = value;
    }

    /**
     * Gets the value of the otherDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherDetails() {
        return otherDetails;
    }

    /**
     * Sets the value of the otherDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherDetails(String value) {
        this.otherDetails = value;
    }

}
