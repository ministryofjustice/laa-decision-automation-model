
package com.acme.mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentUploadRS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentUploadRS"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://legalservices.gov.uk/Enterprise/Common/1.0/Header}HeaderRS"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="NotificationID" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}ID15" minOccurs="0"/&gt;
 *           &lt;element name="CaseReferenceNumber" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}ID15" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="DocumentID" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}ID15" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentUploadRS", namespace = "http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIM", propOrder = {
    "headerRS",
    "notificationID",
    "caseReferenceNumber",
    "documentID"
})
public class DocumentUploadRS {

    @XmlElement(name = "HeaderRS", namespace = "http://legalservices.gov.uk/Enterprise/Common/1.0/Header", required = true)
    protected HeaderRSType headerRS;
    @XmlElement(name = "NotificationID")
    protected String notificationID;
    @XmlElement(name = "CaseReferenceNumber")
    protected String caseReferenceNumber;
    @XmlElement(name = "DocumentID")
    protected String documentID;

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
     * Gets the value of the documentID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentID() {
        return documentID;
    }

    /**
     * Sets the value of the documentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentID(String value) {
        this.documentID = value;
    }

}
