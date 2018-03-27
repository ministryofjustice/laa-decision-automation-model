
package com.acme.mypackage;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OPAEntityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OPAEntityType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SequenceNumber" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}Integer"/&gt;
 *         &lt;element name="EntityName" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C50"/&gt;
 *         &lt;element name="Caption" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C1000" minOccurs="0"/&gt;
 *         &lt;element name="Instances" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}OPAInstanceType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OPAEntityType", namespace = "http://legalservices.gov.uk/Enterprise/Common/1.0/Common", propOrder = {
    "sequenceNumber",
    "entityName",
    "caption",
    "instances"
})
public class OPAEntityType3 {

    @XmlElement(name = "SequenceNumber", required = true)
    protected BigInteger sequenceNumber;
    @XmlElement(name = "EntityName", required = true)
    protected String entityName;
    @XmlElement(name = "Caption")
    protected String caption;
    @XmlElement(name = "Instances", required = true)
    protected List<OPAInstanceType3> instances;

    /**
     * Gets the value of the sequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Sets the value of the sequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSequenceNumber(BigInteger value) {
        this.sequenceNumber = value;
    }

    /**
     * Gets the value of the entityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityName() {
        return entityName;
    }

    /**
     * Sets the value of the entityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityName(String value) {
        this.entityName = value;
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
     * Gets the value of the instances property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the instances property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstances().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OPAInstanceType3 }
     * 
     * 
     */
    public List<OPAInstanceType3> getInstances() {
        if (instances == null) {
            instances = new ArrayList<OPAInstanceType3>();
        }
        return this.instances;
    }

}
