
package com.acme.mypackage;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OtherPartyPersonType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OtherPartyPersonType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}Name"/&gt;
 *         &lt;element name="DateOfBirth" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}Dt" minOccurs="0"/&gt;
 *         &lt;element name="Address" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}Address" minOccurs="0"/&gt;
 *         &lt;element name="RelationToClient" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}LOV"/&gt;
 *         &lt;element name="RelationToCase" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}LOV"/&gt;
 *         &lt;element name="NINumber" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}NationalInsuranceNumber" minOccurs="0"/&gt;
 *         &lt;element name="ContactName" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C35" minOccurs="0"/&gt;
 *         &lt;element name="ContactDetails" type="{http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIO}ContactDetails" minOccurs="0"/&gt;
 *         &lt;element name="OrganizationName" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C30" minOccurs="0"/&gt;
 *         &lt;element name="EmployersName" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C30" minOccurs="0"/&gt;
 *         &lt;element name="EmploymentStatus" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C50" minOccurs="0"/&gt;
 *         &lt;element name="OrganizationAddress" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C150" minOccurs="0"/&gt;
 *         &lt;element name="PartyLegalAidedInd" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}BooleanString" minOccurs="0"/&gt;
 *         &lt;element name="CertificateNumber" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C30" minOccurs="0"/&gt;
 *         &lt;element name="CourtOrderedMeansAssesment" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}BooleanString" minOccurs="0"/&gt;
 *         &lt;element name="AssessedIncomeFrequency" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}LOV" minOccurs="0"/&gt;
 *         &lt;element name="AssessedIncome" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}Amount" minOccurs="0"/&gt;
 *         &lt;element name="AssessedAsstes" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}Amount" minOccurs="0"/&gt;
 *         &lt;element name="AssessmentDate" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}Dt" minOccurs="0"/&gt;
 *         &lt;element name="PublicFundingAppliedInd" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}BooleanString" minOccurs="0"/&gt;
 *         &lt;element name="OtherInformation" type="{http://legalservices.gov.uk/Enterprise/Common/1.0/Common}C240" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OtherPartyPersonType", propOrder = {
    "name",
    "dateOfBirth",
    "address",
    "relationToClient",
    "relationToCase",
    "niNumber",
    "contactName",
    "contactDetails",
    "organizationName",
    "employersName",
    "employmentStatus",
    "organizationAddress",
    "partyLegalAidedInd",
    "certificateNumber",
    "courtOrderedMeansAssesment",
    "assessedIncomeFrequency",
    "assessedIncome",
    "assessedAsstes",
    "assessmentDate",
    "publicFundingAppliedInd",
    "otherInformation"
})
public class OtherPartyPersonType {

    @XmlElement(name = "Name", required = true)
    protected Name name;
    @XmlElement(name = "DateOfBirth")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateOfBirth;
    @XmlElement(name = "Address")
    protected Address address;
    @XmlElement(name = "RelationToClient", required = true)
    protected String relationToClient;
    @XmlElement(name = "RelationToCase", required = true)
    protected String relationToCase;
    @XmlElement(name = "NINumber")
    protected String niNumber;
    @XmlElement(name = "ContactName")
    protected String contactName;
    @XmlElement(name = "ContactDetails")
    protected ContactDetails contactDetails;
    @XmlElement(name = "OrganizationName")
    protected String organizationName;
    @XmlElement(name = "EmployersName")
    protected String employersName;
    @XmlElement(name = "EmploymentStatus")
    protected String employmentStatus;
    @XmlElement(name = "OrganizationAddress")
    protected String organizationAddress;
    @XmlElement(name = "PartyLegalAidedInd")
    protected Boolean partyLegalAidedInd;
    @XmlElement(name = "CertificateNumber")
    protected String certificateNumber;
    @XmlElement(name = "CourtOrderedMeansAssesment")
    protected Boolean courtOrderedMeansAssesment;
    @XmlElement(name = "AssessedIncomeFrequency")
    protected String assessedIncomeFrequency;
    @XmlElement(name = "AssessedIncome")
    protected BigDecimal assessedIncome;
    @XmlElement(name = "AssessedAsstes")
    protected BigDecimal assessedAsstes;
    @XmlElement(name = "AssessmentDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar assessmentDate;
    @XmlElement(name = "PublicFundingAppliedInd")
    protected Boolean publicFundingAppliedInd;
    @XmlElement(name = "OtherInformation")
    protected String otherInformation;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link Name }
     *     
     */
    public Name getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link Name }
     *     
     */
    public void setName(Name value) {
        this.name = value;
    }

    /**
     * Gets the value of the dateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Sets the value of the dateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfBirth(XMLGregorianCalendar value) {
        this.dateOfBirth = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setAddress(Address value) {
        this.address = value;
    }

    /**
     * Gets the value of the relationToClient property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelationToClient() {
        return relationToClient;
    }

    /**
     * Sets the value of the relationToClient property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelationToClient(String value) {
        this.relationToClient = value;
    }

    /**
     * Gets the value of the relationToCase property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelationToCase() {
        return relationToCase;
    }

    /**
     * Sets the value of the relationToCase property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelationToCase(String value) {
        this.relationToCase = value;
    }

    /**
     * Gets the value of the niNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNINumber() {
        return niNumber;
    }

    /**
     * Sets the value of the niNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNINumber(String value) {
        this.niNumber = value;
    }

    /**
     * Gets the value of the contactName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactName() {
        return contactName;
    }

    /**
     * Sets the value of the contactName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactName(String value) {
        this.contactName = value;
    }

    /**
     * Gets the value of the contactDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ContactDetails }
     *     
     */
    public ContactDetails getContactDetails() {
        return contactDetails;
    }

    /**
     * Sets the value of the contactDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactDetails }
     *     
     */
    public void setContactDetails(ContactDetails value) {
        this.contactDetails = value;
    }

    /**
     * Gets the value of the organizationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationName() {
        return organizationName;
    }

    /**
     * Sets the value of the organizationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationName(String value) {
        this.organizationName = value;
    }

    /**
     * Gets the value of the employersName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployersName() {
        return employersName;
    }

    /**
     * Sets the value of the employersName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployersName(String value) {
        this.employersName = value;
    }

    /**
     * Gets the value of the employmentStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmploymentStatus() {
        return employmentStatus;
    }

    /**
     * Sets the value of the employmentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmploymentStatus(String value) {
        this.employmentStatus = value;
    }

    /**
     * Gets the value of the organizationAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationAddress() {
        return organizationAddress;
    }

    /**
     * Sets the value of the organizationAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationAddress(String value) {
        this.organizationAddress = value;
    }

    /**
     * Gets the value of the partyLegalAidedInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPartyLegalAidedInd() {
        return partyLegalAidedInd;
    }

    /**
     * Sets the value of the partyLegalAidedInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPartyLegalAidedInd(Boolean value) {
        this.partyLegalAidedInd = value;
    }

    /**
     * Gets the value of the certificateNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificateNumber() {
        return certificateNumber;
    }

    /**
     * Sets the value of the certificateNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificateNumber(String value) {
        this.certificateNumber = value;
    }

    /**
     * Gets the value of the courtOrderedMeansAssesment property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCourtOrderedMeansAssesment() {
        return courtOrderedMeansAssesment;
    }

    /**
     * Sets the value of the courtOrderedMeansAssesment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCourtOrderedMeansAssesment(Boolean value) {
        this.courtOrderedMeansAssesment = value;
    }

    /**
     * Gets the value of the assessedIncomeFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessedIncomeFrequency() {
        return assessedIncomeFrequency;
    }

    /**
     * Sets the value of the assessedIncomeFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessedIncomeFrequency(String value) {
        this.assessedIncomeFrequency = value;
    }

    /**
     * Gets the value of the assessedIncome property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAssessedIncome() {
        return assessedIncome;
    }

    /**
     * Sets the value of the assessedIncome property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAssessedIncome(BigDecimal value) {
        this.assessedIncome = value;
    }

    /**
     * Gets the value of the assessedAsstes property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAssessedAsstes() {
        return assessedAsstes;
    }

    /**
     * Sets the value of the assessedAsstes property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAssessedAsstes(BigDecimal value) {
        this.assessedAsstes = value;
    }

    /**
     * Gets the value of the assessmentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAssessmentDate() {
        return assessmentDate;
    }

    /**
     * Sets the value of the assessmentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAssessmentDate(XMLGregorianCalendar value) {
        this.assessmentDate = value;
    }

    /**
     * Gets the value of the publicFundingAppliedInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPublicFundingAppliedInd() {
        return publicFundingAppliedInd;
    }

    /**
     * Sets the value of the publicFundingAppliedInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPublicFundingAppliedInd(Boolean value) {
        this.publicFundingAppliedInd = value;
    }

    /**
     * Gets the value of the otherInformation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherInformation() {
        return otherInformation;
    }

    /**
     * Sets the value of the otherInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherInformation(String value) {
        this.otherInformation = value;
    }

}
