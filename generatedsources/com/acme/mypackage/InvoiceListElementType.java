
package com.acme.mypackage;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for InvoiceListElementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvoiceListElementType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BillingIncidentId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="InvoiceType" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}LOV"/&gt;
 *         &lt;element name="DateSubmitted" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}Dt"/&gt;
 *         &lt;element name="DateAuthorized" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}Dt" minOccurs="0"/&gt;
 *         &lt;element name="InvoiceAmount" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}Amount"/&gt;
 *         &lt;element name="InvoiceStatus" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}LOV"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceListElementType", namespace = "http://legalservices.gov.uk/CCMS/Finance/Payables/1.0/BillingBIO", propOrder = {
    "billingIncidentId",
    "invoiceType",
    "dateSubmitted",
    "dateAuthorized",
    "invoiceAmount",
    "invoiceStatus"
})
public class InvoiceListElementType {

    @XmlElement(name = "BillingIncidentId", required = true)
    protected String billingIncidentId;
    @XmlElement(name = "InvoiceType", required = true)
    protected String invoiceType;
    @XmlElement(name = "DateSubmitted", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateSubmitted;
    @XmlElement(name = "DateAuthorized")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateAuthorized;
    @XmlElement(name = "InvoiceAmount", required = true)
    protected BigDecimal invoiceAmount;
    @XmlElement(name = "InvoiceStatus", required = true)
    protected String invoiceStatus;

    /**
     * Gets the value of the billingIncidentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingIncidentId() {
        return billingIncidentId;
    }

    /**
     * Sets the value of the billingIncidentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingIncidentId(String value) {
        this.billingIncidentId = value;
    }

    /**
     * Gets the value of the invoiceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceType() {
        return invoiceType;
    }

    /**
     * Sets the value of the invoiceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceType(String value) {
        this.invoiceType = value;
    }

    /**
     * Gets the value of the dateSubmitted property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateSubmitted() {
        return dateSubmitted;
    }

    /**
     * Sets the value of the dateSubmitted property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateSubmitted(XMLGregorianCalendar value) {
        this.dateSubmitted = value;
    }

    /**
     * Gets the value of the dateAuthorized property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateAuthorized() {
        return dateAuthorized;
    }

    /**
     * Sets the value of the dateAuthorized property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateAuthorized(XMLGregorianCalendar value) {
        this.dateAuthorized = value;
    }

    /**
     * Gets the value of the invoiceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInvoiceAmount() {
        return invoiceAmount;
    }

    /**
     * Sets the value of the invoiceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInvoiceAmount(BigDecimal value) {
        this.invoiceAmount = value;
    }

    /**
     * Gets the value of the invoiceStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceStatus() {
        return invoiceStatus;
    }

    /**
     * Sets the value of the invoiceStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceStatus(String value) {
        this.invoiceStatus = value;
    }

}
