import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {

  version = '0.01-alpha'
  title = 'Welcome to Angular Programming';
  author = 'Ashish S';

  constructor() { }

  ngOnInit(): void {
  }

}
