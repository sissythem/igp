package com.athtech.bankvault.bankvaultserver.eurobank.controllers;


import com.athtech.bankvault.bankvaultserver.commons.payloads.TokenResponsePayload;
import com.athtech.bankvault.bankvaultserver.eurobank.payloads.accounts.AccountsResponsePayload;
import com.athtech.bankvault.bankvaultserver.eurobank.services.EurobankCommunicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@CrossOrigin("*")
@RestController
public class EurobankAccountController {

    private final EurobankCommunicationService eurobankCommunicationService;

    @Autowired
    public EurobankAccountController(EurobankCommunicationService eurobankCommunicationService) {
        this.eurobankCommunicationService = eurobankCommunicationService;
    }

    @PostMapping("/accounts_eurobank")
    public AccountsResponsePayload retrieveAccounts(@RequestBody TokenResponsePayload tokenResponsePayload) throws IOException {

        return eurobankCommunicationService.retrieveAccountsFromEurobank(tokenResponsePayload);

    }

}
