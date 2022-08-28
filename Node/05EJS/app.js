const path = require('path');
const express = require('express');
const bodyParser = require('body-parser');

const app = express();             
                          
app.set('view engine', 'ejs');  
app.set('views', 'views');      

const adminData = require('./routes/admin');      
const shopRoutes = require('./routes/shop');        

app.use(bodyParser.urlencoded({extended: false}));
app.use(express.static(path.join(__dirname, 'public')));  // to serve css files

app.use('/admin', adminData.routes);      
app.use(shopRoutes);                 

app.use((req, res, next) => {

    //res.status(404).sendFile(path.join(__dirname, 'views', '404page.html'));

    res.status(404).render('404', {pageTitle: 'Error 404', path : ''});
});

app.listen(3000);