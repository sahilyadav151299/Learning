// Declaration with Initialization

let id : number = 101
let book : string = 'TypeScript'
let isPublished : boolean = true
let description : any = 'This is an awesome book'

// Declaration then Initialization

let age : number
let person : string
let isAdult : boolean
let bio : any

person = 'Sahil Yadav'
age = 22
isAdult = true
bio = 'The way I am'

// Tuple types

let details : [number, string, number, boolean] = [101, 'Sahil', 23, true]

// Union types

let collection : string | number

collection = 'Sahil'
collection = 22

// Void types

let nothing : void = undefined

// error
// let noValue : void = 1 