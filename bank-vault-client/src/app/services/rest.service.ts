import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders, HttpErrorResponse } from '@angular/common/http';
import { Observable, of, throwError, BehaviorSubject } from 'rxjs';
import { catchError, map, tap } from 'rxjs/operators';
import { TokenResponseModel } from '../models/tokenResponseModel';
import { BaseService } from './base.service';

@Injectable({
  providedIn: 'root'
})
export class RestService extends BaseService {

  public isLoggedIn = new BehaviorSubject<boolean>(false);

  endpoint = 'https://api.rapidlink.piraeusbank.gr/piraeusbank/production/v1.1/info/pointsOfPresence/';

  httpOptions = {
    headers: new HttpHeaders({
      'Content-Type': 'application/json'
    })
  };

  getAtms(): Observable<any> {
    return this.http.get(this.endpoint + 'Atm', this.httpOptions).pipe(
      map(this.extractData));
  }

  getAtmsFromServer(): Observable<any> {
    return this.http.get(this.localEndpoint + 'atm').pipe(
      map(this.extractData)
    );
  }

  postCode(code: string, bank: string): Observable<TokenResponseModel> {
    const requestBody = { bank, code };
    return this.http.post<TokenResponseModel>(this.localEndpoint + 'token', requestBody, this.httpOptions)
      .pipe(
        catchError(this.handleError)
      );
  }

  private extractData(res: Response) {
    const body = res;
    return body || {};
  }
}

