import { Component, OnInit, OnDestroy, ElementRef, AfterContentInit, AfterViewInit } from '@angular/core';
import { RestService } from 'src/app/services/rest.service';
import { Subscription } from 'rxjs';
import { AccountService } from 'src/app/services/accounts.service';
import { BankAccount } from 'src/app/models/bankAccount';
import * as Chart from 'chart.js';
import { Router } from '@angular/router';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit, AfterViewInit {

  isLoggedIn = false;
  bankAccounts: [BankAccount];
  chart: Chart = null;
  total = 0;

  constructor(private elementRef: ElementRef, private rest: RestService, private accountRest: AccountService, private router: Router) { }

  ngOnInit() {

    this.rest.isLoggedIn.subscribe(
      res => {
        this.isLoggedIn = res;
      }
    );
    this.showViews();
  }

  ngAfterViewInit() {

    if (this.isLoggedIn === true) {
      if (this.accountRest.accounts.value == null) {
        this.accountRest.getAccountsFromServer().subscribe((data) => {
          this.accountRest.accounts.next(data);
          this.bankAccounts = data;
          if (data != null) {
            this.showChart();
          }
        });
      } else {
        this.bankAccounts = this.accountRest.accounts.value;
        this.showChart();
      }

    }

  }

  showViews() {

    console.log('Token found is: ' + window.sessionStorage.getItem('peiraiosToken'));
    if (window.sessionStorage.getItem('peiraiosToken') == null) {
      this.isLoggedIn = false;
    } else {
      this.isLoggedIn = true;
    }
  }

  showChart() {

    const ctx = this.elementRef.nativeElement.querySelector('#myChart');

    this.chart = new Chart(ctx, {
      type: 'doughnut',
      data: {
        labels: this.bankAccounts.map(account => account.assetAlias),
        datasets: [{
          backgroundColor: ['#f4bc42', '#0047b3'],
          data: this.bankAccounts.map(account => account.balance)
        }]
      },
      options: {
        events: ['mousemove', 'mouseout', 'click', 'touchstart', 'touchmove'],
        onClick: this.chartClickEvent.bind(this)
      }
    });

    const add = (a: number, b: number) => a + b;
    this.total = this.bankAccounts.map(account => account.balance).reduce(add);
  }



  chartClickEvent(event, array) {
    const activePoints = this.chart.getElementsAtEvent(event);

    if (activePoints.length > 0) {

      const clickedElementindex = activePoints[0]['_index'];

      const accountID = this.accountRest.accounts.value[clickedElementindex].accountId;

      this.router.navigate(['accounts', accountID]);
    }
  }
}
