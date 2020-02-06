import { Component, OnInit } from '@angular/core';
import {AccountService} from "../../services/accounts.service";

@Component({
  selector: 'app-card-backend',
  templateUrl: './card-backend.component.html',
  styleUrls: ['./card-backend.component.css']
})
export class CardBackendComponent implements OnInit {

  constructor(public rest: AccountService) { }

  response: any;
  ngOnInit() {
    this.rest.cards.subscribe( (data) => {
      this.response = data;
    })
  }

}
