
package com.acme.mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ExtResourceElementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExtResourceElementType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ExternalResourceRef" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}IDREF15"/&gt;
 *         &lt;element name="ExternalResourceType" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}LOV"/&gt;
 *         &lt;element name="DateInstructed" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}Dt" minOccurs="0"/&gt;
 *         &lt;element name="CostCeiling" type="{http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIO}CostLimitations" minOccurs="0"/&gt;
 *         &lt;element name="Location" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C25" minOccurs="0"/&gt;
 *         &lt;element name="Chambers" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C25" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtResourceElementType", propOrder = {
    "externalResourceRef",
    "externalResourceType",
    "dateInstructed",
    "costCeiling",
    "location",
    "chambers"
})
public class ExtResourceElementType {

    @XmlElement(name = "ExternalResourceRef", required = true)
    protected String externalResourceRef;
    @XmlElement(name = "ExternalResourceType", required = true)
    protected String externalResourceType;
    @XmlElement(name = "DateInstructed")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateInstructed;
    @XmlElement(name = "CostCeiling")
    protected CostLimitations costCeiling;
    @XmlElement(name = "Location")
    protected String location;
    @XmlElement(name = "Chambers")
    protected String chambers;

    /**
     * Gets the value of the externalResourceRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalResourceRef() {
        return externalResourceRef;
    }

    /**
     * Sets the value of the externalResourceRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalResourceRef(String value) {
        this.externalResourceRef = value;
    }

    /**
     * Gets the value of the externalResourceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalResourceType() {
        return externalResourceType;
    }

    /**
     * Sets the value of the externalResourceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalResourceType(String value) {
        this.externalResourceType = value;
    }

    /**
     * Gets the value of the dateInstructed property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateInstructed() {
        return dateInstructed;
    }

    /**
     * Sets the value of the dateInstructed property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateInstructed(XMLGregorianCalendar value) {
        this.dateInstructed = value;
    }

    /**
     * Gets the value of the costCeiling property.
     * 
     * @return
     *     possible object is
     *     {@link CostLimitations }
     *     
     */
    public CostLimitations getCostCeiling() {
        return costCeiling;
    }

    /**
     * Sets the value of the costCeiling property.
     * 
     * @param value
     *     allowed object is
     *     {@link CostLimitations }
     *     
     */
    public void setCostCeiling(CostLimitations value) {
        this.costCeiling = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Gets the value of the chambers property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChambers() {
        return chambers;
    }

    /**
     * Sets the value of the chambers property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChambers(String value) {
        this.chambers = value;
    }

}
