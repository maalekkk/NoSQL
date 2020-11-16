package com.campaign.banksMarketingCampaign.model.enums;

public enum PreviousCampaignResult {

    unknown("unknown"), other("other"), failure("failure"), success("success");

    private String name;

    private PreviousCampaignResult(String string){
        name = string;
    }

    @Override
    public String toString() {
        return name;
    }
}
