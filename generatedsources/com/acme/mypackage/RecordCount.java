
package com.acme.mypackage;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Record Count
 * 
 * <p>Java class for RecordCount complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecordCount"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MaxRecordsToFetch" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}Integer"/&gt;
 *         &lt;element name="RecordsFetched" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}Integer" minOccurs="0"/&gt;
 *         &lt;element name="RetriveDataOnMaxCount" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}BooleanString"/&gt;
 *         &lt;element name="SortCriteria" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}LOV" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecordCount", namespace = "http://legalservices.gov.uk/Enterprise/Common/1.0/Common", propOrder = {
    "maxRecordsToFetch",
    "recordsFetched",
    "retriveDataOnMaxCount",
    "sortCriteria"
})
public class RecordCount {

    @XmlElement(name = "MaxRecordsToFetch", required = true, defaultValue = "10")
    protected BigInteger maxRecordsToFetch;
    @XmlElement(name = "RecordsFetched")
    protected BigInteger recordsFetched;
    @XmlElement(name = "RetriveDataOnMaxCount", defaultValue = "false")
    protected boolean retriveDataOnMaxCount;
    @XmlElement(name = "SortCriteria")
    protected String sortCriteria;

    /**
     * Gets the value of the maxRecordsToFetch property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxRecordsToFetch() {
        return maxRecordsToFetch;
    }

    /**
     * Sets the value of the maxRecordsToFetch property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxRecordsToFetch(BigInteger value) {
        this.maxRecordsToFetch = value;
    }

    /**
     * Gets the value of the recordsFetched property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRecordsFetched() {
        return recordsFetched;
    }

    /**
     * Sets the value of the recordsFetched property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRecordsFetched(BigInteger value) {
        this.recordsFetched = value;
    }

    /**
     * Gets the value of the retriveDataOnMaxCount property.
     * 
     */
    public boolean isRetriveDataOnMaxCount() {
        return retriveDataOnMaxCount;
    }

    /**
     * Sets the value of the retriveDataOnMaxCount property.
     * 
     */
    public void setRetriveDataOnMaxCount(boolean value) {
        this.retriveDataOnMaxCount = value;
    }

    /**
     * Gets the value of the sortCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSortCriteria() {
        return sortCriteria;
    }

    /**
     * Sets the value of the sortCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSortCriteria(String value) {
        this.sortCriteria = value;
    }

}
