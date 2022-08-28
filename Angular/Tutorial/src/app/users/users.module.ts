import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { MyLoginComponent } from './my-login/my-login.component';
import { MySignUpComponent } from './my-sign-up/my-sign-up.component';

@NgModule({
  declarations: [
    MyLoginComponent,
    MySignUpComponent
  ],

  imports: [
    CommonModule
  ],

  // export the component & import in app.module.ts file
  // and use it outside the module
  exports: [
    MyLoginComponent,
    MySignUpComponent
  ]
  
})

export class UsersModule { }