package com.campaign.banksMarketingCampaign.model.enums;

public enum ContactType {

    unknown("unknown"),telephone("telephone"),cellular("cellular");

    private String name;

    private ContactType(String string){
        name = string;
    }

    @Override
    public String toString() {
        return name;
    }
}
