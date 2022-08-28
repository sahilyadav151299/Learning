const path = require('path');
const rootDir = require('../util/path');
const express = require('express');

const router = express.Router();

const adminData = require('./admin');

router.get('/', (req, res, next) => {

    console.log('In Shop',adminData.products);
    const products = adminData.products;
    res.render('shop', {
        prods: products, 
        pageTitle: 'My Shop', 
        path:'/', 
        hasProducts : products.length > 0, 
        activeShop : true
    }); 
    
});


module.exports = router;