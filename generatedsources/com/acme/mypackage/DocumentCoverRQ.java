
package com.acme.mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentCoverRQ complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentCoverRQ"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://legalservices.gov.uk/Enterprise/Common/1.0/Header}HeaderRQ"/&gt;
 *         &lt;element name="ExpectedDocumentID" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}ID15"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentCoverRQ", namespace = "http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIM", propOrder = {
    "headerRQ",
    "expectedDocumentID"
})
public class DocumentCoverRQ {

    @XmlElement(name = "HeaderRQ", namespace = "http://legalservices.gov.uk/Enterprise/Common/1.0/Header", required = true)
    protected HeaderRQType headerRQ;
    @XmlElement(name = "ExpectedDocumentID", required = true)
    protected String expectedDocumentID;

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
     * Gets the value of the expectedDocumentID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpectedDocumentID() {
        return expectedDocumentID;
    }

    /**
     * Sets the value of the expectedDocumentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpectedDocumentID(String value) {
        this.expectedDocumentID = value;
    }

}
