const path = require('path');
const rootDir = require('../util/path');
const express = require('express');

const router = express.Router();

const adminData = require('./admin');

router.get('/', (req, res, next) => {

    console.log('In Shop',adminData.products);
    const products = adminData.products;
    res.render('shop', {prods: products, pageTitle: 'My Shop', path:'/'}); 
    
    // Render Shop.pug (We already specified path in views)
    // Pass Data for rendering

    //res.sendFile(path.join(rootDir,'views', 'shop.html'));
});


module.exports = router;