// import custom module
const calc = require('./03_custom_module')

// use public function
var total_sum = calc.sum(10, 30)
console.log('Total Sum ' + total_sum)

var total_diff = calc.diff(20, 5)
console.log('Difference ' + total_diff)

var divided = calc.div(9, 4)
console.log('Division ' + divided)

// use private function
// console.log(calc.product(1,1));
// calc.product is not a function


