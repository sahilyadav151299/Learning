import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { validCode } from '../codevalidator';

@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  styleUrls: ['./registration.component.css']
})
export class RegistrationComponent implements OnInit {

  signupForm: FormGroup;

  // set initial value + default validators
  // email = new FormControl('', [Validators.required, Validators.email])
 
  constructor() { 

    // group the form values

    this.signupForm = new FormGroup({
      email : new FormControl('', [Validators.required, Validators.email]),
      password : new FormControl('', [Validators.required, Validators.minLength(6)]),
      code : new FormControl('', [Validators.required, validCode]),
      country : new FormControl('', [Validators.required])
    })

    this.signupForm.controls['country'].valueChanges.subscribe((res:any)=>{

      // Make an http call and fetch all conutries with this keyword
      alert(res)
    })
  }

  ngOnInit() {
   
  }
  
  get password(){
    return this.signupForm.get('password')
  }

  get code(){
    return this.signupForm.get('code')
  }
}

