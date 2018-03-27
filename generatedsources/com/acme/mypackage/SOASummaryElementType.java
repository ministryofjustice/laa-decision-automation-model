
package com.acme.mypackage;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SOASummaryElementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SOASummaryElementType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CostLimitation" type="{http://legalservices.gov.uk/CCMS/Finance/Payables/1.0/BillingBIO}CostLimitElementType"/&gt;
 *         &lt;element name="CounselCostCeiling" type="{http://legalservices.gov.uk/CCMS/Finance/Payables/1.0/BillingBIO}CostCeilingElementType"/&gt;
 *         &lt;element name="UndertakingAmount" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}Amount"/&gt;
 *         &lt;element name="Bills" type="{http://legalservices.gov.uk/CCMS/Finance/Payables/1.0/BillingBIO}BillSummaryElementType"/&gt;
 *         &lt;element name="POA" type="{http://legalservices.gov.uk/CCMS/Finance/Payables/1.0/BillingBIO}POASummaryElementType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SOASummaryElementType", namespace = "http://legalservices.gov.uk/CCMS/Finance/Payables/1.0/BillingBIO", propOrder = {
    "costLimitation",
    "counselCostCeiling",
    "undertakingAmount",
    "bills",
    "poa"
})
public class SOASummaryElementType {

    @XmlElement(name = "CostLimitation", required = true)
    protected CostLimitElementType costLimitation;
    @XmlElement(name = "CounselCostCeiling", required = true)
    protected CostCeilingElementType counselCostCeiling;
    @XmlElement(name = "UndertakingAmount", required = true)
    protected BigDecimal undertakingAmount;
    @XmlElement(name = "Bills", required = true)
    protected BillSummaryElementType bills;
    @XmlElement(name = "POA", required = true)
    protected POASummaryElementType poa;

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
     * Gets the value of the counselCostCeiling property.
     * 
     * @return
     *     possible object is
     *     {@link CostCeilingElementType }
     *     
     */
    public CostCeilingElementType getCounselCostCeiling() {
        return counselCostCeiling;
    }

    /**
     * Sets the value of the counselCostCeiling property.
     * 
     * @param value
     *     allowed object is
     *     {@link CostCeilingElementType }
     *     
     */
    public void setCounselCostCeiling(CostCeilingElementType value) {
        this.counselCostCeiling = value;
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

}
