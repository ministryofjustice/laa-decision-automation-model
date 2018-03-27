
package com.acme.mypackage;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.acme.mypackage package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _HeaderRQ_QNAME = new QName("http://legalservices.gov.uk/Enterprise/Common/1.0/Header", "HeaderRQ");
    private final static QName _HeaderRS_QNAME = new QName("http://legalservices.gov.uk/Enterprise/Common/1.0/Header", "HeaderRS");
    private final static QName _UsernameToken_QNAME = new QName("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", "UsernameToken");
    private final static QName _BinarySecurityToken_QNAME = new QName("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", "BinarySecurityToken");
    private final static QName _Reference_QNAME = new QName("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", "Reference");
    private final static QName _Embedded_QNAME = new QName("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", "Embedded");
    private final static QName _KeyIdentifier_QNAME = new QName("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", "KeyIdentifier");
    private final static QName _SecurityTokenReference_QNAME = new QName("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", "SecurityTokenReference");
    private final static QName _Security_QNAME = new QName("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", "Security");
    private final static QName _TransformationParameters_QNAME = new QName("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", "TransformationParameters");
    private final static QName _Password_QNAME = new QName("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", "Password");
    private final static QName _Nonce_QNAME = new QName("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", "Nonce");
    private final static QName _CaseInqRQ_QNAME = new QName("http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIM", "CaseInqRQ");
    private final static QName _CaseInqRS_QNAME = new QName("http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIM", "CaseInqRS");
    private final static QName _CaseAddUpdtStatusRQ_QNAME = new QName("http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIM", "CaseAddUpdtStatusRQ");
    private final static QName _CaseAddUpdtStatusRS_QNAME = new QName("http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIM", "CaseAddUpdtStatusRS");
    private final static QName _CaseAddRQ_QNAME = new QName("http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIM", "CaseAddRQ");
    private final static QName _CaseAddRS_QNAME = new QName("http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIM", "CaseAddRS");
    private final static QName _CaseUpdateRQ_QNAME = new QName("http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIM", "CaseUpdateRQ");
    private final static QName _CaseUpdateRS_QNAME = new QName("http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIM", "CaseUpdateRS");
    private final static QName _CaseDeleteRQ_QNAME = new QName("http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIM", "CaseDeleteRQ");
    private final static QName _CaseDeleteRS_QNAME = new QName("http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIM", "CaseDeleteRS");
    private final static QName _NotificationInqRQ_QNAME = new QName("http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIM", "NotificationInqRQ");
    private final static QName _NotificationInqRS_QNAME = new QName("http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIM", "NotificationInqRS");
    private final static QName _NotificationUpdateRQ_QNAME = new QName("http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIM", "NotificationUpdateRQ");
    private final static QName _NotificationUpdateRS_QNAME = new QName("http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIM", "NotificationUpdateRS");
    private final static QName _NotificationCntInqRQ_QNAME = new QName("http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIM", "NotificationCntInqRQ");
    private final static QName _NotificationCntInqRS_QNAME = new QName("http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIM", "NotificationCntInqRS");
    private final static QName _DocumentUploadRQ_QNAME = new QName("http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIM", "DocumentUploadRQ");
    private final static QName _DocumentUploadRS_QNAME = new QName("http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIM", "DocumentUploadRS");
    private final static QName _DocumentDownloadRQ_QNAME = new QName("http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIM", "DocumentDownloadRQ");
    private final static QName _DocumentDownloadRS_QNAME = new QName("http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIM", "DocumentDownloadRS");
    private final static QName _DocumentCoverRQ_QNAME = new QName("http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIM", "DocumentCoverRQ");
    private final static QName _DocumentCoverRS_QNAME = new QName("http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIM", "DocumentCoverRS");
    private final static QName _ProviderRequestAddRQ_QNAME = new QName("http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIM", "ProviderRequestAddRQ");
    private final static QName _ProviderRequestAddRS_QNAME = new QName("http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIM", "ProviderRequestAddRS");
    private final static QName _GetAssessmentDataRQ_QNAME = new QName("http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIM", "GetAssessmentDataRQ");
    private final static QName _GetAssessmentDataRS_QNAME = new QName("http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIM", "GetAssessmentDataRS");
    private final static QName _GetDocumentDetailsABMRQ_QNAME = new QName("http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIM", "GetDocumentDetailsABMRQ");
    private final static QName _GetDocumentDetailsABMRS_QNAME = new QName("http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIM", "GetDocumentDetailsABMRS");
    private final static QName _GetDocumentDetailsEBMRQ_QNAME = new QName("http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIM", "GetDocumentDetailsEBMRQ");
    private final static QName _GetDocumentDetailsEBMRS_QNAME = new QName("http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIM", "GetDocumentDetailsEBMRS");
    private final static QName _Timestamp_QNAME = new QName("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd", "Timestamp");
    private final static QName _Expires_QNAME = new QName("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd", "Expires");
    private final static QName _Created_QNAME = new QName("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd", "Created");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.acme.mypackage
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link OPAInstanceType3 }
     * 
     */
    public OPAInstanceType3 createOPAInstanceType3() {
        return new OPAInstanceType3();
    }

    /**
     * Create an instance of {@link GetDocumentDetailsABMRQ }
     * 
     */
    public GetDocumentDetailsABMRQ createGetDocumentDetailsABMRQ() {
        return new GetDocumentDetailsABMRQ();
    }

    /**
     * Create an instance of {@link NotificationCntInqRS }
     * 
     */
    public NotificationCntInqRS createNotificationCntInqRS() {
        return new NotificationCntInqRS();
    }

    /**
     * Create an instance of {@link NotificationCntInqRQ }
     * 
     */
    public NotificationCntInqRQ createNotificationCntInqRQ() {
        return new NotificationCntInqRQ();
    }

    /**
     * Create an instance of {@link NotificationInqRS }
     * 
     */
    public NotificationInqRS createNotificationInqRS() {
        return new NotificationInqRS();
    }

    /**
     * Create an instance of {@link NotificationInqRQ }
     * 
     */
    public NotificationInqRQ createNotificationInqRQ() {
        return new NotificationInqRQ();
    }

    /**
     * Create an instance of {@link CaseInqRQ }
     * 
     */
    public CaseInqRQ createCaseInqRQ() {
        return new CaseInqRQ();
    }

    /**
     * Create an instance of {@link UndertakingDetailsElementType }
     * 
     */
    public UndertakingDetailsElementType createUndertakingDetailsElementType() {
        return new UndertakingDetailsElementType();
    }

    /**
     * Create an instance of {@link UndertakingElementType }
     * 
     */
    public UndertakingElementType createUndertakingElementType() {
        return new UndertakingElementType();
    }

    /**
     * Create an instance of {@link RecoveryElementType }
     * 
     */
    public RecoveryElementType createRecoveryElementType() {
        return new RecoveryElementType();
    }

    /**
     * Create an instance of {@link OtherAssetElementType }
     * 
     */
    public OtherAssetElementType createOtherAssetElementType() {
        return new OtherAssetElementType();
    }

    /**
     * Create an instance of {@link LandAwardElementType }
     * 
     */
    public LandAwardElementType createLandAwardElementType() {
        return new LandAwardElementType();
    }

    /**
     * Create an instance of {@link FinancialAwardElementType }
     * 
     */
    public FinancialAwardElementType createFinancialAwardElementType() {
        return new FinancialAwardElementType();
    }

    /**
     * Create an instance of {@link CostAwardElementType }
     * 
     */
    public CostAwardElementType createCostAwardElementType() {
        return new CostAwardElementType();
    }

    /**
     * Create an instance of {@link AwardDetailElementType }
     * 
     */
    public AwardDetailElementType createAwardDetailElementType() {
        return new AwardDetailElementType();
    }

    /**
     * Create an instance of {@link ProviderRequestElementType }
     * 
     */
    public ProviderRequestElementType createProviderRequestElementType() {
        return new ProviderRequestElementType();
    }

    /**
     * Create an instance of {@link OPAInstanceType2 }
     * 
     */
    public OPAInstanceType2 createOPAInstanceType2() {
        return new OPAInstanceType2();
    }

    /**
     * Create an instance of {@link NotificationElementType }
     * 
     */
    public NotificationElementType createNotificationElementType() {
        return new NotificationElementType();
    }

    /**
     * Create an instance of {@link ProceedingDetElementType }
     * 
     */
    public ProceedingDetElementType createProceedingDetElementType() {
        return new ProceedingDetElementType();
    }

    /**
     * Create an instance of {@link OtherPartyElementType }
     * 
     */
    public OtherPartyElementType createOtherPartyElementType() {
        return new OtherPartyElementType();
    }

    /**
     * Create an instance of {@link OPAInstanceType }
     * 
     */
    public OPAInstanceType createOPAInstanceType() {
        return new OPAInstanceType();
    }

    /**
     * Create an instance of {@link SOADetailElementType }
     * 
     */
    public SOADetailElementType createSOADetailElementType() {
        return new SOADetailElementType();
    }

    /**
     * Create an instance of {@link SOAElementType }
     * 
     */
    public SOAElementType createSOAElementType() {
        return new SOAElementType();
    }

    /**
     * Create an instance of {@link HeaderRQType }
     * 
     */
    public HeaderRQType createHeaderRQType() {
        return new HeaderRQType();
    }

    /**
     * Create an instance of {@link HeaderRSType }
     * 
     */
    public HeaderRSType createHeaderRSType() {
        return new HeaderRSType();
    }

    /**
     * Create an instance of {@link Status }
     * 
     */
    public Status createStatus() {
        return new Status();
    }

    /**
     * Create an instance of {@link Exceptions }
     * 
     */
    public Exceptions createExceptions() {
        return new Exceptions();
    }

    /**
     * Create an instance of {@link BillElementType }
     * 
     */
    public BillElementType createBillElementType() {
        return new BillElementType();
    }

    /**
     * Create an instance of {@link POAElementType }
     * 
     */
    public POAElementType createPOAElementType() {
        return new POAElementType();
    }

    /**
     * Create an instance of {@link SOASummaryElementType }
     * 
     */
    public SOASummaryElementType createSOASummaryElementType() {
        return new SOASummaryElementType();
    }

    /**
     * Create an instance of {@link CostCeilingElementType }
     * 
     */
    public CostCeilingElementType createCostCeilingElementType() {
        return new CostCeilingElementType();
    }

    /**
     * Create an instance of {@link CostLimitElementType }
     * 
     */
    public CostLimitElementType createCostLimitElementType() {
        return new CostLimitElementType();
    }

    /**
     * Create an instance of {@link BillSummaryElementType }
     * 
     */
    public BillSummaryElementType createBillSummaryElementType() {
        return new BillSummaryElementType();
    }

    /**
     * Create an instance of {@link POASummaryElementType }
     * 
     */
    public POASummaryElementType createPOASummaryElementType() {
        return new POASummaryElementType();
    }

    /**
     * Create an instance of {@link InvoiceListElementType }
     * 
     */
    public InvoiceListElementType createInvoiceListElementType() {
        return new InvoiceListElementType();
    }

    /**
     * Create an instance of {@link SearchConditionType }
     * 
     */
    public SearchConditionType createSearchConditionType() {
        return new SearchConditionType();
    }

    /**
     * Create an instance of {@link AssessmentResultsElementType }
     * 
     */
    public AssessmentResultsElementType createAssessmentResultsElementType() {
        return new AssessmentResultsElementType();
    }

    /**
     * Create an instance of {@link OPAEntityType }
     * 
     */
    public OPAEntityType createOPAEntityType() {
        return new OPAEntityType();
    }

    /**
     * Create an instance of {@link OPAAttributesType }
     * 
     */
    public OPAAttributesType createOPAAttributesType() {
        return new OPAAttributesType();
    }

    /**
     * Create an instance of {@link CaseAdd }
     * 
     */
    public CaseAdd createCaseAdd() {
        return new CaseAdd();
    }

    /**
     * Create an instance of {@link Case }
     * 
     */
    public Case createCase() {
        return new Case();
    }

    /**
     * Create an instance of {@link CaseDetailsAdd }
     * 
     */
    public CaseDetailsAdd createCaseDetailsAdd() {
        return new CaseDetailsAdd();
    }

    /**
     * Create an instance of {@link CaseDetails }
     * 
     */
    public CaseDetails createCaseDetails() {
        return new CaseDetails();
    }

    /**
     * Create an instance of {@link ApplicationDetails }
     * 
     */
    public ApplicationDetails createApplicationDetails() {
        return new ApplicationDetails();
    }

    /**
     * Create an instance of {@link UpdateApplicationDetails }
     * 
     */
    public UpdateApplicationDetails createUpdateApplicationDetails() {
        return new UpdateApplicationDetails();
    }

    /**
     * Create an instance of {@link Client }
     * 
     */
    public Client createClient() {
        return new Client();
    }

    /**
     * Create an instance of {@link CaseStatusElementType }
     * 
     */
    public CaseStatusElementType createCaseStatusElementType() {
        return new CaseStatusElementType();
    }

    /**
     * Create an instance of {@link ProviderDetails }
     * 
     */
    public ProviderDetails createProviderDetails() {
        return new ProviderDetails();
    }

    /**
     * Create an instance of {@link ContactDetails }
     * 
     */
    public ContactDetails createContactDetails() {
        return new ContactDetails();
    }

    /**
     * Create an instance of {@link CategoryOfLawElementType }
     * 
     */
    public CategoryOfLawElementType createCategoryOfLawElementType() {
        return new CategoryOfLawElementType();
    }

    /**
     * Create an instance of {@link CostLimitationElementType }
     * 
     */
    public CostLimitationElementType createCostLimitationElementType() {
        return new CostLimitationElementType();
    }

    /**
     * Create an instance of {@link CostLimitations }
     * 
     */
    public CostLimitations createCostLimitations() {
        return new CostLimitations();
    }

    /**
     * Create an instance of {@link OtherParties }
     * 
     */
    public OtherParties createOtherParties() {
        return new OtherParties();
    }

    /**
     * Create an instance of {@link OtherPartyOrgType }
     * 
     */
    public OtherPartyOrgType createOtherPartyOrgType() {
        return new OtherPartyOrgType();
    }

    /**
     * Create an instance of {@link OtherPartyPersonType }
     * 
     */
    public OtherPartyPersonType createOtherPartyPersonType() {
        return new OtherPartyPersonType();
    }

    /**
     * Create an instance of {@link NameType }
     * 
     */
    public NameType createNameType() {
        return new NameType();
    }

    /**
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link OrganizationType }
     * 
     */
    public OrganizationType createOrganizationType() {
        return new OrganizationType();
    }

    /**
     * Create an instance of {@link ExternalResources }
     * 
     */
    public ExternalResources createExternalResources() {
        return new ExternalResources();
    }

    /**
     * Create an instance of {@link ExtResourceElementType }
     * 
     */
    public ExtResourceElementType createExtResourceElementType() {
        return new ExtResourceElementType();
    }

    /**
     * Create an instance of {@link Proceedings }
     * 
     */
    public Proceedings createProceedings() {
        return new Proceedings();
    }

    /**
     * Create an instance of {@link ProceedingElementType }
     * 
     */
    public ProceedingElementType createProceedingElementType() {
        return new ProceedingElementType();
    }

    /**
     * Create an instance of {@link ScopeLimitationElementType }
     * 
     */
    public ScopeLimitationElementType createScopeLimitationElementType() {
        return new ScopeLimitationElementType();
    }

    /**
     * Create an instance of {@link LinkedCases }
     * 
     */
    public LinkedCases createLinkedCases() {
        return new LinkedCases();
    }

    /**
     * Create an instance of {@link LinkedCasesUpdate }
     * 
     */
    public LinkedCasesUpdate createLinkedCasesUpdate() {
        return new LinkedCasesUpdate();
    }

    /**
     * Create an instance of {@link LinkedCaseType }
     * 
     */
    public LinkedCaseType createLinkedCaseType() {
        return new LinkedCaseType();
    }

    /**
     * Create an instance of {@link LinkedCaseUpdateType }
     * 
     */
    public LinkedCaseUpdateType createLinkedCaseUpdateType() {
        return new LinkedCaseUpdateType();
    }

    /**
     * Create an instance of {@link Messages }
     * 
     */
    public Messages createMessages() {
        return new Messages();
    }

    /**
     * Create an instance of {@link MessageType }
     * 
     */
    public MessageType createMessageType() {
        return new MessageType();
    }

    /**
     * Create an instance of {@link Notifications }
     * 
     */
    public Notifications createNotifications() {
        return new Notifications();
    }

    /**
     * Create an instance of {@link ActionListElementType }
     * 
     */
    public ActionListElementType createActionListElementType() {
        return new ActionListElementType();
    }

    /**
     * Create an instance of {@link NotesElementType }
     * 
     */
    public NotesElementType createNotesElementType() {
        return new NotesElementType();
    }

    /**
     * Create an instance of {@link Notes }
     * 
     */
    public Notes createNotes() {
        return new Notes();
    }

    /**
     * Create an instance of {@link DocumentUploadElementType }
     * 
     */
    public DocumentUploadElementType createDocumentUploadElementType() {
        return new DocumentUploadElementType();
    }

    /**
     * Create an instance of {@link AssessmentResultsElementType2 }
     * 
     */
    public AssessmentResultsElementType2 createAssessmentResultsElementType2() {
        return new AssessmentResultsElementType2();
    }

    /**
     * Create an instance of {@link OPAEntityType2 }
     * 
     */
    public OPAEntityType2 createOPAEntityType2() {
        return new OPAEntityType2();
    }

    /**
     * Create an instance of {@link OPAAttributesType2 }
     * 
     */
    public OPAAttributesType2 createOPAAttributesType2() {
        return new OPAAttributesType2();
    }

    /**
     * Create an instance of {@link MeansAssesments }
     * 
     */
    public MeansAssesments createMeansAssesments() {
        return new MeansAssesments();
    }

    /**
     * Create an instance of {@link MeritsAssesments }
     * 
     */
    public MeritsAssesments createMeritsAssesments() {
        return new MeritsAssesments();
    }

    /**
     * Create an instance of {@link CaseList }
     * 
     */
    public CaseList createCaseList() {
        return new CaseList();
    }

    /**
     * Create an instance of {@link CaseInfo }
     * 
     */
    public CaseInfo createCaseInfo() {
        return new CaseInfo();
    }

    /**
     * Create an instance of {@link NotificationLinksElementType }
     * 
     */
    public NotificationLinksElementType createNotificationLinksElementType() {
        return new NotificationLinksElementType();
    }

    /**
     * Create an instance of {@link NotificationListElementType }
     * 
     */
    public NotificationListElementType createNotificationListElementType() {
        return new NotificationListElementType();
    }

    /**
     * Create an instance of {@link NotificationCntList }
     * 
     */
    public NotificationCntList createNotificationCntList() {
        return new NotificationCntList();
    }

    /**
     * Create an instance of {@link ProviderRequestDetailsElementType }
     * 
     */
    public ProviderRequestDetailsElementType createProviderRequestDetailsElementType() {
        return new ProviderRequestDetailsElementType();
    }

    /**
     * Create an instance of {@link ProviderRequestTextElementType }
     * 
     */
    public ProviderRequestTextElementType createProviderRequestTextElementType() {
        return new ProviderRequestTextElementType();
    }

    /**
     * Create an instance of {@link Outcomes }
     * 
     */
    public Outcomes createOutcomes() {
        return new Outcomes();
    }

    /**
     * Create an instance of {@link OutcomeElementType }
     * 
     */
    public OutcomeElementType createOutcomeElementType() {
        return new OutcomeElementType();
    }

    /**
     * Create an instance of {@link OutcomeDetailElementType }
     * 
     */
    public OutcomeDetailElementType createOutcomeDetailElementType() {
        return new OutcomeDetailElementType();
    }

    /**
     * Create an instance of {@link JudgementElementType }
     * 
     */
    public JudgementElementType createJudgementElementType() {
        return new JudgementElementType();
    }

    /**
     * Create an instance of {@link AwardsElementType }
     * 
     */
    public AwardsElementType createAwardsElementType() {
        return new AwardsElementType();
    }

    /**
     * Create an instance of {@link AwardElementType }
     * 
     */
    public AwardElementType createAwardElementType() {
        return new AwardElementType();
    }

    /**
     * Create an instance of {@link RecoveryAmountElementType }
     * 
     */
    public RecoveryAmountElementType createRecoveryAmountElementType() {
        return new RecoveryAmountElementType();
    }

    /**
     * Create an instance of {@link ServiceAddrElementType }
     * 
     */
    public ServiceAddrElementType createServiceAddrElementType() {
        return new ServiceAddrElementType();
    }

    /**
     * Create an instance of {@link TimeRelatedElementType }
     * 
     */
    public TimeRelatedElementType createTimeRelatedElementType() {
        return new TimeRelatedElementType();
    }

    /**
     * Create an instance of {@link DischargeElementType }
     * 
     */
    public DischargeElementType createDischargeElementType() {
        return new DischargeElementType();
    }

    /**
     * Create an instance of {@link PriorAuthorities }
     * 
     */
    public PriorAuthorities createPriorAuthorities() {
        return new PriorAuthorities();
    }

    /**
     * Create an instance of {@link PriorAuthorityElementType }
     * 
     */
    public PriorAuthorityElementType createPriorAuthorityElementType() {
        return new PriorAuthorityElementType();
    }

    /**
     * Create an instance of {@link PriorAuthorityDetElementType }
     * 
     */
    public PriorAuthorityDetElementType createPriorAuthorityDetElementType() {
        return new PriorAuthorityDetElementType();
    }

    /**
     * Create an instance of {@link PriorAuthorityAttribElementType }
     * 
     */
    public PriorAuthorityAttribElementType createPriorAuthorityAttribElementType() {
        return new PriorAuthorityAttribElementType();
    }

    /**
     * Create an instance of {@link LARDetails }
     * 
     */
    public LARDetails createLARDetails() {
        return new LARDetails();
    }

    /**
     * Create an instance of {@link DocumentStatusElementType }
     * 
     */
    public DocumentStatusElementType createDocumentStatusElementType() {
        return new DocumentStatusElementType();
    }

    /**
     * Create an instance of {@link DocumentDetails }
     * 
     */
    public DocumentDetails createDocumentDetails() {
        return new DocumentDetails();
    }

    /**
     * Create an instance of {@link UsernameTokenType }
     * 
     */
    public UsernameTokenType createUsernameTokenType() {
        return new UsernameTokenType();
    }

    /**
     * Create an instance of {@link BinarySecurityTokenType }
     * 
     */
    public BinarySecurityTokenType createBinarySecurityTokenType() {
        return new BinarySecurityTokenType();
    }

    /**
     * Create an instance of {@link ReferenceType }
     * 
     */
    public ReferenceType createReferenceType() {
        return new ReferenceType();
    }

    /**
     * Create an instance of {@link EmbeddedType }
     * 
     */
    public EmbeddedType createEmbeddedType() {
        return new EmbeddedType();
    }

    /**
     * Create an instance of {@link KeyIdentifierType }
     * 
     */
    public KeyIdentifierType createKeyIdentifierType() {
        return new KeyIdentifierType();
    }

    /**
     * Create an instance of {@link SecurityTokenReferenceType }
     * 
     */
    public SecurityTokenReferenceType createSecurityTokenReferenceType() {
        return new SecurityTokenReferenceType();
    }

    /**
     * Create an instance of {@link SecurityHeaderType }
     * 
     */
    public SecurityHeaderType createSecurityHeaderType() {
        return new SecurityHeaderType();
    }

    /**
     * Create an instance of {@link TransformationParametersType }
     * 
     */
    public TransformationParametersType createTransformationParametersType() {
        return new TransformationParametersType();
    }

    /**
     * Create an instance of {@link PasswordString }
     * 
     */
    public PasswordString createPasswordString() {
        return new PasswordString();
    }

    /**
     * Create an instance of {@link EncodedString }
     * 
     */
    public EncodedString createEncodedString() {
        return new EncodedString();
    }

    /**
     * Create an instance of {@link AttributedString }
     * 
     */
    public AttributedString createAttributedString() {
        return new AttributedString();
    }

    /**
     * Create an instance of {@link CaseInqRS }
     * 
     */
    public CaseInqRS createCaseInqRS() {
        return new CaseInqRS();
    }

    /**
     * Create an instance of {@link CaseAddUpdtStatusRQ }
     * 
     */
    public CaseAddUpdtStatusRQ createCaseAddUpdtStatusRQ() {
        return new CaseAddUpdtStatusRQ();
    }

    /**
     * Create an instance of {@link CaseAddUpdtStatusRS }
     * 
     */
    public CaseAddUpdtStatusRS createCaseAddUpdtStatusRS() {
        return new CaseAddUpdtStatusRS();
    }

    /**
     * Create an instance of {@link CaseAddRQ }
     * 
     */
    public CaseAddRQ createCaseAddRQ() {
        return new CaseAddRQ();
    }

    /**
     * Create an instance of {@link CaseAddRS }
     * 
     */
    public CaseAddRS createCaseAddRS() {
        return new CaseAddRS();
    }

    /**
     * Create an instance of {@link CaseUpdateRQ }
     * 
     */
    public CaseUpdateRQ createCaseUpdateRQ() {
        return new CaseUpdateRQ();
    }

    /**
     * Create an instance of {@link CaseUpdateRS }
     * 
     */
    public CaseUpdateRS createCaseUpdateRS() {
        return new CaseUpdateRS();
    }

    /**
     * Create an instance of {@link CaseDeleteRQ }
     * 
     */
    public CaseDeleteRQ createCaseDeleteRQ() {
        return new CaseDeleteRQ();
    }

    /**
     * Create an instance of {@link CaseDeleteRS }
     * 
     */
    public CaseDeleteRS createCaseDeleteRS() {
        return new CaseDeleteRS();
    }

    /**
     * Create an instance of {@link NotificationUpdateRQ }
     * 
     */
    public NotificationUpdateRQ createNotificationUpdateRQ() {
        return new NotificationUpdateRQ();
    }

    /**
     * Create an instance of {@link NotificationUpdateRS }
     * 
     */
    public NotificationUpdateRS createNotificationUpdateRS() {
        return new NotificationUpdateRS();
    }

    /**
     * Create an instance of {@link DocumentUploadRQ }
     * 
     */
    public DocumentUploadRQ createDocumentUploadRQ() {
        return new DocumentUploadRQ();
    }

    /**
     * Create an instance of {@link DocumentUploadRS }
     * 
     */
    public DocumentUploadRS createDocumentUploadRS() {
        return new DocumentUploadRS();
    }

    /**
     * Create an instance of {@link DocumentDownloadRQ }
     * 
     */
    public DocumentDownloadRQ createDocumentDownloadRQ() {
        return new DocumentDownloadRQ();
    }

    /**
     * Create an instance of {@link DocumentDownloadRS }
     * 
     */
    public DocumentDownloadRS createDocumentDownloadRS() {
        return new DocumentDownloadRS();
    }

    /**
     * Create an instance of {@link DocumentCoverRQ }
     * 
     */
    public DocumentCoverRQ createDocumentCoverRQ() {
        return new DocumentCoverRQ();
    }

    /**
     * Create an instance of {@link DocumentCoverRS }
     * 
     */
    public DocumentCoverRS createDocumentCoverRS() {
        return new DocumentCoverRS();
    }

    /**
     * Create an instance of {@link ProviderRequestAddRQ }
     * 
     */
    public ProviderRequestAddRQ createProviderRequestAddRQ() {
        return new ProviderRequestAddRQ();
    }

    /**
     * Create an instance of {@link ProviderRequestAddRS }
     * 
     */
    public ProviderRequestAddRS createProviderRequestAddRS() {
        return new ProviderRequestAddRS();
    }

    /**
     * Create an instance of {@link GetAssessmentDataRQ }
     * 
     */
    public GetAssessmentDataRQ createGetAssessmentDataRQ() {
        return new GetAssessmentDataRQ();
    }

    /**
     * Create an instance of {@link GetAssessmentDataRS }
     * 
     */
    public GetAssessmentDataRS createGetAssessmentDataRS() {
        return new GetAssessmentDataRS();
    }

    /**
     * Create an instance of {@link GetDocumentDetailsABMRS }
     * 
     */
    public GetDocumentDetailsABMRS createGetDocumentDetailsABMRS() {
        return new GetDocumentDetailsABMRS();
    }

    /**
     * Create an instance of {@link GetDocumentDetailsEBMRQ }
     * 
     */
    public GetDocumentDetailsEBMRQ createGetDocumentDetailsEBMRQ() {
        return new GetDocumentDetailsEBMRQ();
    }

    /**
     * Create an instance of {@link GetDocumentDetailsEBMRS }
     * 
     */
    public GetDocumentDetailsEBMRS createGetDocumentDetailsEBMRS() {
        return new GetDocumentDetailsEBMRS();
    }

    /**
     * Create an instance of {@link Bin }
     * 
     */
    public Bin createBin() {
        return new Bin();
    }

    /**
     * Create an instance of {@link VATCode }
     * 
     */
    public VATCode createVATCode() {
        return new VATCode();
    }

    /**
     * Create an instance of {@link Name }
     * 
     */
    public Name createName() {
        return new Name();
    }

    /**
     * Create an instance of {@link PhoneticName }
     * 
     */
    public PhoneticName createPhoneticName() {
        return new PhoneticName();
    }

    /**
     * Create an instance of {@link Attributes15 }
     * 
     */
    public Attributes15 createAttributes15() {
        return new Attributes15();
    }

    /**
     * Create an instance of {@link Attributes20 }
     * 
     */
    public Attributes20 createAttributes20() {
        return new Attributes20();
    }

    /**
     * Create an instance of {@link Attributes24 }
     * 
     */
    public Attributes24 createAttributes24() {
        return new Attributes24();
    }

    /**
     * Create an instance of {@link Attributes25 }
     * 
     */
    public Attributes25 createAttributes25() {
        return new Attributes25();
    }

    /**
     * Create an instance of {@link Attributes30 }
     * 
     */
    public Attributes30 createAttributes30() {
        return new Attributes30();
    }

    /**
     * Create an instance of {@link GlobalAttributes }
     * 
     */
    public GlobalAttributes createGlobalAttributes() {
        return new GlobalAttributes();
    }

    /**
     * Create an instance of {@link Segments20 }
     * 
     */
    public Segments20 createSegments20() {
        return new Segments20();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link RecordHistory }
     * 
     */
    public RecordHistory createRecordHistory() {
        return new RecordHistory();
    }

    /**
     * Create an instance of {@link RecordCount }
     * 
     */
    public RecordCount createRecordCount() {
        return new RecordCount();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link DocumentLinksElementType }
     * 
     */
    public DocumentLinksElementType createDocumentLinksElementType() {
        return new DocumentLinksElementType();
    }

    /**
     * Create an instance of {@link DocumentElementType }
     * 
     */
    public DocumentElementType createDocumentElementType() {
        return new DocumentElementType();
    }

    /**
     * Create an instance of {@link AssesmentResultType }
     * 
     */
    public AssesmentResultType createAssesmentResultType() {
        return new AssesmentResultType();
    }

    /**
     * Create an instance of {@link AssessmentDetailType }
     * 
     */
    public AssessmentDetailType createAssessmentDetailType() {
        return new AssessmentDetailType();
    }

    /**
     * Create an instance of {@link AssessmentScreenType }
     * 
     */
    public AssessmentScreenType createAssessmentScreenType() {
        return new AssessmentScreenType();
    }

    /**
     * Create an instance of {@link OPAEntityType3 }
     * 
     */
    public OPAEntityType3 createOPAEntityType3() {
        return new OPAEntityType3();
    }

    /**
     * Create an instance of {@link OPAAttributesType3 }
     * 
     */
    public OPAAttributesType3 createOPAAttributesType3() {
        return new OPAAttributesType3();
    }

    /**
     * Create an instance of {@link OPAResultType }
     * 
     */
    public OPAResultType createOPAResultType() {
        return new OPAResultType();
    }

    /**
     * Create an instance of {@link OPAGoalType }
     * 
     */
    public OPAGoalType createOPAGoalType() {
        return new OPAGoalType();
    }

    /**
     * Create an instance of {@link NameValuePair }
     * 
     */
    public NameValuePair createNameValuePair() {
        return new NameValuePair();
    }

    /**
     * Create an instance of {@link TimestampType }
     * 
     */
    public TimestampType createTimestampType() {
        return new TimestampType();
    }

    /**
     * Create an instance of {@link AttributedDateTime }
     * 
     */
    public AttributedDateTime createAttributedDateTime() {
        return new AttributedDateTime();
    }

    /**
     * Create an instance of {@link AttributedURI }
     * 
     */
    public AttributedURI createAttributedURI() {
        return new AttributedURI();
    }

    /**
     * Create an instance of {@link OPAInstanceType3 .Attributes }
     * 
     */
    public OPAInstanceType3 .Attributes createOPAInstanceType3Attributes() {
        return new OPAInstanceType3 .Attributes();
    }

    /**
     * Create an instance of {@link GetDocumentDetailsABMRQ.SearchCondition }
     * 
     */
    public GetDocumentDetailsABMRQ.SearchCondition createGetDocumentDetailsABMRQSearchCondition() {
        return new GetDocumentDetailsABMRQ.SearchCondition();
    }

    /**
     * Create an instance of {@link NotificationCntInqRS.NotificationCntLists }
     * 
     */
    public NotificationCntInqRS.NotificationCntLists createNotificationCntInqRSNotificationCntLists() {
        return new NotificationCntInqRS.NotificationCntLists();
    }

    /**
     * Create an instance of {@link NotificationCntInqRQ.SearchCriteria }
     * 
     */
    public NotificationCntInqRQ.SearchCriteria createNotificationCntInqRQSearchCriteria() {
        return new NotificationCntInqRQ.SearchCriteria();
    }

    /**
     * Create an instance of {@link NotificationInqRS.NotificationList }
     * 
     */
    public NotificationInqRS.NotificationList createNotificationInqRSNotificationList() {
        return new NotificationInqRS.NotificationList();
    }

    /**
     * Create an instance of {@link NotificationInqRQ.SearchCriteria }
     * 
     */
    public NotificationInqRQ.SearchCriteria createNotificationInqRQSearchCriteria() {
        return new NotificationInqRQ.SearchCriteria();
    }

    /**
     * Create an instance of {@link CaseInqRQ.SearchCriteria }
     * 
     */
    public CaseInqRQ.SearchCriteria createCaseInqRQSearchCriteria() {
        return new CaseInqRQ.SearchCriteria();
    }

    /**
     * Create an instance of {@link UndertakingDetailsElementType.BillsToDate }
     * 
     */
    public UndertakingDetailsElementType.BillsToDate createUndertakingDetailsElementTypeBillsToDate() {
        return new UndertakingDetailsElementType.BillsToDate();
    }

    /**
     * Create an instance of {@link UndertakingElementType.Details }
     * 
     */
    public UndertakingElementType.Details createUndertakingElementTypeDetails() {
        return new UndertakingElementType.Details();
    }

    /**
     * Create an instance of {@link RecoveryElementType.RecoveredAmount }
     * 
     */
    public RecoveryElementType.RecoveredAmount createRecoveryElementTypeRecoveredAmount() {
        return new RecoveryElementType.RecoveredAmount();
    }

    /**
     * Create an instance of {@link RecoveryElementType.OfferedAmount }
     * 
     */
    public RecoveryElementType.OfferedAmount createRecoveryElementTypeOfferedAmount() {
        return new RecoveryElementType.OfferedAmount();
    }

    /**
     * Create an instance of {@link OtherAssetElementType.Valuation }
     * 
     */
    public OtherAssetElementType.Valuation createOtherAssetElementTypeValuation() {
        return new OtherAssetElementType.Valuation();
    }

    /**
     * Create an instance of {@link OtherAssetElementType.HeldBy }
     * 
     */
    public OtherAssetElementType.HeldBy createOtherAssetElementTypeHeldBy() {
        return new OtherAssetElementType.HeldBy();
    }

    /**
     * Create an instance of {@link LandAwardElementType.Valuation }
     * 
     */
    public LandAwardElementType.Valuation createLandAwardElementTypeValuation() {
        return new LandAwardElementType.Valuation();
    }

    /**
     * Create an instance of {@link LandAwardElementType.OtherProprietors }
     * 
     */
    public LandAwardElementType.OtherProprietors createLandAwardElementTypeOtherProprietors() {
        return new LandAwardElementType.OtherProprietors();
    }

    /**
     * Create an instance of {@link FinancialAwardElementType.LiableParties }
     * 
     */
    public FinancialAwardElementType.LiableParties createFinancialAwardElementTypeLiableParties() {
        return new FinancialAwardElementType.LiableParties();
    }

    /**
     * Create an instance of {@link CostAwardElementType.LiableParties }
     * 
     */
    public CostAwardElementType.LiableParties createCostAwardElementTypeLiableParties() {
        return new CostAwardElementType.LiableParties();
    }

    /**
     * Create an instance of {@link AwardDetailElementType.AwardDetails }
     * 
     */
    public AwardDetailElementType.AwardDetails createAwardDetailElementTypeAwardDetails() {
        return new AwardDetailElementType.AwardDetails();
    }

    /**
     * Create an instance of {@link ProviderRequestElementType.RequestDetails }
     * 
     */
    public ProviderRequestElementType.RequestDetails createProviderRequestElementTypeRequestDetails() {
        return new ProviderRequestElementType.RequestDetails();
    }

    /**
     * Create an instance of {@link OPAInstanceType2 .Attributes }
     * 
     */
    public OPAInstanceType2 .Attributes createOPAInstanceType2Attributes() {
        return new OPAInstanceType2 .Attributes();
    }

    /**
     * Create an instance of {@link NotificationElementType.AttachedDocuments }
     * 
     */
    public NotificationElementType.AttachedDocuments createNotificationElementTypeAttachedDocuments() {
        return new NotificationElementType.AttachedDocuments();
    }

    /**
     * Create an instance of {@link NotificationElementType.UploadedDocuments }
     * 
     */
    public NotificationElementType.UploadedDocuments createNotificationElementTypeUploadedDocuments() {
        return new NotificationElementType.UploadedDocuments();
    }

    /**
     * Create an instance of {@link NotificationElementType.AvailableResponses }
     * 
     */
    public NotificationElementType.AvailableResponses createNotificationElementTypeAvailableResponses() {
        return new NotificationElementType.AvailableResponses();
    }

    /**
     * Create an instance of {@link ProceedingDetElementType.ScopeLimitations }
     * 
     */
    public ProceedingDetElementType.ScopeLimitations createProceedingDetElementTypeScopeLimitations() {
        return new ProceedingDetElementType.ScopeLimitations();
    }

    /**
     * Create an instance of {@link OtherPartyElementType.OtherPartyDetail }
     * 
     */
    public OtherPartyElementType.OtherPartyDetail createOtherPartyElementTypeOtherPartyDetail() {
        return new OtherPartyElementType.OtherPartyDetail();
    }

    /**
     * Create an instance of {@link OPAInstanceType.Attributes }
     * 
     */
    public OPAInstanceType.Attributes createOPAInstanceTypeAttributes() {
        return new OPAInstanceType.Attributes();
    }

    /**
     * Create an instance of {@link SOADetailElementType.InvoiceList }
     * 
     */
    public SOADetailElementType.InvoiceList createSOADetailElementTypeInvoiceList() {
        return new SOADetailElementType.InvoiceList();
    }

    /**
     * Create an instance of {@link SOAElementType.Details }
     * 
     */
    public SOAElementType.Details createSOAElementTypeDetails() {
        return new SOAElementType.Details();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HeaderRQType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://legalservices.gov.uk/Enterprise/Common/1.0/Header", name = "HeaderRQ")
    public JAXBElement<HeaderRQType> createHeaderRQ(HeaderRQType value) {
        return new JAXBElement<HeaderRQType>(_HeaderRQ_QNAME, HeaderRQType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HeaderRSType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://legalservices.gov.uk/Enterprise/Common/1.0/Header", name = "HeaderRS")
    public JAXBElement<HeaderRSType> createHeaderRS(HeaderRSType value) {
        return new JAXBElement<HeaderRSType>(_HeaderRS_QNAME, HeaderRSType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UsernameTokenType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", name = "UsernameToken")
    public JAXBElement<UsernameTokenType> createUsernameToken(UsernameTokenType value) {
        return new JAXBElement<UsernameTokenType>(_UsernameToken_QNAME, UsernameTokenType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BinarySecurityTokenType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", name = "BinarySecurityToken")
    public JAXBElement<BinarySecurityTokenType> createBinarySecurityToken(BinarySecurityTokenType value) {
        return new JAXBElement<BinarySecurityTokenType>(_BinarySecurityToken_QNAME, BinarySecurityTokenType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", name = "Reference")
    public JAXBElement<ReferenceType> createReference(ReferenceType value) {
        return new JAXBElement<ReferenceType>(_Reference_QNAME, ReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmbeddedType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", name = "Embedded")
    public JAXBElement<EmbeddedType> createEmbedded(EmbeddedType value) {
        return new JAXBElement<EmbeddedType>(_Embedded_QNAME, EmbeddedType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeyIdentifierType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", name = "KeyIdentifier")
    public JAXBElement<KeyIdentifierType> createKeyIdentifier(KeyIdentifierType value) {
        return new JAXBElement<KeyIdentifierType>(_KeyIdentifier_QNAME, KeyIdentifierType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SecurityTokenReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", name = "SecurityTokenReference")
    public JAXBElement<SecurityTokenReferenceType> createSecurityTokenReference(SecurityTokenReferenceType value) {
        return new JAXBElement<SecurityTokenReferenceType>(_SecurityTokenReference_QNAME, SecurityTokenReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SecurityHeaderType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", name = "Security")
    public JAXBElement<SecurityHeaderType> createSecurity(SecurityHeaderType value) {
        return new JAXBElement<SecurityHeaderType>(_Security_QNAME, SecurityHeaderType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransformationParametersType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", name = "TransformationParameters")
    public JAXBElement<TransformationParametersType> createTransformationParameters(TransformationParametersType value) {
        return new JAXBElement<TransformationParametersType>(_TransformationParameters_QNAME, TransformationParametersType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PasswordString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", name = "Password")
    public JAXBElement<PasswordString> createPassword(PasswordString value) {
        return new JAXBElement<PasswordString>(_Password_QNAME, PasswordString.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EncodedString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", name = "Nonce")
    public JAXBElement<EncodedString> createNonce(EncodedString value) {
        return new JAXBElement<EncodedString>(_Nonce_QNAME, EncodedString.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CaseInqRQ }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIM", name = "CaseInqRQ")
    public JAXBElement<CaseInqRQ> createCaseInqRQ(CaseInqRQ value) {
        return new JAXBElement<CaseInqRQ>(_CaseInqRQ_QNAME, CaseInqRQ.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CaseInqRS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIM", name = "CaseInqRS")
    public JAXBElement<CaseInqRS> createCaseInqRS(CaseInqRS value) {
        return new JAXBElement<CaseInqRS>(_CaseInqRS_QNAME, CaseInqRS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CaseAddUpdtStatusRQ }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIM", name = "CaseAddUpdtStatusRQ")
    public JAXBElement<CaseAddUpdtStatusRQ> createCaseAddUpdtStatusRQ(CaseAddUpdtStatusRQ value) {
        return new JAXBElement<CaseAddUpdtStatusRQ>(_CaseAddUpdtStatusRQ_QNAME, CaseAddUpdtStatusRQ.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CaseAddUpdtStatusRS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIM", name = "CaseAddUpdtStatusRS")
    public JAXBElement<CaseAddUpdtStatusRS> createCaseAddUpdtStatusRS(CaseAddUpdtStatusRS value) {
        return new JAXBElement<CaseAddUpdtStatusRS>(_CaseAddUpdtStatusRS_QNAME, CaseAddUpdtStatusRS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CaseAddRQ }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIM", name = "CaseAddRQ")
    public JAXBElement<CaseAddRQ> createCaseAddRQ(CaseAddRQ value) {
        return new JAXBElement<CaseAddRQ>(_CaseAddRQ_QNAME, CaseAddRQ.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CaseAddRS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIM", name = "CaseAddRS")
    public JAXBElement<CaseAddRS> createCaseAddRS(CaseAddRS value) {
        return new JAXBElement<CaseAddRS>(_CaseAddRS_QNAME, CaseAddRS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CaseUpdateRQ }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIM", name = "CaseUpdateRQ")
    public JAXBElement<CaseUpdateRQ> createCaseUpdateRQ(CaseUpdateRQ value) {
        return new JAXBElement<CaseUpdateRQ>(_CaseUpdateRQ_QNAME, CaseUpdateRQ.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CaseUpdateRS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIM", name = "CaseUpdateRS")
    public JAXBElement<CaseUpdateRS> createCaseUpdateRS(CaseUpdateRS value) {
        return new JAXBElement<CaseUpdateRS>(_CaseUpdateRS_QNAME, CaseUpdateRS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CaseDeleteRQ }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIM", name = "CaseDeleteRQ")
    public JAXBElement<CaseDeleteRQ> createCaseDeleteRQ(CaseDeleteRQ value) {
        return new JAXBElement<CaseDeleteRQ>(_CaseDeleteRQ_QNAME, CaseDeleteRQ.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CaseDeleteRS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIM", name = "CaseDeleteRS")
    public JAXBElement<CaseDeleteRS> createCaseDeleteRS(CaseDeleteRS value) {
        return new JAXBElement<CaseDeleteRS>(_CaseDeleteRS_QNAME, CaseDeleteRS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotificationInqRQ }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIM", name = "NotificationInqRQ")
    public JAXBElement<NotificationInqRQ> createNotificationInqRQ(NotificationInqRQ value) {
        return new JAXBElement<NotificationInqRQ>(_NotificationInqRQ_QNAME, NotificationInqRQ.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotificationInqRS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIM", name = "NotificationInqRS")
    public JAXBElement<NotificationInqRS> createNotificationInqRS(NotificationInqRS value) {
        return new JAXBElement<NotificationInqRS>(_NotificationInqRS_QNAME, NotificationInqRS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotificationUpdateRQ }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIM", name = "NotificationUpdateRQ")
    public JAXBElement<NotificationUpdateRQ> createNotificationUpdateRQ(NotificationUpdateRQ value) {
        return new JAXBElement<NotificationUpdateRQ>(_NotificationUpdateRQ_QNAME, NotificationUpdateRQ.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotificationUpdateRS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIM", name = "NotificationUpdateRS")
    public JAXBElement<NotificationUpdateRS> createNotificationUpdateRS(NotificationUpdateRS value) {
        return new JAXBElement<NotificationUpdateRS>(_NotificationUpdateRS_QNAME, NotificationUpdateRS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotificationCntInqRQ }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIM", name = "NotificationCntInqRQ")
    public JAXBElement<NotificationCntInqRQ> createNotificationCntInqRQ(NotificationCntInqRQ value) {
        return new JAXBElement<NotificationCntInqRQ>(_NotificationCntInqRQ_QNAME, NotificationCntInqRQ.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotificationCntInqRS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIM", name = "NotificationCntInqRS")
    public JAXBElement<NotificationCntInqRS> createNotificationCntInqRS(NotificationCntInqRS value) {
        return new JAXBElement<NotificationCntInqRS>(_NotificationCntInqRS_QNAME, NotificationCntInqRS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentUploadRQ }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIM", name = "DocumentUploadRQ")
    public JAXBElement<DocumentUploadRQ> createDocumentUploadRQ(DocumentUploadRQ value) {
        return new JAXBElement<DocumentUploadRQ>(_DocumentUploadRQ_QNAME, DocumentUploadRQ.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentUploadRS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIM", name = "DocumentUploadRS")
    public JAXBElement<DocumentUploadRS> createDocumentUploadRS(DocumentUploadRS value) {
        return new JAXBElement<DocumentUploadRS>(_DocumentUploadRS_QNAME, DocumentUploadRS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentDownloadRQ }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIM", name = "DocumentDownloadRQ")
    public JAXBElement<DocumentDownloadRQ> createDocumentDownloadRQ(DocumentDownloadRQ value) {
        return new JAXBElement<DocumentDownloadRQ>(_DocumentDownloadRQ_QNAME, DocumentDownloadRQ.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentDownloadRS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIM", name = "DocumentDownloadRS")
    public JAXBElement<DocumentDownloadRS> createDocumentDownloadRS(DocumentDownloadRS value) {
        return new JAXBElement<DocumentDownloadRS>(_DocumentDownloadRS_QNAME, DocumentDownloadRS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentCoverRQ }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIM", name = "DocumentCoverRQ")
    public JAXBElement<DocumentCoverRQ> createDocumentCoverRQ(DocumentCoverRQ value) {
        return new JAXBElement<DocumentCoverRQ>(_DocumentCoverRQ_QNAME, DocumentCoverRQ.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentCoverRS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIM", name = "DocumentCoverRS")
    public JAXBElement<DocumentCoverRS> createDocumentCoverRS(DocumentCoverRS value) {
        return new JAXBElement<DocumentCoverRS>(_DocumentCoverRS_QNAME, DocumentCoverRS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProviderRequestAddRQ }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIM", name = "ProviderRequestAddRQ")
    public JAXBElement<ProviderRequestAddRQ> createProviderRequestAddRQ(ProviderRequestAddRQ value) {
        return new JAXBElement<ProviderRequestAddRQ>(_ProviderRequestAddRQ_QNAME, ProviderRequestAddRQ.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProviderRequestAddRS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIM", name = "ProviderRequestAddRS")
    public JAXBElement<ProviderRequestAddRS> createProviderRequestAddRS(ProviderRequestAddRS value) {
        return new JAXBElement<ProviderRequestAddRS>(_ProviderRequestAddRS_QNAME, ProviderRequestAddRS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAssessmentDataRQ }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIM", name = "GetAssessmentDataRQ")
    public JAXBElement<GetAssessmentDataRQ> createGetAssessmentDataRQ(GetAssessmentDataRQ value) {
        return new JAXBElement<GetAssessmentDataRQ>(_GetAssessmentDataRQ_QNAME, GetAssessmentDataRQ.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAssessmentDataRS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIM", name = "GetAssessmentDataRS")
    public JAXBElement<GetAssessmentDataRS> createGetAssessmentDataRS(GetAssessmentDataRS value) {
        return new JAXBElement<GetAssessmentDataRS>(_GetAssessmentDataRS_QNAME, GetAssessmentDataRS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDocumentDetailsABMRQ }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIM", name = "GetDocumentDetailsABMRQ")
    public JAXBElement<GetDocumentDetailsABMRQ> createGetDocumentDetailsABMRQ(GetDocumentDetailsABMRQ value) {
        return new JAXBElement<GetDocumentDetailsABMRQ>(_GetDocumentDetailsABMRQ_QNAME, GetDocumentDetailsABMRQ.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDocumentDetailsABMRS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIM", name = "GetDocumentDetailsABMRS")
    public JAXBElement<GetDocumentDetailsABMRS> createGetDocumentDetailsABMRS(GetDocumentDetailsABMRS value) {
        return new JAXBElement<GetDocumentDetailsABMRS>(_GetDocumentDetailsABMRS_QNAME, GetDocumentDetailsABMRS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDocumentDetailsEBMRQ }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIM", name = "GetDocumentDetailsEBMRQ")
    public JAXBElement<GetDocumentDetailsEBMRQ> createGetDocumentDetailsEBMRQ(GetDocumentDetailsEBMRQ value) {
        return new JAXBElement<GetDocumentDetailsEBMRQ>(_GetDocumentDetailsEBMRQ_QNAME, GetDocumentDetailsEBMRQ.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDocumentDetailsEBMRS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://legalservices.gov.uk/CCMS/CaseManagement/Case/1.0/CaseBIM", name = "GetDocumentDetailsEBMRS")
    public JAXBElement<GetDocumentDetailsEBMRS> createGetDocumentDetailsEBMRS(GetDocumentDetailsEBMRS value) {
        return new JAXBElement<GetDocumentDetailsEBMRS>(_GetDocumentDetailsEBMRS_QNAME, GetDocumentDetailsEBMRS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimestampType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd", name = "Timestamp")
    public JAXBElement<TimestampType> createTimestamp(TimestampType value) {
        return new JAXBElement<TimestampType>(_Timestamp_QNAME, TimestampType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AttributedDateTime }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd", name = "Expires")
    public JAXBElement<AttributedDateTime> createExpires(AttributedDateTime value) {
        return new JAXBElement<AttributedDateTime>(_Expires_QNAME, AttributedDateTime.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AttributedDateTime }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd", name = "Created")
    public JAXBElement<AttributedDateTime> createCreated(AttributedDateTime value) {
        return new JAXBElement<AttributedDateTime>(_Created_QNAME, AttributedDateTime.class, null, value);
    }

}
