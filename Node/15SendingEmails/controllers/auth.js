// for encryption purpose
const bcrypt = require('bcryptjs');

// for mail service
const nodemailer = require('nodemailer');
const sendGridTransport = require('nodemailer-sendgrid-transport');

const User = require('../models/user');

// sendGridTransport() returns configuration that nodemailer can use to use sendGrid
const transporter = nodemailer.createTransport(sendGridTransport({

  auth: {
    api_key: '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'
  }
})); 

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

          // send after redirecting otherwise it slow down the service
          return transporter.sendMail({

            to: email,  // to email address variable
            from: 'sahilyadav151299@gmail.com',
            subject: 'Signup succeeded',
            html: '<h1>Welcome On Shop</h1>'
          });
        })
        .catch(err => {
          console.log(err);
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
