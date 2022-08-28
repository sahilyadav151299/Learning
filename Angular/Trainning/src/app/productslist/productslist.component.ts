import { Product } from '../product';
import { Component, OnInit } from '@angular/core';
import { ProductsdataService } from 'src/app/productsdata.service';

@Component({
  selector: 'app-productslist',
  templateUrl: './productslist.component.html',
  styleUrls: ['./productslist.component.css'],
  // DI at Component level
  // This and its child component get a singleton service
  // providers:[{provide:ProductsdataService, useClass:ProductsdataService}]
  // providers: [ProductsdataService]
})

export class ProductslistComponent implements OnInit {

  // Custome array class variable declaration
  productList : Array<Product>
  isAdmin : boolean = true
  
  // Dependency Injection
  constructor( private productDataService : ProductsdataService) { 

    // initialization of array
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

    // get common data from service
    // let productDataService = new ProductsdataService();     // dependency

  }

  ngOnInit(): void {
    // imvoke services for frist rendering of data
    this.productList = this.productDataService.getProductList()
  }

  delete(pid:number){

    let newProductList = new Array<Product>()

    for(var i=0; i<this.productList.length; i++){

      if(pid !== this.productList[i].id)
        newProductList.push(this.productList[i])
    }

    this.productList = newProductList
  }

}
