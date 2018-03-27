
package com.acme.mypackage;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UndertakingDetailsElementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UndertakingDetailsElementType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EntityType" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}Amount"/&gt;
 *         &lt;element name="EntityRef" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}Amount"/&gt;
 *         &lt;element name="BillsToDate" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="InterimAndFinal" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}Amount"/&gt;
 *                   &lt;element name="UnRecoupedPaymentOnAcct" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}Amount"/&gt;
 *                   &lt;element name="BillsSubmitted" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}Amount"/&gt;
 *                   &lt;element name="FinalBillReceived" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}Amount"/&gt;
 *                   &lt;element name="CurrentUndertaking" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}Amount"/&gt;
 *                   &lt;element name="UnBilledLiability" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}Amount"/&gt;
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
@XmlType(name = "UndertakingDetailsElementType", propOrder = {
    "entityType",
    "entityRef",
    "billsToDate"
})
public class UndertakingDetailsElementType {

    @XmlElement(name = "EntityType", required = true)
    protected BigDecimal entityType;
    @XmlElement(name = "EntityRef", required = true)
    protected BigDecimal entityRef;
    @XmlElement(name = "BillsToDate")
    protected UndertakingDetailsElementType.BillsToDate billsToDate;

    /**
     * Gets the value of the entityType property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEntityType() {
        return entityType;
    }

    /**
     * Sets the value of the entityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEntityType(BigDecimal value) {
        this.entityType = value;
    }

    /**
     * Gets the value of the entityRef property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEntityRef() {
        return entityRef;
    }

    /**
     * Sets the value of the entityRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEntityRef(BigDecimal value) {
        this.entityRef = value;
    }

    /**
     * Gets the value of the billsToDate property.
     * 
     * @return
     *     possible object is
     *     {@link UndertakingDetailsElementType.BillsToDate }
     *     
     */
    public UndertakingDetailsElementType.BillsToDate getBillsToDate() {
        return billsToDate;
    }

    /**
     * Sets the value of the billsToDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link UndertakingDetailsElementType.BillsToDate }
     *     
     */
    public void setBillsToDate(UndertakingDetailsElementType.BillsToDate value) {
        this.billsToDate = value;
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
     *         &lt;element name="InterimAndFinal" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}Amount"/&gt;
     *         &lt;element name="UnRecoupedPaymentOnAcct" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}Amount"/&gt;
     *         &lt;element name="BillsSubmitted" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}Amount"/&gt;
     *         &lt;element name="FinalBillReceived" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}Amount"/&gt;
     *         &lt;element name="CurrentUndertaking" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}Amount"/&gt;
     *         &lt;element name="UnBilledLiability" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}Amount"/&gt;
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
        "interimAndFinal",
        "unRecoupedPaymentOnAcct",
        "billsSubmitted",
        "finalBillReceived",
        "currentUndertaking",
        "unBilledLiability"
    })
    public static class BillsToDate {

        @XmlElement(name = "InterimAndFinal", required = true)
        protected BigDecimal interimAndFinal;
        @XmlElement(name = "UnRecoupedPaymentOnAcct", required = true)
        protected BigDecimal unRecoupedPaymentOnAcct;
        @XmlElement(name = "BillsSubmitted", required = true)
        protected BigDecimal billsSubmitted;
        @XmlElement(name = "FinalBillReceived", required = true)
        protected BigDecimal finalBillReceived;
        @XmlElement(name = "CurrentUndertaking", required = true)
        protected BigDecimal currentUndertaking;
        @XmlElement(name = "UnBilledLiability", required = true)
        protected BigDecimal unBilledLiability;

        /**
         * Gets the value of the interimAndFinal property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getInterimAndFinal() {
            return interimAndFinal;
        }

        /**
         * Sets the value of the interimAndFinal property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setInterimAndFinal(BigDecimal value) {
            this.interimAndFinal = value;
        }

        /**
         * Gets the value of the unRecoupedPaymentOnAcct property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getUnRecoupedPaymentOnAcct() {
            return unRecoupedPaymentOnAcct;
        }

        /**
         * Sets the value of the unRecoupedPaymentOnAcct property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setUnRecoupedPaymentOnAcct(BigDecimal value) {
            this.unRecoupedPaymentOnAcct = value;
        }

        /**
         * Gets the value of the billsSubmitted property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getBillsSubmitted() {
            return billsSubmitted;
        }

        /**
         * Sets the value of the billsSubmitted property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setBillsSubmitted(BigDecimal value) {
            this.billsSubmitted = value;
        }

        /**
         * Gets the value of the finalBillReceived property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getFinalBillReceived() {
            return finalBillReceived;
        }

        /**
         * Sets the value of the finalBillReceived property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setFinalBillReceived(BigDecimal value) {
            this.finalBillReceived = value;
        }

        /**
         * Gets the value of the currentUndertaking property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getCurrentUndertaking() {
            return currentUndertaking;
        }

        /**
         * Sets the value of the currentUndertaking property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setCurrentUndertaking(BigDecimal value) {
            this.currentUndertaking = value;
        }

        /**
         * Gets the value of the unBilledLiability property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getUnBilledLiability() {
            return unBilledLiability;
        }

        /**
         * Sets the value of the unBilledLiability property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setUnBilledLiability(BigDecimal value) {
            this.unBilledLiability = value;
        }

    }

}
