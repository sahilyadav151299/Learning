const express = require('express');

// this gives us check function in this way
// body function 
const { check, body } = require('express-validator/check');

const authController = require('../controllers/auth');
const User = require('../models/user');

const router = express.Router();

router.get('/login', authController.getLogin);

router.get('/signup', authController.getSignup);

router.post(
  '/login',
  [
    body('email')
      .isEmail()
      .withMessage('Please enter a valid email address.')
      // data sanitization
      .normalizeEmail(),
    body('password', 'Password has to be valid.')
      .isLength({ min: 5 })
      .isAlphanumeric()
      .trim()  // data sanitization
  ],
  authController.postLogin
);

// add an extra middleware of check before render page
router.post(
  '/signup',
  [
    // checks email field we are getting from signip page
    check('email')
      .isEmail()
      // error array msg
      .withMessage('Please enter a valid email.')
      .custom((value, { req }) => {
        
        return User.findOne({ email: value })
        .then(userDoc => {
          // if we get user with thes mail raise error
          if (userDoc) {
            // this will be stored as an error
            return Promise.reject(
              'E-Mail exists already, please pick a different one.'
            );
          }
        });
      }) // data sanitization
      .normalizeEmail(),
    // checks password strength  
    body(
      'password', // so that we dont have to repeat withMesg with every validator
      'Please enter a password with only numbers and text and at least 5 characters.'
    )
      .isLength({ min: 5 })
      .isAlphanumeric()
      .trim(), // data sanitization
      // if staisfied chechk for confirm password field
    body('confirmPassword')
      .trim()  // data sanitization
      .custom((value, { req }) => {
        if (value !== req.body.password) {
          throw new Error('Passwords have to match!');
        }
        // if matched return success
        return true;
      })
  ],
  // if all is fine this will called
  authController.postSignup
);

router.post('/logout', authController.postLogout);

router.get('/reset', authController.getReset);

router.post('/reset', authController.postReset);

router.get('/reset/:token', authController.getNewPassword);

router.post('/new-password', authController.postNewPassword);

module.exports = router;
