const express = require('express');

const bodyParser = require('body-parser');

const feedRoutes = require('./routes/feed');

const app = express();

// this way is good for data(form data) encoded in x-www-form-urlencoded
//app.use(bodyParser.urlencoded());

// json() able to parse the JSON data instead form data
// good for application/json
app.use(bodyParser.json());

//resolve CORS erro
app.use((req, res, next) => {
    
    //res.setHeader('Access-Control-Allow-Origin', 'codepen.io');
    res.setHeader('Access-Control-Allow-Origin', '*');
    res.setHeader('Access-Control-Allow-Methods', 'GET, POST, PUT, PATCH, DELETE');
    res.setHeader('Access-Control-Allow-Headers', 'Content-Type', 'Authorization');
    next();
});

app.use('/feed', feedRoutes);

app.listen(8080);