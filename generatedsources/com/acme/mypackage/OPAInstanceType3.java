
package com.acme.mypackage;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OPAInstanceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OPAInstanceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InstanceLabel" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C255"/&gt;
 *         &lt;element name="Caption" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C1000" minOccurs="0"/&gt;
 *         &lt;element name="Attributes"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Attribute" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}OPAAttributesType" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OPAInstanceType", namespace = "http://legalservices.gov.uk/Enterprise/Common/1.0/Common", propOrder = {
    "instanceLabel",
    "caption",
    "attributes"
})
public class OPAInstanceType3 {

    @XmlElement(name = "InstanceLabel", required = true)
    protected String instanceLabel;
    @XmlElement(name = "Caption")
    protected String caption;
    @XmlElement(name = "Attributes", required = true)
    protected OPAInstanceType3 .Attributes attributes;

    /**
     * Gets the value of the instanceLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstanceLabel() {
        return instanceLabel;
    }

    /**
     * Sets the value of the instanceLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstanceLabel(String value) {
        this.instanceLabel = value;
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
     * Gets the value of the attributes property.
     * 
     * @return
     *     possible object is
     *     {@link OPAInstanceType3 .Attributes }
     *     
     */
    public OPAInstanceType3 .Attributes getAttributes() {
        return attributes;
    }

    /**
     * Sets the value of the attributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link OPAInstanceType3 .Attributes }
     *     
     */
    public void setAttributes(OPAInstanceType3 .Attributes value) {
        this.attributes = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Attribute" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}OPAAttributesType" maxOccurs="unbounded"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "attribute"
    })
    public static class Attributes {

        @XmlElement(name = "Attribute", namespace = "http://legalservices.gov.uk/Enterprise/Common/1.0/Common", required = true)
        protected List<OPAAttributesType3> attribute;

        /**
         * Gets the value of the attribute property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the attribute property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAttribute().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OPAAttributesType3 }
         * 
         * 
         */
        public List<OPAAttributesType3> getAttribute() {
            if (attribute == null) {
                attribute = new ArrayList<OPAAttributesType3>();
            }
            return this.attribute;
        }

    }

}
