package com.athtech.bankvault.bankvaultserver.commons.controllers;

import com.athtech.bankvault.bankvaultserver.commons.errors.exceptions.BankVaultExcpetion;
import com.athtech.bankvault.bankvaultserver.commons.payloads.BankVaultAccountDetailsResponsePayload;
import com.athtech.bankvault.bankvaultserver.commons.payloads.BankVaultAccountPayload;
import com.athtech.bankvault.bankvaultserver.commons.payloads.TokenResponsePayload;
import com.athtech.bankvault.bankvaultserver.commons.services.CommonAccountService;
import com.athtech.bankvault.bankvaultserver.peiraios_bank.payloads.cards.CardsResponsePayload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;


@CrossOrigin("*")
@RestController
public class AccountController {

    private final CommonAccountService commonAccountService;

    @Autowired
    public AccountController(CommonAccountService commonAccountService) {
        this.commonAccountService = commonAccountService;
    }

    @PostMapping("/accounts")
    public List<BankVaultAccountPayload> retrieveAccounts(@RequestBody TokenResponsePayload tokenResponsePayload) throws BankVaultExcpetion {


        List<BankVaultAccountPayload> accountsPayload = commonAccountService.retrieveAllAccounts(tokenResponsePayload);

        return accountsPayload;

    }


    @PostMapping("/accounts/{accountId}")
    public BankVaultAccountDetailsResponsePayload retrieveAccountDetails(@RequestBody TokenResponsePayload tokenResponsePayload,
                                                                         @PathVariable String accountId) throws IOException {

        BankVaultAccountDetailsResponsePayload accountDetailsResponsePayload =
                commonAccountService.retrieveAccountDetails(tokenResponsePayload, accountId);

        return accountDetailsResponsePayload;

    }

    @PostMapping("/cards")
    public CardsResponsePayload retrieveCards(@RequestBody TokenResponsePayload tokenResponsePayload) throws IOException {

    return commonAccountService.retrieveAllCards(tokenResponsePayload);


    }
}
