
package com.acme.mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OPAAttributesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OPAAttributesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Attribute" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C50"/&gt;
 *         &lt;element name="Caption" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C1000" minOccurs="0"/&gt;
 *         &lt;element name="ResponseType" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}LOV"/&gt;
 *         &lt;element name="ResponseValue" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C8000" minOccurs="0"/&gt;
 *         &lt;element name="ResponseText" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C2000" minOccurs="0"/&gt;
 *         &lt;element name="UserDefinedInd" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}BooleanString" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OPAAttributesType", namespace = "http://legalservices.gov.uk/Enterprise/Common/1.0/Common", propOrder = {
    "attribute",
    "caption",
    "responseType",
    "responseValue",
    "responseText",
    "userDefinedInd"
})
public class OPAAttributesType3 {

    @XmlElement(name = "Attribute", required = true)
    protected String attribute;
    @XmlElement(name = "Caption")
    protected String caption;
    @XmlElement(name = "ResponseType", required = true)
    protected String responseType;
    @XmlElement(name = "ResponseValue")
    protected String responseValue;
    @XmlElement(name = "ResponseText")
    protected String responseText;
    @XmlElement(name = "UserDefinedInd")
    protected Boolean userDefinedInd;

    /**
     * Gets the value of the attribute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttribute() {
        return attribute;
    }

    /**
     * Sets the value of the attribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttribute(String value) {
        this.attribute = value;
    }

    /**
     * Gets the value of the caption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaption() {
        return caption;
    }

    /**
     * Sets the value of the caption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaption(String value) {
        this.caption = value;
    }

    /**
     * Gets the value of the responseType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseType() {
        return responseType;
    }

    /**
     * Sets the value of the responseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseType(String value) {
        this.responseType = value;
    }

    /**
     * Gets the value of the responseValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseValue() {
        return responseValue;
    }

    /**
     * Sets the value of the responseValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseValue(String value) {
        this.responseValue = value;
    }

    /**
     * Gets the value of the responseText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseText() {
        return responseText;
    }

    /**
     * Sets the value of the responseText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseText(String value) {
        this.responseText = value;
    }

    /**
     * Gets the value of the userDefinedInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUserDefinedInd() {
        return userDefinedInd;
    }

    /**
     * Sets the value of the userDefinedInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUserDefinedInd(Boolean value) {
        this.userDefinedInd = value;
    }

}
