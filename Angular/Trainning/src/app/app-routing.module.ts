
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { ProductslistComponent } from './productslist/productslist.component';
import { InventoryComponent } from './inventory/inventory.component';
import { PagenotfoundComponent } from './pagenotfound/pagenotfound.component';
import { UserlistComponent } from './userlist/userlist.component';
import { UserdetailsComponent } from './userdetails/userdetails.component';
import { RegistrationComponent } from './registration/registration.component';

const routes: Routes = [

  {path:'', redirectTo:'login', pathMatch:'full'},
  {path:'login', component:LoginComponent},
  {path:'products', component:ProductslistComponent},
  {path:'inventory', component:InventoryComponent},
  {path:'register', component:RegistrationComponent},
  {
    path:'users', 
    component: UserlistComponent,
    // to add child routes
    children:[{
      path:'userdetails/:id/:name',
      component:UserdetailsComponent
    }]
  },
  {path:'**', component:PagenotfoundComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)], // Primary routes
  exports: [RouterModule]
})
export class AppRoutingModule { }
