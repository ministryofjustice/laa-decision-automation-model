
package com.acme.mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LinkedCaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LinkedCaseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CaseReferenceNumber" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}IDREF30"/&gt;
 *         &lt;element name="ProviderReferenceNumber" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}IDREF30" minOccurs="0"/&gt;
 *         &lt;element name="Client" type="{http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIO}Client"/&gt;
 *         &lt;element name="CategoryOfLawCode" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}LOV"/&gt;
 *         &lt;element name="CategoryOfLawDesc" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C150"/&gt;
 *         &lt;element name="FeeEarnerID" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}ID15" minOccurs="0"/&gt;
 *         &lt;element name="FeeEarnerName" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C300" minOccurs="0"/&gt;
 *         &lt;element name="PublicFundingAppliedInd" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}BooleanString" minOccurs="0"/&gt;
 *         &lt;element name="LinkType" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}LOV"/&gt;
 *         &lt;element name="CaseStatus" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}LOV"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LinkedCaseType", propOrder = {
    "caseReferenceNumber",
    "providerReferenceNumber",
    "client",
    "categoryOfLawCode",
    "categoryOfLawDesc",
    "feeEarnerID",
    "feeEarnerName",
    "publicFundingAppliedInd",
    "linkType",
    "caseStatus"
})
public class LinkedCaseType {

    @XmlElement(name = "CaseReferenceNumber", required = true)
    protected String caseReferenceNumber;
    @XmlElement(name = "ProviderReferenceNumber")
    protected String providerReferenceNumber;
    @XmlElement(name = "Client", required = true)
    protected Client client;
    @XmlElement(name = "CategoryOfLawCode", required = true)
    protected String categoryOfLawCode;
    @XmlElement(name = "CategoryOfLawDesc", required = true)
    protected String categoryOfLawDesc;
    @XmlElement(name = "FeeEarnerID")
    protected String feeEarnerID;
    @XmlElement(name = "FeeEarnerName")
    protected String feeEarnerName;
    @XmlElement(name = "PublicFundingAppliedInd")
    protected Boolean publicFundingAppliedInd;
    @XmlElement(name = "LinkType", required = true)
    protected String linkType;
    @XmlElement(name = "CaseStatus", required = true)
    protected String caseStatus;

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
     * Gets the value of the providerReferenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderReferenceNumber() {
        return providerReferenceNumber;
    }

    /**
     * Sets the value of the providerReferenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderReferenceNumber(String value) {
        this.providerReferenceNumber = value;
    }

    /**
     * Gets the value of the client property.
     * 
     * @return
     *     possible object is
     *     {@link Client }
     *     
     */
    public Client getClient() {
        return client;
    }

    /**
     * Sets the value of the client property.
     * 
     * @param value
     *     allowed object is
     *     {@link Client }
     *     
     */
    public void setClient(Client value) {
        this.client = value;
    }

    /**
     * Gets the value of the categoryOfLawCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryOfLawCode() {
        return categoryOfLawCode;
    }

    /**
     * Sets the value of the categoryOfLawCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryOfLawCode(String value) {
        this.categoryOfLawCode = value;
    }

    /**
     * Gets the value of the categoryOfLawDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryOfLawDesc() {
        return categoryOfLawDesc;
    }

    /**
     * Sets the value of the categoryOfLawDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryOfLawDesc(String value) {
        this.categoryOfLawDesc = value;
    }

    /**
     * Gets the value of the feeEarnerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeeEarnerID() {
        return feeEarnerID;
    }

    /**
     * Sets the value of the feeEarnerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeeEarnerID(String value) {
        this.feeEarnerID = value;
    }

    /**
     * Gets the value of the feeEarnerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeeEarnerName() {
        return feeEarnerName;
    }

    /**
     * Sets the value of the feeEarnerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeeEarnerName(String value) {
        this.feeEarnerName = value;
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
     * Gets the value of the caseStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseStatus() {
        return caseStatus;
    }

    /**
     * Sets the value of the caseStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseStatus(String value) {
        this.caseStatus = value;
    }

}
