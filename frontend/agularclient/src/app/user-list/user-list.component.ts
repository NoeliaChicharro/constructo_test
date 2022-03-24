import { Component, OnInit } from '@angular/core';
import {User} from "../user";
import {UserServiceService} from "../sercive/user-service.service";

@Component({
  selector: 'app-user-list',
  templateUrl: './user-list.component.html',
  styleUrls: ['./user-list.component.scss']
})
export class UserListComponent implements OnInit {

  users: User[] | undefined;

  constructor(private userService: UserServiceService) { }

  ngOnInit(): void {
    this.userService.findAll().subscribe(data => {
      this.users = data;
    })
  }

}
