
package com.acme.mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CaseAdd complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CaseAdd"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CaseReferenceNumber" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}IDREF30"/&gt;
 *         &lt;element name="CaseDetails" type="{http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIO}CaseDetailsAdd"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CaseAdd", propOrder = {
    "caseReferenceNumber",
    "caseDetails"
})
public class CaseAdd {

    @XmlElement(name = "CaseReferenceNumber", required = true)
    protected String caseReferenceNumber;
    @XmlElement(name = "CaseDetails", required = true)
    protected CaseDetailsAdd caseDetails;

    /**
     * Gets the value of the caseReferenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseReferenceNumber() {
        return caseReferenceNumber;
    }

    /**
     * Sets the value of the caseReferenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseReferenceNumber(String value) {
        this.caseReferenceNumber = value;
    }

    /**
     * Gets the value of the caseDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CaseDetailsAdd }
     *     
     */
    public CaseDetailsAdd getCaseDetails() {
        return caseDetails;
    }

    /**
     * Sets the value of the caseDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CaseDetailsAdd }
     *     
     */
    public void setCaseDetails(CaseDetailsAdd value) {
        this.caseDetails = value;
    }

}
