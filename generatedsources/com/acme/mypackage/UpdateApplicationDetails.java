
package com.acme.mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for UpdateApplicationDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateApplicationDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PreferredAddress" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C50" minOccurs="0"/&gt;
 *         &lt;element name="CorrespondenceAddress" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}Address" minOccurs="0"/&gt;
 *         &lt;element name="ProviderDetails" type="{http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIO}ProviderDetails" minOccurs="0"/&gt;
 *         &lt;element name="CategoryOfLaw" type="{http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIO}CategoryOfLawElementType" minOccurs="0"/&gt;
 *         &lt;element name="OtherParties" type="{http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIO}OtherParties" minOccurs="0"/&gt;
 *         &lt;element name="ExternalResources" type="{http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIO}ExternalResources" minOccurs="0"/&gt;
 *         &lt;element name="Proceedings" type="{http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIO}Proceedings" minOccurs="0"/&gt;
 *         &lt;element name="MeansAssesments" type="{http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIO}MeansAssesments" minOccurs="0"/&gt;
 *         &lt;element name="MeritsAssesments" type="{http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIO}MeritsAssesments" minOccurs="0"/&gt;
 *         &lt;element name="Undertakings" type="{http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIO}UndertakingElementType" minOccurs="0"/&gt;
 *         &lt;element name="DateOfFirstAttendance" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}Dt" minOccurs="0"/&gt;
 *         &lt;element name="PurposeOfApplication" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C50" minOccurs="0"/&gt;
 *         &lt;element name="FixedHearingDateInd" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}BooleanString" minOccurs="0"/&gt;
 *         &lt;element name="DateOfHearing" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}Dt" minOccurs="0"/&gt;
 *         &lt;element name="PurposeOfHearing" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C2000" minOccurs="0"/&gt;
 *         &lt;element name="HighProfileCaseInd" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}BooleanString" minOccurs="0"/&gt;
 *         &lt;element name="SupervisorContactID" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}ID15" minOccurs="0"/&gt;
 *         &lt;element name="FeeEarnerContactID" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}ID15" minOccurs="0"/&gt;
 *         &lt;element name="DevolvedPowersDate" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}Dt" minOccurs="0"/&gt;
 *         &lt;element name="ApplicationAmendmentType" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}LOV" minOccurs="0"/&gt;
 *         &lt;element name="LARDetails" type="{http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIO}LARDetails" minOccurs="0"/&gt;
 *         &lt;element name="CertificateType" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}LOV" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateApplicationDetails", propOrder = {
    "preferredAddress",
    "correspondenceAddress",
    "providerDetails",
    "categoryOfLaw",
    "otherParties",
    "externalResources",
    "proceedings",
    "meansAssesments",
    "meritsAssesments",
    "undertakings",
    "dateOfFirstAttendance",
    "purposeOfApplication",
    "fixedHearingDateInd",
    "dateOfHearing",
    "purposeOfHearing",
    "highProfileCaseInd",
    "supervisorContactID",
    "feeEarnerContactID",
    "devolvedPowersDate",
    "applicationAmendmentType",
    "larDetails",
    "certificateType"
})
public class UpdateApplicationDetails {

    @XmlElement(name = "PreferredAddress")
    protected String preferredAddress;
    @XmlElement(name = "CorrespondenceAddress")
    protected Address correspondenceAddress;
    @XmlElement(name = "ProviderDetails")
    protected ProviderDetails providerDetails;
    @XmlElement(name = "CategoryOfLaw")
    protected CategoryOfLawElementType categoryOfLaw;
    @XmlElement(name = "OtherParties")
    protected OtherParties otherParties;
    @XmlElement(name = "ExternalResources")
    protected ExternalResources externalResources;
    @XmlElement(name = "Proceedings")
    protected Proceedings proceedings;
    @XmlElement(name = "MeansAssesments")
    protected MeansAssesments meansAssesments;
    @XmlElement(name = "MeritsAssesments")
    protected MeritsAssesments meritsAssesments;
    @XmlElement(name = "Undertakings")
    protected UndertakingElementType undertakings;
    @XmlElement(name = "DateOfFirstAttendance")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateOfFirstAttendance;
    @XmlElement(name = "PurposeOfApplication")
    protected String purposeOfApplication;
    @XmlElement(name = "FixedHearingDateInd")
    protected Boolean fixedHearingDateInd;
    @XmlElement(name = "DateOfHearing")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateOfHearing;
    @XmlElement(name = "PurposeOfHearing")
    protected String purposeOfHearing;
    @XmlElement(name = "HighProfileCaseInd")
    protected Boolean highProfileCaseInd;
    @XmlElement(name = "SupervisorContactID")
    protected String supervisorContactID;
    @XmlElement(name = "FeeEarnerContactID")
    protected String feeEarnerContactID;
    @XmlElement(name = "DevolvedPowersDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar devolvedPowersDate;
    @XmlElement(name = "ApplicationAmendmentType")
    protected String applicationAmendmentType;
    @XmlElement(name = "LARDetails")
    protected LARDetails larDetails;
    @XmlElement(name = "CertificateType")
    protected String certificateType;

    /**
     * Gets the value of the preferredAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreferredAddress() {
        return preferredAddress;
    }

    /**
     * Sets the value of the preferredAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreferredAddress(String value) {
        this.preferredAddress = value;
    }

    /**
     * Gets the value of the correspondenceAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getCorrespondenceAddress() {
        return correspondenceAddress;
    }

    /**
     * Sets the value of the correspondenceAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setCorrespondenceAddress(Address value) {
        this.correspondenceAddress = value;
    }

    /**
     * Gets the value of the providerDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ProviderDetails }
     *     
     */
    public ProviderDetails getProviderDetails() {
        return providerDetails;
    }

    /**
     * Sets the value of the providerDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProviderDetails }
     *     
     */
    public void setProviderDetails(ProviderDetails value) {
        this.providerDetails = value;
    }

    /**
     * Gets the value of the categoryOfLaw property.
     * 
     * @return
     *     possible object is
     *     {@link CategoryOfLawElementType }
     *     
     */
    public CategoryOfLawElementType getCategoryOfLaw() {
        return categoryOfLaw;
    }

    /**
     * Sets the value of the categoryOfLaw property.
     * 
     * @param value
     *     allowed object is
     *     {@link CategoryOfLawElementType }
     *     
     */
    public void setCategoryOfLaw(CategoryOfLawElementType value) {
        this.categoryOfLaw = value;
    }

    /**
     * Gets the value of the otherParties property.
     * 
     * @return
     *     possible object is
     *     {@link OtherParties }
     *     
     */
    public OtherParties getOtherParties() {
        return otherParties;
    }

    /**
     * Sets the value of the otherParties property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherParties }
     *     
     */
    public void setOtherParties(OtherParties value) {
        this.otherParties = value;
    }

    /**
     * Gets the value of the externalResources property.
     * 
     * @return
     *     possible object is
     *     {@link ExternalResources }
     *     
     */
    public ExternalResources getExternalResources() {
        return externalResources;
    }

    /**
     * Sets the value of the externalResources property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalResources }
     *     
     */
    public void setExternalResources(ExternalResources value) {
        this.externalResources = value;
    }

    /**
     * Gets the value of the proceedings property.
     * 
     * @return
     *     possible object is
     *     {@link Proceedings }
     *     
     */
    public Proceedings getProceedings() {
        return proceedings;
    }

    /**
     * Sets the value of the proceedings property.
     * 
     * @param value
     *     allowed object is
     *     {@link Proceedings }
     *     
     */
    public void setProceedings(Proceedings value) {
        this.proceedings = value;
    }

    /**
     * Gets the value of the meansAssesments property.
     * 
     * @return
     *     possible object is
     *     {@link MeansAssesments }
     *     
     */
    public MeansAssesments getMeansAssesments() {
        return meansAssesments;
    }

    /**
     * Sets the value of the meansAssesments property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeansAssesments }
     *     
     */
    public void setMeansAssesments(MeansAssesments value) {
        this.meansAssesments = value;
    }

    /**
     * Gets the value of the meritsAssesments property.
     * 
     * @return
     *     possible object is
     *     {@link MeritsAssesments }
     *     
     */
    public MeritsAssesments getMeritsAssesments() {
        return meritsAssesments;
    }

    /**
     * Sets the value of the meritsAssesments property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeritsAssesments }
     *     
     */
    public void setMeritsAssesments(MeritsAssesments value) {
        this.meritsAssesments = value;
    }

    /**
     * Gets the value of the undertakings property.
     * 
     * @return
     *     possible object is
     *     {@link UndertakingElementType }
     *     
     */
    public UndertakingElementType getUndertakings() {
        return undertakings;
    }

    /**
     * Sets the value of the undertakings property.
     * 
     * @param value
     *     allowed object is
     *     {@link UndertakingElementType }
     *     
     */
    public void setUndertakings(UndertakingElementType value) {
        this.undertakings = value;
    }

    /**
     * Gets the value of the dateOfFirstAttendance property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfFirstAttendance() {
        return dateOfFirstAttendance;
    }

    /**
     * Sets the value of the dateOfFirstAttendance property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfFirstAttendance(XMLGregorianCalendar value) {
        this.dateOfFirstAttendance = value;
    }

    /**
     * Gets the value of the purposeOfApplication property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurposeOfApplication() {
        return purposeOfApplication;
    }

    /**
     * Sets the value of the purposeOfApplication property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurposeOfApplication(String value) {
        this.purposeOfApplication = value;
    }

    /**
     * Gets the value of the fixedHearingDateInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFixedHearingDateInd() {
        return fixedHearingDateInd;
    }

    /**
     * Sets the value of the fixedHearingDateInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFixedHearingDateInd(Boolean value) {
        this.fixedHearingDateInd = value;
    }

    /**
     * Gets the value of the dateOfHearing property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfHearing() {
        return dateOfHearing;
    }

    /**
     * Sets the value of the dateOfHearing property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfHearing(XMLGregorianCalendar value) {
        this.dateOfHearing = value;
    }

    /**
     * Gets the value of the purposeOfHearing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurposeOfHearing() {
        return purposeOfHearing;
    }

    /**
     * Sets the value of the purposeOfHearing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurposeOfHearing(String value) {
        this.purposeOfHearing = value;
    }

    /**
     * Gets the value of the highProfileCaseInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHighProfileCaseInd() {
        return highProfileCaseInd;
    }

    /**
     * Sets the value of the highProfileCaseInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHighProfileCaseInd(Boolean value) {
        this.highProfileCaseInd = value;
    }

    /**
     * Gets the value of the supervisorContactID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupervisorContactID() {
        return supervisorContactID;
    }

    /**
     * Sets the value of the supervisorContactID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupervisorContactID(String value) {
        this.supervisorContactID = value;
    }

    /**
     * Gets the value of the feeEarnerContactID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeeEarnerContactID() {
        return feeEarnerContactID;
    }

    /**
     * Sets the value of the feeEarnerContactID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeeEarnerContactID(String value) {
        this.feeEarnerContactID = value;
    }

    /**
     * Gets the value of the devolvedPowersDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDevolvedPowersDate() {
        return devolvedPowersDate;
    }

    /**
     * Sets the value of the devolvedPowersDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDevolvedPowersDate(XMLGregorianCalendar value) {
        this.devolvedPowersDate = value;
    }

    /**
     * Gets the value of the applicationAmendmentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationAmendmentType() {
        return applicationAmendmentType;
    }

    /**
     * Sets the value of the applicationAmendmentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationAmendmentType(String value) {
        this.applicationAmendmentType = value;
    }

    /**
     * Gets the value of the larDetails property.
     * 
     * @return
     *     possible object is
     *     {@link LARDetails }
     *     
     */
    public LARDetails getLARDetails() {
        return larDetails;
    }

    /**
     * Sets the value of the larDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link LARDetails }
     *     
     */
    public void setLARDetails(LARDetails value) {
        this.larDetails = value;
    }

    /**
     * Gets the value of the certificateType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificateType() {
        return certificateType;
    }

    /**
     * Sets the value of the certificateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificateType(String value) {
        this.certificateType = value;
    }

}
