import { Component, OnInit } from '@angular/core';

@Component({
  // user-list selector name use in app.component.html
  selector: 'app-user-list',
  // user-list component html file
  templateUrl: './user-list.component.html',
  // user-list component css file
  styleUrls: ['./user-list.component.css']
})

export class UserListComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

}
