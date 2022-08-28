const path = require('path');

const express = require('express');

const adminController = require('../controllers/admin');

const router = express.Router();

//admin/add-product 
router.get('/add-product', adminController.getAddProductPage); 
// ~() don't execute here, do it in controllers/prodcuts

//admin/products
router.get('/products', adminController.getProducts); 

//admin/add-product 
router.post('/add-product',adminController.postAddProduct);


module.exports = router;