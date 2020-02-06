package com.athtech.bankvault.bankvaultserver.peiraios_bank.controllers;

import com.athtech.bankvault.bankvaultserver.commons.payloads.BankVaultAccountPayload;
import com.athtech.bankvault.bankvaultserver.commons.payloads.TokenResponsePayload;
import com.athtech.bankvault.bankvaultserver.commons.services.PeiraiosAccountToBankVaultAccountMapperService;
import com.athtech.bankvault.bankvaultserver.peiraios_bank.payloads.accounts.AccountDetailsResponsePayload;
import com.athtech.bankvault.bankvaultserver.peiraios_bank.payloads.accounts.AccountsPayload;
import com.athtech.bankvault.bankvaultserver.peiraios_bank.payloads.accounts.IbanInfoPayload;
import com.athtech.bankvault.bankvaultserver.peiraios_bank.payloads.transactions.AccountTransactions;
import com.athtech.bankvault.bankvaultserver.peiraios_bank.services.PeiraiosCommunicationService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@CrossOrigin("*")
@RestController
public class PeiraiosController {

    private final PeiraiosCommunicationService peiraiosCommunicationService;
    private final PeiraiosAccountToBankVaultAccountMapperService peiraiosAccountToBankVaultAccountMapperService;

    @Autowired
    public PeiraiosController(PeiraiosCommunicationService peiraiosCommunicationService, PeiraiosAccountToBankVaultAccountMapperService peiraiosAccountToBankVaultAccountMapperService) {
        this.peiraiosCommunicationService = peiraiosCommunicationService;
        this.peiraiosAccountToBankVaultAccountMapperService = peiraiosAccountToBankVaultAccountMapperService;
    }

    @PostMapping("/accounts_peiraios")
    public List<BankVaultAccountPayload> retrieveAccounts(@RequestBody TokenResponsePayload tokenResponsePayload) throws IOException {

        List<BankVaultAccountPayload> bankVaultAccounts = new ArrayList<>();
        AccountsPayload accountsPayload = peiraiosCommunicationService.retrieveAccounts(tokenResponsePayload.getToken());

        if (accountsPayload != null) {
            bankVaultAccounts.addAll(peiraiosAccountToBankVaultAccountMapperService.transformAccount(accountsPayload));
        }

        return bankVaultAccounts;
    }


    @GetMapping("accounts_peiraios/{accountId}")
    public AccountDetailsResponsePayload retrieveAccountDetails(@RequestBody TokenResponsePayload tokenResponsePayload,
                                                                @PathVariable String accountId) {


        return peiraiosCommunicationService.retrieveAccountDetails(tokenResponsePayload.getToken(), accountId);
    }


    @GetMapping("iban_peiraios/{iban}")
    public IbanInfoPayload retrieveIbanInfo(@RequestBody TokenResponsePayload tokenResponsePayload,
                                            @PathVariable String iban) {


        return peiraiosCommunicationService.retrieveIbanInfo(tokenResponsePayload.getToken(), iban);
    }


    @GetMapping("accounts_peiraios/{accountId}/transactions")
    public ResponseEntity<AccountTransactions> retrieveTransactions
            (@RequestBody TokenResponsePayload tokenResponsePayload,
             @PathVariable String accountId) throws JsonProcessingException {
        return peiraiosCommunicationService.getAccountTransactions(accountId, tokenResponsePayload.getToken());
    }
}
