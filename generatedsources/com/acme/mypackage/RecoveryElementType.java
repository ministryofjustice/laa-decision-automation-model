
package com.acme.mypackage;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RecoveryElementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecoveryElementType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AwardValue" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}Amount"/&gt;
 *         &lt;element name="RecoveredAmount" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Solicitor" type="{http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIO}RecoveryAmountElementType" minOccurs="0"/&gt;
 *                   &lt;element name="Court" type="{http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIO}RecoveryAmountElementType" minOccurs="0"/&gt;
 *                   &lt;element name="Client" type="{http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIO}RecoveryAmountElementType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UnRecoveredAmount" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}Amount" minOccurs="0"/&gt;
 *         &lt;element name="LeaveOfCourtReqdInd" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}BooleanString" minOccurs="0"/&gt;
 *         &lt;element name="OfferedAmount" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Amount" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}Amount" minOccurs="0"/&gt;
 *                   &lt;element name="ConditionsOfOffer" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C240" minOccurs="0"/&gt;
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
@XmlType(name = "RecoveryElementType", propOrder = {
    "awardValue",
    "recoveredAmount",
    "unRecoveredAmount",
    "leaveOfCourtReqdInd",
    "offeredAmount"
})
public class RecoveryElementType {

    @XmlElement(name = "AwardValue", required = true)
    protected BigDecimal awardValue;
    @XmlElement(name = "RecoveredAmount")
    protected RecoveryElementType.RecoveredAmount recoveredAmount;
    @XmlElement(name = "UnRecoveredAmount")
    protected BigDecimal unRecoveredAmount;
    @XmlElement(name = "LeaveOfCourtReqdInd")
    protected Boolean leaveOfCourtReqdInd;
    @XmlElement(name = "OfferedAmount")
    protected RecoveryElementType.OfferedAmount offeredAmount;

    /**
     * Gets the value of the awardValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAwardValue() {
        return awardValue;
    }

    /**
     * Sets the value of the awardValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAwardValue(BigDecimal value) {
        this.awardValue = value;
    }

    /**
     * Gets the value of the recoveredAmount property.
     * 
     * @return
     *     possible object is
     *     {@link RecoveryElementType.RecoveredAmount }
     *     
     */
    public RecoveryElementType.RecoveredAmount getRecoveredAmount() {
        return recoveredAmount;
    }

    /**
     * Sets the value of the recoveredAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecoveryElementType.RecoveredAmount }
     *     
     */
    public void setRecoveredAmount(RecoveryElementType.RecoveredAmount value) {
        this.recoveredAmount = value;
    }

    /**
     * Gets the value of the unRecoveredAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUnRecoveredAmount() {
        return unRecoveredAmount;
    }

    /**
     * Sets the value of the unRecoveredAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUnRecoveredAmount(BigDecimal value) {
        this.unRecoveredAmount = value;
    }

    /**
     * Gets the value of the leaveOfCourtReqdInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLeaveOfCourtReqdInd() {
        return leaveOfCourtReqdInd;
    }

    /**
     * Sets the value of the leaveOfCourtReqdInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLeaveOfCourtReqdInd(Boolean value) {
        this.leaveOfCourtReqdInd = value;
    }

    /**
     * Gets the value of the offeredAmount property.
     * 
     * @return
     *     possible object is
     *     {@link RecoveryElementType.OfferedAmount }
     *     
     */
    public RecoveryElementType.OfferedAmount getOfferedAmount() {
        return offeredAmount;
    }

    /**
     * Sets the value of the offeredAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecoveryElementType.OfferedAmount }
     *     
     */
    public void setOfferedAmount(RecoveryElementType.OfferedAmount value) {
        this.offeredAmount = value;
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
     *         &lt;element name="Amount" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}Amount" minOccurs="0"/&gt;
     *         &lt;element name="ConditionsOfOffer" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C240" minOccurs="0"/&gt;
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
        "amount",
        "conditionsOfOffer"
    })
    public static class OfferedAmount {

        @XmlElement(name = "Amount")
        protected BigDecimal amount;
        @XmlElement(name = "ConditionsOfOffer")
        protected String conditionsOfOffer;

        /**
         * Gets the value of the amount property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getAmount() {
            return amount;
        }

        /**
         * Sets the value of the amount property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setAmount(BigDecimal value) {
            this.amount = value;
        }

        /**
         * Gets the value of the conditionsOfOffer property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getConditionsOfOffer() {
            return conditionsOfOffer;
        }

        /**
         * Sets the value of the conditionsOfOffer property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setConditionsOfOffer(String value) {
            this.conditionsOfOffer = value;
        }

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
     *         &lt;element name="Solicitor" type="{http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIO}RecoveryAmountElementType" minOccurs="0"/&gt;
     *         &lt;element name="Court" type="{http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIO}RecoveryAmountElementType" minOccurs="0"/&gt;
     *         &lt;element name="Client" type="{http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIO}RecoveryAmountElementType" minOccurs="0"/&gt;
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
        "solicitor",
        "court",
        "client"
    })
    public static class RecoveredAmount {

        @XmlElement(name = "Solicitor")
        protected RecoveryAmountElementType solicitor;
        @XmlElement(name = "Court")
        protected RecoveryAmountElementType court;
        @XmlElement(name = "Client")
        protected RecoveryAmountElementType client;

        /**
         * Gets the value of the solicitor property.
         * 
         * @return
         *     possible object is
         *     {@link RecoveryAmountElementType }
         *     
         */
        public RecoveryAmountElementType getSolicitor() {
            return solicitor;
        }

        /**
         * Sets the value of the solicitor property.
         * 
         * @param value
         *     allowed object is
         *     {@link RecoveryAmountElementType }
         *     
         */
        public void setSolicitor(RecoveryAmountElementType value) {
            this.solicitor = value;
        }

        /**
         * Gets the value of the court property.
         * 
         * @return
         *     possible object is
         *     {@link RecoveryAmountElementType }
         *     
         */
        public RecoveryAmountElementType getCourt() {
            return court;
        }

        /**
         * Sets the value of the court property.
         * 
         * @param value
         *     allowed object is
         *     {@link RecoveryAmountElementType }
         *     
         */
        public void setCourt(RecoveryAmountElementType value) {
            this.court = value;
        }

        /**
         * Gets the value of the client property.
         * 
         * @return
         *     possible object is
         *     {@link RecoveryAmountElementType }
         *     
         */
        public RecoveryAmountElementType getClient() {
            return client;
        }

        /**
         * Sets the value of the client property.
         * 
         * @param value
         *     allowed object is
         *     {@link RecoveryAmountElementType }
         *     
         */
        public void setClient(RecoveryAmountElementType value) {
            this.client = value;
        }

    }

}
