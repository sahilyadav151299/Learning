const path = require('path');

const rootDir = require('../util/path');

const express = require('express');

const router = express.Router();

//admin/add-product
router.get('/add-product', (req, res, next) => {
    //res.sendFile(path.join(__dirname, '../', 'views', 'add-product.html'));
    res.sendFile(path.join(rootDir, 'views', 'add-product.html'));
});

//admin/product or admin/add-product as diffrent method
router.post('/add-product', (req, res, next) => {
    res.redirect('/');
});

/*router.get('/add-product', (req, res, next) => {
    res.send('<h1>post</h1>');
});

Same path can be used if the method differs....

router.post('/add-product', (req, res, next) => {
    res.redirect('');
});*/

module.exports = router;