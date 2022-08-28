import { AuthService } from '../auth.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {

  username:string = ''

  constructor(private auth : AuthService) { }

  ngOnInit() {
      // subscribe to the observable
      this.auth.getUsername().subscribe((name : string)=> {
        this.username = name
      })
  }

}
