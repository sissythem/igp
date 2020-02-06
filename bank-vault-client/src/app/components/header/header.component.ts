import { Component, OnInit, OnDestroy } from '@angular/core';
import { RestService } from 'src/app/services/rest.service';
import { Subscription } from 'rxjs';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit, OnDestroy {

  isLoggedIn = false;
  subscription: Subscription;

  constructor(private rest: RestService, private router: Router) { }

  ngOnInit() {
    this.subscription = this.rest.isLoggedIn.subscribe(
      res => {
        this.isLoggedIn = res;
      },
      err => {
        console.error(`An error occurred: ${err.message}`);
      }
    );

    if (window.sessionStorage.getItem('peiraiosToken') == null) {
      this.isLoggedIn = false;
    } else {
      this.isLoggedIn = true;
    }
  }

  ngOnDestroy(): void {
    this.subscription.unsubscribe();
  }

  clearLocalStorage() {
    window.sessionStorage.clear();
    this.rest.isLoggedIn.next(false);
    this.router.navigate(['/']);
  }
}
