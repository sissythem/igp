import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router, ParamMap } from '@angular/router';
import { AccountService } from 'src/app/services/accounts.service';
import {BankAccountDetailsResponseModel} from '../../models/bankAccountDetailsResponseModel';

@Component({
  selector: 'app-account-details',
  templateUrl: './account-details.component.html',
  styleUrls: ['./account-details.component.css']
})
export class AccountDetailsComponent implements OnInit {

  constructor(private rest: AccountService, private route: ActivatedRoute, private router: Router) { }

  accountDetailsView: BankAccountDetailsResponseModel;

  ngOnInit() {

    this.getDetails();
  }
    getDetails() {
      const accountId = this.route.snapshot.paramMap.get('id');

      this.rest.getAccountDetailsFromServer(accountId).subscribe((data) => {
        this.accountDetailsView = data;
      });
    }


}
