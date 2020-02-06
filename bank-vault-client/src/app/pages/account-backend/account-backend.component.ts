import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { BankAccount } from 'src/app/models/bankAccount';
import { AccountService } from 'src/app/services/accounts.service';
import { observable, Observable, Subscription } from 'rxjs';

@Component({
  selector: 'app-account-backend',
  templateUrl: './account-backend.component.html',
  styleUrls: ['./account-backend.component.css']
})

export class AccountBackendComponent implements OnInit {

  constructor(public rest: AccountService, private route: ActivatedRoute, private router: Router) { }

  bankAccounts: [BankAccount];

  ngOnInit() {
    this.rest.accounts.subscribe((data) => {
      this.bankAccounts = data;
    });

    if (this.rest.accounts.value == null) {
      this.rest.getAccountsFromServer().subscribe((data) => {
        this.rest.accounts.next(data);
        this.bankAccounts = data;
        if (data != null) {
        }
      });
    } else {
      this.bankAccounts = this.rest.accounts.value;
    }
  }
}
