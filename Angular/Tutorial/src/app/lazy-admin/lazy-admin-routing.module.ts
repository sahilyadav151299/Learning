import { LazyproductsComponent } from './lazyproducts/lazyproducts.component';
import { LazyloginComponent } from './lazylogin/lazylogin.component';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

const routes: Routes = [

  { path:'lazylogin', component: LazyloginComponent },
  { path: 'lazyproducts', component: LazyproductsComponent}

];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class LazyAdminRoutingModule { }
