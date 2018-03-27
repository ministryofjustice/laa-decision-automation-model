
package com.acme.mypackage;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SOAElementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SOAElementType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CaseReferenceNumber" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}IDREF30"/&gt;
 *         &lt;element name="CertificateType" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}LOV" minOccurs="0"/&gt;
 *         &lt;element name="CertificateDate" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}Dt" minOccurs="0"/&gt;
 *         &lt;element name="Total" type="{http://legalservices.gov.uk/CCMS/Finance/Payables/1.0/BillingBIO}SOASummaryElementType"/&gt;
 *         &lt;element name="Details"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Statement" type="{http://legalservices.gov.uk/CCMS/Finance/Payables/1.0/BillingBIO}SOADetailElementType" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SOAElementType", namespace = "http://legalservices.gov.uk/CCMS/Finance/Payables/1.0/BillingBIO", propOrder = {
    "caseReferenceNumber",
    "certificateType",
    "certificateDate",
    "total",
    "details"
})
public class SOAElementType {

    @XmlElement(name = "CaseReferenceNumber", required = true)
    protected String caseReferenceNumber;
    @XmlElement(name = "CertificateType")
    protected String certificateType;
    @XmlElement(name = "CertificateDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar certificateDate;
    @XmlElement(name = "Total", required = true)
    protected SOASummaryElementType total;
    @XmlElement(name = "Details", required = true)
    protected SOAElementType.Details details;

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
     * Gets the value of the certificateType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificateType() {
        return certificateType;
    }

    /**
     * Sets the value of the certificateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificateType(String value) {
        this.certificateType = value;
    }

    /**
     * Gets the value of the certificateDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCertificateDate() {
        return certificateDate;
    }

    /**
     * Sets the value of the certificateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCertificateDate(XMLGregorianCalendar value) {
        this.certificateDate = value;
    }

    /**
     * Gets the value of the total property.
     * 
     * @return
     *     possible object is
     *     {@link SOASummaryElementType }
     *     
     */
    public SOASummaryElementType getTotal() {
        return total;
    }

    /**
     * Sets the value of the total property.
     * 
     * @param value
     *     allowed object is
     *     {@link SOASummaryElementType }
     *     
     */
    public void setTotal(SOASummaryElementType value) {
        this.total = value;
    }

    /**
     * Gets the value of the details property.
     * 
     * @return
     *     possible object is
     *     {@link SOAElementType.Details }
     *     
     */
    public SOAElementType.Details getDetails() {
        return details;
    }

    /**
     * Sets the value of the details property.
     * 
     * @param value
     *     allowed object is
     *     {@link SOAElementType.Details }
     *     
     */
    public void setDetails(SOAElementType.Details value) {
        this.details = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Statement" type="{http://legalservices.gov.uk/CCMS/Finance/Payables/1.0/BillingBIO}SOADetailElementType" maxOccurs="unbounded"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "statement"
    })
    public static class Details {

        @XmlElement(name = "Statement", namespace = "http://legalservices.gov.uk/CCMS/Finance/Payables/1.0/BillingBIO", required = true)
        protected List<SOADetailElementType> statement;

        /**
         * Gets the value of the statement property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the statement property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getStatement().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SOADetailElementType }
         * 
         * 
         */
        public List<SOADetailElementType> getStatement() {
            if (statement == null) {
                statement = new ArrayList<SOADetailElementType>();
            }
            return this.statement;
        }

    }

}
