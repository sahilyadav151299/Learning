const path = require('path');
 
const express = require('express');

const bodyParser = require('body-parser');

const app = express();

const adminRoutes = require('./routes/admin');      // Order of import doesn't matters
const shopRoutes = require('./routes/shop');        

app.use(bodyParser.urlencoded({extended: false}));
app.use(express.static(path.join(__dirname, 'public'))); // helps in serving css files statically

app.use('/admin', adminRoutes);      // As same starting path we can add here
app.use(shopRoutes);                 // Order doesn't matter here as we are doing exact match. Get, Post does exact match

app.use((req, res, next) => {

    // This handles all http method, If match not found this will executes

    res.status(404).sendFile(path.join(__dirname, 'views', '404page.html'));
    // don't put '../' as we are in root folder
    
    // send() must be last one
});

app.listen(3000);