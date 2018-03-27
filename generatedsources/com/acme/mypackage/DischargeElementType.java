
package com.acme.mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DischargeElementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DischargeElementType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Reason" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C240" minOccurs="0"/&gt;
 *         &lt;element name="ClientContinuePvtInd" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}BooleanString" minOccurs="0"/&gt;
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
@XmlType(name = "DischargeElementType", propOrder = {
    "reason",
    "clientContinuePvtInd",
    "otherDetails"
})
public class DischargeElementType {

    @XmlElement(name = "Reason")
    protected String reason;
    @XmlElement(name = "ClientContinuePvtInd")
    protected Boolean clientContinuePvtInd;
    @XmlElement(name = "OtherDetails")
    protected String otherDetails;

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason(String value) {
        this.reason = value;
    }

    /**
     * Gets the value of the clientContinuePvtInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isClientContinuePvtInd() {
        return clientContinuePvtInd;
    }

    /**
     * Sets the value of the clientContinuePvtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setClientContinuePvtInd(Boolean value) {
        this.clientContinuePvtInd = value;
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
