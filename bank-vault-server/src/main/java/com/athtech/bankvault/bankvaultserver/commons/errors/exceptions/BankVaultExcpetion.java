package com.athtech.bankvault.bankvaultserver.commons.errors.exceptions;

public class BankVaultExcpetion extends RuntimeException {

    public BankVaultExcpetion() {
        super();
    }

    public BankVaultExcpetion(String message) {
        super(message);
    }

    public BankVaultExcpetion(String message, Throwable cause) {
        super(message, cause);
    }

    public BankVaultExcpetion(Throwable cause) {
        super(cause);
    }
}
