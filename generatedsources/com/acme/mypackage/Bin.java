
package com.acme.mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The base type for Binaries
 * 
 * <p>Java class for Bin complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Bin"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BinContentType" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}BinContentType"/&gt;
 *         &lt;element name="BinLength" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}BinLength"/&gt;
 *         &lt;element name="BinData" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}BinData"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Bin", namespace = "http://legalservices.gov.uk/Enterprise/Common/1.0/Common", propOrder = {
    "binContentType",
    "binLength",
    "binData"
})
public class Bin {

    @XmlElement(name = "BinContentType", required = true)
    protected String binContentType;
    @XmlElement(name = "BinLength")
    protected long binLength;
    @XmlElement(name = "BinData", required = true)
    protected byte[] binData;

    /**
     * Gets the value of the binContentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBinContentType() {
        return binContentType;
    }

    /**
     * Sets the value of the binContentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBinContentType(String value) {
        this.binContentType = value;
    }

    /**
     * Gets the value of the binLength property.
     * 
     */
    public long getBinLength() {
        return binLength;
    }

    /**
     * Sets the value of the binLength property.
     * 
     */
    public void setBinLength(long value) {
        this.binLength = value;
    }

    /**
     * Gets the value of the binData property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getBinData() {
        return binData;
    }

    /**
     * Sets the value of the binData property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setBinData(byte[] value) {
        this.binData = value;
    }

}
