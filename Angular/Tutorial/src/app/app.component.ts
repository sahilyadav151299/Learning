import { Component, ViewContainerRef, ComponentFactoryResolver } from '@angular/core';
import { UserDataServiceService } from './user-data-service.service';
import { ServiceAPIService } from './service-api.service';
import { FormControl, FormGroup, Validators } from '@angular/forms';

// Interface for model
interface dataType{

  name : string,
  id : number,
  indian: boolean,
  address: any
}


// App component configuration inside app component ts file
@Component({
  // App component selector name use in index.html  
  selector: 'app-root',
  // App component html file
  templateUrl: './app.component.html',
  // App component css file
  styleUrls: ['./app.component.css']
})

export class AppComponent {

  // Service

  userDataArray = []

  constructor(private userData : UserDataServiceService, 
              private userAPI : ServiceAPIService, 
              private viewContainer : ViewContainerRef,
              private cfr : ComponentFactoryResolver ){


    console.log(this.userData.getDataFromService())

    this.userAPI.getDataFromAPI().subscribe( (data : any) => {

      this.userDataArray = data
      console.log(this.userDataArray)
      console.log('Data - ' + typeof(data))
      console.log('Array - ' + typeof(this.userDataArray))
    })
  }

  // Lazy loading component function
  async loadLazyComponent(){

    this.viewContainer.clear()
    
    const { LazyComponentComponent } = await import('./lazy-component/lazy-component.component');

    this.viewContainer.createComponent(this.cfr.resolveComponentFactory(LazyComponentComponent))
  }

  // Property
  title = 'Tutorial'
  name  = 'Sahil Yadav'

  // Function
  getName(){
    return this.name
  }

  // Object
  obj1 = {
    name : 'Sahil',
    age  :  22
  }

  // Array
  arr = ['S1', 'S2', 'S3', 'S4']

  // Property
  n1 = 100
  n2 = 40

  // Home url
  siteUrl = window.location.href

  // Function for button click event
  getAge(){
    alert(this.obj1.age)
  }

  // Function with parameter
  greet(username: string){
    alert('Hello ' + username)
  }

  // Function to work with events
  myEvent(event : any){
    console.warn(event)   
  }

  // Get value from textbox on value change
  setName1(event : any){
    this.name = event.target.value
    console.warn(this.name)
  }

  // Get value from textbox on button click
  setName2(val : string){
    console.warn(val)
    this.name = val
  }

  // Property Binding vs Interpolation
  disabledBox = true

  enableBox(){
    this.disabledBox = false
  }

  // Conditional statements
  show = true
  data = 'no'
  color = 'red'

  // Iterative statement
  brr = ['Berlin', 'Denver', 'Rio', 'Tokyo']

  arrObj = [
    { name: 'Sahil', age: 22},
    { name: 'Vishal' , age: 23},
    { name: 'Sonu', age: 21}
  ]

  // Form value getter
  getUserData(values : any){
    console.warn(values)
  }

  // Style Binding
  setColor = 'orange'
  err = false

  updateColor(){
    this.setColor = 'blue'
  }

  // Parent to child data sharing
  parentToChild = 'Information'

  parentToChildObj = {

    name: 'Sahil',
    age:  22
  }

  // Child to parent data passing
  childToParent(data : string){
    console.log(data)
  }

  // Pipe in angular
  pipeVar = 'sahil Yadav'
  dateVar = Date.now()
  charVar = 'Hey buddy !'
  currVar = 140

  // Model with interface validate data

  getModelData(){

    const data : dataType = {
      name : 'Sahil',
      id : 100,
      indian : true,
      address : 'MP'
    }

    return data
  }

  // Template driven form
  onSubmit(userFormData : string){
    console.log(userFormData)
  }

  // Reactive form
  // loginForm = new FormGroup({

  //   email : new FormControl('', Validators.required),
  //   password : new FormControl('')
  // })
}

