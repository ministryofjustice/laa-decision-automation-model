
package com.acme.mypackage;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns:common="http://legalservices.gov.uk/Enterprise/Common/1.0/Common" xmlns:header="http://legalservices.gov.uk/Enterprise/Common/1.0/Header" xmlns:lang="en" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Response Message for Header&lt;/Definition&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ChangeDescription xmlns:common="http://legalservices.gov.uk/Enterprise/Common/1.0/Common" xmlns:header="http://legalservices.gov.uk/Enterprise/Common/1.0/Header" xmlns:lang="en" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Initial&lt;/ChangeDescription&gt;
 * </pre>
 * 
 * 
 * <p>Java class for HeaderRSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HeaderRSType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TransactionID" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}TransactionID"/&gt;
 *         &lt;element name="RequestDetails" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Header}HeaderRQType"/&gt;
 *         &lt;element name="ResultCount" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}Integer" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Header}Status"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HeaderRSType", namespace = "http://legalservices.gov.uk/Enterprise/Common/1.0/Header", propOrder = {
    "transactionID",
    "requestDetails",
    "resultCount",
    "status"
})
public class HeaderRSType {

    @XmlElement(name = "TransactionID", required = true)
    protected String transactionID;
    @XmlElement(name = "RequestDetails", required = true)
    protected HeaderRQType requestDetails;
    @XmlElement(name = "ResultCount")
    protected BigInteger resultCount;
    @XmlElement(name = "Status", required = true)
    protected Status status;

    /**
     * Gets the value of the transactionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionID() {
        return transactionID;
    }

    /**
     * Sets the value of the transactionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionID(String value) {
        this.transactionID = value;
    }

    /**
     * Gets the value of the requestDetails property.
     * 
     * @return
     *     possible object is
     *     {@link HeaderRQType }
     *     
     */
    public HeaderRQType getRequestDetails() {
        return requestDetails;
    }

    /**
     * Sets the value of the requestDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link HeaderRQType }
     *     
     */
    public void setRequestDetails(HeaderRQType value) {
        this.requestDetails = value;
    }

    /**
     * Gets the value of the resultCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getResultCount() {
        return resultCount;
    }

    /**
     * Sets the value of the resultCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setResultCount(BigInteger value) {
        this.resultCount = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Status }
     *     
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Status }
     *     
     */
    public void setStatus(Status value) {
        this.status = value;
    }

}
