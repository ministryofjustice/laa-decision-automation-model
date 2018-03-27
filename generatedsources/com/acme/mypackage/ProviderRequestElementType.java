
package com.acme.mypackage;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProviderRequestElementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProviderRequestElementType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CaseReferenceNumber" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}IDREF30" minOccurs="0"/&gt;
 *         &lt;element name="User" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}User"/&gt;
 *         &lt;element name="RequestDetails" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Request" type="{http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIO}ProviderRequestDetailsElementType"/&gt;
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
@XmlType(name = "ProviderRequestElementType", propOrder = {
    "caseReferenceNumber",
    "user",
    "requestDetails"
})
public class ProviderRequestElementType {

    @XmlElement(name = "CaseReferenceNumber")
    protected String caseReferenceNumber;
    @XmlElement(name = "User", required = true)
    protected User user;
    @XmlElement(name = "RequestDetails", required = true)
    protected List<ProviderRequestElementType.RequestDetails> requestDetails;

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
     * Gets the value of the requestDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requestDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequestDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProviderRequestElementType.RequestDetails }
     * 
     * 
     */
    public List<ProviderRequestElementType.RequestDetails> getRequestDetails() {
        if (requestDetails == null) {
            requestDetails = new ArrayList<ProviderRequestElementType.RequestDetails>();
        }
        return this.requestDetails;
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
     *         &lt;element name="Request" type="{http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIO}ProviderRequestDetailsElementType"/&gt;
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
        "request"
    })
    public static class RequestDetails {

        @XmlElement(name = "Request", required = true)
        protected ProviderRequestDetailsElementType request;

        /**
         * Gets the value of the request property.
         * 
         * @return
         *     possible object is
         *     {@link ProviderRequestDetailsElementType }
         *     
         */
        public ProviderRequestDetailsElementType getRequest() {
            return request;
        }

        /**
         * Sets the value of the request property.
         * 
         * @param value
         *     allowed object is
         *     {@link ProviderRequestDetailsElementType }
         *     
         */
        public void setRequest(ProviderRequestDetailsElementType value) {
            this.request = value;
        }

    }

}
