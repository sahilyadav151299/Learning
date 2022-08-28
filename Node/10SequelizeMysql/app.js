const path = require('path');
const express = require('express');
const bodyParser = require('body-parser');

const errorController = require('./controllers/error');
const adminRoutes = require('./routes/admin');
const shopRoutes = require('./routes/shop');

const sequelize = require('./util/database');
// database pool imported to work with 
const Product = require('./models/product');
const User = require('./models/user');
const Cart = require('./models/cart');
const CartItem = require('./models/cart-item');
const Order = require('./models/order');
const OrderItem = require('./models/order-item');

const app = express();

app.set('view engine', 'ejs');
app.set('views', 'views');

app.use(bodyParser.urlencoded({ extended: false }));
app.use(express.static(path.join(__dirname, 'public')));

app.use((req, res, next) => {
    User.findByPk(1)
        .then(user => {
        req.user = user;
        next();
        })
        .catch(err => console.log(err));
});

app.use('/admin', adminRoutes);
app.use(shopRoutes);
app.use(errorController.get404);

Product.belongsTo(User, { constraints: true, onDelete: 'CASCADE' });
// CASCADE If user deleted product too
User.hasMany(Product);
User.hasOne(Cart);
Cart.belongsTo(User);
Cart.belongsToMany(Product, { through: CartItem });
Product.belongsToMany(Cart, { through: CartItem });
Order.belongsTo(User);
User.hasMany(Order); // 1 to Many
Order.belongsToMany(Product, {through: OrderItem});

sequelize
    //.sync({ force: true }) // Override existing table
    .sync()
    .then(result => {
        return User.findByPk(1);
    })
    .then(user => {
        if (!user) {
        return User.create({name: 'Sahil', email: 'sahil@1208'});
        }
        return user;
    })
    .then(user => {
        return user.createCart(); // Create a cart for a user
    })
    .then(cart => {
        app.listen(3000);
    })
    .catch( err => {console.log(err);});


// The sync method has a look at all the models you defined
// It then basically creates tables for all the models if not exists
// It syncs your models to the database by creating the appropriate tables

