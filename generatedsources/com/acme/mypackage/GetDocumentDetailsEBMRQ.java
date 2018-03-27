
package com.acme.mypackage;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetDocumentDetailsEBMRQ complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetDocumentDetailsEBMRQ"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://legalservices.gov.uk/Enterprise/Common/1.0/Header}HeaderRQ"/&gt;
 *         &lt;element name="NameValuePair" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}NameValuePair" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetDocumentDetailsEBMRQ", namespace = "http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIM", propOrder = {
    "headerRQ",
    "nameValuePair"
})
public class GetDocumentDetailsEBMRQ {

    @XmlElement(name = "HeaderRQ", namespace = "http://legalservices.gov.uk/Enterprise/Common/1.0/Header", required = true)
    protected HeaderRQType headerRQ;
    @XmlElement(name = "NameValuePair")
    protected List<NameValuePair> nameValuePair;

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
     * Gets the value of the nameValuePair property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nameValuePair property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNameValuePair().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameValuePair }
     * 
     * 
     */
    public List<NameValuePair> getNameValuePair() {
        if (nameValuePair == null) {
            nameValuePair = new ArrayList<NameValuePair>();
        }
        return this.nameValuePair;
    }

}
