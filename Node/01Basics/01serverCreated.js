const http = require('http');  
// Module Imported 

const server = http.createServer((req, res) => {    // Server Created & Returned Back
    console.log(req);                               // Arrow Function (Event Listener) with req/res objects
    //process.exit();                               // Ends Loop (Stops Server)
});

server.listen(3000);    // Server Cont. Receives Request

/* 
function rqServer(req, res){    // Normal Funaction 
    console.log(req);
}

const server = http.createServer(function(req, res){ // Anonymous Function
    console.log(req);                                   
});

*/