import { Injectable } from '@angular/core';
import { dataType } from './interface';

@Injectable({
  providedIn: 'root'
})

export class UserDataServiceService {

  constructor() { }

  getDataFromService(){

    return{
      name: 'Sahil',
      age: 22,
      id: 77
    }

  }

  // User Interface
  
  getModelData(){

    const data : dataType = {
      name : 'Sahil',
      id : 100,
      indian : true,
      address : 'MP'
    }

    return data
  }
}
