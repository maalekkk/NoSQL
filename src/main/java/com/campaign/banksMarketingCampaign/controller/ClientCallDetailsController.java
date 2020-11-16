package com.campaign.banksMarketingCampaign.controller;

import com.campaign.banksMarketingCampaign.model.ClientCallDetails;
import com.campaign.banksMarketingCampaign.repo.ClientCallsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ClientCallDetailsController {

    @Autowired
    ClientCallsRepository repository;

    @PostMapping("/clients/add")
    public ClientCallDetails addClient(@RequestBody ClientCallDetails client){
        repository.save(client);
        return client;
    }


}
