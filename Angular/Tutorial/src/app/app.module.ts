import { AdminModule } from './admin/admin.module';
import { UsersModule } from './users/users.module';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http'

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { UserListComponent } from './user-list/user-list.component';
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';
import { ChildComponentComponent } from './child-component/child-component.component';
import { LoginComponent } from './login/login.component';
import { SignupComponent } from './signup/signup.component';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';
import { CustomDirectiveDirective } from './custom-directive.directive';
import { LazyComponentComponent } from './lazy-component/lazy-component.component';



@NgModule({

  // Holds list of custom components, pipes and directives
  declarations: [
    AppComponent,
    UserListComponent,
    HeaderComponent,
    FooterComponent,
    ChildComponentComponent,
    LoginComponent,
    SignupComponent,
    PageNotFoundComponent,
    CustomDirectiveDirective,
    LazyComponentComponent
  ],

  // Holds list of modules required by the application
  imports: [
    BrowserModule,
    AppRoutingModule,
    UsersModule,
    FormsModule,
    HttpClientModule,
    AdminModule,
    ReactiveFormsModule
  ],

  // Holds list of services injected in the root component
  providers: [],

  // Holds name of root component(s)
  bootstrap: [AppComponent]
})

export class AppModule { }
