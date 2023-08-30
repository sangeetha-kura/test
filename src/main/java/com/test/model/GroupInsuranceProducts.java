@Entity
@Table(name = "group_insurance_products")
public class GroupInsuranceProducts {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String leadGeneration;
    private String createProposal;
    private String generateQuotation;
    
    private String configureMasterPolicies;
    private String mapUnits;
    private String underwritePolicies;
    private String manageReinsurance;
    private String issuePolicyBonds;
    private String collectStampDuty;
    private String generateReports;
    
    private String approveDeviations;
    
    private String approveDecisions;
    
    private String performValuations;
    
    private String makePricingDecisions;
    
    private String makeUnderwritingPricingDecisions;
    
    private String manageMemberData;
    private String managePayments;
    private String manageClaimForms;
    private String changeSchemeRules;
    private String consentForRenewal;
    private String requestForConversion;
    private String withdrawal;
    private String surrender;
    private String makeMemberLevelPayments;
    private String manageTDsDetails;
    private String manageGST;
    private String makeFundingBasedOnValuations;
    private String manageNonMonetaryServices;
    
    private String acknowledgeReceiptOfClaimForms;
    
    private String updateLeads;
    private String coordinateWithCustomers;
    private String acknowledgeCommissionReceipts;
    
    // getters and setters
}