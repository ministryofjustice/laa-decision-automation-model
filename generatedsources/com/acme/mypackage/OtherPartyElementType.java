
package com.acme.mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OtherPartyElementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OtherPartyElementType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OtherPartyID" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}ID15" minOccurs="0"/&gt;
 *         &lt;element name="SharedInd" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}BooleanString"/&gt;
 *         &lt;element name="OtherPartyDetail"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;element name="Person" type="{http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIO}OtherPartyPersonType"/&gt;
 *                   &lt;element name="Organization" type="{http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIO}OtherPartyOrgType"/&gt;
 *                 &lt;/choice&gt;
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
@XmlType(name = "OtherPartyElementType", propOrder = {
    "otherPartyID",
    "sharedInd",
    "otherPartyDetail"
})
public class OtherPartyElementType {

    @XmlElement(name = "OtherPartyID")
    protected String otherPartyID;
    @XmlElement(name = "SharedInd")
    protected boolean sharedInd;
    @XmlElement(name = "OtherPartyDetail", required = true)
    protected OtherPartyElementType.OtherPartyDetail otherPartyDetail;

    /**
     * Gets the value of the otherPartyID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherPartyID() {
        return otherPartyID;
    }

    /**
     * Sets the value of the otherPartyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherPartyID(String value) {
        this.otherPartyID = value;
    }

    /**
     * Gets the value of the sharedInd property.
     * 
     */
    public boolean isSharedInd() {
        return sharedInd;
    }

    /**
     * Sets the value of the sharedInd property.
     * 
     */
    public void setSharedInd(boolean value) {
        this.sharedInd = value;
    }

    /**
     * Gets the value of the otherPartyDetail property.
     * 
     * @return
     *     possible object is
     *     {@link OtherPartyElementType.OtherPartyDetail }
     *     
     */
    public OtherPartyElementType.OtherPartyDetail getOtherPartyDetail() {
        return otherPartyDetail;
    }

    /**
     * Sets the value of the otherPartyDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherPartyElementType.OtherPartyDetail }
     *     
     */
    public void setOtherPartyDetail(OtherPartyElementType.OtherPartyDetail value) {
        this.otherPartyDetail = value;
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
     *       &lt;choice&gt;
     *         &lt;element name="Person" type="{http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIO}OtherPartyPersonType"/&gt;
     *         &lt;element name="Organization" type="{http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIO}OtherPartyOrgType"/&gt;
     *       &lt;/choice&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "person",
        "organization"
    })
    public static class OtherPartyDetail {

        @XmlElement(name = "Person")
        protected OtherPartyPersonType person;
        @XmlElement(name = "Organization")
        protected OtherPartyOrgType organization;

        /**
         * Gets the value of the person property.
         * 
         * @return
         *     possible object is
         *     {@link OtherPartyPersonType }
         *     
         */
        public OtherPartyPersonType getPerson() {
            return person;
        }

        /**
         * Sets the value of the person property.
         * 
         * @param value
         *     allowed object is
         *     {@link OtherPartyPersonType }
         *     
         */
        public void setPerson(OtherPartyPersonType value) {
            this.person = value;
        }

        /**
         * Gets the value of the organization property.
         * 
         * @return
         *     possible object is
         *     {@link OtherPartyOrgType }
         *     
         */
        public OtherPartyOrgType getOrganization() {
            return organization;
        }

        /**
         * Sets the value of the organization property.
         * 
         * @param value
         *     allowed object is
         *     {@link OtherPartyOrgType }
         *     
         */
        public void setOrganization(OtherPartyOrgType value) {
            this.organization = value;
        }

    }

}
