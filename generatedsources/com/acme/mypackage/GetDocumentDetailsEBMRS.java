
package com.acme.mypackage;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetDocumentDetailsEBMRS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetDocumentDetailsEBMRS"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://legalservices.gov.uk/Enterprise/Common/1.0/Header}HeaderRS"/&gt;
 *         &lt;element name="DocumentDetails" type="{http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIO}DocumentDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetDocumentDetailsEBMRS", namespace = "http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIM", propOrder = {
    "headerRS",
    "documentDetails"
})
public class GetDocumentDetailsEBMRS {

    @XmlElement(name = "HeaderRS", namespace = "http://legalservices.gov.uk/Enterprise/Common/1.0/Header", required = true)
    protected HeaderRSType headerRS;
    @XmlElement(name = "DocumentDetails")
    protected List<DocumentDetails> documentDetails;

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
     * Gets the value of the documentDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentDetails }
     * 
     * 
     */
    public List<DocumentDetails> getDocumentDetails() {
        if (documentDetails == null) {
            documentDetails = new ArrayList<DocumentDetails>();
        }
        return this.documentDetails;
    }

}
