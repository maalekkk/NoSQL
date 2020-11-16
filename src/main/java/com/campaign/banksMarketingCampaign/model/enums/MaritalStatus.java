package com.campaign.banksMarketingCampaign.model.enums;

public enum MaritalStatus {

    married("married"), divorced("divorced"), single("single");

    private String name;

    private MaritalStatus(String string){
        name = string;
    }

    @Override
    public String toString() {
        return name;
    }
}
