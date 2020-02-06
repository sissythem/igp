import { Component, OnInit } from '@angular/core';
import { RestService } from '../../services/rest.service';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-atm',
  templateUrl: './atm.component.html',
  styleUrls: ['./atm.component.css']
})

export class AtmComponent implements OnInit {

  atms: any = [];


  constructor(public rest: RestService, private route: ActivatedRoute, private router: Router) { }

  ngOnInit() {
    this.getAtms();
  }

  getAtms() {
    this.atms = [];
    this.rest.getAtms().subscribe((data: {}) => {
      console.log(data);
      this.atms = data;
    });
  }
}
