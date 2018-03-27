
package com.acme.mypackage;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SOADetailElementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SOADetailElementType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FirmID" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}ID15"/&gt;
 *         &lt;element name="FirmName" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C35"/&gt;
 *         &lt;element name="EntityType" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C50"/&gt;
 *         &lt;element name="CostLimitation" type="{http://legalservices.gov.uk/CCMS/Finance/Payables/1.0/BillingBIO}CostLimitElementType" minOccurs="0"/&gt;
 *         &lt;element name="UndertakingAmount" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}Amount"/&gt;
 *         &lt;element name="Bills" type="{http://legalservices.gov.uk/CCMS/Finance/Payables/1.0/BillingBIO}BillSummaryElementType"/&gt;
 *         &lt;element name="POA" type="{http://legalservices.gov.uk/CCMS/Finance/Payables/1.0/BillingBIO}POASummaryElementType"/&gt;
 *         &lt;element name="InvoiceList" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Invoice" type="{http://legalservices.gov.uk/CCMS/Finance/Payables/1.0/BillingBIO}InvoiceListElementType" maxOccurs="unbounded"/&gt;
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
@XmlType(name = "SOADetailElementType", namespace = "http://legalservices.gov.uk/CCMS/Finance/Payables/1.0/BillingBIO", propOrder = {
    "firmID",
    "firmName",
    "entityType",
    "costLimitation",
    "undertakingAmount",
    "bills",
    "poa",
    "invoiceList"
})
public class SOADetailElementType {

    @XmlElement(name = "FirmID", required = true)
    protected String firmID;
    @XmlElement(name = "FirmName", required = true)
    protected String firmName;
    @XmlElement(name = "EntityType", required = true)
    protected String entityType;
    @XmlElement(name = "CostLimitation")
    protected CostLimitElementType costLimitation;
    @XmlElement(name = "UndertakingAmount", required = true)
    protected BigDecimal undertakingAmount;
    @XmlElement(name = "Bills", required = true)
    protected BillSummaryElementType bills;
    @XmlElement(name = "POA", required = true)
    protected POASummaryElementType poa;
    @XmlElement(name = "InvoiceList")
    protected SOADetailElementType.InvoiceList invoiceList;

    /**
     * Gets the value of the firmID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirmID() {
        return firmID;
    }

    /**
     * Sets the value of the firmID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirmID(String value) {
        this.firmID = value;
    }

    /**
     * Gets the value of the firmName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirmName() {
        return firmName;
    }

    /**
     * Sets the value of the firmName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirmName(String value) {
        this.firmName = value;
    }

    /**
     * Gets the value of the entityType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityType() {
        return entityType;
    }

    /**
     * Sets the value of the entityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityType(String value) {
        this.entityType = value;
    }

    /**
     * Gets the value of the costLimitation property.
     * 
     * @return
     *     possible object is
     *     {@link CostLimitElementType }
     *     
     */
    public CostLimitElementType getCostLimitation() {
        return costLimitation;
    }

    /**
     * Sets the value of the costLimitation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CostLimitElementType }
     *     
     */
    public void setCostLimitation(CostLimitElementType value) {
        this.costLimitation = value;
    }

    /**
     * Gets the value of the undertakingAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUndertakingAmount() {
        return undertakingAmount;
    }

    /**
     * Sets the value of the undertakingAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUndertakingAmount(BigDecimal value) {
        this.undertakingAmount = value;
    }

    /**
     * Gets the value of the bills property.
     * 
     * @return
     *     possible object is
     *     {@link BillSummaryElementType }
     *     
     */
    public BillSummaryElementType getBills() {
        return bills;
    }

    /**
     * Sets the value of the bills property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillSummaryElementType }
     *     
     */
    public void setBills(BillSummaryElementType value) {
        this.bills = value;
    }

    /**
     * Gets the value of the poa property.
     * 
     * @return
     *     possible object is
     *     {@link POASummaryElementType }
     *     
     */
    public POASummaryElementType getPOA() {
        return poa;
    }

    /**
     * Sets the value of the poa property.
     * 
     * @param value
     *     allowed object is
     *     {@link POASummaryElementType }
     *     
     */
    public void setPOA(POASummaryElementType value) {
        this.poa = value;
    }

    /**
     * Gets the value of the invoiceList property.
     * 
     * @return
     *     possible object is
     *     {@link SOADetailElementType.InvoiceList }
     *     
     */
    public SOADetailElementType.InvoiceList getInvoiceList() {
        return invoiceList;
    }

    /**
     * Sets the value of the invoiceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SOADetailElementType.InvoiceList }
     *     
     */
    public void setInvoiceList(SOADetailElementType.InvoiceList value) {
        this.invoiceList = value;
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
     *         &lt;element name="Invoice" type="{http://legalservices.gov.uk/CCMS/Finance/Payables/1.0/BillingBIO}InvoiceListElementType" maxOccurs="unbounded"/&gt;
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
        "invoice"
    })
    public static class InvoiceList {

        @XmlElement(name = "Invoice", namespace = "http://legalservices.gov.uk/CCMS/Finance/Payables/1.0/BillingBIO", required = true)
        protected List<InvoiceListElementType> invoice;

        /**
         * Gets the value of the invoice property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the invoice property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getInvoice().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link InvoiceListElementType }
         * 
         * 
         */
        public List<InvoiceListElementType> getInvoice() {
            if (invoice == null) {
                invoice = new ArrayList<InvoiceListElementType>();
            }
            return this.invoice;
        }

    }

}
