let string = 'H E'; 

for(const ch of string){
    console.log(ch);
}

let arr = [
    { fname : 'sahil'},
    { fname : 'vishal'}
];

for(const obj of arr){
    console.log(obj.fname);
    console.log(JSON.stringify(obj));
}

// Iterates over values in array/string
// Returns object for each iteration