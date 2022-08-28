"use strict";
// 1) Simple function
function demo() {
    console.log('This is a demo function');
}
demo();
// 2) Parameter and return type
function addNum(n1, n2) {
    return n1 + n2;
}
console.log(addNum(10, 23));
// 3) Anonymous function
let greeting = function () {
    console.log("Hello TypeScript!");
};
greeting();
// 4) Anonymous function with parameter and return type
let Sum = function (x, y) {
    return x + y;
};
console.log(Sum(2, 3));
// 5) Optional parameter
function Greet(greeting, name) {
    return greeting + ' ' + name + '!';
}
console.log(Greet('Hello'));
console.log(Greet('Hello', 'Sahil'));
// 6) Default parameter at last
function GreetMe1(name, greeting = "Hello") {
    return greeting + ' ' + name + '!';
}
console.log(GreetMe1('Sahil'));
console.log(GreetMe1('Sahil', 'Hi'));
// 7) Default parameter at first
function GreetMe2(greeting = "Hello", name) {
    return greeting + ' ' + name + '!';
}
console.log(GreetMe2(undefined, 'Sahil'));
console.log(GreetMe2('Hi', 'Sahil'));
// 8) Arrow functions
let Print = () => console.log('A simple arrow function!');
let Calc = (n1, n2) => {
    return n1 + n2;
};
Print();
console.log(Calc(12, 12));
// 9) Function overloading
function addVal(val1, val2) {
    return val1 + val2;
}
console.log(addVal(12, 24));
console.log(addVal('Sahil ', 'Yadav'));
// 10) Rest parameters
function GreetUS(greeting, ...names) {
    return greeting + " " + names.join(", ") + "!";
}
console.log(GreetUS('Hello'));
console.log(GreetUS('Hello', 'Sahil'));
console.log(GreetUS('Hello', 'Sahil', 'Vishal'));
console.log(GreetUS('Hello', 'Sahil', 'Vishal', 'Sonu'));
let GreetAgain = (greeting, ...names) => {
    return greeting + " " + names.join(", ") + "!";
};
console.log(GreetAgain('Hello'));
console.log(GreetAgain('Hello', 'Sahil'));
console.log(GreetAgain('Hello', 'Sahil', 'Vishal'));
console.log(GreetAgain('Hello', 'Sahil', 'Vishal', 'Sonu'));
