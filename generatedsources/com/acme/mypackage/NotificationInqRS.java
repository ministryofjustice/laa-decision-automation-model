
package com.acme.mypackage;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NotificationInqRS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotificationInqRS"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://legalservices.gov.uk/Enterprise/Common/1.0/Header}HeaderRS"/&gt;
 *         &lt;element name="RecordCount" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}RecordCount"/&gt;
 *         &lt;element name="NotificationList" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Notifications" type="{http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIO}NotificationListElementType" maxOccurs="unbounded"/&gt;
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
@XmlType(name = "NotificationInqRS", namespace = "http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIM", propOrder = {
    "headerRS",
    "recordCount",
    "notificationList"
})
public class NotificationInqRS {

    @XmlElement(name = "HeaderRS", namespace = "http://legalservices.gov.uk/Enterprise/Common/1.0/Header", required = true)
    protected HeaderRSType headerRS;
    @XmlElement(name = "RecordCount", required = true)
    protected RecordCount recordCount;
    @XmlElement(name = "NotificationList")
    protected NotificationInqRS.NotificationList notificationList;

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
     * Gets the value of the notificationList property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationInqRS.NotificationList }
     *     
     */
    public NotificationInqRS.NotificationList getNotificationList() {
        return notificationList;
    }

    /**
     * Sets the value of the notificationList property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationInqRS.NotificationList }
     *     
     */
    public void setNotificationList(NotificationInqRS.NotificationList value) {
        this.notificationList = value;
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
     *         &lt;element name="Notifications" type="{http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIO}NotificationListElementType" maxOccurs="unbounded"/&gt;
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
        "notifications"
    })
    public static class NotificationList {

        @XmlElement(name = "Notifications", namespace = "http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIM", required = true)
        protected List<NotificationListElementType> notifications;

        /**
         * Gets the value of the notifications property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the notifications property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNotifications().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link NotificationListElementType }
         * 
         * 
         */
        public List<NotificationListElementType> getNotifications() {
            if (notifications == null) {
                notifications = new ArrayList<NotificationListElementType>();
            }
            return this.notifications;
        }

    }

}
