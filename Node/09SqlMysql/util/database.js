const mysql = require('mysql2');
// Import mysql2

const pool = mysql.createPool({

    host: 'localhost',
    user: 'root',
    database: 'nodedb',
    password: 'Sahil@root@786'
});
// Manages multiple conn simultaneously so that we don't have to make
// a new conn/close that one everytime as each query need it's own conn 
// once the query is done, the connection will be handed back into the pool
// & it's available again for a new query & pool finished when app shuts down

module.exports = pool.promise();

// Promises handle asynchronous tasks, asynchronous data instead of callbacks 
// because promises allow us to write code in a bit more structured way, we
// can use promise chains instead of having nested anonymous function