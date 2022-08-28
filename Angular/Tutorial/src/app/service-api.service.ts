import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'

@Injectable({
  providedIn: 'root'
})
export class ServiceAPIService {

  constructor(private http: HttpClient) { }

  getDataFromAPI(){

    let URL = 'https://jsonplaceholder.typicode.com/todos'

    return this.http.get(URL)
  }
}
