
package com.acme.mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentStatusElementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentStatusElementType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CCMSDocumentID" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C50" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C50" minOccurs="0"/&gt;
 *         &lt;element name="StatusDescription" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C50" minOccurs="0"/&gt;
 *         &lt;element name="EDRMSFilePath" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C100" minOccurs="0"/&gt;
 *         &lt;element name="FileType" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C10" minOccurs="0"/&gt;
 *         &lt;element name="DocumentClass" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C20" minOccurs="0"/&gt;
 *         &lt;element name="DocumentType" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C20" minOccurs="0"/&gt;
 *         &lt;element name="DocumentTypeDescription" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C50" minOccurs="0"/&gt;
 *         &lt;element name="DocumentDescription" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C100" minOccurs="0"/&gt;
 *         &lt;element name="Version" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C20" minOccurs="0"/&gt;
 *         &lt;element name="DateCreated" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C14" minOccurs="0"/&gt;
 *         &lt;element name="DocumentOwner" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C20" minOccurs="0"/&gt;
 *         &lt;element name="DateLastAmended" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C14" minOccurs="0"/&gt;
 *         &lt;element name="LastAmendedBy" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C20" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentStatusElementType", propOrder = {
    "ccmsDocumentID",
    "status",
    "statusDescription",
    "edrmsFilePath",
    "fileType",
    "documentClass",
    "documentType",
    "documentTypeDescription",
    "documentDescription",
    "version",
    "dateCreated",
    "documentOwner",
    "dateLastAmended",
    "lastAmendedBy"
})
public class DocumentStatusElementType {

    @XmlElement(name = "CCMSDocumentID")
    protected String ccmsDocumentID;
    @XmlElement(name = "Status")
    protected String status;
    @XmlElement(name = "StatusDescription")
    protected String statusDescription;
    @XmlElement(name = "EDRMSFilePath")
    protected String edrmsFilePath;
    @XmlElement(name = "FileType")
    protected String fileType;
    @XmlElement(name = "DocumentClass")
    protected String documentClass;
    @XmlElement(name = "DocumentType")
    protected String documentType;
    @XmlElement(name = "DocumentTypeDescription")
    protected String documentTypeDescription;
    @XmlElement(name = "DocumentDescription")
    protected String documentDescription;
    @XmlElement(name = "Version")
    protected String version;
    @XmlElement(name = "DateCreated")
    protected String dateCreated;
    @XmlElement(name = "DocumentOwner")
    protected String documentOwner;
    @XmlElement(name = "DateLastAmended")
    protected String dateLastAmended;
    @XmlElement(name = "LastAmendedBy")
    protected String lastAmendedBy;

    /**
     * Gets the value of the ccmsDocumentID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCMSDocumentID() {
        return ccmsDocumentID;
    }

    /**
     * Sets the value of the ccmsDocumentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCMSDocumentID(String value) {
        this.ccmsDocumentID = value;
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
     * Gets the value of the statusDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusDescription() {
        return statusDescription;
    }

    /**
     * Sets the value of the statusDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusDescription(String value) {
        this.statusDescription = value;
    }

    /**
     * Gets the value of the edrmsFilePath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEDRMSFilePath() {
        return edrmsFilePath;
    }

    /**
     * Sets the value of the edrmsFilePath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEDRMSFilePath(String value) {
        this.edrmsFilePath = value;
    }

    /**
     * Gets the value of the fileType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileType() {
        return fileType;
    }

    /**
     * Sets the value of the fileType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileType(String value) {
        this.fileType = value;
    }

    /**
     * Gets the value of the documentClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentClass() {
        return documentClass;
    }

    /**
     * Sets the value of the documentClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentClass(String value) {
        this.documentClass = value;
    }

    /**
     * Gets the value of the documentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentType() {
        return documentType;
    }

    /**
     * Sets the value of the documentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentType(String value) {
        this.documentType = value;
    }

    /**
     * Gets the value of the documentTypeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentTypeDescription() {
        return documentTypeDescription;
    }

    /**
     * Sets the value of the documentTypeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentTypeDescription(String value) {
        this.documentTypeDescription = value;
    }

    /**
     * Gets the value of the documentDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentDescription() {
        return documentDescription;
    }

    /**
     * Sets the value of the documentDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentDescription(String value) {
        this.documentDescription = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the dateCreated property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateCreated() {
        return dateCreated;
    }

    /**
     * Sets the value of the dateCreated property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateCreated(String value) {
        this.dateCreated = value;
    }

    /**
     * Gets the value of the documentOwner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentOwner() {
        return documentOwner;
    }

    /**
     * Sets the value of the documentOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentOwner(String value) {
        this.documentOwner = value;
    }

    /**
     * Gets the value of the dateLastAmended property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateLastAmended() {
        return dateLastAmended;
    }

    /**
     * Sets the value of the dateLastAmended property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateLastAmended(String value) {
        this.dateLastAmended = value;
    }

    /**
     * Gets the value of the lastAmendedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastAmendedBy() {
        return lastAmendedBy;
    }

    /**
     * Sets the value of the lastAmendedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastAmendedBy(String value) {
        this.lastAmendedBy = value;
    }

}
