
package com.acme.mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NotificationCntList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotificationCntList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AssignedToPartyID" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}IDREF30" minOccurs="0"/&gt;
 *         &lt;element name="AssignedToPartyName" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C360" minOccurs="0"/&gt;
 *         &lt;element name="NotificationCount" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}IDREF30"/&gt;
 *         &lt;element name="StandardActionCount" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}IDREF30"/&gt;
 *         &lt;element name="OverdueActionCount" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}IDREF30"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotificationCntList", propOrder = {
    "assignedToPartyID",
    "assignedToPartyName",
    "notificationCount",
    "standardActionCount",
    "overdueActionCount"
})
public class NotificationCntList {

    @XmlElement(name = "AssignedToPartyID")
    protected String assignedToPartyID;
    @XmlElement(name = "AssignedToPartyName")
    protected String assignedToPartyName;
    @XmlElement(name = "NotificationCount", required = true)
    protected String notificationCount;
    @XmlElement(name = "StandardActionCount", required = true)
    protected String standardActionCount;
    @XmlElement(name = "OverdueActionCount", required = true)
    protected String overdueActionCount;

    /**
     * Gets the value of the assignedToPartyID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssignedToPartyID() {
        return assignedToPartyID;
    }

    /**
     * Sets the value of the assignedToPartyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssignedToPartyID(String value) {
        this.assignedToPartyID = value;
    }

    /**
     * Gets the value of the assignedToPartyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssignedToPartyName() {
        return assignedToPartyName;
    }

    /**
     * Sets the value of the assignedToPartyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssignedToPartyName(String value) {
        this.assignedToPartyName = value;
    }

    /**
     * Gets the value of the notificationCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotificationCount() {
        return notificationCount;
    }

    /**
     * Sets the value of the notificationCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotificationCount(String value) {
        this.notificationCount = value;
    }

    /**
     * Gets the value of the standardActionCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStandardActionCount() {
        return standardActionCount;
    }

    /**
     * Sets the value of the standardActionCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStandardActionCount(String value) {
        this.standardActionCount = value;
    }

    /**
     * Gets the value of the overdueActionCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverdueActionCount() {
        return overdueActionCount;
    }

    /**
     * Sets the value of the overdueActionCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverdueActionCount(String value) {
        this.overdueActionCount = value;
    }

}
