package com.test.controller;

import com.test.service.GroupInsuranceProductsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GroupInsuranceProductsController {

    @Autowired
    private GroupInsuranceProductsService groupInsuranceProductsService;

    //Lead Generation, Creation, Proposal, and Quotation Generation
    public void leadGeneration(){
        groupInsuranceProductsService.leadGeneration();
    }
    public void createProposal(){
        groupInsuranceProductsService.createProposal();
    }
    public void generateQuotation(){
        groupInsuranceProductsService.generateQuotation();
    }

    //Unit (New Business)
    public void configureMasterPolicies(){
        groupInsuranceProductsService.configureMasterPolicies();
    }
    public void mapUnits(){
        groupInsuranceProductsService.mapUnits();
    }
    public void underwritePolicies(){
        groupInsuranceProductsService.underwritePolicies();
    }
    public void manageReinsurance(){
        groupInsuranceProductsService.manageReinsurance();
    }
    public void issuePolicyBonds(){
        groupInsuranceProductsService.issuePolicyBonds();
    }
    public void collectStampDuty(){
        groupInsuranceProductsService.collectStampDuty();
    }
    public void generateReports(){
        groupInsuranceProductsService.generateReports();
    }

    //ZO
    public void approveDeviations(){
        groupInsuranceProductsService.approveDeviations();
    }

    //CO
    public void approveDecisions(){
        groupInsuranceProductsService.approveDecisions();
    }

    //Actuarial
    public void performValuations(){
        groupInsuranceProductsService.performValuations();
    }

    //Re-insurer
    public void makePricingDecisions(){
        groupInsuranceProductsService.makePricingDecisions();
    }

    //Underwriter
    public void makeUnderwritingPricingDecisions(){
        groupInsuranceProductsService.makeUnderwritingPricingDecisions();
    }

    //Master Policy Holder
    public void manageMemberData(){
        groupInsuranceProductsService.manageMemberData();
    }
    public void managePayments(){
        groupInsuranceProductsService.managePayments();
    }
    public void manageClaimForms(){
        groupInsuranceProductsService.manageClaimForms();
    }
    public void changeSchemeRules(){
        groupInsuranceProductsService.changeSchemeRules();
    }
    public void consentForRenewal(){
        groupInsuranceProductsService.consentForRenewal();
    }
    public void requestForConversion(){
        groupInsuranceProductsService.requestForConversion();
    }
    public void withdrawal(){
        groupInsuranceProductsService.withdrawal();
    }
    public void surrender(){
        groupInsuranceProductsService.surrender();
    }
    public void makeMemberLevelPayments(){
        groupInsuranceProductsService.makeMemberLevelPayments();
    }
    public void manageTDsDetails(){
        groupInsuranceProductsService.manageTDsDetails();
    }
    public void manageGST(){
        groupInsuranceProductsService.manageGST();
    }
    public void makeFundingBasedOnValuations(){
        groupInsuranceProductsService.makeFundingBasedOnValuations();
    }
    public void manageNonMonetaryServices(){
        groupInsuranceProductsService.manageNonMonetaryServices();
    }

    //Member
    public void acknowledgeReceiptOfClaimForms(){
        groupInsuranceProductsService.acknowledgeReceiptOfClaimForms();
    }

    //Channel Users
    public void updateLeads(){
        groupInsuranceProductsService.updateLeads();
    }
    public void coordinateWithCustomers(){
        groupInsuranceProductsService.coordinateWithCustomers();
    }
    public void acknowledgeCommissionReceipts(){
        groupInsuranceProductsService.acknowledgeCommissionReceipts();
    }
}