package com.athtech.bankvault.bankvaultserver.peiraios_bank.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InformationController {


    @GetMapping("/atms")
    public String retrieveAtms() {

        return "atm";
    }

    @GetMapping("/banks")
    public String retrieve(){

        return "bank";
    }
}
