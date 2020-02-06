import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { RestService } from 'src/app/services/rest.service';
import { TokenResponseModel } from 'src/app/models/tokenResponseModel';
import {Router} from '@angular/router';

@Component({
  selector: 'app-auth',
  templateUrl: './auth.component.html',
  styleUrls: ['./auth.component.css']
})
export class AuthComponent implements OnInit {
  code: string;

  constructor(private rest: RestService, private route: ActivatedRoute, private router: Router) {

    this.route.queryParams.subscribe(params => {
      this.code = params.code;
    });
  }

  ngOnInit() {
    this.rest.postCode(this.code, Bank.Peiraios)
      .subscribe(
        (token: TokenResponseModel) => {
          console.log('The token is: ' + token.token);
          window.sessionStorage.setItem('peiraiosToken', token.token);
          this.rest.isLoggedIn.next(true);
          this.router.navigate(['/']);
        }
        ,
        error => console.log(error)
      );
  }
}

enum Bank {
  Peiraios = 'PEIRAIOS',
  Eurobank = 'EUROBANK'
}
