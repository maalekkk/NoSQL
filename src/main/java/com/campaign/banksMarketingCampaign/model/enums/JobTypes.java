package com.campaign.banksMarketingCampaign.model.enums;

import org.springframework.boot.autoconfigure.batch.BatchProperties;

public enum JobTypes {
    admin("admin"), unknown("unknown"), unemployed("unemployed"), management("management"),
    housemaid("housemaid"), entrepreneur("entrepreneur"), student("student"),
    bluecollar("blue-collar"), selfemployed("self-employed"), retired("retired"),
    technician("technician"), services("services");

    private String name;

    private JobTypes(String string){
        name = string;
    }


    @Override
    public String toString() {
        return name;
    }
}
