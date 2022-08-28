import { Component, OnInit } from '@angular/core';
import { AuthService } from '../auth.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  username : string = 'Username'
  password : string = 'Password'

  constructor( private auth : AuthService,
               private router: Router ) { }
               

  ngOnInit() {
  }



  login(){
    this.auth.setUsername(this.username)

    // authenticate and redirected to the landing page
    this.router.navigateByUrl('/products')
  }

}
