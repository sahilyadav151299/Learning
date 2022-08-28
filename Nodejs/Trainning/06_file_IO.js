// IO Operations could be
//          - File IO
//          - DB IO
//          - Network IO


// import node module
const fs = require('fs')

console.log('Program Started')  // 1

// asynchronous operation : 3
fs.readFile('MyData.txt', 'utf-8', function(err, filedata){

    // callback executes after readfile finishes it's execution

    if(err)
        console.log('Error in reading file ' + err.message)
    else{

        console.log('File reading is done')
        console.log(filedata)
    }    
})

console.log('Program Ended')    // 2