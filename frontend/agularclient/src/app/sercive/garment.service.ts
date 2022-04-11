import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Garment} from "../class/garment";

@Injectable({
  providedIn: 'root'
})
export class GarmentService {

  private garmentUrl: string;

  constructor(private http: HttpClient) {
    this.garmentUrl = "http://localhost/8080/garments";
  }

  public findAll(): Observable<Garment[]>{
    return this.http.get<Garment[]>(this.garmentUrl);
  }
}
