
package com.acme.mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for NotificationInqRQ complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotificationInqRQ"&gt;
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
 *                   &lt;element name="AssignedToUserID" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}ID15" minOccurs="0"/&gt;
 *                   &lt;element name="DateFrom" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}Dt" minOccurs="0"/&gt;
 *                   &lt;element name="DateTo" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}Dt" minOccurs="0"/&gt;
 *                   &lt;element name="CaseReferenceNumber" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}IDREF30" minOccurs="0"/&gt;
 *                   &lt;element name="ClientSurName" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C35" minOccurs="0"/&gt;
 *                   &lt;element name="FeeEarnerID" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}ID15" minOccurs="0"/&gt;
 *                   &lt;element name="ProviderCaseReferenceNumber" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}IDREF30" minOccurs="0"/&gt;
 *                   &lt;element name="NotitificationType" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}LOV" minOccurs="0"/&gt;
 *                   &lt;element name="IncludeClosedNotification" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}BooleanString" minOccurs="0"/&gt;
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
@XmlType(name = "NotificationInqRQ", namespace = "http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIM", propOrder = {
    "headerRQ",
    "recordCount",
    "searchCriteria"
})
public class NotificationInqRQ {

    @XmlElement(name = "HeaderRQ", namespace = "http://legalservices.gov.uk/Enterprise/Common/1.0/Header", required = true)
    protected HeaderRQType headerRQ;
    @XmlElement(name = "RecordCount", required = true)
    protected RecordCount recordCount;
    @XmlElement(name = "SearchCriteria", required = true)
    protected NotificationInqRQ.SearchCriteria searchCriteria;

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
     *     {@link NotificationInqRQ.SearchCriteria }
     *     
     */
    public NotificationInqRQ.SearchCriteria getSearchCriteria() {
        return searchCriteria;
    }

    /**
     * Sets the value of the searchCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationInqRQ.SearchCriteria }
     *     
     */
    public void setSearchCriteria(NotificationInqRQ.SearchCriteria value) {
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
     *         &lt;element name="AssignedToUserID" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}ID15" minOccurs="0"/&gt;
     *         &lt;element name="DateFrom" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}Dt" minOccurs="0"/&gt;
     *         &lt;element name="DateTo" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}Dt" minOccurs="0"/&gt;
     *         &lt;element name="CaseReferenceNumber" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}IDREF30" minOccurs="0"/&gt;
     *         &lt;element name="ClientSurName" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C35" minOccurs="0"/&gt;
     *         &lt;element name="FeeEarnerID" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}ID15" minOccurs="0"/&gt;
     *         &lt;element name="ProviderCaseReferenceNumber" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}IDREF30" minOccurs="0"/&gt;
     *         &lt;element name="NotitificationType" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}LOV" minOccurs="0"/&gt;
     *         &lt;element name="IncludeClosedNotification" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}BooleanString" minOccurs="0"/&gt;
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
        "assignedToUserID",
        "dateFrom",
        "dateTo",
        "caseReferenceNumber",
        "clientSurName",
        "feeEarnerID",
        "providerCaseReferenceNumber",
        "notitificationType",
        "includeClosedNotification"
    })
    public static class SearchCriteria {

        @XmlElement(name = "AssignedToUserID", namespace = "http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIM")
        protected String assignedToUserID;
        @XmlElement(name = "DateFrom", namespace = "http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIM")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar dateFrom;
        @XmlElement(name = "DateTo", namespace = "http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIM")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar dateTo;
        @XmlElement(name = "CaseReferenceNumber", namespace = "http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIM")
        protected String caseReferenceNumber;
        @XmlElement(name = "ClientSurName", namespace = "http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIM")
        protected String clientSurName;
        @XmlElement(name = "FeeEarnerID", namespace = "http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIM")
        protected String feeEarnerID;
        @XmlElement(name = "ProviderCaseReferenceNumber", namespace = "http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIM")
        protected String providerCaseReferenceNumber;
        @XmlElement(name = "NotitificationType", namespace = "http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIM")
        protected String notitificationType;
        @XmlElement(name = "IncludeClosedNotification", namespace = "http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIM")
        protected Boolean includeClosedNotification;

        /**
         * Gets the value of the assignedToUserID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssignedToUserID() {
            return assignedToUserID;
        }

        /**
         * Sets the value of the assignedToUserID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssignedToUserID(String value) {
            this.assignedToUserID = value;
        }

        /**
         * Gets the value of the dateFrom property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDateFrom() {
            return dateFrom;
        }

        /**
         * Sets the value of the dateFrom property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDateFrom(XMLGregorianCalendar value) {
            this.dateFrom = value;
        }

        /**
         * Gets the value of the dateTo property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDateTo() {
            return dateTo;
        }

        /**
         * Sets the value of the dateTo property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDateTo(XMLGregorianCalendar value) {
            this.dateTo = value;
        }

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
         * Gets the value of the clientSurName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getClientSurName() {
            return clientSurName;
        }

        /**
         * Sets the value of the clientSurName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setClientSurName(String value) {
            this.clientSurName = value;
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
         * Gets the value of the notitificationType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNotitificationType() {
            return notitificationType;
        }

        /**
         * Sets the value of the notitificationType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNotitificationType(String value) {
            this.notitificationType = value;
        }

        /**
         * Gets the value of the includeClosedNotification property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isIncludeClosedNotification() {
            return includeClosedNotification;
        }

        /**
         * Sets the value of the includeClosedNotification property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setIncludeClosedNotification(Boolean value) {
            this.includeClosedNotification = value;
        }

    }

}
