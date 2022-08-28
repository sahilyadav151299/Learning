const Product = require('../models/product');

exports.getAddProductPage = (req, res, next) => {

    res.render('admin/add-product', {
        pageTitle: 'Add Products', 
        path: '/admin/add-product',
        activeAddProduct : true,
        productCSS : true
    });
};

exports.postAddProduct = (req, res, next) => {

    const getTitle = req.body.title;
    const getImageURL = req.body.imageURL;
    const getPrice = req.body.price;
    const getDesc = req.body.description;

    const product = new Product(getTitle, getImageURL, getPrice, getDesc);
    product.save();

    res.redirect('/');
};

exports.getProducts = (req, res, next) =>{

    Product.fetchAll( products => {

        res.render('admin/products', {
        prods: products, 
        pageTitle: 'Admin Products', 
        path:'/admin/products'
        });
    });
}