import { UserService } from './../user.service';
import { Component, OnInit } from '@angular/core';
import { User } from './User';

@Component({
  selector: 'app-userlist',
  templateUrl: './userlist.component.html',
  styleUrls: ['./userlist.component.css']
})

export class UserlistComponent implements OnInit {

  userList = new Array<User>();
     
    constructor(private  userService : UserService){            
    }

    ngOnInit() { 
      
      this.userService
        .getUsers()
        .subscribe((users:any) => {
          this.userList = users
        }, (error:any) => console.log('Error in fetching the data'))

        // this.userService
        // .getUsersAsPromise()
        // .then((users:any) => {
        //   this.userList = users
        // }, (error:any) => console.log('Error in fetching the data'))
    }

    addUser(){
      this.userService
      .addUser({name:'Amit', email:'amit@gmail.com'})
      .subscribe((res:any)=>{
        alert(res)
      })
    }
}
