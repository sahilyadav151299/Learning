import { HttpClientModule } from '@angular/common/http';
import { MenuComponent } from './menu/menu.component';
import { BigBasketDataService } from './BigBasketData.service';
import { InventoryComponent } from './inventory/inventory.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { ProductslistComponent } from './productslist/productslist.component';
import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { ProductsdataService } from './productsdata.service';
import { PagenotfoundComponent } from './pagenotfound/pagenotfound.component';
import { PriceupdaterComponent } from './priceupdater/priceupdater.component';
import { HeaderComponent } from './header/header.component';
import { UserlistComponent } from './userlist/userlist.component';
import { UserdetailsComponent } from './userdetails/userdetails.component';
import { RegistrationComponent } from './registration/registration.component';

@NgModule({
  declarations: [		
    AppComponent,
      LoginComponent,
      ProductslistComponent,
      InventoryComponent,
      MenuComponent,
      PagenotfoundComponent,
      PriceupdaterComponent,
      HeaderComponent,
      UserlistComponent,
      UserdetailsComponent,
      RegistrationComponent
   ],

  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    ReactiveFormsModule
  ],

  // DI at module level
  // All components get a singleton service (same instance of a service)
  // providers: [ ProductsdataService ]
  providers: [ {provide: ProductsdataService, useClass: BigBasketDataService} ],

  bootstrap: [AppComponent]
})
export class AppModule { }
