package com.test.service;

import com.test.repository.GroupInsuranceProductsRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GroupInsuranceProductsService {
    
    @Autowired
    private GroupInsuranceProductsRepository groupInsuranceProductsRepository;

    //Lead Generation, Creation, Proposal, and Quotation Generation
    public void leadGeneration(){
        groupInsuranceProductsRepository.leadGeneration();
    }
    public void createProposal(){
        groupInsuranceProductsRepository.createProposal();
    }
    public void generateQuotation(){
        groupInsuranceProductsRepository.generateQuotation();
    }

    //Unit (New Business)
    public void configureMasterPolicies(){
        groupInsuranceProductsRepository.configureMasterPolicies();
    }
    public void mapUnits(){
        groupInsuranceProductsRepository.mapUnits();
    }
    public void underwritePolicies(){
        groupInsuranceProductsRepository.underwritePolicies();
    }
    public void manageReinsurance(){
        groupInsuranceProductsRepository.manageReinsurance();
    }
    public void issuePolicyBonds(){
        groupInsuranceProductsRepository.issuePolicyBonds();
    }
    public void collectStampDuty(){
        groupInsuranceProductsRepository.collectStampDuty();
    }
    public void generateReports(){
        groupInsuranceProductsRepository.generateReports();
    }

    //ZO
    public void approveDeviations(){
        groupInsuranceProductsRepository.approveDeviations();
    }

    //CO
    public void approveDecisions(){
        groupInsuranceProductsRepository.approveDecisions();
    }

    //Actuarial
    public void performValuations(){
        groupInsuranceProductsRepository.performValuations();
    }

    //Re-insurer
    public void makePricingDecisions(){
        groupInsuranceProductsRepository.makePricingDecisions();
    }

    //Underwriter
    public void makeUnderwritingPricingDecisions(){
        groupInsuranceProductsRepository.makeUnderwritingPricingDecisions();
    }

    //Master Policy Holder
    public void manageMemberData(){
        groupInsuranceProductsRepository.manageMemberData();
    }
    public void managePayments(){
        groupInsuranceProductsRepository.managePayments();
    }
    public void manageClaimForms(){
        groupInsuranceProductsRepository.manageClaimForms();
    }
    public void changeSchemeRules(){
        groupInsuranceProductsRepository.changeSchemeRules();
    }
    public void consentForRenewal(){
        groupInsuranceProductsRepository.consentForRenewal();
    }
    public void requestForConversion(){
        groupInsuranceProductsRepository.requestForConversion();
    }
    public void withdrawal(){
        groupInsuranceProductsRepository.withdrawal();
    }
    public void surrender(){
        groupInsuranceProductsRepository.surrender();
    }
    public void makeMemberLevelPayments(){
        groupInsuranceProductsRepository.makeMemberLevelPayments();
    }
    public void manageTDsDetails(){
        groupInsuranceProductsRepository.manageTDsDetails();
    }
    public void manageGST(){
        groupInsuranceProductsRepository.manageGST();
    }
    public void makeFundingBasedOnValuations(){
        groupInsuranceProductsRepository.makeFundingBasedOnValuations();
    }
    public void manageNonMonetaryServices(){
        groupInsuranceProductsRepository.manageNonMonetaryServices();
    }

    //Member
    public void acknowledgeReceiptOfClaimForms(){
        groupInsuranceProductsRepository.acknowledgeReceiptOfClaimForms();
    }

    //Channel Users
    public void updateLeads(){
        groupInsuranceProductsRepository.updateLeads();
    }
    public void coordinateWithCustomers(){
        groupInsuranceProductsRepository.coordinateWithCustomers();
    }
    public void acknowledgeCommissionReceipts(){
        groupInsuranceProductsRepository.acknowledgeCommissionReceipts();
    }
}