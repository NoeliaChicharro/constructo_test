import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { UserListComponent } from './user-list/user-list.component';
import { UserFormComponent } from './user-form/user-form.component';
import {UserServiceService} from "./sercive/user-service.service";
import {HttpClientModule} from "@angular/common/http";
import {FormsModule, ReactiveFormsModule} from "@angular/forms";
import { EwpComponent } from './ewp/ewp.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import {MatButtonModule} from "@angular/material/button";
import {AgGridModule} from "ag-grid-angular";
import {MatToolbarModule} from "@angular/material/toolbar";
import { NavComponent } from './nav/nav.component';
import {MatIconModule} from "@angular/material/icon";
import {MatSidenavModule} from "@angular/material/sidenav";

@NgModule({
  declarations: [
    AppComponent,
    UserListComponent,
    UserFormComponent,
    EwpComponent,
    NavComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule,
    BrowserAnimationsModule,
    MatButtonModule,
    AgGridModule.withComponents([]),
    MatToolbarModule,
    MatIconModule,
    MatSidenavModule

  ],
  providers: [UserServiceService],
  bootstrap: [AppComponent]
})
export class AppModule { }
