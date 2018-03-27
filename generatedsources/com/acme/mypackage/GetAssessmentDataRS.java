
package com.acme.mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetAssessmentDataRS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetAssessmentDataRS"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://legalservices.gov.uk/Enterprise/Common/1.0/Header}HeaderRS"/&gt;
 *         &lt;element name="LatestAssessmentResults" type="{http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIO}AssessmentResultsElementType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetAssessmentDataRS", namespace = "http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIM", propOrder = {
    "headerRS",
    "latestAssessmentResults"
})
public class GetAssessmentDataRS {

    @XmlElement(name = "HeaderRS", namespace = "http://legalservices.gov.uk/Enterprise/Common/1.0/Header", required = true)
    protected HeaderRSType headerRS;
    @XmlElement(name = "LatestAssessmentResults")
    protected AssessmentResultsElementType2 latestAssessmentResults;

    /**
     * Gets the value of the headerRS property.
     * 
     * @return
     *     possible object is
     *     {@link HeaderRSType }
     *     
     */
    public HeaderRSType getHeaderRS() {
        return headerRS;
    }

    /**
     * Sets the value of the headerRS property.
     * 
     * @param value
     *     allowed object is
     *     {@link HeaderRSType }
     *     
     */
    public void setHeaderRS(HeaderRSType value) {
        this.headerRS = value;
    }

    /**
     * Gets the value of the latestAssessmentResults property.
     * 
     * @return
     *     possible object is
     *     {@link AssessmentResultsElementType2 }
     *     
     */
    public AssessmentResultsElementType2 getLatestAssessmentResults() {
        return latestAssessmentResults;
    }

    /**
     * Sets the value of the latestAssessmentResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssessmentResultsElementType2 }
     *     
     */
    public void setLatestAssessmentResults(AssessmentResultsElementType2 value) {
        this.latestAssessmentResults = value;
    }

}
