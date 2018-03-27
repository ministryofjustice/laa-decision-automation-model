
package com.acme.mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CaseInqRQ complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CaseInqRQ"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://legalservices.gov.uk/Enterprise/Common/1.0/Header}HeaderRQ"/&gt;
 *         &lt;element name="RecordCount" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}RecordCount"/&gt;
 *         &lt;element name="SearchCriteria"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;choice&gt;
 *                     &lt;element name="CaseReferenceNumber" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}IDREF30"/&gt;
 *                     &lt;element name="CaseInfo" type="{http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIO}CaseInfo"/&gt;
 *                   &lt;/choice&gt;
 *                   &lt;element name="CaseSortOrder" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C50" minOccurs="0"/&gt;
 *                   &lt;element name="SearchForLinkedCases" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}BooleanString" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CaseInqRQ", namespace = "http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIM", propOrder = {
    "headerRQ",
    "recordCount",
    "searchCriteria"
})
public class CaseInqRQ {

    @XmlElement(name = "HeaderRQ", namespace = "http://legalservices.gov.uk/Enterprise/Common/1.0/Header", required = true)
    protected HeaderRQType headerRQ;
    @XmlElement(name = "RecordCount", required = true)
    protected RecordCount recordCount;
    @XmlElement(name = "SearchCriteria", required = true)
    protected CaseInqRQ.SearchCriteria searchCriteria;

    /**
     * Gets the value of the headerRQ property.
     * 
     * @return
     *     possible object is
     *     {@link HeaderRQType }
     *     
     */
    public HeaderRQType getHeaderRQ() {
        return headerRQ;
    }

    /**
     * Sets the value of the headerRQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link HeaderRQType }
     *     
     */
    public void setHeaderRQ(HeaderRQType value) {
        this.headerRQ = value;
    }

    /**
     * Gets the value of the recordCount property.
     * 
     * @return
     *     possible object is
     *     {@link RecordCount }
     *     
     */
    public RecordCount getRecordCount() {
        return recordCount;
    }

    /**
     * Sets the value of the recordCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordCount }
     *     
     */
    public void setRecordCount(RecordCount value) {
        this.recordCount = value;
    }

    /**
     * Gets the value of the searchCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link CaseInqRQ.SearchCriteria }
     *     
     */
    public CaseInqRQ.SearchCriteria getSearchCriteria() {
        return searchCriteria;
    }

    /**
     * Sets the value of the searchCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link CaseInqRQ.SearchCriteria }
     *     
     */
    public void setSearchCriteria(CaseInqRQ.SearchCriteria value) {
        this.searchCriteria = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;choice&gt;
     *           &lt;element name="CaseReferenceNumber" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}IDREF30"/&gt;
     *           &lt;element name="CaseInfo" type="{http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIO}CaseInfo"/&gt;
     *         &lt;/choice&gt;
     *         &lt;element name="CaseSortOrder" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C50" minOccurs="0"/&gt;
     *         &lt;element name="SearchForLinkedCases" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}BooleanString" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "caseReferenceNumber",
        "caseInfo",
        "caseSortOrder",
        "searchForLinkedCases"
    })
    public static class SearchCriteria {

        @XmlElement(name = "CaseReferenceNumber", namespace = "http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIM")
        protected String caseReferenceNumber;
        @XmlElement(name = "CaseInfo", namespace = "http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIM")
        protected CaseInfo caseInfo;
        @XmlElement(name = "CaseSortOrder", namespace = "http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIM")
        protected String caseSortOrder;
        @XmlElement(name = "SearchForLinkedCases", namespace = "http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIM")
        protected Boolean searchForLinkedCases;

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
         * Gets the value of the caseInfo property.
         * 
         * @return
         *     possible object is
         *     {@link CaseInfo }
         *     
         */
        public CaseInfo getCaseInfo() {
            return caseInfo;
        }

        /**
         * Sets the value of the caseInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link CaseInfo }
         *     
         */
        public void setCaseInfo(CaseInfo value) {
            this.caseInfo = value;
        }

        /**
         * Gets the value of the caseSortOrder property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCaseSortOrder() {
            return caseSortOrder;
        }

        /**
         * Sets the value of the caseSortOrder property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCaseSortOrder(String value) {
            this.caseSortOrder = value;
        }

        /**
         * Gets the value of the searchForLinkedCases property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isSearchForLinkedCases() {
            return searchForLinkedCases;
        }

        /**
         * Sets the value of the searchForLinkedCases property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setSearchForLinkedCases(Boolean value) {
            this.searchForLinkedCases = value;
        }

    }

}
