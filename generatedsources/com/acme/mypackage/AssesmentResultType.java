
package com.acme.mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AssesmentResultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssesmentResultType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AssesmentID" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}IDREF30" minOccurs="0"/&gt;
 *         &lt;element name="Default" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}BooleanString" minOccurs="0"/&gt;
 *         &lt;element name="Date" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}Dt" minOccurs="0"/&gt;
 *         &lt;element name="Results" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}OPAResultType" minOccurs="0"/&gt;
 *         &lt;element name="AssesmentDetails" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}AssessmentDetailType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssesmentResultType", namespace = "http://legalservices.gov.uk/Enterprise/Common/1.0/Common", propOrder = {
    "assesmentID",
    "_default",
    "date",
    "results",
    "assesmentDetails"
})
public class AssesmentResultType {

    @XmlElement(name = "AssesmentID")
    protected String assesmentID;
    @XmlElement(name = "Default")
    protected Boolean _default;
    @XmlElement(name = "Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar date;
    @XmlElement(name = "Results")
    protected OPAResultType results;
    @XmlElement(name = "AssesmentDetails", required = true)
    protected AssessmentDetailType assesmentDetails;

    /**
     * Gets the value of the assesmentID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssesmentID() {
        return assesmentID;
    }

    /**
     * Sets the value of the assesmentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssesmentID(String value) {
        this.assesmentID = value;
    }

    /**
     * Gets the value of the default property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDefault() {
        return _default;
    }

    /**
     * Sets the value of the default property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDefault(Boolean value) {
        this._default = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * Gets the value of the results property.
     * 
     * @return
     *     possible object is
     *     {@link OPAResultType }
     *     
     */
    public OPAResultType getResults() {
        return results;
    }

    /**
     * Sets the value of the results property.
     * 
     * @param value
     *     allowed object is
     *     {@link OPAResultType }
     *     
     */
    public void setResults(OPAResultType value) {
        this.results = value;
    }

    /**
     * Gets the value of the assesmentDetails property.
     * 
     * @return
     *     possible object is
     *     {@link AssessmentDetailType }
     *     
     */
    public AssessmentDetailType getAssesmentDetails() {
        return assesmentDetails;
    }

    /**
     * Sets the value of the assesmentDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssessmentDetailType }
     *     
     */
    public void setAssesmentDetails(AssessmentDetailType value) {
        this.assesmentDetails = value;
    }

}
