package com.campaign.banksMarketingCampaign.controller;

import com.campaign.banksMarketingCampaign.ResourceNotFoundException;
import com.campaign.banksMarketingCampaign.model.ClientCallDetails;
import com.campaign.banksMarketingCampaign.repo.ClientCallsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ClientCallDetailsController {

    @Autowired
    ClientCallsRepository repository;

    @PostMapping("/clients/add")
    public ClientCallDetails addClient(@RequestBody ClientCallDetails clientCallDetails){
        repository.save(clientCallDetails);
        return clientCallDetails;
    }

    @GetMapping("/clients/show/{id}")
    public ResponseEntity<ClientCallDetails> findById(@PathVariable("id") Integer clientCallDetailsId){

        ClientCallDetails cld = repository.findById(clientCallDetailsId).orElseThrow(
                () -> new ResourceNotFoundException("Client not found!" + clientCallDetailsId));

        return ResponseEntity.ok().body(cld);
    }

    @GetMapping("/clients/show")
    public List<ClientCallDetails> getClients(){
        return repository.findAll();
    }

    @DeleteMapping("/clients/del/{id}")
    public ResponseEntity<Void> deleteClient(@PathVariable(value="id") Integer clientCallDetailsId, @RequestBody ClientCallDetails clientCallDetails) {

        ClientCallDetails cld = repository.findById(clientCallDetailsId).orElseThrow(
                () -> new ResourceNotFoundException("Client not found!" + clientCallDetailsId));

        repository.delete(cld);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/clients/upd/{id}")
    public ResponseEntity<ClientCallDetails> updateClient(@PathVariable(value="id") Integer clientCallDetailsId, @RequestBody ClientCallDetails clientCallDetails){

        ClientCallDetails cld = repository.findById(clientCallDetailsId).orElseThrow(
                () -> new ResourceNotFoundException("Client not found!" + clientCallDetailsId));

        cld.setId(clientCallDetails.getId());
        cld.setJob(clientCallDetails.getJob());
        cld.setMarital(clientCallDetails.getMarital());
        cld.setEducation(clientCallDetails.getEducation());
        cld.setDefaultCredit(clientCallDetails.getDefaultCredit());
        cld.setBalance(clientCallDetails.getBalance());
        cld.setHousing(clientCallDetails.getHousing());
        cld.setLoan(clientCallDetails.getLoan());
        cld.setContact(clientCallDetails.getContact());
        cld.setDay(clientCallDetails.getDay());
        cld.setMonth(clientCallDetails.getMonth());
        cld.setDuration(clientCallDetails.getDuration());
        cld.setCampaign(clientCallDetails.getCampaign());
        cld.setPdays(clientCallDetails.getPdays());
        cld.setPrevious(clientCallDetails.getPrevious());
        cld.setPoutcome(clientCallDetails.getPoutcome());
        cld.setResult(clientCallDetails.getResult());
        final ClientCallDetails updatedClientCallDetails = repository.save(cld);
        return ResponseEntity.ok(updatedClientCallDetails);
    }
}