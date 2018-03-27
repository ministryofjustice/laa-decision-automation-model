
package com.acme.mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LARDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LARDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LARScopeFlag" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}Boolean" minOccurs="0"/&gt;
 *         &lt;element name="LegalHelpOfficeCode" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C30" minOccurs="0"/&gt;
 *         &lt;element name="LegalHelpUFN" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C30" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LARDetails", propOrder = {
    "larScopeFlag",
    "legalHelpOfficeCode",
    "legalHelpUFN"
})
public class LARDetails {

    @XmlElement(name = "LARScopeFlag")
    protected Boolean larScopeFlag;
    @XmlElement(name = "LegalHelpOfficeCode")
    protected String legalHelpOfficeCode;
    @XmlElement(name = "LegalHelpUFN")
    protected String legalHelpUFN;

    /**
     * Gets the value of the larScopeFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLARScopeFlag() {
        return larScopeFlag;
    }

    /**
     * Sets the value of the larScopeFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLARScopeFlag(Boolean value) {
        this.larScopeFlag = value;
    }

    /**
     * Gets the value of the legalHelpOfficeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegalHelpOfficeCode() {
        return legalHelpOfficeCode;
    }

    /**
     * Sets the value of the legalHelpOfficeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalHelpOfficeCode(String value) {
        this.legalHelpOfficeCode = value;
    }

    /**
     * Gets the value of the legalHelpUFN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegalHelpUFN() {
        return legalHelpUFN;
    }

    /**
     * Sets the value of the legalHelpUFN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalHelpUFN(String value) {
        this.legalHelpUFN = value;
    }

}
