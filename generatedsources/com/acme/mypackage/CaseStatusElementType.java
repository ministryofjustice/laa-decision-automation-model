
package com.acme.mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CaseStatusElementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CaseStatusElementType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ActualCaseStatus" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C25"/&gt;
 *         &lt;element name="DisplayCaseStatus" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C25"/&gt;
 *         &lt;element name="StatusUpdateInd" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}BooleanString"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CaseStatusElementType", propOrder = {
    "actualCaseStatus",
    "displayCaseStatus",
    "statusUpdateInd"
})
public class CaseStatusElementType {

    @XmlElement(name = "ActualCaseStatus", required = true)
    protected String actualCaseStatus;
    @XmlElement(name = "DisplayCaseStatus", required = true)
    protected String displayCaseStatus;
    @XmlElement(name = "StatusUpdateInd")
    protected boolean statusUpdateInd;

    /**
     * Gets the value of the actualCaseStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActualCaseStatus() {
        return actualCaseStatus;
    }

    /**
     * Sets the value of the actualCaseStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActualCaseStatus(String value) {
        this.actualCaseStatus = value;
    }

    /**
     * Gets the value of the displayCaseStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayCaseStatus() {
        return displayCaseStatus;
    }

    /**
     * Sets the value of the displayCaseStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayCaseStatus(String value) {
        this.displayCaseStatus = value;
    }

    /**
     * Gets the value of the statusUpdateInd property.
     * 
     */
    public boolean isStatusUpdateInd() {
        return statusUpdateInd;
    }

    /**
     * Sets the value of the statusUpdateInd property.
     * 
     */
    public void setStatusUpdateInd(boolean value) {
        this.statusUpdateInd = value;
    }

}
