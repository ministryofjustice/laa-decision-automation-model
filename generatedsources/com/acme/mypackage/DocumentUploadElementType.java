
package com.acme.mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentUploadElementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentUploadElementType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CCMSDocumentID" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C50" minOccurs="0"/&gt;
 *         &lt;element name="DocumentType" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C240"/&gt;
 *         &lt;element name="FileExtension" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C50" minOccurs="0"/&gt;
 *         &lt;element name="Channel" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C20" minOccurs="0"/&gt;
 *         &lt;element name="Text" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C240" minOccurs="0"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="DocumentLink" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C240"/&gt;
 *           &lt;element name="BinData" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}BinData"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentUploadElementType", propOrder = {
    "ccmsDocumentID",
    "documentType",
    "fileExtension",
    "channel",
    "text",
    "documentLink",
    "binData"
})
public class DocumentUploadElementType {

    @XmlElement(name = "CCMSDocumentID")
    protected String ccmsDocumentID;
    @XmlElement(name = "DocumentType", required = true)
    protected String documentType;
    @XmlElement(name = "FileExtension")
    protected String fileExtension;
    @XmlElement(name = "Channel")
    protected String channel;
    @XmlElement(name = "Text")
    protected String text;
    @XmlElement(name = "DocumentLink")
    protected String documentLink;
    @XmlElement(name = "BinData")
    protected byte[] binData;

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
     * Gets the value of the fileExtension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileExtension() {
        return fileExtension;
    }

    /**
     * Sets the value of the fileExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileExtension(String value) {
        this.fileExtension = value;
    }

    /**
     * Gets the value of the channel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannel() {
        return channel;
    }

    /**
     * Sets the value of the channel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannel(String value) {
        this.channel = value;
    }

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText(String value) {
        this.text = value;
    }

    /**
     * Gets the value of the documentLink property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentLink() {
        return documentLink;
    }

    /**
     * Sets the value of the documentLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentLink(String value) {
        this.documentLink = value;
    }

    /**
     * Gets the value of the binData property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getBinData() {
        return binData;
    }

    /**
     * Sets the value of the binData property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setBinData(byte[] value) {
        this.binData = value;
    }

}
