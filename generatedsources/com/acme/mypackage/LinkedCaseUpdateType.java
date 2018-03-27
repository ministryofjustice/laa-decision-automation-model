
package com.acme.mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LinkedCaseUpdateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LinkedCaseUpdateType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CaseReferenceNumber" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}IDREF15"/&gt;
 *         &lt;element name="LinkType" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}LOV"/&gt;
 *         &lt;element name="PublicFundingAppliedInd" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}BooleanString" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LinkedCaseUpdateType", propOrder = {
    "caseReferenceNumber",
    "linkType",
    "publicFundingAppliedInd"
})
public class LinkedCaseUpdateType {

    @XmlElement(name = "CaseReferenceNumber", required = true)
    protected String caseReferenceNumber;
    @XmlElement(name = "LinkType", required = true)
    protected String linkType;
    @XmlElement(name = "PublicFundingAppliedInd")
    protected Boolean publicFundingAppliedInd;

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
     * Gets the value of the linkType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkType() {
        return linkType;
    }

    /**
     * Sets the value of the linkType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkType(String value) {
        this.linkType = value;
    }

    /**
     * Gets the value of the publicFundingAppliedInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPublicFundingAppliedInd() {
        return publicFundingAppliedInd;
    }

    /**
     * Sets the value of the publicFundingAppliedInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPublicFundingAppliedInd(Boolean value) {
        this.publicFundingAppliedInd = value;
    }

}
