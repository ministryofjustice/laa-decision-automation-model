
package com.acme.mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns:common="http://legalservices.gov.uk/Enterprise/Common/1.0/Common" xmlns:header="http://legalservices.gov.uk/Enterprise/Common/1.0/Header" xmlns:lang="en" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Status of the operation&lt;/Definition&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ChangeDescription xmlns:common="http://legalservices.gov.uk/Enterprise/Common/1.0/Common" xmlns:header="http://legalservices.gov.uk/Enterprise/Common/1.0/Header" xmlns:lang="en" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Initial&lt;/ChangeDescription&gt;
 * </pre>
 * 
 * 
 * <p>Java class for Status complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Status"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Status" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Header}StatusTextType"/&gt;
 *         &lt;element name="StatusFreeText" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C50"/&gt;
 *         &lt;element name="Exceptions" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Header}Exceptions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Status", namespace = "http://legalservices.gov.uk/Enterprise/Common/1.0/Header", propOrder = {
    "status",
    "statusFreeText",
    "exceptions"
})
public class Status {

    @XmlElement(name = "Status", required = true)
    @XmlSchemaType(name = "string")
    protected StatusTextType status;
    @XmlElement(name = "StatusFreeText", required = true)
    protected String statusFreeText;
    @XmlElement(name = "Exceptions")
    protected Exceptions exceptions;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link StatusTextType }
     *     
     */
    public StatusTextType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusTextType }
     *     
     */
    public void setStatus(StatusTextType value) {
        this.status = value;
    }

    /**
     * Gets the value of the statusFreeText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusFreeText() {
        return statusFreeText;
    }

    /**
     * Sets the value of the statusFreeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusFreeText(String value) {
        this.statusFreeText = value;
    }

    /**
     * Gets the value of the exceptions property.
     * 
     * @return
     *     possible object is
     *     {@link Exceptions }
     *     
     */
    public Exceptions getExceptions() {
        return exceptions;
    }

    /**
     * Sets the value of the exceptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Exceptions }
     *     
     */
    public void setExceptions(Exceptions value) {
        this.exceptions = value;
    }

}
