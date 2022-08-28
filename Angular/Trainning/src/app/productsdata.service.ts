import { Injectable } from '@angular/core';
import { Product } from './product'

@Injectable({
  providedIn: 'root'  // By default provided in the app.module as DI
})

export class ProductsdataService {

  // Custome array class variable declaration
  productList : Array<Product>

  constructor() { 

    // Shared instance of service by default app.module as DI
    // prints only once as only one instance created
    console.log('Products data service')

    // generic data service
    this.productList = new Array<Product>()

      // create objects of product array
      // let p1 = new Product(1, 'Angular CookBook', 'Technical', 240, 'assets/images/angular.jpg');
      // let p2 = new Product(2, 'Angular CookBook', 'Technical', 240, 'assets/images/angular.jpg');
      // let p3 = new Product(3, 'Angular CookBook', 'Technical', 240, 'assets/images/angular.jpg');
      // let p4 = new Product(4, 'Angular CookBook', 'Technical', 240, 'assets/images/angular.jpg');
      // let p5 = new Product(5, 'Angular CookBook', 'Technical', 240, 'assets/images/angular.jpg');

      // this.productList.push(p1)
      // this.productList.push(p2)
      // this.productList.push(p3)
      // this.productList.push(p4)
      // this.productList.push(p5)
  }

  getProductList(){

    return this.productList
  }

}
