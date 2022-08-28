const path = require('path');
const rootDir = require('../util/path');
const express = require('express');

const router = express.Router();
const products = [];

router.get('/add-product', (req, res, next) => {

    res.render('add-product', {pageTitle: 'Add Products', path: '/admin/add-product'})
    //res.sendFile(path.join(rootDir, 'views', 'add-product.html'));
});

router.post('/add-product', (req, res, next) => {

    //console.log(req.body);
    products.push({ title: req.body.title });
    console.log('In Admin', products);
    res.redirect('/');
});


exports.routes = router;
exports.products = products;