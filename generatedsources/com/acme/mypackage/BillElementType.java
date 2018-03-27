
package com.acme.mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for BillElementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BillElementType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CaseReferenceNumber" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}IDREF30"/&gt;
 *         &lt;element name="ProviderFirmID" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}ID15"/&gt;
 *         &lt;element name="TypeOfBill" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}LOV" minOccurs="0"/&gt;
 *         &lt;element name="SupportingInfo" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C240" minOccurs="0"/&gt;
 *         &lt;element name="ClientApproval" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}BooleanString" minOccurs="0"/&gt;
 *         &lt;element name="DateSentToClient" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}Dt" minOccurs="0"/&gt;
 *         &lt;element name="ClientResponse" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}LOV" minOccurs="0"/&gt;
 *         &lt;element name="ClientObjectionReason" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C150" minOccurs="0"/&gt;
 *         &lt;element name="CourtCode" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}LOV" minOccurs="0"/&gt;
 *         &lt;element name="CourtAssessment" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}BooleanString" minOccurs="0"/&gt;
 *         &lt;element name="CourtAssessmentDate" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}Dt" minOccurs="0"/&gt;
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
@XmlType(name = "BillElementType", namespace = "http://legalservices.gov.uk/CCMS/Finance/Payables/1.0/BillingBIO", propOrder = {
    "caseReferenceNumber",
    "providerFirmID",
    "typeOfBill",
    "supportingInfo",
    "clientApproval",
    "dateSentToClient",
    "clientResponse",
    "clientObjectionReason",
    "courtCode",
    "courtAssessment",
    "courtAssessmentDate",
    "opaResponse"
})
public class BillElementType {

    @XmlElement(name = "CaseReferenceNumber", required = true)
    protected String caseReferenceNumber;
    @XmlElement(name = "ProviderFirmID", required = true)
    protected String providerFirmID;
    @XmlElement(name = "TypeOfBill")
    protected String typeOfBill;
    @XmlElement(name = "SupportingInfo")
    protected String supportingInfo;
    @XmlElement(name = "ClientApproval")
    protected Boolean clientApproval;
    @XmlElement(name = "DateSentToClient")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateSentToClient;
    @XmlElement(name = "ClientResponse")
    protected String clientResponse;
    @XmlElement(name = "ClientObjectionReason")
    protected String clientObjectionReason;
    @XmlElement(name = "CourtCode")
    protected String courtCode;
    @XmlElement(name = "CourtAssessment")
    protected Boolean courtAssessment;
    @XmlElement(name = "CourtAssessmentDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar courtAssessmentDate;
    @XmlElement(name = "OPAResponse", required = true)
    protected AssesmentResultType opaResponse;

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
     * Gets the value of the providerFirmID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderFirmID() {
        return providerFirmID;
    }

    /**
     * Sets the value of the providerFirmID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderFirmID(String value) {
        this.providerFirmID = value;
    }

    /**
     * Gets the value of the typeOfBill property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeOfBill() {
        return typeOfBill;
    }

    /**
     * Sets the value of the typeOfBill property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeOfBill(String value) {
        this.typeOfBill = value;
    }

    /**
     * Gets the value of the supportingInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupportingInfo() {
        return supportingInfo;
    }

    /**
     * Sets the value of the supportingInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupportingInfo(String value) {
        this.supportingInfo = value;
    }

    /**
     * Gets the value of the clientApproval property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isClientApproval() {
        return clientApproval;
    }

    /**
     * Sets the value of the clientApproval property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setClientApproval(Boolean value) {
        this.clientApproval = value;
    }

    /**
     * Gets the value of the dateSentToClient property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateSentToClient() {
        return dateSentToClient;
    }

    /**
     * Sets the value of the dateSentToClient property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateSentToClient(XMLGregorianCalendar value) {
        this.dateSentToClient = value;
    }

    /**
     * Gets the value of the clientResponse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientResponse() {
        return clientResponse;
    }

    /**
     * Sets the value of the clientResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientResponse(String value) {
        this.clientResponse = value;
    }

    /**
     * Gets the value of the clientObjectionReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientObjectionReason() {
        return clientObjectionReason;
    }

    /**
     * Sets the value of the clientObjectionReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientObjectionReason(String value) {
        this.clientObjectionReason = value;
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
     * Gets the value of the courtAssessment property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCourtAssessment() {
        return courtAssessment;
    }

    /**
     * Sets the value of the courtAssessment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCourtAssessment(Boolean value) {
        this.courtAssessment = value;
    }

    /**
     * Gets the value of the courtAssessmentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCourtAssessmentDate() {
        return courtAssessmentDate;
    }

    /**
     * Sets the value of the courtAssessmentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCourtAssessmentDate(XMLGregorianCalendar value) {
        this.courtAssessmentDate = value;
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
