
package com.acme.mypackage;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetDocumentDetailsABMRQ complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetDocumentDetailsABMRQ"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://legalservices.gov.uk/Enterprise/Common/1.0/Header}HeaderRQ"/&gt;
 *         &lt;element name="SearchCondition"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CCMSDocumentId" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C50" maxOccurs="unbounded"/&gt;
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
@XmlType(name = "GetDocumentDetailsABMRQ", namespace = "http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIM", propOrder = {
    "headerRQ",
    "searchCondition"
})
public class GetDocumentDetailsABMRQ {

    @XmlElement(name = "HeaderRQ", namespace = "http://legalservices.gov.uk/Enterprise/Common/1.0/Header", required = true)
    protected HeaderRQType headerRQ;
    @XmlElement(name = "SearchCondition", required = true)
    protected GetDocumentDetailsABMRQ.SearchCondition searchCondition;

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
     * Gets the value of the searchCondition property.
     * 
     * @return
     *     possible object is
     *     {@link GetDocumentDetailsABMRQ.SearchCondition }
     *     
     */
    public GetDocumentDetailsABMRQ.SearchCondition getSearchCondition() {
        return searchCondition;
    }

    /**
     * Sets the value of the searchCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetDocumentDetailsABMRQ.SearchCondition }
     *     
     */
    public void setSearchCondition(GetDocumentDetailsABMRQ.SearchCondition value) {
        this.searchCondition = value;
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
     *         &lt;element name="CCMSDocumentId" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C50" maxOccurs="unbounded"/&gt;
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
        "ccmsDocumentId"
    })
    public static class SearchCondition {

        @XmlElement(name = "CCMSDocumentId", namespace = "http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIM", required = true)
        protected List<String> ccmsDocumentId;

        /**
         * Gets the value of the ccmsDocumentId property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ccmsDocumentId property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCCMSDocumentId().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getCCMSDocumentId() {
            if (ccmsDocumentId == null) {
                ccmsDocumentId = new ArrayList<String>();
            }
            return this.ccmsDocumentId;
        }

    }

}
