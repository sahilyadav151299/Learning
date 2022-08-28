const path = require('path');
const express = require('express');
const bodyParser = require('body-parser');

const app = express();             
                          
app.set('view engine', 'ejs');  
app.set('views', 'views');      

const adminRoutes = require('./routes/admin');      
const shopRoutes = require('./routes/shop');  
const errorController = require('./controllers/error');      
const db = require('./util/database');
// database pool imported to work with

db.execute('SELECT * FROM nodedb.products')
    .then( result => { console.log(result[0]); /*result*/ })
    .catch( err => { console.log(err); });
// executes then block, if error executes catch block    

app.use(bodyParser.urlencoded({extended: false}));
app.use(express.static(path.join(__dirname, 'public')));

app.use('/admin', adminRoutes);      
app.use(shopRoutes);                 

app.use(errorController.get404Page);

app.listen(3000);