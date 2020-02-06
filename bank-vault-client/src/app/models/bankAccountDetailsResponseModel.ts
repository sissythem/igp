export class  BankAccountDetailsResponseModel {

    accountDetailsPayload: BankAccountDetails;
    accountDetailsTransactionsPayload: BankAccountTransactions[];
}

export class BankAccountTransactions {

    transactionId: string;
    transactionReference: string;
    description: string;
    amount: number;
    postDate: string;
    valueDate: string;

}

export class BankAccountDetails {

    balance: number;
    accountingBalance: number;
    description: string;
    status: string;
    debit: boolean;
}
