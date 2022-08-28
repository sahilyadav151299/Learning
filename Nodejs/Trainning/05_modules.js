// There are 3 types of modules

// 1) Custom or User-defined module

const calc = require('./03_custom_module')

// 2) npm or third-party module

const math = require('mathjs')

// 3) In-built or node module

const os = require('os')




// Where node seeks for npm module after installation
// Inside node_modules dir in PWD, If not found
// Inside node_modules dir in Parent Dir, If not found
// Looks recursively in the parent dir till it reached the Root, If not found
// Looks inside the node installtion dir 
