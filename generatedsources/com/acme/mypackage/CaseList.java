
package com.acme.mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CaseList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CaseList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CaseReferenceNumber" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}IDREF30"/&gt;
 *         &lt;element name="ProviderCaseReferenceNumber" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}IDREF35"/&gt;
 *         &lt;element name="Client" type="{http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIO}Client"/&gt;
 *         &lt;element name="FeeEarnerName" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C300" minOccurs="0"/&gt;
 *         &lt;element name="CategoryOfLaw" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C35"/&gt;
 *         &lt;element name="DisplayStatus" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}LOV" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CaseList", propOrder = {
    "caseReferenceNumber",
    "providerCaseReferenceNumber",
    "client",
    "feeEarnerName",
    "categoryOfLaw",
    "displayStatus"
})
public class CaseList {

    @XmlElement(name = "CaseReferenceNumber", required = true)
    protected String caseReferenceNumber;
    @XmlElement(name = "ProviderCaseReferenceNumber", required = true)
    protected String providerCaseReferenceNumber;
    @XmlElement(name = "Client", required = true)
    protected Client client;
    @XmlElement(name = "FeeEarnerName")
    protected String feeEarnerName;
    @XmlElement(name = "CategoryOfLaw", required = true)
    protected String categoryOfLaw;
    @XmlElement(name = "DisplayStatus")
    protected String displayStatus;

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
     * Gets the value of the providerCaseReferenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderCaseReferenceNumber() {
        return providerCaseReferenceNumber;
    }

    /**
     * Sets the value of the providerCaseReferenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderCaseReferenceNumber(String value) {
        this.providerCaseReferenceNumber = value;
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
     * Gets the value of the categoryOfLaw property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryOfLaw() {
        return categoryOfLaw;
    }

    /**
     * Sets the value of the categoryOfLaw property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryOfLaw(String value) {
        this.categoryOfLaw = value;
    }

    /**
     * Gets the value of the displayStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayStatus() {
        return displayStatus;
    }

    /**
     * Sets the value of the displayStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayStatus(String value) {
        this.displayStatus = value;
    }

}
