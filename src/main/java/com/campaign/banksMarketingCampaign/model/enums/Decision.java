package com.campaign.banksMarketingCampaign.model.enums;

public enum Decision {
    yes("yes"),no("no");

    private String name;

    private Decision(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
