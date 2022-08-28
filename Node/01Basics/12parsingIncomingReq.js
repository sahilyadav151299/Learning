const express = require('express');
const bodyParser = require('body-parser');  // npm install --save body-pasrser

const app = express(); // express object

app.use(bodyParser.urlencoded({extended: false})); // middleware parse only form data

app.use('/app-product', (req, res, next) => { // req res order matters, next can be omitted if not used
    res.send('<form action="/product" method="POST"><input type="text" name="title"><button type="submit">Add Product</button></form>');
}); // Middleware

app.use('/product', (req, res, next) => {
    console.log(req.body);  // request doesn't try to pasre incoming request body, to do that register a parse 
    res.redirect('/');      // redirects to the home page as '/' is used here, use don't perfrom exact match
}); // Middleware, also executes for incoming GET request use app.post/app.get for specific methods

app.use('/', (req, res, next) => {
    res.send('<h1>Home Page</h1>');
}); // Middleware Should be last as '/' always responds 

app.listen(3000);