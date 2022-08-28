const path = require('path');
const express = require('express');
const bodyParser = require('body-parser');
const mongoose = require('mongoose');

// installed express-session imported
const session = require('express-session');

// to store session data in db
const MongoDBStore = require('connect-mongodb-session')(session);

const errorController = require('./controllers/error');
const User = require('./models/user');

// connection string
const MONGODB_URI =
  'mongodb+srv://sahilyadav:xZ6xgy4Qys6TjcS@cluster0.zvwgx.mongodb.net/shop';
 
const app = express();

// use this not memory as data is here unlimited
const store = new MongoDBStore({
  uri: MONGODB_URI,               // db connection string
  collection: 'sessions'          // model where session will store
});

app.set('view engine', 'ejs');
app.set('views', 'views');

const adminRoutes = require('./routes/admin');
const shopRoutes = require('./routes/shop');
const authRoutes = require('./routes/auth');

app.use(bodyParser.urlencoded({ extended: false }));
app.use(express.static(path.join(__dirname, 'public')));

//core configuration session middleware setup
// this automatically set cookies for us
app.use(
  session({
    secret: 'my secret',      // for signing the hsah which secretly stores our ID in the cookie
    resave: false,            // session not be saved on every request or response
    saveUninitialized: false, // ensure to not to save session if not required
    store: store              // above store vriable
  })
);

app.use((req, res, next) => {
  if (!req.session.user) {
    return next();
  }
  User.findById(req.session.user._id)
    .then(user => {
      req.user = user;
      next();
    })
    .catch(err => console.log(err));
});

app.use('/admin', adminRoutes);
app.use(shopRoutes);
app.use(authRoutes);

app.use(errorController.get404);

mongoose
  .connect(MONGODB_URI)
  .then(result => {
    User.findOne().then(user => {
      if (!user) {
        const user = new User({
          name: 'Sahil',
          email: 'sahil@.com',
          cart: {
            items: []
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
