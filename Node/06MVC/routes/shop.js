const path = require('path');
const express = require('express');

const router = express.Router();

const productsController = require('../controllers/products');

router.get('/', productsController.getProductsPage);

module.exports = router;