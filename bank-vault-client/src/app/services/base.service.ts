import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders, HttpErrorResponse } from '@angular/common/http';
import { throwError } from 'rxjs';

@Injectable({
    providedIn: 'root'
})
export class BaseService {

    localEndpoint = 'http://localhost:8080/api/v1/';

    httpOptions = {
        headers: new HttpHeaders({
            'X-IBM-Client-Id': '17fd536d-b247-4e0d-8207-5340f8ef538b',
            'Content-Type': 'application/json'
        })
    };

    constructor(protected http: HttpClient) { }

    protected handleError(error: HttpErrorResponse) {
        if (error.error instanceof ErrorEvent) {
            // A client-side or network error occurred. Handle it accordingly.
            console.error('An error occurred:', error.error.message);
        } else {
            // The backend returned an unsuccessful response code.
            // The response body may contain clues as to what went wrong,
            console.error(
                `Backend returned code ${error.status}, ` +
                `body was: ${error.error}`);
        }
        // return an observable with a user-facing error message
        return throwError(
            'Something bad happened; please try again later.');
    }
}
