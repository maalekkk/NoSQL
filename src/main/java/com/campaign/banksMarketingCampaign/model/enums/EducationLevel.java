package com.campaign.banksMarketingCampaign.model.enums;

public enum EducationLevel {

    unknown("unknown"),secondary("secondary"),primary("primary"),tertiary("tertiary") ;

    private String name;

    private EducationLevel(String string){
        name = string;
    }


    @Override
    public String toString() {
        return name;
    }
}
