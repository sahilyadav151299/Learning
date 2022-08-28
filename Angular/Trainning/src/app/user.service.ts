import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { Injectable } from "@angular/core";
import { User } from './userlist/User';

@Injectable({
  providedIn:'root'
})

export class UserService {

  // Injecting a service within a service
  constructor(private http : HttpClient) {}

  getUsers():Observable<any>{
   return this.http.get(`https://jsonplaceholder.typicode.com/users`);
  }

  getUser(id:any):Observable<any>{
    return this.http.get(`https://jsonplaceholder.typicode.com/users` + id);
   }

  getUsersAsPromise():Promise<any>{
    return this.http.get(`https://jsonplaceholder.typicode.com/users`).toPromise();
   }

  addUser(user : any):Observable<any>{
    return this.http.post(`https://jsonplaceholder.typicode.com/users`, user);
   }

}