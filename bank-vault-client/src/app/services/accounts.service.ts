import { Injectable } from '@angular/core';
import { Observable, BehaviorSubject } from 'rxjs';
import { HttpClient, HttpHeaders, HttpErrorResponse } from '@angular/common/http';
import { map, catchError } from 'rxjs/operators';
import { BankAccount } from '../models/bankAccount';
import { BaseService } from './base.service';
import { BankAccountDetailsResponseModel } from '../models/bankAccountDetailsResponseModel';

@Injectable({
    providedIn: 'root'
})
export class AccountService extends BaseService {

    public accounts = new BehaviorSubject<[BankAccount]>(null);
    public cards = new BehaviorSubject<any>(null);

    httpOptions = {
        headers: new HttpHeaders({
            'X-IBM-Client-Id': '17fd536d-b247-4e0d-8207-5340f8ef538b',
            'Content-Type': 'application/json'
        })
    };

    constructor(protected http: HttpClient) {
        super(http);
    }

    getAccountsFromServer(): Observable<[BankAccount]> {

        const token = window.sessionStorage.getItem('peiraiosToken');
        const requestBody = { token };
        return this.http.post<[BankAccount]>(this.localEndpoint + 'accounts', requestBody, this.httpOptions)
            .pipe(
                catchError(this.handleError)
            );
    }

    getCardsFromServer(): Observable<any> {
        const token = window.sessionStorage.getItem('peiraiosToken');
        const requestBody = { token };

        return this.http.post<any>(this.localEndpoint + 'cards', requestBody, this.httpOptions).pipe(
            catchError(this.handleError)
        );
    }

    getAccountDetailsFromServer(accountId: string): Observable<BankAccountDetailsResponseModel> {
        const token = window.sessionStorage.getItem('peiraiosToken');
        const requestBody = { token };
        return this.http.post<BankAccountDetailsResponseModel>
        (this.localEndpoint + 'accounts' + `/${accountId}`, requestBody, this.httpOptions)
            .pipe(
                catchError(this.handleError)
            );
    }
}
