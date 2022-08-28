const path = require('path');
const express = require('express');
const bodyParser = require('body-parser');

// mongoose imported to work with it
const mongoose = require('mongoose');

const errorController = require('./controllers/error');
const adminRoutes = require('./routes/admin');
const shopRoutes = require('./routes/shop');

//import User model to work with db
const User = require('./models/user');

const app = express();

app.set('view engine', 'ejs');
app.set('views', 'views');

app.use(bodyParser.urlencoded({ extended: false }));
app.use(express.static(path.join(__dirname, 'public')));

app.use((req, res, next) => {
    User.findById('604b2037f3ce122e749239f2')
        .then(user => {
        req.user = user; // store user in req.user
        next();
        })
        .catch(err => console.log(err));
});

app.use('/admin', adminRoutes);
app.use(shopRoutes);
app.use(errorController.get404);

// connect to "shop" database 
mongoose
    .connect('mongodb+srv://sahilyadav:xZ6xgy4Qys6TjcS@cluster0.zvwgx.mongodb.net/shop?retryWrites=true&w=majority')
    .then(result => {
        User.findOne().then(user => {
            if(!user){
                const user = new User({
                    name: 'Sahil',
                    email: 'sahil@.com',
                    cart:{
                        items:[]
                    }
                });
                user.save();
            }
        });
        
        app.listen(3000);        
    })
    .catch(err => {
        console.log(err);
    });