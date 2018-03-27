
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
 * <p>Java class for ProceedingDetElementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProceedingDetElementType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ProceedingType" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}LOV"/&gt;
 *         &lt;element name="ProceedingDescription" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C542" minOccurs="0"/&gt;
 *         &lt;element name="DateCostsValid" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}Dt" minOccurs="0"/&gt;
 *         &lt;element name="OrderType" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}LOV" minOccurs="0"/&gt;
 *         &lt;element name="MatterType" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}LOV" minOccurs="0"/&gt;
 *         &lt;element name="LevelOfService" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}LOV" minOccurs="0"/&gt;
 *         &lt;element name="Stage" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}LOV" minOccurs="0"/&gt;
 *         &lt;element name="ClientInvolvementType" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}LOV" minOccurs="0"/&gt;
 *         &lt;element name="ScopeLimitations" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ScopeLimitation" type="{http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIO}ScopeLimitationElementType" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ScopeLimitationApplied" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}LOV" minOccurs="0"/&gt;
 *         &lt;element name="DevolvedPowersInd" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}BooleanString" minOccurs="0"/&gt;
 *         &lt;element name="DateDevolvedPowersUsed" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}Dt" minOccurs="0"/&gt;
 *         &lt;element name="DateGranted" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}Dt" minOccurs="0"/&gt;
 *         &lt;element name="Outcome" type="{http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIO}OutcomeDetailElementType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProceedingDetElementType", propOrder = {
    "proceedingType",
    "proceedingDescription",
    "dateCostsValid",
    "orderType",
    "matterType",
    "levelOfService",
    "stage",
    "clientInvolvementType",
    "scopeLimitations",
    "scopeLimitationApplied",
    "devolvedPowersInd",
    "dateDevolvedPowersUsed",
    "dateGranted",
    "outcome"
})
public class ProceedingDetElementType {

    @XmlElement(name = "ProceedingType", required = true)
    protected String proceedingType;
    @XmlElement(name = "ProceedingDescription")
    protected String proceedingDescription;
    @XmlElement(name = "DateCostsValid")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateCostsValid;
    @XmlElement(name = "OrderType")
    protected String orderType;
    @XmlElement(name = "MatterType")
    protected String matterType;
    @XmlElement(name = "LevelOfService")
    protected String levelOfService;
    @XmlElement(name = "Stage")
    protected String stage;
    @XmlElement(name = "ClientInvolvementType")
    protected String clientInvolvementType;
    @XmlElement(name = "ScopeLimitations")
    protected ProceedingDetElementType.ScopeLimitations scopeLimitations;
    @XmlElement(name = "ScopeLimitationApplied")
    protected String scopeLimitationApplied;
    @XmlElement(name = "DevolvedPowersInd")
    protected Boolean devolvedPowersInd;
    @XmlElement(name = "DateDevolvedPowersUsed")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateDevolvedPowersUsed;
    @XmlElement(name = "DateGranted")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateGranted;
    @XmlElement(name = "Outcome")
    protected OutcomeDetailElementType outcome;

    /**
     * Gets the value of the proceedingType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProceedingType() {
        return proceedingType;
    }

    /**
     * Sets the value of the proceedingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProceedingType(String value) {
        this.proceedingType = value;
    }

    /**
     * Gets the value of the proceedingDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProceedingDescription() {
        return proceedingDescription;
    }

    /**
     * Sets the value of the proceedingDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProceedingDescription(String value) {
        this.proceedingDescription = value;
    }

    /**
     * Gets the value of the dateCostsValid property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateCostsValid() {
        return dateCostsValid;
    }

    /**
     * Sets the value of the dateCostsValid property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateCostsValid(XMLGregorianCalendar value) {
        this.dateCostsValid = value;
    }

    /**
     * Gets the value of the orderType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderType() {
        return orderType;
    }

    /**
     * Sets the value of the orderType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderType(String value) {
        this.orderType = value;
    }

    /**
     * Gets the value of the matterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatterType() {
        return matterType;
    }

    /**
     * Sets the value of the matterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatterType(String value) {
        this.matterType = value;
    }

    /**
     * Gets the value of the levelOfService property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLevelOfService() {
        return levelOfService;
    }

    /**
     * Sets the value of the levelOfService property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLevelOfService(String value) {
        this.levelOfService = value;
    }

    /**
     * Gets the value of the stage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStage() {
        return stage;
    }

    /**
     * Sets the value of the stage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStage(String value) {
        this.stage = value;
    }

    /**
     * Gets the value of the clientInvolvementType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientInvolvementType() {
        return clientInvolvementType;
    }

    /**
     * Sets the value of the clientInvolvementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientInvolvementType(String value) {
        this.clientInvolvementType = value;
    }

    /**
     * Gets the value of the scopeLimitations property.
     * 
     * @return
     *     possible object is
     *     {@link ProceedingDetElementType.ScopeLimitations }
     *     
     */
    public ProceedingDetElementType.ScopeLimitations getScopeLimitations() {
        return scopeLimitations;
    }

    /**
     * Sets the value of the scopeLimitations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProceedingDetElementType.ScopeLimitations }
     *     
     */
    public void setScopeLimitations(ProceedingDetElementType.ScopeLimitations value) {
        this.scopeLimitations = value;
    }

    /**
     * Gets the value of the scopeLimitationApplied property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScopeLimitationApplied() {
        return scopeLimitationApplied;
    }

    /**
     * Sets the value of the scopeLimitationApplied property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScopeLimitationApplied(String value) {
        this.scopeLimitationApplied = value;
    }

    /**
     * Gets the value of the devolvedPowersInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDevolvedPowersInd() {
        return devolvedPowersInd;
    }

    /**
     * Sets the value of the devolvedPowersInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDevolvedPowersInd(Boolean value) {
        this.devolvedPowersInd = value;
    }

    /**
     * Gets the value of the dateDevolvedPowersUsed property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateDevolvedPowersUsed() {
        return dateDevolvedPowersUsed;
    }

    /**
     * Sets the value of the dateDevolvedPowersUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateDevolvedPowersUsed(XMLGregorianCalendar value) {
        this.dateDevolvedPowersUsed = value;
    }

    /**
     * Gets the value of the dateGranted property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateGranted() {
        return dateGranted;
    }

    /**
     * Sets the value of the dateGranted property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateGranted(XMLGregorianCalendar value) {
        this.dateGranted = value;
    }

    /**
     * Gets the value of the outcome property.
     * 
     * @return
     *     possible object is
     *     {@link OutcomeDetailElementType }
     *     
     */
    public OutcomeDetailElementType getOutcome() {
        return outcome;
    }

    /**
     * Sets the value of the outcome property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutcomeDetailElementType }
     *     
     */
    public void setOutcome(OutcomeDetailElementType value) {
        this.outcome = value;
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
     *         &lt;element name="ScopeLimitation" type="{http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIO}ScopeLimitationElementType" maxOccurs="unbounded"/&gt;
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
        "scopeLimitation"
    })
    public static class ScopeLimitations {

        @XmlElement(name = "ScopeLimitation", required = true)
        protected List<ScopeLimitationElementType> scopeLimitation;

        /**
         * Gets the value of the scopeLimitation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the scopeLimitation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getScopeLimitation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ScopeLimitationElementType }
         * 
         * 
         */
        public List<ScopeLimitationElementType> getScopeLimitation() {
            if (scopeLimitation == null) {
                scopeLimitation = new ArrayList<ScopeLimitationElementType>();
            }
            return this.scopeLimitation;
        }

    }

}
