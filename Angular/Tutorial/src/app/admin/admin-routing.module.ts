import { PageNotFoundComponent } from './../page-not-found/page-not-found.component';
import { AdminProductsComponent } from './admin-products/admin-products.component';
import { AdminLoginComponent } from './admin-login/admin-login.component';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';


const routes: Routes = [

  { path: 'admin', children: [
    { path: 'adminlogin', component: AdminLoginComponent },
    { path: 'adminproducts', component: AdminProductsComponent}
  ] },
  
  { path: '**', component: PageNotFoundComponent }

];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})

export class AdminRoutingModule { }
