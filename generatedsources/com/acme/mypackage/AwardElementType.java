
package com.acme.mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AwardElementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AwardElementType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AwardID" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}ID15" minOccurs="0"/&gt;
 *         &lt;element name="AwardType" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C50" minOccurs="0"/&gt;
 *         &lt;element name="DeleteAllowed" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}BooleanString"/&gt;
 *         &lt;element name="UpdateAllowed" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}BooleanString"/&gt;
 *         &lt;element name="AwardDetails" type="{http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIO}AwardDetailElementType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AwardElementType", propOrder = {
    "awardID",
    "awardType",
    "deleteAllowed",
    "updateAllowed",
    "awardDetails"
})
public class AwardElementType {

    @XmlElement(name = "AwardID")
    protected String awardID;
    @XmlElement(name = "AwardType")
    protected String awardType;
    @XmlElement(name = "DeleteAllowed")
    protected boolean deleteAllowed;
    @XmlElement(name = "UpdateAllowed")
    protected boolean updateAllowed;
    @XmlElement(name = "AwardDetails", required = true)
    protected AwardDetailElementType awardDetails;

    /**
     * Gets the value of the awardID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAwardID() {
        return awardID;
    }

    /**
     * Sets the value of the awardID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAwardID(String value) {
        this.awardID = value;
    }

    /**
     * Gets the value of the awardType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAwardType() {
        return awardType;
    }

    /**
     * Sets the value of the awardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAwardType(String value) {
        this.awardType = value;
    }

    /**
     * Gets the value of the deleteAllowed property.
     * 
     */
    public boolean isDeleteAllowed() {
        return deleteAllowed;
    }

    /**
     * Sets the value of the deleteAllowed property.
     * 
     */
    public void setDeleteAllowed(boolean value) {
        this.deleteAllowed = value;
    }

    /**
     * Gets the value of the updateAllowed property.
     * 
     */
    public boolean isUpdateAllowed() {
        return updateAllowed;
    }

    /**
     * Sets the value of the updateAllowed property.
     * 
     */
    public void setUpdateAllowed(boolean value) {
        this.updateAllowed = value;
    }

    /**
     * Gets the value of the awardDetails property.
     * 
     * @return
     *     possible object is
     *     {@link AwardDetailElementType }
     *     
     */
    public AwardDetailElementType getAwardDetails() {
        return awardDetails;
    }

    /**
     * Sets the value of the awardDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link AwardDetailElementType }
     *     
     */
    public void setAwardDetails(AwardDetailElementType value) {
        this.awardDetails = value;
    }

}
