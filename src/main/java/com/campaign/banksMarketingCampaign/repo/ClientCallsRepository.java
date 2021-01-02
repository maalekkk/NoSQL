package com.campaign.banksMarketingCampaign.repo;

import com.campaign.banksMarketingCampaign.model.ClientCallDetails;
import org.springframework.data.cassandra.core.cql.CqlTemplate;
import org.springframework.data.cassandra.repository.CassandraRepository;

import java.util.List;

public interface ClientCallsRepository  extends CassandraRepository<ClientCallDetails, Integer> {

}
