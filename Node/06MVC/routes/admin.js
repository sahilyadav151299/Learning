const path = require('path');

const express = require('express');

const productsController = require('../controllers/products');

const router = express.Router();

router.get('/add-product', productsController.getAddProductPage); 
// !() don't execute here, do it in controllers/prodcuts

router.post('/add-product', productsController.postAddProduct);


//exports.routes = router;

module.exports = router;