
package com.acme.mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns:common="http://legalservices.gov.uk/Enterprise/Common/1.0/Common" xmlns:header="http://legalservices.gov.uk/Enterprise/Common/1.0/Header" xmlns:lang="en" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Request Message for Header&lt;/Definition&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ChangeDescription xmlns:common="http://legalservices.gov.uk/Enterprise/Common/1.0/Common" xmlns:header="http://legalservices.gov.uk/Enterprise/Common/1.0/Header" xmlns:lang="en" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Initial&lt;/ChangeDescription&gt;
 * </pre>
 * 
 * 
 * <p>Java class for HeaderRQType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HeaderRQType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TransactionRequestID" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}TransactionID"/&gt;
 *         &lt;element name="Language" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}LanguageCode" minOccurs="0"/&gt;
 *         &lt;element name="TransactionIDREF" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}IDREF15" minOccurs="0"/&gt;
 *         &lt;element name="TransactionName" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C30" minOccurs="0"/&gt;
 *         &lt;element name="Source" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}SystemsList" minOccurs="0"/&gt;
 *         &lt;element name="Target" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}SystemsList" minOccurs="0"/&gt;
 *         &lt;element name="HostName" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C50" minOccurs="0"/&gt;
 *         &lt;element name="UserLoginID" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}ID100"/&gt;
 *         &lt;element name="UserRole" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C25" minOccurs="0"/&gt;
 *         &lt;element name="ApplicationResponsibility" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C25" minOccurs="0"/&gt;
 *         &lt;element name="TimeStamp" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}DtTm" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HeaderRQType", namespace = "http://legalservices.gov.uk/Enterprise/Common/1.0/Header", propOrder = {
    "transactionRequestID",
    "language",
    "transactionIDREF",
    "transactionName",
    "source",
    "target",
    "hostName",
    "userLoginID",
    "userRole",
    "applicationResponsibility",
    "timeStamp"
})
public class HeaderRQType {

    @XmlElement(name = "TransactionRequestID", required = true)
    protected String transactionRequestID;
    @XmlElement(name = "Language")
    protected String language;
    @XmlElement(name = "TransactionIDREF")
    protected String transactionIDREF;
    @XmlElement(name = "TransactionName")
    protected String transactionName;
    @XmlElement(name = "Source")
    @XmlSchemaType(name = "string")
    protected SystemsList source;
    @XmlElement(name = "Target")
    @XmlSchemaType(name = "string")
    protected SystemsList target;
    @XmlElement(name = "HostName")
    protected String hostName;
    @XmlElement(name = "UserLoginID", required = true)
    protected String userLoginID;
    @XmlElement(name = "UserRole")
    protected String userRole;
    @XmlElement(name = "ApplicationResponsibility")
    protected String applicationResponsibility;
    @XmlElement(name = "TimeStamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeStamp;

    /**
     * Gets the value of the transactionRequestID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionRequestID() {
        return transactionRequestID;
    }

    /**
     * Sets the value of the transactionRequestID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionRequestID(String value) {
        this.transactionRequestID = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the transactionIDREF property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionIDREF() {
        return transactionIDREF;
    }

    /**
     * Sets the value of the transactionIDREF property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionIDREF(String value) {
        this.transactionIDREF = value;
    }

    /**
     * Gets the value of the transactionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionName() {
        return transactionName;
    }

    /**
     * Sets the value of the transactionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionName(String value) {
        this.transactionName = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link SystemsList }
     *     
     */
    public SystemsList getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemsList }
     *     
     */
    public void setSource(SystemsList value) {
        this.source = value;
    }

    /**
     * Gets the value of the target property.
     * 
     * @return
     *     possible object is
     *     {@link SystemsList }
     *     
     */
    public SystemsList getTarget() {
        return target;
    }

    /**
     * Sets the value of the target property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemsList }
     *     
     */
    public void setTarget(SystemsList value) {
        this.target = value;
    }

    /**
     * Gets the value of the hostName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostName() {
        return hostName;
    }

    /**
     * Sets the value of the hostName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostName(String value) {
        this.hostName = value;
    }

    /**
     * Gets the value of the userLoginID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserLoginID() {
        return userLoginID;
    }

    /**
     * Sets the value of the userLoginID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserLoginID(String value) {
        this.userLoginID = value;
    }

    /**
     * Gets the value of the userRole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserRole() {
        return userRole;
    }

    /**
     * Sets the value of the userRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserRole(String value) {
        this.userRole = value;
    }

    /**
     * Gets the value of the applicationResponsibility property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationResponsibility() {
        return applicationResponsibility;
    }

    /**
     * Sets the value of the applicationResponsibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationResponsibility(String value) {
        this.applicationResponsibility = value;
    }

    /**
     * Gets the value of the timeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeStamp() {
        return timeStamp;
    }

    /**
     * Sets the value of the timeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeStamp(XMLGregorianCalendar value) {
        this.timeStamp = value;
    }

}
