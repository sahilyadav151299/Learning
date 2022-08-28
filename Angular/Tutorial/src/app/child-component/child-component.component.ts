import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-child-component',
  templateUrl: './child-component.component.html',
  styleUrls: ['./child-component.component.css']
})
export class ChildComponentComponent implements OnInit {

  // get from Parent
  @Input() 
  info : any

  // sent to Parent
  @Output()
  childToParent : EventEmitter<any> = new EventEmitter()

  constructor() { }

  ngOnInit(): void {

    console.log(this.info)

    // sent to Parent
    this.childToParent.emit('Hello There')
  }

  // sent to Parent
  sendData(){
    this.childToParent.emit('Hello There')
  }

}
