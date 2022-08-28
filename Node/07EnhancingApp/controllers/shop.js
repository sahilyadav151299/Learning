const Product = require('../models/product');

exports.getProductsPage = (req, res, next) => {

    Product.fetchAll( products => {

        res.render('shop/product-list', {
        prods: products, 
        pageTitle: 'My Shop', 
        path:'/products'
        });
    });
};    

exports.getIndex = (req, res, next) => {

    Product.fetchAll( products => {

        res.render('shop/index', {
        prods: products, 
        pageTitle: 'My Shop', 
        path:'/'
        });
    });
};

exports.getCart = (req, res, next) => {

    res.render('shop/cart', {
        path: '/cart',
        pageTitle: 'My Cart'
    });
};

exports.getOrders = (req, res, next) => {

    res.render('shop/orders', {
        path: '/orders',
        pageTitle: 'My Orders'
    });
};

exports.getCheckout = (req, res, next) => {

    res.render('shop/checkout', {
        path: '/checkout',
        pageTitle: 'Checkout'
    });
};
