import { Component, OnInit } from '@angular/core';
import { RestService } from '../../services/rest.service';
import { ActivatedRoute, Router } from '@angular/router';
import { HttpClient, HttpHeaders, HttpErrorResponse } from '@angular/common/http';

@Component({
  selector: 'app-account',
  templateUrl: './account.component.html',
  styleUrls: ['./account.component.css']
})
export class AccountComponent implements OnInit {

  constructor(public rest: RestService, private route: ActivatedRoute, private router: Router) { }

  accountsFromServer: any= []

  account = {
        "Type": "IA",
        "TypeDescription": "ΤΑΜΙΕΥΤΗΡΙΟ -Κ-",
        "Number": "7022123123123",
        "Iban": "GR2801718220007022123123123",
        "Currency": "EUR",
        "Balance": 13000983700.08,
        "AccountingBalance": 14996854573.28,
        "OverdraftAmount": 0,
        "HolderName": "",
        "ArrangementId": "334083",
        "AccountId": "cwBsAHgAMABjAHoAMgByAMAioSa639FXqvNWTdbvtyo%3d",
        "Alias": "ΤΑΜΙΕΥΤΗΡΙΟ",
        "CanDebit": true,
        "CanViewStatement": true,
        "Status": "001"
      }
  
    account2 = {
        "Type": "IA",
        "TypeDescription": "ΤΑΜΙΕΥΤΗΡΙΟ -Κ-",
        "Number": "7022123123123",
        "Iban": "GR2801718220007022123123124",
        "Currency": "EUR",
        "Balance": 13000983700.08,
        "AccountingBalance": 14996854573.28,
        "OverdraftAmount": 0,
        "HolderName": "",
        "ArrangementId": "334083",
        "AccountId": "cwBsAHgAMABjAHoAMgByAMAioSa639FXqvNWTdbvtyo%3d",
        "Alias": "ΤΑΜΙΕΥΤΗΡΙΟ",
        "CanDebit": true,
        "CanViewStatement": true,
        "Status": "001"
      }

  accountSamples = [this.account, this.account2]


  ngOnInit() {
    this.getAccounts();
  }


  getAccounts() {
    this.accountSamples;
    console.log(this.accountSamples)
    };
  


}

