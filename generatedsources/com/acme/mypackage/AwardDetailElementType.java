
package com.acme.mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AwardDetailElementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AwardDetailElementType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AwardCategory" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C50" minOccurs="0"/&gt;
 *         &lt;element name="AwardDetails"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;element name="CostAward" type="{http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIO}CostAwardElementType"/&gt;
 *                   &lt;element name="FinancialAward" type="{http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIO}FinancialAwardElementType"/&gt;
 *                   &lt;element name="LandAward" type="{http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIO}LandAwardElementType"/&gt;
 *                   &lt;element name="OtherAsset" type="{http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIO}OtherAssetElementType"/&gt;
 *                 &lt;/choice&gt;
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
@XmlType(name = "AwardDetailElementType", propOrder = {
    "awardCategory",
    "awardDetails"
})
public class AwardDetailElementType {

    @XmlElement(name = "AwardCategory")
    protected String awardCategory;
    @XmlElement(name = "AwardDetails", required = true)
    protected AwardDetailElementType.AwardDetails awardDetails;

    /**
     * Gets the value of the awardCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAwardCategory() {
        return awardCategory;
    }

    /**
     * Sets the value of the awardCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAwardCategory(String value) {
        this.awardCategory = value;
    }

    /**
     * Gets the value of the awardDetails property.
     * 
     * @return
     *     possible object is
     *     {@link AwardDetailElementType.AwardDetails }
     *     
     */
    public AwardDetailElementType.AwardDetails getAwardDetails() {
        return awardDetails;
    }

    /**
     * Sets the value of the awardDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link AwardDetailElementType.AwardDetails }
     *     
     */
    public void setAwardDetails(AwardDetailElementType.AwardDetails value) {
        this.awardDetails = value;
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
     *       &lt;choice&gt;
     *         &lt;element name="CostAward" type="{http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIO}CostAwardElementType"/&gt;
     *         &lt;element name="FinancialAward" type="{http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIO}FinancialAwardElementType"/&gt;
     *         &lt;element name="LandAward" type="{http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIO}LandAwardElementType"/&gt;
     *         &lt;element name="OtherAsset" type="{http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIO}OtherAssetElementType"/&gt;
     *       &lt;/choice&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "costAward",
        "financialAward",
        "landAward",
        "otherAsset"
    })
    public static class AwardDetails {

        @XmlElement(name = "CostAward")
        protected CostAwardElementType costAward;
        @XmlElement(name = "FinancialAward")
        protected FinancialAwardElementType financialAward;
        @XmlElement(name = "LandAward")
        protected LandAwardElementType landAward;
        @XmlElement(name = "OtherAsset")
        protected OtherAssetElementType otherAsset;

        /**
         * Gets the value of the costAward property.
         * 
         * @return
         *     possible object is
         *     {@link CostAwardElementType }
         *     
         */
        public CostAwardElementType getCostAward() {
            return costAward;
        }

        /**
         * Sets the value of the costAward property.
         * 
         * @param value
         *     allowed object is
         *     {@link CostAwardElementType }
         *     
         */
        public void setCostAward(CostAwardElementType value) {
            this.costAward = value;
        }

        /**
         * Gets the value of the financialAward property.
         * 
         * @return
         *     possible object is
         *     {@link FinancialAwardElementType }
         *     
         */
        public FinancialAwardElementType getFinancialAward() {
            return financialAward;
        }

        /**
         * Sets the value of the financialAward property.
         * 
         * @param value
         *     allowed object is
         *     {@link FinancialAwardElementType }
         *     
         */
        public void setFinancialAward(FinancialAwardElementType value) {
            this.financialAward = value;
        }

        /**
         * Gets the value of the landAward property.
         * 
         * @return
         *     possible object is
         *     {@link LandAwardElementType }
         *     
         */
        public LandAwardElementType getLandAward() {
            return landAward;
        }

        /**
         * Sets the value of the landAward property.
         * 
         * @param value
         *     allowed object is
         *     {@link LandAwardElementType }
         *     
         */
        public void setLandAward(LandAwardElementType value) {
            this.landAward = value;
        }

        /**
         * Gets the value of the otherAsset property.
         * 
         * @return
         *     possible object is
         *     {@link OtherAssetElementType }
         *     
         */
        public OtherAssetElementType getOtherAsset() {
            return otherAsset;
        }

        /**
         * Sets the value of the otherAsset property.
         * 
         * @param value
         *     allowed object is
         *     {@link OtherAssetElementType }
         *     
         */
        public void setOtherAsset(OtherAssetElementType value) {
            this.otherAsset = value;
        }

    }

}
