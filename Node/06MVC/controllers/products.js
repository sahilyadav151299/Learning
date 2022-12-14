const Product = require('../models/product');

exports.getAddProductPage = (req, res, next) => {

    res.render('add-product', {
        pageTitle: 'Add Products', 
        path: '/admin/add-product',
        activeAddProduct : true,
        productCSS : true
    });
};

exports.postAddProduct = (req, res, next) => {

    const product = new Product(req.body.title);
    product.save();

    res.redirect('/');
};

exports.getProductsPage = (req, res, next) => {

    Product.fetchAll( products => {

        res.render('shop', {
        prods: products, 
        pageTitle: 'My Shop', 
        path:'/', 
        hasProducts : products.length > 0, 
        activeShop : true
        });
    });
};    
