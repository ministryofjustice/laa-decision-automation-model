
package com.acme.mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * GlobalAttribute structure
 * 
 * <p>Java class for GlobalAttributes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GlobalAttributes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GlobalAttributeCategory" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C30" minOccurs="0"/&gt;
 *         &lt;element name="GlobalAttribute1" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C150" minOccurs="0"/&gt;
 *         &lt;element name="GlobalAttribute2" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C150" minOccurs="0"/&gt;
 *         &lt;element name="GlobalAttribute3" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C150" minOccurs="0"/&gt;
 *         &lt;element name="GlobalAttribute4" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C150" minOccurs="0"/&gt;
 *         &lt;element name="GlobalAttribute5" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C150" minOccurs="0"/&gt;
 *         &lt;element name="GlobalAttribute6" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C150" minOccurs="0"/&gt;
 *         &lt;element name="GlobalAttribute7" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C150" minOccurs="0"/&gt;
 *         &lt;element name="GlobalAttribute8" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C150" minOccurs="0"/&gt;
 *         &lt;element name="GlobalAttribute9" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C150" minOccurs="0"/&gt;
 *         &lt;element name="GlobalAttribute10" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C150" minOccurs="0"/&gt;
 *         &lt;element name="GlobalAttribute11" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C150" minOccurs="0"/&gt;
 *         &lt;element name="GlobalAttribute12" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C150" minOccurs="0"/&gt;
 *         &lt;element name="GlobalAttribute13" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C150" minOccurs="0"/&gt;
 *         &lt;element name="GlobalAttribute14" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C150" minOccurs="0"/&gt;
 *         &lt;element name="GlobalAttribute15" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C150" minOccurs="0"/&gt;
 *         &lt;element name="GlobalAttribute16" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C150" minOccurs="0"/&gt;
 *         &lt;element name="GlobalAttribute17" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C150" minOccurs="0"/&gt;
 *         &lt;element name="GlobalAttribute18" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C150" minOccurs="0"/&gt;
 *         &lt;element name="GlobalAttribute19" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C150" minOccurs="0"/&gt;
 *         &lt;element name="GlobalAttribute20" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C150" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GlobalAttributes", namespace = "http://legalservices.gov.uk/Enterprise/Common/1.0/Common", propOrder = {
    "globalAttributeCategory",
    "globalAttribute1",
    "globalAttribute2",
    "globalAttribute3",
    "globalAttribute4",
    "globalAttribute5",
    "globalAttribute6",
    "globalAttribute7",
    "globalAttribute8",
    "globalAttribute9",
    "globalAttribute10",
    "globalAttribute11",
    "globalAttribute12",
    "globalAttribute13",
    "globalAttribute14",
    "globalAttribute15",
    "globalAttribute16",
    "globalAttribute17",
    "globalAttribute18",
    "globalAttribute19",
    "globalAttribute20"
})
public class GlobalAttributes {

    @XmlElement(name = "GlobalAttributeCategory")
    protected String globalAttributeCategory;
    @XmlElement(name = "GlobalAttribute1")
    protected String globalAttribute1;
    @XmlElement(name = "GlobalAttribute2")
    protected String globalAttribute2;
    @XmlElement(name = "GlobalAttribute3")
    protected String globalAttribute3;
    @XmlElement(name = "GlobalAttribute4")
    protected String globalAttribute4;
    @XmlElement(name = "GlobalAttribute5")
    protected String globalAttribute5;
    @XmlElement(name = "GlobalAttribute6")
    protected String globalAttribute6;
    @XmlElement(name = "GlobalAttribute7")
    protected String globalAttribute7;
    @XmlElement(name = "GlobalAttribute8")
    protected String globalAttribute8;
    @XmlElement(name = "GlobalAttribute9")
    protected String globalAttribute9;
    @XmlElement(name = "GlobalAttribute10")
    protected String globalAttribute10;
    @XmlElement(name = "GlobalAttribute11")
    protected String globalAttribute11;
    @XmlElement(name = "GlobalAttribute12")
    protected String globalAttribute12;
    @XmlElement(name = "GlobalAttribute13")
    protected String globalAttribute13;
    @XmlElement(name = "GlobalAttribute14")
    protected String globalAttribute14;
    @XmlElement(name = "GlobalAttribute15")
    protected String globalAttribute15;
    @XmlElement(name = "GlobalAttribute16")
    protected String globalAttribute16;
    @XmlElement(name = "GlobalAttribute17")
    protected String globalAttribute17;
    @XmlElement(name = "GlobalAttribute18")
    protected String globalAttribute18;
    @XmlElement(name = "GlobalAttribute19")
    protected String globalAttribute19;
    @XmlElement(name = "GlobalAttribute20")
    protected String globalAttribute20;

    /**
     * Gets the value of the globalAttributeCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlobalAttributeCategory() {
        return globalAttributeCategory;
    }

    /**
     * Sets the value of the globalAttributeCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlobalAttributeCategory(String value) {
        this.globalAttributeCategory = value;
    }

    /**
     * Gets the value of the globalAttribute1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlobalAttribute1() {
        return globalAttribute1;
    }

    /**
     * Sets the value of the globalAttribute1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlobalAttribute1(String value) {
        this.globalAttribute1 = value;
    }

    /**
     * Gets the value of the globalAttribute2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlobalAttribute2() {
        return globalAttribute2;
    }

    /**
     * Sets the value of the globalAttribute2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlobalAttribute2(String value) {
        this.globalAttribute2 = value;
    }

    /**
     * Gets the value of the globalAttribute3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlobalAttribute3() {
        return globalAttribute3;
    }

    /**
     * Sets the value of the globalAttribute3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlobalAttribute3(String value) {
        this.globalAttribute3 = value;
    }

    /**
     * Gets the value of the globalAttribute4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlobalAttribute4() {
        return globalAttribute4;
    }

    /**
     * Sets the value of the globalAttribute4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlobalAttribute4(String value) {
        this.globalAttribute4 = value;
    }

    /**
     * Gets the value of the globalAttribute5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlobalAttribute5() {
        return globalAttribute5;
    }

    /**
     * Sets the value of the globalAttribute5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlobalAttribute5(String value) {
        this.globalAttribute5 = value;
    }

    /**
     * Gets the value of the globalAttribute6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlobalAttribute6() {
        return globalAttribute6;
    }

    /**
     * Sets the value of the globalAttribute6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlobalAttribute6(String value) {
        this.globalAttribute6 = value;
    }

    /**
     * Gets the value of the globalAttribute7 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlobalAttribute7() {
        return globalAttribute7;
    }

    /**
     * Sets the value of the globalAttribute7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlobalAttribute7(String value) {
        this.globalAttribute7 = value;
    }

    /**
     * Gets the value of the globalAttribute8 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlobalAttribute8() {
        return globalAttribute8;
    }

    /**
     * Sets the value of the globalAttribute8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlobalAttribute8(String value) {
        this.globalAttribute8 = value;
    }

    /**
     * Gets the value of the globalAttribute9 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlobalAttribute9() {
        return globalAttribute9;
    }

    /**
     * Sets the value of the globalAttribute9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlobalAttribute9(String value) {
        this.globalAttribute9 = value;
    }

    /**
     * Gets the value of the globalAttribute10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlobalAttribute10() {
        return globalAttribute10;
    }

    /**
     * Sets the value of the globalAttribute10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlobalAttribute10(String value) {
        this.globalAttribute10 = value;
    }

    /**
     * Gets the value of the globalAttribute11 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlobalAttribute11() {
        return globalAttribute11;
    }

    /**
     * Sets the value of the globalAttribute11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlobalAttribute11(String value) {
        this.globalAttribute11 = value;
    }

    /**
     * Gets the value of the globalAttribute12 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlobalAttribute12() {
        return globalAttribute12;
    }

    /**
     * Sets the value of the globalAttribute12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlobalAttribute12(String value) {
        this.globalAttribute12 = value;
    }

    /**
     * Gets the value of the globalAttribute13 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlobalAttribute13() {
        return globalAttribute13;
    }

    /**
     * Sets the value of the globalAttribute13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlobalAttribute13(String value) {
        this.globalAttribute13 = value;
    }

    /**
     * Gets the value of the globalAttribute14 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlobalAttribute14() {
        return globalAttribute14;
    }

    /**
     * Sets the value of the globalAttribute14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlobalAttribute14(String value) {
        this.globalAttribute14 = value;
    }

    /**
     * Gets the value of the globalAttribute15 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlobalAttribute15() {
        return globalAttribute15;
    }

    /**
     * Sets the value of the globalAttribute15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlobalAttribute15(String value) {
        this.globalAttribute15 = value;
    }

    /**
     * Gets the value of the globalAttribute16 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlobalAttribute16() {
        return globalAttribute16;
    }

    /**
     * Sets the value of the globalAttribute16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlobalAttribute16(String value) {
        this.globalAttribute16 = value;
    }

    /**
     * Gets the value of the globalAttribute17 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlobalAttribute17() {
        return globalAttribute17;
    }

    /**
     * Sets the value of the globalAttribute17 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlobalAttribute17(String value) {
        this.globalAttribute17 = value;
    }

    /**
     * Gets the value of the globalAttribute18 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlobalAttribute18() {
        return globalAttribute18;
    }

    /**
     * Sets the value of the globalAttribute18 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlobalAttribute18(String value) {
        this.globalAttribute18 = value;
    }

    /**
     * Gets the value of the globalAttribute19 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlobalAttribute19() {
        return globalAttribute19;
    }

    /**
     * Sets the value of the globalAttribute19 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlobalAttribute19(String value) {
        this.globalAttribute19 = value;
    }

    /**
     * Gets the value of the globalAttribute20 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlobalAttribute20() {
        return globalAttribute20;
    }

    /**
     * Sets the value of the globalAttribute20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlobalAttribute20(String value) {
        this.globalAttribute20 = value;
    }

}
