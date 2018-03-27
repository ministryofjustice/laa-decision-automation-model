
package com.acme.mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NotificationListElementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotificationListElementType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ClientReferenceNumber" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}IDREF30" minOccurs="0"/&gt;
 *         &lt;element name="CaseReferenceNumber" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}IDREF30" minOccurs="0"/&gt;
 *         &lt;element name="ProviderCaseReferenceNumber" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}IDREF35" minOccurs="0"/&gt;
 *         &lt;element name="User" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}User" minOccurs="0"/&gt;
 *         &lt;element name="ClientName" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C35" minOccurs="0"/&gt;
 *         &lt;element name="CategoryOfLaw" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C50" minOccurs="0"/&gt;
 *         &lt;element name="FeeEarner" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C300" minOccurs="0"/&gt;
 *         &lt;element name="Notification" type="{http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIO}NotificationElementType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotificationListElementType", propOrder = {
    "clientReferenceNumber",
    "caseReferenceNumber",
    "providerCaseReferenceNumber",
    "user",
    "clientName",
    "categoryOfLaw",
    "feeEarner",
    "notification"
})
public class NotificationListElementType {

    @XmlElement(name = "ClientReferenceNumber")
    protected String clientReferenceNumber;
    @XmlElement(name = "CaseReferenceNumber")
    protected String caseReferenceNumber;
    @XmlElement(name = "ProviderCaseReferenceNumber")
    protected String providerCaseReferenceNumber;
    @XmlElement(name = "User")
    protected User user;
    @XmlElement(name = "ClientName")
    protected String clientName;
    @XmlElement(name = "CategoryOfLaw")
    protected String categoryOfLaw;
    @XmlElement(name = "FeeEarner")
    protected String feeEarner;
    @XmlElement(name = "Notification", required = true)
    protected NotificationElementType notification;

    /**
     * Gets the value of the clientReferenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientReferenceNumber() {
        return clientReferenceNumber;
    }

    /**
     * Sets the value of the clientReferenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientReferenceNumber(String value) {
        this.clientReferenceNumber = value;
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
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setUser(User value) {
        this.user = value;
    }

    /**
     * Gets the value of the clientName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientName() {
        return clientName;
    }

    /**
     * Sets the value of the clientName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientName(String value) {
        this.clientName = value;
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
     * Gets the value of the feeEarner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeeEarner() {
        return feeEarner;
    }

    /**
     * Sets the value of the feeEarner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeeEarner(String value) {
        this.feeEarner = value;
    }

    /**
     * Gets the value of the notification property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationElementType }
     *     
     */
    public NotificationElementType getNotification() {
        return notification;
    }

    /**
     * Sets the value of the notification property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationElementType }
     *     
     */
    public void setNotification(NotificationElementType value) {
        this.notification = value;
    }

}
