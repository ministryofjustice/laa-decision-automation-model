
package com.acme.mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Key Segment Structure with 20 segments
 * 
 * <p>Java class for Segments20 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Segments20"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Segment1" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C40" minOccurs="0"/&gt;
 *         &lt;element name="Segment2" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C40" minOccurs="0"/&gt;
 *         &lt;element name="Segment3" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C40" minOccurs="0"/&gt;
 *         &lt;element name="Segment4" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C40" minOccurs="0"/&gt;
 *         &lt;element name="Segment5" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C40" minOccurs="0"/&gt;
 *         &lt;element name="Segment6" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C40" minOccurs="0"/&gt;
 *         &lt;element name="Segment7" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C40" minOccurs="0"/&gt;
 *         &lt;element name="Segment8" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C40" minOccurs="0"/&gt;
 *         &lt;element name="Segment9" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C40" minOccurs="0"/&gt;
 *         &lt;element name="Segment10" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C40" minOccurs="0"/&gt;
 *         &lt;element name="Segment11" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C40" minOccurs="0"/&gt;
 *         &lt;element name="Segment12" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C40" minOccurs="0"/&gt;
 *         &lt;element name="Segment13" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C40" minOccurs="0"/&gt;
 *         &lt;element name="Segment14" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C40" minOccurs="0"/&gt;
 *         &lt;element name="Segment15" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C40" minOccurs="0"/&gt;
 *         &lt;element name="Segment16" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C40" minOccurs="0"/&gt;
 *         &lt;element name="Segment17" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C40" minOccurs="0"/&gt;
 *         &lt;element name="Segment18" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C40" minOccurs="0"/&gt;
 *         &lt;element name="Segment19" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C40" minOccurs="0"/&gt;
 *         &lt;element name="Segment20" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C40" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Segments20", namespace = "http://legalservices.gov.uk/Enterprise/Common/1.0/Common", propOrder = {
    "segment1",
    "segment2",
    "segment3",
    "segment4",
    "segment5",
    "segment6",
    "segment7",
    "segment8",
    "segment9",
    "segment10",
    "segment11",
    "segment12",
    "segment13",
    "segment14",
    "segment15",
    "segment16",
    "segment17",
    "segment18",
    "segment19",
    "segment20"
})
public class Segments20 {

    @XmlElement(name = "Segment1")
    protected String segment1;
    @XmlElement(name = "Segment2")
    protected String segment2;
    @XmlElement(name = "Segment3")
    protected String segment3;
    @XmlElement(name = "Segment4")
    protected String segment4;
    @XmlElement(name = "Segment5")
    protected String segment5;
    @XmlElement(name = "Segment6")
    protected String segment6;
    @XmlElement(name = "Segment7")
    protected String segment7;
    @XmlElement(name = "Segment8")
    protected String segment8;
    @XmlElement(name = "Segment9")
    protected String segment9;
    @XmlElement(name = "Segment10")
    protected String segment10;
    @XmlElement(name = "Segment11")
    protected String segment11;
    @XmlElement(name = "Segment12")
    protected String segment12;
    @XmlElement(name = "Segment13")
    protected String segment13;
    @XmlElement(name = "Segment14")
    protected String segment14;
    @XmlElement(name = "Segment15")
    protected String segment15;
    @XmlElement(name = "Segment16")
    protected String segment16;
    @XmlElement(name = "Segment17")
    protected String segment17;
    @XmlElement(name = "Segment18")
    protected String segment18;
    @XmlElement(name = "Segment19")
    protected String segment19;
    @XmlElement(name = "Segment20")
    protected String segment20;

    /**
     * Gets the value of the segment1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegment1() {
        return segment1;
    }

    /**
     * Sets the value of the segment1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegment1(String value) {
        this.segment1 = value;
    }

    /**
     * Gets the value of the segment2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegment2() {
        return segment2;
    }

    /**
     * Sets the value of the segment2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegment2(String value) {
        this.segment2 = value;
    }

    /**
     * Gets the value of the segment3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegment3() {
        return segment3;
    }

    /**
     * Sets the value of the segment3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegment3(String value) {
        this.segment3 = value;
    }

    /**
     * Gets the value of the segment4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegment4() {
        return segment4;
    }

    /**
     * Sets the value of the segment4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegment4(String value) {
        this.segment4 = value;
    }

    /**
     * Gets the value of the segment5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegment5() {
        return segment5;
    }

    /**
     * Sets the value of the segment5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegment5(String value) {
        this.segment5 = value;
    }

    /**
     * Gets the value of the segment6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegment6() {
        return segment6;
    }

    /**
     * Sets the value of the segment6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegment6(String value) {
        this.segment6 = value;
    }

    /**
     * Gets the value of the segment7 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegment7() {
        return segment7;
    }

    /**
     * Sets the value of the segment7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegment7(String value) {
        this.segment7 = value;
    }

    /**
     * Gets the value of the segment8 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegment8() {
        return segment8;
    }

    /**
     * Sets the value of the segment8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegment8(String value) {
        this.segment8 = value;
    }

    /**
     * Gets the value of the segment9 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegment9() {
        return segment9;
    }

    /**
     * Sets the value of the segment9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegment9(String value) {
        this.segment9 = value;
    }

    /**
     * Gets the value of the segment10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegment10() {
        return segment10;
    }

    /**
     * Sets the value of the segment10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegment10(String value) {
        this.segment10 = value;
    }

    /**
     * Gets the value of the segment11 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegment11() {
        return segment11;
    }

    /**
     * Sets the value of the segment11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegment11(String value) {
        this.segment11 = value;
    }

    /**
     * Gets the value of the segment12 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegment12() {
        return segment12;
    }

    /**
     * Sets the value of the segment12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegment12(String value) {
        this.segment12 = value;
    }

    /**
     * Gets the value of the segment13 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegment13() {
        return segment13;
    }

    /**
     * Sets the value of the segment13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegment13(String value) {
        this.segment13 = value;
    }

    /**
     * Gets the value of the segment14 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegment14() {
        return segment14;
    }

    /**
     * Sets the value of the segment14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegment14(String value) {
        this.segment14 = value;
    }

    /**
     * Gets the value of the segment15 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegment15() {
        return segment15;
    }

    /**
     * Sets the value of the segment15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegment15(String value) {
        this.segment15 = value;
    }

    /**
     * Gets the value of the segment16 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegment16() {
        return segment16;
    }

    /**
     * Sets the value of the segment16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegment16(String value) {
        this.segment16 = value;
    }

    /**
     * Gets the value of the segment17 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegment17() {
        return segment17;
    }

    /**
     * Sets the value of the segment17 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegment17(String value) {
        this.segment17 = value;
    }

    /**
     * Gets the value of the segment18 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegment18() {
        return segment18;
    }

    /**
     * Sets the value of the segment18 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegment18(String value) {
        this.segment18 = value;
    }

    /**
     * Gets the value of the segment19 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegment19() {
        return segment19;
    }

    /**
     * Sets the value of the segment19 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegment19(String value) {
        this.segment19 = value;
    }

    /**
     * Gets the value of the segment20 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegment20() {
        return segment20;
    }

    /**
     * Sets the value of the segment20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegment20(String value) {
        this.segment20 = value;
    }

}
