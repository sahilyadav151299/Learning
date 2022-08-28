import { Injectable } from '@angular/core';
import { Subject, Observable } from 'rxjs';

@Injectable({
  providedIn: 'root' 
}) 

export class AuthService {

  // used for continuous value changes
  subject = new Subject<string>()
  
  constructor() { }

  // called by login component
  setUsername(username:string){ 
    
    // add it to the subject - stream of values
    this.subject.next(username)
  }

  // called by header component
  // Observable : return type
  getUsername():Observable<string>{ 
    return this.subject.asObservable();
  }
}
