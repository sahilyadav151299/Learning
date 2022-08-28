import { Injectable } from '@angular/core';
import { ProductsdataService } from './productsdata.service';
import { Product } from './product';

@Injectable({
  providedIn: 'root'
})
export class BigBasketDataService extends ProductsdataService {

  // productList:Array<Product>

  constructor() { 

        super()

        // this.productList = new Array<Product>()
        
        let p1 = new Product(1, 'Angular CookBook', 'Technical', 240, 'assets/images/angular.jpg');
        let p2 = new Product(2, 'Angular CookBook', 'Technical', 240, 'assets/images/angular.jpg');
        let p3 = new Product(3, 'Angular CookBook', 'Technical', 240, 'assets/images/angular.jpg');
        let p4 = new Product(4, 'Angular CookBook', 'Technical', 240, 'assets/images/angular.jpg');
        let p5 = new Product(5, 'Angular CookBook', 'Technical', 240, 'assets/images/angular.jpg');

        this.productList.push(p1)
        this.productList.push(p2)
        this.productList.push(p3)
        this.productList.push(p4)
        this.productList.push(p5)
  }
}
