let amount = 123456789;
console.log(amount);
console.log(typeof amount);

amount = amount.toString();            // Number To String
console.log(amount);
console.log(typeof amount);

amount = Number.parseInt(amount);      // String To Number
console.log(amount);
console.log(typeof amount);

amount = Number.parseFloat("1.02 A");  // Starting Matters
console.log(amount);
console.log(typeof amount);

amount = +"12345"                      // String To Number
console.log(amount);
console.log(typeof amount);

