const http = require('http');

const routes = require('./07routes');

const server = http.createServer(routes.handler);

console.log(routes.someText);

server.listen(3000);