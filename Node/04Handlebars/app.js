const path = require('path');
const express = require('express');
const bodyParser = require('body-parser');
const expressHBS = require('express-handlebars');

const app = express();             

app.engine('hbs', expressHBS({
    layoutsDir: 'views/layouts/',
    defaultLayout: 'main-layout',
    extname: 'hbs'
}));                            // Engine Registered named hbs
app.set('view engine', 'hbs');  // Use hbs engine
app.set('views', 'views');      // Route for files

const adminData = require('./routes/admin');      
const shopRoutes = require('./routes/shop');        

app.use(bodyParser.urlencoded({extended: false}));
app.use(express.static(path.join(__dirname, 'public'))); 

app.use('/admin', adminData.routes);      
app.use(shopRoutes);                 

app.use((req, res, next) => {

    //res.status(404).sendFile(path.join(__dirname, 'views', '404page.html'));
    res.status(404).render('404', {pageTitle: 'Error 404'});
});

app.listen(3000);