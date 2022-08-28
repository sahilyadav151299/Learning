import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { LazyAdminRoutingModule } from './lazy-admin-routing.module';
import { LazyloginComponent } from './lazylogin/lazylogin.component';
import { LazyproductsComponent } from './lazyproducts/lazyproducts.component';

// Check lazy loading
console.log('Lazy Loading Module Called')

@NgModule({
  declarations: [
    LazyloginComponent,
    LazyproductsComponent
  ],
  imports: [
    CommonModule,
    LazyAdminRoutingModule
  ]
})
export class LazyAdminModule { }
