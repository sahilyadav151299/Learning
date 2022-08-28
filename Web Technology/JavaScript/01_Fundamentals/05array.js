let nums = [];                             // 1st way

nums[0] = 10;
nums[1] = 20;
nums[2] = 30;

let chars = ['a', 'b', 'c'];              // 2nd Way

let names = Array.of('Sahil', 'Sahil');   // 3rd Way

console.log(nums);
console.log(chars);
console.log(names);
console.log(names[0]);

// Array Operations 

let values = [1,2,3,4,5,6,7,8,9,10];

console.log(Array.isArray(values));       // Returns true if true
console.log(values.pop());                // Pop last value
console.log(values.length);               // Returns length
console.log(values.push(10));             // Adds value at last
console.log(values.shift());              // Pop first value & shift array left
console.log(values.unshift(0,1));         // Adds valus from start & shift right
console.log(values);                      // Return array itself    
console.log(values.indexOf(10));          // Gives index of value 

let arr = values.slice(1,11);             // Slice arry using idx, last idx excluded
console.log(arr);

arr.splice(0,5);                          // (start idx, delete count)
console.log(arr);

arr.splice(1, 4, 100);                    // (insert idx, delete count from insert idx, val)
console.log(arr);

let ages = [12,15,18,21,20];

let adult = ages.filter( function (val) {   // Returns array of filterd values
    return val >= 18;
});                                         // ages.found() or ages.forEach() 

console.log(adult);
