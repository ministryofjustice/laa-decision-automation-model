
package com.acme.mypackage;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for POAElementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="POAElementType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ProviderID" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}ID15"/&gt;
 *         &lt;element name="CaseReferenceNumber" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}IDREF30"/&gt;
 *         &lt;element name="Reason" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C50" minOccurs="0"/&gt;
 *         &lt;element name="CourtType" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}LOV" minOccurs="0"/&gt;
 *         &lt;element name="DateIncurred" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}Dt" minOccurs="0"/&gt;
 *         &lt;element name="ActualNetCost" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}Amount" minOccurs="0"/&gt;
 *         &lt;element name="VATRate" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}LOV" minOccurs="0"/&gt;
 *         &lt;element name="DtldAssessmentOrderDate" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}Dt" minOccurs="0"/&gt;
 *         &lt;element name="Notes" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C2000" minOccurs="0"/&gt;
 *         &lt;element name="CalculatedNetCost" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}Amount" minOccurs="0"/&gt;
 *         &lt;element name="ActualTotalCost" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}Amount" minOccurs="0"/&gt;
 *         &lt;element name="OPAResponse" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}AssesmentResultType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "POAElementType", namespace = "http://legalservices.gov.uk/CCMS/Finance/Payables/1.0/BillingBIO", propOrder = {
    "providerID",
    "caseReferenceNumber",
    "reason",
    "courtType",
    "dateIncurred",
    "actualNetCost",
    "vatRate",
    "dtldAssessmentOrderDate",
    "notes",
    "calculatedNetCost",
    "actualTotalCost",
    "opaResponse"
})
public class POAElementType {

    @XmlElement(name = "ProviderID", required = true)
    protected String providerID;
    @XmlElement(name = "CaseReferenceNumber", required = true)
    protected String caseReferenceNumber;
    @XmlElement(name = "Reason")
    protected String reason;
    @XmlElement(name = "CourtType")
    protected String courtType;
    @XmlElement(name = "DateIncurred")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateIncurred;
    @XmlElement(name = "ActualNetCost")
    protected BigDecimal actualNetCost;
    @XmlElement(name = "VATRate")
    protected String vatRate;
    @XmlElement(name = "DtldAssessmentOrderDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dtldAssessmentOrderDate;
    @XmlElement(name = "Notes")
    protected String notes;
    @XmlElement(name = "CalculatedNetCost")
    protected BigDecimal calculatedNetCost;
    @XmlElement(name = "ActualTotalCost")
    protected BigDecimal actualTotalCost;
    @XmlElement(name = "OPAResponse", required = true)
    protected AssesmentResultType opaResponse;

    /**
     * Gets the value of the providerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderID() {
        return providerID;
    }

    /**
     * Sets the value of the providerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderID(String value) {
        this.providerID = value;
    }

    /**
     * Gets the value of the caseReferenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseReferenceNumber() {
        return caseReferenceNumber;
    }

    /**
     * Sets the value of the caseReferenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseReferenceNumber(String value) {
        this.caseReferenceNumber = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason(String value) {
        this.reason = value;
    }

    /**
     * Gets the value of the courtType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourtType() {
        return courtType;
    }

    /**
     * Sets the value of the courtType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourtType(String value) {
        this.courtType = value;
    }

    /**
     * Gets the value of the dateIncurred property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateIncurred() {
        return dateIncurred;
    }

    /**
     * Sets the value of the dateIncurred property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateIncurred(XMLGregorianCalendar value) {
        this.dateIncurred = value;
    }

    /**
     * Gets the value of the actualNetCost property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getActualNetCost() {
        return actualNetCost;
    }

    /**
     * Sets the value of the actualNetCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setActualNetCost(BigDecimal value) {
        this.actualNetCost = value;
    }

    /**
     * Gets the value of the vatRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVATRate() {
        return vatRate;
    }

    /**
     * Sets the value of the vatRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVATRate(String value) {
        this.vatRate = value;
    }

    /**
     * Gets the value of the dtldAssessmentOrderDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtldAssessmentOrderDate() {
        return dtldAssessmentOrderDate;
    }

    /**
     * Sets the value of the dtldAssessmentOrderDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtldAssessmentOrderDate(XMLGregorianCalendar value) {
        this.dtldAssessmentOrderDate = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes(String value) {
        this.notes = value;
    }

    /**
     * Gets the value of the calculatedNetCost property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCalculatedNetCost() {
        return calculatedNetCost;
    }

    /**
     * Sets the value of the calculatedNetCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCalculatedNetCost(BigDecimal value) {
        this.calculatedNetCost = value;
    }

    /**
     * Gets the value of the actualTotalCost property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getActualTotalCost() {
        return actualTotalCost;
    }

    /**
     * Sets the value of the actualTotalCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setActualTotalCost(BigDecimal value) {
        this.actualTotalCost = value;
    }

    /**
     * Gets the value of the opaResponse property.
     * 
     * @return
     *     possible object is
     *     {@link AssesmentResultType }
     *     
     */
    public AssesmentResultType getOPAResponse() {
        return opaResponse;
    }

    /**
     * Sets the value of the opaResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssesmentResultType }
     *     
     */
    public void setOPAResponse(AssesmentResultType value) {
        this.opaResponse = value;
    }

}
