// for encryption purpose

const bcrypt = require('bcryptjs');

const User = require('../models/user');

exports.getLogin = (req, res, next) => {
  // returns as array of message
  let message = req.flash('error');
  if (message.length > 0) {
    message = message[0];
  } else {
    message = null;
  }
  res.render('auth/login', {
    path: '/login',
    pageTitle: 'Login',
    errorMessage: message
  });
};

exports.getSignup = (req, res, next) => { 
  let message = req.flash('error');
  if (message.length > 0) {
    message = message[0];
  } else {
    message = null;
  }
  res.render('auth/signup', {
    path: '/signup',
    pageTitle: 'Signup',
    errorMessage: message
  });
};

exports.postLogin = (req, res, next) => {
  // form data for matching  
  const email = req.body.email;
  const password = req.body.password;

  // to find one user for specific email
  User.findOne({ email: email })
    .then(user => {
      if (!user) {
        // if no user with email error as a key 
        req.flash('error', 'Invalid email or password.');
        return res.redirect('/login');
      }
      // if exist match password via encryption bcoz can't be decrypted
      bcrypt
        // entered === returned user password
        .compare(password, user.password)
        .then(doMatch => {
          if (doMatch) {
            // if matched, login & save user session 
            req.session.isLoggedIn = true;
            req.session.user = user;
            return req.session.save(err => {
              console.log(err);
              res.redirect('/');
            });
          }
          // if not matched
          req.flash('error', 'Invalid email or password.');
          res.redirect('/login');
        })
        .catch(err => {
          console.log(err);
          res.redirect('/login');
        });
    })
    .catch(err => console.log(err));
};

exports.postSignup = (req, res, next) => {

  // form titles/id/name
  const email = req.body.email;      
  const password = req.body.password;
  const confirmPassword = req.body.confirmPassword;

  // find user via email whether its exist or not
  // returns user document
  User.findOne({ email: email })
    .then(userDoc => {
      if (userDoc) {
        // user exists don't create one just redirect
        req.flash('error', 'E-Mail exists already, please pick a different one.');
        return res.redirect('/signup');
      }
      return bcrypt
        // password + 12 : generates a hash promise which can't be decrypted
        .hash(password, 12)
        .then(hashedPassword => {
          // new user if not exists
            const user = new User({
            email: email,
            password: hashedPassword,
            cart: { items: [] }
          });
          return user.save();
        })
        .then(result => {
          // redirect to login after create account and save
          res.redirect('/login');
        });
    })
    .catch(err => {
      console.log(err);
    });
};

exports.postLogout = (req, res, next) => {
  
  // clear session from session db
  req.session.destroy(err => {
    console.log(err);
    res.redirect('/');
  });
};
