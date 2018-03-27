
package com.acme.mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ProceedingElementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProceedingElementType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ProceedingCaseID" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}ID15" minOccurs="0"/&gt;
 *         &lt;element name="DateApplied" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}Dt" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}LOV" minOccurs="0"/&gt;
 *         &lt;element name="LeadProceedingIndicator" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}Boolean" minOccurs="0"/&gt;
 *         &lt;element name="OutcomeCourtCaseNumber" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}IDREF30" minOccurs="0"/&gt;
 *         &lt;element name="AvailableFunctions" type="{http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIO}ActionListElementType" minOccurs="0"/&gt;
 *         &lt;element name="ProceedingDetails" type="{http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIO}ProceedingDetElementType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProceedingElementType", propOrder = {
    "proceedingCaseID",
    "dateApplied",
    "status",
    "leadProceedingIndicator",
    "outcomeCourtCaseNumber",
    "availableFunctions",
    "proceedingDetails"
})
public class ProceedingElementType {

    @XmlElement(name = "ProceedingCaseID")
    protected String proceedingCaseID;
    @XmlElement(name = "DateApplied")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateApplied;
    @XmlElement(name = "Status")
    protected String status;
    @XmlElement(name = "LeadProceedingIndicator")
    protected Boolean leadProceedingIndicator;
    @XmlElement(name = "OutcomeCourtCaseNumber")
    protected String outcomeCourtCaseNumber;
    @XmlElement(name = "AvailableFunctions")
    protected ActionListElementType availableFunctions;
    @XmlElement(name = "ProceedingDetails", required = true)
    protected ProceedingDetElementType proceedingDetails;

    /**
     * Gets the value of the proceedingCaseID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProceedingCaseID() {
        return proceedingCaseID;
    }

    /**
     * Sets the value of the proceedingCaseID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProceedingCaseID(String value) {
        this.proceedingCaseID = value;
    }

    /**
     * Gets the value of the dateApplied property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateApplied() {
        return dateApplied;
    }

    /**
     * Sets the value of the dateApplied property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateApplied(XMLGregorianCalendar value) {
        this.dateApplied = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the leadProceedingIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLeadProceedingIndicator() {
        return leadProceedingIndicator;
    }

    /**
     * Sets the value of the leadProceedingIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLeadProceedingIndicator(Boolean value) {
        this.leadProceedingIndicator = value;
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

    /**
     * Gets the value of the availableFunctions property.
     * 
     * @return
     *     possible object is
     *     {@link ActionListElementType }
     *     
     */
    public ActionListElementType getAvailableFunctions() {
        return availableFunctions;
    }

    /**
     * Sets the value of the availableFunctions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionListElementType }
     *     
     */
    public void setAvailableFunctions(ActionListElementType value) {
        this.availableFunctions = value;
    }

    /**
     * Gets the value of the proceedingDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ProceedingDetElementType }
     *     
     */
    public ProceedingDetElementType getProceedingDetails() {
        return proceedingDetails;
    }

    /**
     * Sets the value of the proceedingDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProceedingDetElementType }
     *     
     */
    public void setProceedingDetails(ProceedingDetElementType value) {
        this.proceedingDetails = value;
    }

}
