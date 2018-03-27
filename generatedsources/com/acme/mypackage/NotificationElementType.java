
package com.acme.mypackage;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for NotificationElementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotificationElementType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NotificationID" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}ID15"/&gt;
 *         &lt;element name="ProviderFirmID" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Subject" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C150" minOccurs="0"/&gt;
 *         &lt;element name="AssignDate" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}Dt" minOccurs="0"/&gt;
 *         &lt;element name="DueDate" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}Dt" minOccurs="0"/&gt;
 *         &lt;element name="NotitificationType" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}LOV"/&gt;
 *         &lt;element name="Status" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}LOV"/&gt;
 *         &lt;element name="Notes" type="{http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIO}Notes" minOccurs="0"/&gt;
 *         &lt;element name="EvidenceAllowed" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}BooleanString" minOccurs="0"/&gt;
 *         &lt;element name="NotificationOpenInd" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}BooleanString" minOccurs="0"/&gt;
 *         &lt;element name="AttachedDocuments" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Document" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}DocumentElementType" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UploadedDocuments" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Document" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}DocumentElementType" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AvailableResponses" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Response" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}LOV" maxOccurs="unbounded"/&gt;
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
@XmlType(name = "NotificationElementType", propOrder = {
    "notificationID",
    "providerFirmID",
    "subject",
    "assignDate",
    "dueDate",
    "notitificationType",
    "status",
    "notes",
    "evidenceAllowed",
    "notificationOpenInd",
    "attachedDocuments",
    "uploadedDocuments",
    "availableResponses"
})
public class NotificationElementType {

    @XmlElement(name = "NotificationID", required = true)
    protected String notificationID;
    @XmlElement(name = "ProviderFirmID")
    protected BigDecimal providerFirmID;
    @XmlElement(name = "Subject")
    protected String subject;
    @XmlElement(name = "AssignDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar assignDate;
    @XmlElement(name = "DueDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dueDate;
    @XmlElement(name = "NotitificationType", required = true)
    protected String notitificationType;
    @XmlElement(name = "Status", required = true)
    protected String status;
    @XmlElement(name = "Notes")
    protected Notes notes;
    @XmlElement(name = "EvidenceAllowed")
    protected Boolean evidenceAllowed;
    @XmlElement(name = "NotificationOpenInd")
    protected Boolean notificationOpenInd;
    @XmlElement(name = "AttachedDocuments")
    protected NotificationElementType.AttachedDocuments attachedDocuments;
    @XmlElement(name = "UploadedDocuments")
    protected NotificationElementType.UploadedDocuments uploadedDocuments;
    @XmlElement(name = "AvailableResponses")
    protected NotificationElementType.AvailableResponses availableResponses;

    /**
     * Gets the value of the notificationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotificationID() {
        return notificationID;
    }

    /**
     * Sets the value of the notificationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotificationID(String value) {
        this.notificationID = value;
    }

    /**
     * Gets the value of the providerFirmID property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getProviderFirmID() {
        return providerFirmID;
    }

    /**
     * Sets the value of the providerFirmID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setProviderFirmID(BigDecimal value) {
        this.providerFirmID = value;
    }

    /**
     * Gets the value of the subject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Sets the value of the subject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubject(String value) {
        this.subject = value;
    }

    /**
     * Gets the value of the assignDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAssignDate() {
        return assignDate;
    }

    /**
     * Sets the value of the assignDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAssignDate(XMLGregorianCalendar value) {
        this.assignDate = value;
    }

    /**
     * Gets the value of the dueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDueDate() {
        return dueDate;
    }

    /**
     * Sets the value of the dueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDueDate(XMLGregorianCalendar value) {
        this.dueDate = value;
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
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link Notes }
     *     
     */
    public Notes getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Notes }
     *     
     */
    public void setNotes(Notes value) {
        this.notes = value;
    }

    /**
     * Gets the value of the evidenceAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEvidenceAllowed() {
        return evidenceAllowed;
    }

    /**
     * Sets the value of the evidenceAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEvidenceAllowed(Boolean value) {
        this.evidenceAllowed = value;
    }

    /**
     * Gets the value of the notificationOpenInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNotificationOpenInd() {
        return notificationOpenInd;
    }

    /**
     * Sets the value of the notificationOpenInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNotificationOpenInd(Boolean value) {
        this.notificationOpenInd = value;
    }

    /**
     * Gets the value of the attachedDocuments property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationElementType.AttachedDocuments }
     *     
     */
    public NotificationElementType.AttachedDocuments getAttachedDocuments() {
        return attachedDocuments;
    }

    /**
     * Sets the value of the attachedDocuments property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationElementType.AttachedDocuments }
     *     
     */
    public void setAttachedDocuments(NotificationElementType.AttachedDocuments value) {
        this.attachedDocuments = value;
    }

    /**
     * Gets the value of the uploadedDocuments property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationElementType.UploadedDocuments }
     *     
     */
    public NotificationElementType.UploadedDocuments getUploadedDocuments() {
        return uploadedDocuments;
    }

    /**
     * Sets the value of the uploadedDocuments property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationElementType.UploadedDocuments }
     *     
     */
    public void setUploadedDocuments(NotificationElementType.UploadedDocuments value) {
        this.uploadedDocuments = value;
    }

    /**
     * Gets the value of the availableResponses property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationElementType.AvailableResponses }
     *     
     */
    public NotificationElementType.AvailableResponses getAvailableResponses() {
        return availableResponses;
    }

    /**
     * Sets the value of the availableResponses property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationElementType.AvailableResponses }
     *     
     */
    public void setAvailableResponses(NotificationElementType.AvailableResponses value) {
        this.availableResponses = value;
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
     *         &lt;element name="Document" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}DocumentElementType" maxOccurs="unbounded"/&gt;
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
        "document"
    })
    public static class AttachedDocuments {

        @XmlElement(name = "Document", required = true)
        protected List<DocumentElementType> document;

        /**
         * Gets the value of the document property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the document property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDocument().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DocumentElementType }
         * 
         * 
         */
        public List<DocumentElementType> getDocument() {
            if (document == null) {
                document = new ArrayList<DocumentElementType>();
            }
            return this.document;
        }

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
     *         &lt;element name="Response" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}LOV" maxOccurs="unbounded"/&gt;
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
        "response"
    })
    public static class AvailableResponses {

        @XmlElement(name = "Response", required = true)
        protected List<String> response;

        /**
         * Gets the value of the response property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the response property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getResponse().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getResponse() {
            if (response == null) {
                response = new ArrayList<String>();
            }
            return this.response;
        }

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
     *         &lt;element name="Document" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}DocumentElementType" maxOccurs="unbounded"/&gt;
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
        "document"
    })
    public static class UploadedDocuments {

        @XmlElement(name = "Document", required = true)
        protected List<DocumentElementType> document;

        /**
         * Gets the value of the document property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the document property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDocument().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DocumentElementType }
         * 
         * 
         */
        public List<DocumentElementType> getDocument() {
            if (document == null) {
                document = new ArrayList<DocumentElementType>();
            }
            return this.document;
        }

    }

}
