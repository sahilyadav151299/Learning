const Product = require('../models/product');

exports.getAddProductPage = (req, res, next) => {

    res.render('admin/edit-product', {
        pageTitle: 'Add Products', 
        path: '/admin/add-product',
        editing: false
    });
};

exports.postAddProduct = (req, res, next) => {

    const getTitle = req.body.title;
    const getImageURL = req.body.imageURL;
    const getPrice = req.body.price;
    const getDesc = req.body.description;

    const product = new Product(null, getTitle, getImageURL, getPrice, getDesc);
    product.save();

    res.redirect('/');
};


exports.getEditProduct= (req, res, next) => {

    const editMode = req.query.edit;        // query object

    if(!editMode){
        return res.redirect('/');
    }

    const prodID = req.params.productID;

    Product.findByID(prodID, product => {
        if(!product){
            return res.redirect('/');
        }

        res.render('admin/edit-product', {
            pageTitle: 'Edit Product', 
            path: '/admin/edit-product',
            editing: editMode,
            product: product
        });
    });
};

exports.postEditProduct = (req, res, next) => {

    const prodID = req.body.productID;
    const updatedTitle = req.body.title;
    const updatedImageURL = req.body.imageURL;
    const updatedPrice = req.body.price;
    const updatedDesc = req.body.description;

    const updatedProduct = new Product(prodID, updatedTitle, updatedImageURL, updatedPrice, updatedDesc);
    updatedProduct.save();
    res.redirect('/admin/products');
}

exports.getProducts = (req, res, next) =>{

    Product.fetchAll( products => {

        res.render('admin/products', {
        prods: products, 
        pageTitle: 'Admin Products', 
        path:'/admin/products'
        });
    });
}

exports.postDeleteProduct = (req, res, next) => {

    const prodID = req.body.productID;  // from hidden input
    Product.deleteByID(prodID);
    res.redirect('/admin/products');
};