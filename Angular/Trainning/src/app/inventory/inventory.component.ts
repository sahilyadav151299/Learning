import { Component, OnInit } from '@angular/core';
import { Product } from '../product';
import { ProductsdataService } from 'src/app/productsdata.service';

@Component({
  selector: 'app-inventory',
  templateUrl: './inventory.component.html',
  styleUrls: ['./inventory.component.css'],
  
})
export class InventoryComponent implements OnInit {

  products:Array<Product>;

    constructor( productDataService : ProductsdataService ) {
      
      this.products = productDataService.getProductList()
   }

  ngOnInit(): void {
    
  }  

  setNewPrice(newPrice:any, pid:number){
    // Refractor and move it to Product Data Service
    for(var i=0; i<this.products.length; i++){

      if(pid === this.products[i].id)
        this.products[i].price = newPrice
    }
  }
}
