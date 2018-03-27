
package com.acme.mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OutcomeDetailElementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OutcomeDetailElementType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IssueDate" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}Dt" minOccurs="0"/&gt;
 *         &lt;element name="FinalWorkDate" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}Dt"/&gt;
 *         &lt;element name="StageEnd" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}LOV"/&gt;
 *         &lt;element name="ResolutionMethod" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}LOV"/&gt;
 *         &lt;element name="Result" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}LOV"/&gt;
 *         &lt;element name="AdditionalResultInfo" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C1000" minOccurs="0"/&gt;
 *         &lt;element name="AltDisputeResolution" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C50"/&gt;
 *         &lt;element name="AltAcceptanceReason" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C1000" minOccurs="0"/&gt;
 *         &lt;element name="CourtCode" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}LOV" minOccurs="0"/&gt;
 *         &lt;element name="WiderBenifits" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}LOV"/&gt;
 *         &lt;element name="OutcomeCourtCaseNumber" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}IDREF30" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutcomeDetailElementType", propOrder = {
    "issueDate",
    "finalWorkDate",
    "stageEnd",
    "resolutionMethod",
    "result",
    "additionalResultInfo",
    "altDisputeResolution",
    "altAcceptanceReason",
    "courtCode",
    "widerBenifits",
    "outcomeCourtCaseNumber"
})
public class OutcomeDetailElementType {

    @XmlElement(name = "IssueDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar issueDate;
    @XmlElement(name = "FinalWorkDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar finalWorkDate;
    @XmlElement(name = "StageEnd", required = true)
    protected String stageEnd;
    @XmlElement(name = "ResolutionMethod", required = true)
    protected String resolutionMethod;
    @XmlElement(name = "Result", required = true)
    protected String result;
    @XmlElement(name = "AdditionalResultInfo")
    protected String additionalResultInfo;
    @XmlElement(name = "AltDisputeResolution", required = true)
    protected String altDisputeResolution;
    @XmlElement(name = "AltAcceptanceReason")
    protected String altAcceptanceReason;
    @XmlElement(name = "CourtCode")
    protected String courtCode;
    @XmlElement(name = "WiderBenifits", required = true)
    protected String widerBenifits;
    @XmlElement(name = "OutcomeCourtCaseNumber")
    protected String outcomeCourtCaseNumber;

    /**
     * Gets the value of the issueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIssueDate() {
        return issueDate;
    }

    /**
     * Sets the value of the issueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIssueDate(XMLGregorianCalendar value) {
        this.issueDate = value;
    }

    /**
     * Gets the value of the finalWorkDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFinalWorkDate() {
        return finalWorkDate;
    }

    /**
     * Sets the value of the finalWorkDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFinalWorkDate(XMLGregorianCalendar value) {
        this.finalWorkDate = value;
    }

    /**
     * Gets the value of the stageEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStageEnd() {
        return stageEnd;
    }

    /**
     * Sets the value of the stageEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStageEnd(String value) {
        this.stageEnd = value;
    }

    /**
     * Gets the value of the resolutionMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResolutionMethod() {
        return resolutionMethod;
    }

    /**
     * Sets the value of the resolutionMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResolutionMethod(String value) {
        this.resolutionMethod = value;
    }

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResult(String value) {
        this.result = value;
    }

    /**
     * Gets the value of the additionalResultInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalResultInfo() {
        return additionalResultInfo;
    }

    /**
     * Sets the value of the additionalResultInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalResultInfo(String value) {
        this.additionalResultInfo = value;
    }

    /**
     * Gets the value of the altDisputeResolution property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltDisputeResolution() {
        return altDisputeResolution;
    }

    /**
     * Sets the value of the altDisputeResolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltDisputeResolution(String value) {
        this.altDisputeResolution = value;
    }

    /**
     * Gets the value of the altAcceptanceReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltAcceptanceReason() {
        return altAcceptanceReason;
    }

    /**
     * Sets the value of the altAcceptanceReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltAcceptanceReason(String value) {
        this.altAcceptanceReason = value;
    }

    /**
     * Gets the value of the courtCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourtCode() {
        return courtCode;
    }

    /**
     * Sets the value of the courtCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourtCode(String value) {
        this.courtCode = value;
    }

    /**
     * Gets the value of the widerBenifits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWiderBenifits() {
        return widerBenifits;
    }

    /**
     * Sets the value of the widerBenifits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWiderBenifits(String value) {
        this.widerBenifits = value;
    }

    /**
     * Gets the value of the outcomeCourtCaseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutcomeCourtCaseNumber() {
        return outcomeCourtCaseNumber;
    }

    /**
     * Sets the value of the outcomeCourtCaseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutcomeCourtCaseNumber(String value) {
        this.outcomeCourtCaseNumber = value;
    }

}
