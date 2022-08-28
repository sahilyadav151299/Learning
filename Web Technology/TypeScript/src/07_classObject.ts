class Customer{
    
    // Properties
    default: string = 'The default is public'

    public id: number
    private name: string
    protected age: number

    // Constructor
    constructor(id: number, name: string, age: number){

        this.id = id
        this.name = name
        this.age = age
    }

    // Methods
    getDetails(){
        console.log('ID : ' + this.id)
        console.log('Name : ' + this.name)
        console.log('Age : ' + this.age)
    }

    getAge() : number {
        return this.age
    }

    greet(greet: string){
        console.log(greet + ' ' + this.name)
    }
}


// Creat an object

let Cust = new Customer(101, 'Sahil', 22)

console.log(Cust)

// Access properties
console.log(Cust.default)
console.log(Cust.id)

// Access methods
Cust.greet('Hello')
Cust.getDetails()
console.log(Cust.getAge())

// Update property details
Cust.id = 102
Cust.getDetails()