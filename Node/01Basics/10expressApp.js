const express = require('express'); // npm install --save express

const app = express();

app.use((req, res, next) => {            // Handle Request In Top-Bottom    
    console.log('In the middleware');
    next();                              // Allows next middleware to run
});

app.use((req, res, next) => {
    console.log('In the another middleware');
    res.send('<h1>Hello From ExpressJS</h1>');   // Automatically adds header, content-type
});

app.listen(3000);     // Internally Creates Server Using http