import { MySignUpComponent } from './users/my-sign-up/my-sign-up.component';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';
import { SignupComponent } from './signup/signup.component';
import { LoginComponent } from './login/login.component';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { MyLoginComponent } from './users/my-login/my-login.component';

const routes: Routes = [

  { path: '', redirectTo:'', pathMatch: 'full'},
  { path: 'login', component: LoginComponent },
  { path: 'signup', component: SignupComponent},
  { path: 'mylogin', component: MyLoginComponent },
  { path: 'mysignup', component: MySignUpComponent},
  // { path: '**', component: PageNotFoundComponent}

  // Lazy loading stuff for module
  { path: 'lazyadmin', loadChildren: () => import('./lazy-admin/lazy-admin.module').then(module => module.LazyAdminModule) }
];



@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})

export class AppRoutingModule { }
