
package com.acme.mypackage;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns:common="http://legalservices.gov.uk/Enterprise/Common/1.0/Common" xmlns:header="http://legalservices.gov.uk/Enterprise/Common/1.0/Header" xmlns:lang="en" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Exceptions&lt;/Definition&gt;
 * </pre>
 * 
 * 
 * <p>Java class for Exceptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Exceptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ObjectPath"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C150"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="StatusCode"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}Integer"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="StatusText" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C150"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AdditionalStatus" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Header}Exceptions" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Exceptions", namespace = "http://legalservices.gov.uk/Enterprise/Common/1.0/Header", propOrder = {
    "objectPath",
    "statusCode",
    "statusText",
    "additionalStatus"
})
public class Exceptions {

    @XmlElement(name = "ObjectPath", required = true)
    protected String objectPath;
    @XmlElement(name = "StatusCode", required = true)
    protected BigInteger statusCode;
    @XmlElement(name = "StatusText")
    protected String statusText;
    @XmlElement(name = "AdditionalStatus")
    protected List<Exceptions> additionalStatus;

    /**
     * Gets the value of the objectPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectPath() {
        return objectPath;
    }

    /**
     * Sets the value of the objectPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectPath(String value) {
        this.objectPath = value;
    }

    /**
     * Gets the value of the statusCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStatusCode() {
        return statusCode;
    }

    /**
     * Sets the value of the statusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStatusCode(BigInteger value) {
        this.statusCode = value;
    }

    /**
     * Gets the value of the statusText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusText() {
        return statusText;
    }

    /**
     * Sets the value of the statusText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusText(String value) {
        this.statusText = value;
    }

    /**
     * Gets the value of the additionalStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Exceptions }
     * 
     * 
     */
    public List<Exceptions> getAdditionalStatus() {
        if (additionalStatus == null) {
            additionalStatus = new ArrayList<Exceptions>();
        }
        return this.additionalStatus;
    }

}
