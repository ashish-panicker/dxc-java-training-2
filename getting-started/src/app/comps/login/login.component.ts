import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css'],
})
export class LoginComponent implements OnInit {

  userName:string = 'some name';
  password:string = 'some password'

  constructor() {
    console.log('LoginComponent');
  }

  //  life cycle hook
  ngOnInit(): void {}

  //  method
  login() {
    console.log('login');
    console.log(
      `userName: ${this.userName}
      password: ${this.password}`
    );

  }


}
