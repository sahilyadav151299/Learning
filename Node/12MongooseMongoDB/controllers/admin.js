const mongodb = require('mongodb');
const Product = require('../models/product');

exports.getAddProduct = (req, res, next) => {

  res.render('admin/edit-product', {
    pageTitle: 'Add Product',
    path: '/admin/add-product',
    editing: false
  });
};
 
exports.postAddProduct = (req, res, next) => {

    const title = req.body.title;
    const imageUrl = req.body.imageUrl;
    const price = req.body.price;
    const description = req.body.description;

    // Create a new product based on our product model
    const product = new Product({

        title: title,
        price: price,
        description: description,
        imageUrl: imageUrl,
        userId: req.user // automatically _id picked up
    });
    
    // save() provided by mongoose
    product.save()
        .then(result => {
            console.log('Created Product');
            res.redirect('/admin/products');
            })
        .catch( err => {console.group(err);});
};

exports.getEditProduct = (req, res, next) => {

  const editMode = req.query.edit;
  if (!editMode) {
    return res.redirect('/');
  }
  const prodId = req.params.productId;
  
  Product
    .findById(prodId)
    .then(product => {
      if (!product) {
        return res.redirect('/');
      }
      res.render('admin/edit-product', {
        pageTitle: 'Edit Product',
        path: '/admin/edit-product',
        editing: editMode,
        product: product
      });
    })
    .catch(err => console.log(err));
};

exports.postEditProduct = (req, res, next) => {
  const prodId = req.body.productId;
  const updatedTitle = req.body.title;
  const updatedPrice = req.body.price;
  const updatedImageUrl = req.body.imageUrl;
  const updatedDesc = req.body.description;

  Product.findById(prodId).then(product => {

        product.title = updatedTitle;
        product.price = updatedPrice;
        product.description = updatedDesc;
        product.imageUrl = updatedImageUrl;
        return product.save();
  })
  .then(result => {
        console.log('UPDATED PRODUCT!');
        res.redirect('/admin/products');
  })
    .catch(err => console.log(err));
};

exports.getProducts = (req, res, next) => {
  
        Product
        .find()
        // .select('title price -_id') // id excluded
        // .populate('userId', 'name')
        .then(products => {
            console.log(products); // via populate() it results in user information
        res.render('admin/products', {
            prods: products,
            pageTitle: 'Admin Products',
            path: '/admin/products'
        });
        })
        .catch(err => console.log(err));
};

exports.postDeleteProduct = (req, res, next) => {
  
    const prodId = req.body.productId;   // from hidden input
    
    // Product model
    Product.findByIdAndRemove(prodId)
            .then(result => {
            console.log('DESTROYED PRODUCT');
            res.redirect('/admin/products');
            })
            .catch(err => console.log(err));
};
