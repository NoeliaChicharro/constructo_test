import {Component, OnInit, ViewChild} from '@angular/core';
import {ColDef} from "ag-grid-community";
import {Observable} from "rxjs";
import {HttpClient} from "@angular/common/http";
import {AgGridAngular} from "ag-grid-angular";
import {Garment} from "../class/garment";
import {GarmentService} from "../sercive/garment.service";
import {UserServiceService} from "../sercive/user-service.service";
import {User} from "../class/user";

@Component({
  selector: 'app-ewp',
  templateUrl: './ewp.component.html',
  styleUrls: ['./ewp.component.scss']
})
export class EwpComponent implements OnInit {
  @ViewChild('agGrid') agGrid!: AgGridAngular;

  garments?: Garment[];
  title = "Blusen";

  constructor(private garmentService: GarmentService) { }

  ngOnInit(): void {
    this.garmentService.findAll().subscribe(data => {
      this.garments = data;
    })
  }
}
