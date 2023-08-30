@Repository
public interface GroupInsuranceProductsRepository {
    
    //Lead Generation, Creation, Proposal, and Quotation Generation
    void leadGeneration();
    void createProposal();
    void generateQuotation();
    
    //Unit (New Business)
    void configureMasterPolicies();
    void mapUnits();
    void underwritePolicies();
    void manageReinsurance();
    void issuePolicyBonds();
    void collectStampDuty();
    void generateReports();
    
    //ZO
    void approveDeviations();
    
    //CO
    void approveDecisions();
    
    //Actuarial
    void performValuations();
    
    //Re-insurer
    void makePricingDecisions();
    
    //Underwriter
    void makeUnderwritingPricingDecisions();
    
    //Master Policy Holder
    void manageMemberData();
    void managePayments();
    void manageClaimForms();
    void changeSchemeRules();
    void consentForRenewal();
    void requestForConversion();
    void withdrawal();
    void surrender();
    void makeMemberLevelPayments();
    void manageTDsDetails();
    void manageGST();
    void makeFundingBasedOnValuations();
    void manageNonMonetaryServices();
    
    //Member
    void acknowledgeReceiptOfClaimForms();
    
    //Channel Users
    void updateLeads();
    void coordinateWithCustomers();
    void acknowledgeCommissionReceipts();
}