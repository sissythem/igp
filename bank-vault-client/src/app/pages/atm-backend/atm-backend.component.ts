import { Component, OnInit } from '@angular/core';
import { RestService } from '../../services/rest.service';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-atm-backend',
  templateUrl: './atm-backend.component.html',
  styleUrls: ['./atm-backend.component.css']
})
export class AtmBackendComponent implements OnInit {

  constructor(public rest: RestService, private route: ActivatedRoute, private router: Router) { }

  atms:any = [];

  ngOnInit() {
    this.getAtms();
  }
  
  getAtms() {
    this.atms = [];
    this.rest.getAtmsFromServer().subscribe((data: {}) => {
      console.log(data);
      this.atms = data;
    });
  }

}

