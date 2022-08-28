import { UserService } from './../user.service';
import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-userdetails',
  templateUrl: './userdetails.component.html',
  styleUrls: ['./userdetails.component.css']
})

export class UserdetailsComponent implements OnInit {

  // will be passed as route parameters
  userid: number = 0;
  username :string = ''
  user:any

  constructor(private activatedRoute : ActivatedRoute,
              private userService : UserService) {

    // Read the route parameters at front end
    this.activatedRoute.params.subscribe((params:any)=>{
       
      this.userid = parseInt(params['id'])
      this.username = params['name']
      // Make another http call to get more details with the id
  
    })

    // this.activatedRoute.paramMap
    //   .pipe(flatMap((routeparams:any) => this.userService.getUser(parseInt(routeparams.get['id']))))
    //   .subscribe((user:any)=> this.user = user)
  }

  ngOnInit() {
    
  }
  
}
