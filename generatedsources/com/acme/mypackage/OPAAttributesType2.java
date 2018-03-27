
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
 *         &lt;element name="Name" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C50"/&gt;
 *         &lt;element name="Value" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C2000" minOccurs="0"/&gt;
 *         &lt;element name="Type" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C50" minOccurs="0"/&gt;
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
@XmlType(name = "OPAAttributesType", propOrder = {
    "name",
    "value",
    "type",
    "userDefinedInd"
})
public class OPAAttributesType2 {

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Value")
    protected String value;
    @XmlElement(name = "Type")
    protected String type;
    @XmlElement(name = "UserDefinedInd")
    protected Boolean userDefinedInd;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
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
