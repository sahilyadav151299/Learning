import { Component, OnInit, Input, EventEmitter, Output } from '@angular/core';

@Component({
  selector: 'app-priceupdater',
  templateUrl: './priceupdater.component.html',
  styleUrls: ['./priceupdater.component.css']
})
export class PriceupdaterComponent implements OnInit {

  // parent (inventory) to child data passing
  @Input()
  pricevalue:number = 0; 

  // child to parent data passing (inventory)
  // custom event 'update'
  @Output()
  update = new EventEmitter<Number>()

  constructor() {
  
  }

  ngOnInit() {
  
  }

  updatePrice(){
    // Emit custom event to the parent (inventory component)
    // with value with it
    this.update.emit(this.pricevalue)
  }
}
