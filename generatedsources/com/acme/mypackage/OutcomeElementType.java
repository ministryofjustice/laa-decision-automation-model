
package com.acme.mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OutcomeElementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OutcomeElementType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ProceedingCaseID" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}ID15"/&gt;
 *         &lt;element name="OutcomeDetails" type="{http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIO}OutcomeDetailElementType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutcomeElementType", propOrder = {
    "proceedingCaseID",
    "outcomeDetails"
})
public class OutcomeElementType {

    @XmlElement(name = "ProceedingCaseID", required = true)
    protected String proceedingCaseID;
    @XmlElement(name = "OutcomeDetails", required = true)
    protected OutcomeDetailElementType outcomeDetails;

    /**
     * Gets the value of the proceedingCaseID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProceedingCaseID() {
        return proceedingCaseID;
    }

    /**
     * Sets the value of the proceedingCaseID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProceedingCaseID(String value) {
        this.proceedingCaseID = value;
    }

    /**
     * Gets the value of the outcomeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link OutcomeDetailElementType }
     *     
     */
    public OutcomeDetailElementType getOutcomeDetails() {
        return outcomeDetails;
    }

    /**
     * Sets the value of the outcomeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutcomeDetailElementType }
     *     
     */
    public void setOutcomeDetails(OutcomeDetailElementType value) {
        this.outcomeDetails = value;
    }

}
