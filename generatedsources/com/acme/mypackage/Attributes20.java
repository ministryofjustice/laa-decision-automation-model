
package com.acme.mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * DFF Attributes 1 to 20 in e-Business Suite
 * 
 * <p>Java class for Attributes20 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Attributes20"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AttributeCategory" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C30" minOccurs="0"/&gt;
 *         &lt;element name="Attribute1" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C150" minOccurs="0"/&gt;
 *         &lt;element name="Attribute2" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C150" minOccurs="0"/&gt;
 *         &lt;element name="Attribute3" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C150" minOccurs="0"/&gt;
 *         &lt;element name="Attribute4" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C150" minOccurs="0"/&gt;
 *         &lt;element name="Attribute5" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C150" minOccurs="0"/&gt;
 *         &lt;element name="Attribute6" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C150" minOccurs="0"/&gt;
 *         &lt;element name="Attribute7" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C150" minOccurs="0"/&gt;
 *         &lt;element name="Attribute8" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C150" minOccurs="0"/&gt;
 *         &lt;element name="Attribute9" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C150" minOccurs="0"/&gt;
 *         &lt;element name="Attribute10" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C150" minOccurs="0"/&gt;
 *         &lt;element name="Attribute11" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C150" minOccurs="0"/&gt;
 *         &lt;element name="Attribute12" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C150" minOccurs="0"/&gt;
 *         &lt;element name="Attribute13" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C150" minOccurs="0"/&gt;
 *         &lt;element name="Attribute14" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C150" minOccurs="0"/&gt;
 *         &lt;element name="Attribute15" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C150" minOccurs="0"/&gt;
 *         &lt;element name="Attribute16" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C150" minOccurs="0"/&gt;
 *         &lt;element name="Attribute17" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C150" minOccurs="0"/&gt;
 *         &lt;element name="Attribute18" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C150" minOccurs="0"/&gt;
 *         &lt;element name="Attribute19" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C150" minOccurs="0"/&gt;
 *         &lt;element name="Attribute20" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C150" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Attributes20", namespace = "http://legalservices.gov.uk/Enterprise/Common/1.0/Common", propOrder = {
    "attributeCategory",
    "attribute1",
    "attribute2",
    "attribute3",
    "attribute4",
    "attribute5",
    "attribute6",
    "attribute7",
    "attribute8",
    "attribute9",
    "attribute10",
    "attribute11",
    "attribute12",
    "attribute13",
    "attribute14",
    "attribute15",
    "attribute16",
    "attribute17",
    "attribute18",
    "attribute19",
    "attribute20"
})
public class Attributes20 {

    @XmlElement(name = "AttributeCategory")
    protected String attributeCategory;
    @XmlElement(name = "Attribute1")
    protected String attribute1;
    @XmlElement(name = "Attribute2")
    protected String attribute2;
    @XmlElement(name = "Attribute3")
    protected String attribute3;
    @XmlElement(name = "Attribute4")
    protected String attribute4;
    @XmlElement(name = "Attribute5")
    protected String attribute5;
    @XmlElement(name = "Attribute6")
    protected String attribute6;
    @XmlElement(name = "Attribute7")
    protected String attribute7;
    @XmlElement(name = "Attribute8")
    protected String attribute8;
    @XmlElement(name = "Attribute9")
    protected String attribute9;
    @XmlElement(name = "Attribute10")
    protected String attribute10;
    @XmlElement(name = "Attribute11")
    protected String attribute11;
    @XmlElement(name = "Attribute12")
    protected String attribute12;
    @XmlElement(name = "Attribute13")
    protected String attribute13;
    @XmlElement(name = "Attribute14")
    protected String attribute14;
    @XmlElement(name = "Attribute15")
    protected String attribute15;
    @XmlElement(name = "Attribute16")
    protected String attribute16;
    @XmlElement(name = "Attribute17")
    protected String attribute17;
    @XmlElement(name = "Attribute18")
    protected String attribute18;
    @XmlElement(name = "Attribute19")
    protected String attribute19;
    @XmlElement(name = "Attribute20")
    protected String attribute20;

    /**
     * Gets the value of the attributeCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttributeCategory() {
        return attributeCategory;
    }

    /**
     * Sets the value of the attributeCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttributeCategory(String value) {
        this.attributeCategory = value;
    }

    /**
     * Gets the value of the attribute1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttribute1() {
        return attribute1;
    }

    /**
     * Sets the value of the attribute1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttribute1(String value) {
        this.attribute1 = value;
    }

    /**
     * Gets the value of the attribute2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttribute2() {
        return attribute2;
    }

    /**
     * Sets the value of the attribute2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttribute2(String value) {
        this.attribute2 = value;
    }

    /**
     * Gets the value of the attribute3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttribute3() {
        return attribute3;
    }

    /**
     * Sets the value of the attribute3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttribute3(String value) {
        this.attribute3 = value;
    }

    /**
     * Gets the value of the attribute4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttribute4() {
        return attribute4;
    }

    /**
     * Sets the value of the attribute4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttribute4(String value) {
        this.attribute4 = value;
    }

    /**
     * Gets the value of the attribute5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttribute5() {
        return attribute5;
    }

    /**
     * Sets the value of the attribute5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttribute5(String value) {
        this.attribute5 = value;
    }

    /**
     * Gets the value of the attribute6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttribute6() {
        return attribute6;
    }

    /**
     * Sets the value of the attribute6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttribute6(String value) {
        this.attribute6 = value;
    }

    /**
     * Gets the value of the attribute7 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttribute7() {
        return attribute7;
    }

    /**
     * Sets the value of the attribute7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttribute7(String value) {
        this.attribute7 = value;
    }

    /**
     * Gets the value of the attribute8 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttribute8() {
        return attribute8;
    }

    /**
     * Sets the value of the attribute8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttribute8(String value) {
        this.attribute8 = value;
    }

    /**
     * Gets the value of the attribute9 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttribute9() {
        return attribute9;
    }

    /**
     * Sets the value of the attribute9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttribute9(String value) {
        this.attribute9 = value;
    }

    /**
     * Gets the value of the attribute10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttribute10() {
        return attribute10;
    }

    /**
     * Sets the value of the attribute10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttribute10(String value) {
        this.attribute10 = value;
    }

    /**
     * Gets the value of the attribute11 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttribute11() {
        return attribute11;
    }

    /**
     * Sets the value of the attribute11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttribute11(String value) {
        this.attribute11 = value;
    }

    /**
     * Gets the value of the attribute12 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttribute12() {
        return attribute12;
    }

    /**
     * Sets the value of the attribute12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttribute12(String value) {
        this.attribute12 = value;
    }

    /**
     * Gets the value of the attribute13 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttribute13() {
        return attribute13;
    }

    /**
     * Sets the value of the attribute13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttribute13(String value) {
        this.attribute13 = value;
    }

    /**
     * Gets the value of the attribute14 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttribute14() {
        return attribute14;
    }

    /**
     * Sets the value of the attribute14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttribute14(String value) {
        this.attribute14 = value;
    }

    /**
     * Gets the value of the attribute15 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttribute15() {
        return attribute15;
    }

    /**
     * Sets the value of the attribute15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttribute15(String value) {
        this.attribute15 = value;
    }

    /**
     * Gets the value of the attribute16 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttribute16() {
        return attribute16;
    }

    /**
     * Sets the value of the attribute16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttribute16(String value) {
        this.attribute16 = value;
    }

    /**
     * Gets the value of the attribute17 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttribute17() {
        return attribute17;
    }

    /**
     * Sets the value of the attribute17 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttribute17(String value) {
        this.attribute17 = value;
    }

    /**
     * Gets the value of the attribute18 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttribute18() {
        return attribute18;
    }

    /**
     * Sets the value of the attribute18 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttribute18(String value) {
        this.attribute18 = value;
    }

    /**
     * Gets the value of the attribute19 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttribute19() {
        return attribute19;
    }

    /**
     * Sets the value of the attribute19 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttribute19(String value) {
        this.attribute19 = value;
    }

    /**
     * Gets the value of the attribute20 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttribute20() {
        return attribute20;
    }

    /**
     * Sets the value of the attribute20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttribute20(String value) {
        this.attribute20 = value;
    }

}
