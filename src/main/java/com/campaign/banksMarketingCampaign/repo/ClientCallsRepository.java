package com.campaign.banksMarketingCampaign.repo;

import com.campaign.banksMarketingCampaign.model.ClientCallDetails;
import org.springframework.data.cassandra.repository.CassandraRepository;

public interface ClientCallsRepository  extends CassandraRepository<ClientCallDetails, Integer> {
}
