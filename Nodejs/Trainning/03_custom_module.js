// Every JS file is a module

// public fucntion : if exported
// private function : if not exported

function sum(n1, n2){
    return n1 + n2;
}

function product(n1, n2){
    return n1 * n2;
}

function diff(n1, n2){
    return n1 - n2;
}

function div(n1, n2){
    return n1 % n2;
}

// Way 1 of Exporting functions

module.exports.sum = sum;

// Way 2 of Exporting functions 

module.exports = {sum, diff, div}

// Use any one of them