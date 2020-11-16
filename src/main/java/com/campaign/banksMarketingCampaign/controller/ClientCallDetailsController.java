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

    @GetMapping("/students/id")
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
                () -> new ResourceNotFoundException("Student not found..." + clientCallDetailsId));

        repository.delete(cld);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/clients/upd/{id}")
    public ResponseEntity<ClientCallDetails> updateClient(@PathVariable(value="id") Integer clientCallDetailsId, @RequestBody ClientCallDetails clientCallDetails){

        ClientCallDetails cld = repository.findById(clientCallDetailsId).orElseThrow(
                () -> new ResourceNotFoundException("Client not found!" + clientCallDetailsId));

        cld.setName(clientCallDetails.getName());
        final ClientCallDetails updatedStudent = repository.save(cld);

        return ResponseEntity.ok(updatedStudent);
    }



}
