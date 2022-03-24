import { Component, OnInit } from '@angular/core';
import {User} from "../user";
import {ActivatedRoute, Router} from "@angular/router";
import {UserServiceService} from "../sercive/user-service.service";
import {FormBuilder, FormGroup} from "@angular/forms";

@Component({
  selector: 'app-user-form',
  templateUrl: './user-form.component.html',
  styleUrls: ['./user-form.component.scss']
})
export class UserFormComponent implements OnInit {

  user: User | undefined;
  form?: FormGroup;

  constructor(private route: ActivatedRoute,
              private router: Router,
              private userService: UserServiceService,
  private formBuilder: FormBuilder) {
    this.form = this.formBuilder.group({
      id: undefined,
      name: undefined,
      email: undefined,
    })
    this.user = new User();

    this.form.valueChanges.subscribe((changes) => {
      console.log(changes)
    })
  }

  onSubmit(){
    this.userService.save({...this.form?.getRawValue(), id: 2}).subscribe(result =>
    this.gotoUserList());
  }

  gotoUserList(){
    this.router.navigate(['/users']);
  }

  ngOnInit() {}
}
