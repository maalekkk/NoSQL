package com.campaign.banksMarketingCampaign.model;

import com.campaign.banksMarketingCampaign.model.enums.*;
import lombok.*;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ClientCallDetails {
    @PrimaryKey
    private int id;
    private JobTypes job;
    private MaritalStatus marital;
    private EducationLevel education;
    private boolean defaultCredit;
    private int balance;
    private boolean housing;
    private boolean loan;
    private ContactType contact;
    private int day;
    private Month month;
    private int duration;
    private int campaign;
    private int pdays;
    private int previous;
    private PreviousCampaignResult poutcome;
    private boolean result;
}
