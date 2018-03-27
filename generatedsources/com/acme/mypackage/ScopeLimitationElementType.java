
package com.acme.mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ScopeLimitationElementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ScopeLimitationElementType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ScopeLimitationID" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}ID15" minOccurs="0"/&gt;
 *         &lt;element name="ScopeLimitation" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}LOV"/&gt;
 *         &lt;element name="ScopeLimitationWording" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C1000" minOccurs="0"/&gt;
 *         &lt;element name="DelegatedFunctionsApply" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}BooleanString" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScopeLimitationElementType", propOrder = {
    "scopeLimitationID",
    "scopeLimitation",
    "scopeLimitationWording",
    "delegatedFunctionsApply"
})
public class ScopeLimitationElementType {

    @XmlElement(name = "ScopeLimitationID")
    protected String scopeLimitationID;
    @XmlElement(name = "ScopeLimitation", required = true)
    protected String scopeLimitation;
    @XmlElement(name = "ScopeLimitationWording")
    protected String scopeLimitationWording;
    @XmlElement(name = "DelegatedFunctionsApply")
    protected Boolean delegatedFunctionsApply;

    /**
     * Gets the value of the scopeLimitationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScopeLimitationID() {
        return scopeLimitationID;
    }

    /**
     * Sets the value of the scopeLimitationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScopeLimitationID(String value) {
        this.scopeLimitationID = value;
    }

    /**
     * Gets the value of the scopeLimitation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScopeLimitation() {
        return scopeLimitation;
    }

    /**
     * Sets the value of the scopeLimitation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScopeLimitation(String value) {
        this.scopeLimitation = value;
    }

    /**
     * Gets the value of the scopeLimitationWording property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScopeLimitationWording() {
        return scopeLimitationWording;
    }

    /**
     * Sets the value of the scopeLimitationWording property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScopeLimitationWording(String value) {
        this.scopeLimitationWording = value;
    }

    /**
     * Gets the value of the delegatedFunctionsApply property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDelegatedFunctionsApply() {
        return delegatedFunctionsApply;
    }

    /**
     * Sets the value of the delegatedFunctionsApply property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDelegatedFunctionsApply(Boolean value) {
        this.delegatedFunctionsApply = value;
    }

}
