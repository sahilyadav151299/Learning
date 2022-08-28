"use strict";
class Customer {
    // Constructor
    constructor(id, name, age) {
        // Properties
        this.default = 'The default is public';
        this.id = id;
        this.name = name;
        this.age = age;
    }
    // Methods
    getDetails() {
        console.log('ID : ' + this.id);
        console.log('Name : ' + this.name);
        console.log('Age : ' + this.age);
    }
    getAge() {
        return this.age;
    }
    greet(greet) {
        console.log(greet + ' ' + this.name);
    }
}
// Creat an object
let Cust = new Customer(101, 'Sahil', 22);
console.log(Cust);
// Access properties
console.log(Cust.default);
console.log(Cust.id);
// Access methods
Cust.greet('Hello');
Cust.getDetails();
console.log(Cust.getAge());
// Update property details
Cust.id = 102;
Cust.getDetails();
