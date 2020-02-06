package com.athtech.bankvault.bankvaultserver.commons.controllers;


import com.athtech.bankvault.bankvaultserver.commons.payloads.Bank;
import com.athtech.bankvault.bankvaultserver.commons.payloads.TokenRequestPayload;
import com.athtech.bankvault.bankvaultserver.commons.payloads.TokenResponsePayload;
import com.athtech.bankvault.bankvaultserver.eurobank.services.EurobankCommunicationService;
import com.athtech.bankvault.bankvaultserver.peiraios_bank.services.PeiraiosCommunicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
public class TokenController {

    private final PeiraiosCommunicationService peiraiosCommunicationService;
    private final EurobankCommunicationService eurobankCommunicationService;

    @Autowired
    public TokenController(PeiraiosCommunicationService peiraiosCommunicationService,
                           EurobankCommunicationService eurobankCommunicationService) {
        this.peiraiosCommunicationService = peiraiosCommunicationService;
        this.eurobankCommunicationService = eurobankCommunicationService;
    }

    @PostMapping("/token")
    public TokenResponsePayload retrieveToken(@RequestBody TokenRequestPayload tokenRequestPayload) throws Exception{


        String code = tokenRequestPayload.getCode();

        if (Bank.PEIRAIOS.name().equals(tokenRequestPayload.getBank().name())){

            return peiraiosCommunicationService.retrieveToken(code);
        }

        else if (Bank.EUROBANK.name().equals(tokenRequestPayload.getBank().name())){

            return eurobankCommunicationService.retrieveTokenFromEurobank(code);
        }
        throw new Exception("Implemented Banks are Peiraios and Eurobank");
    }
}
