const Product = require('../models/product');
const Cart = require('../models/cart');

exports.getProductsPage = (req, res, next) => {

    Product.fetchAll( products => {

        res.render('shop/product-list', {
        prods: products, 
        pageTitle: 'My Shop', 
        path:'/products'
        });
    });
};    

exports.getProduct = (req, res, next) => {

    const prodID = req.params.productID;    // param object
    console.log(Product.findByID(prodID, product => {
        res.render('shop/product-detail', {
            product : product,
            pageTitle: product.title,
            path: '/products'
        });
    }));
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

    Cart.getCart(cart => {
        Product.fetchAll(products =>{
            const cartProducts = [];
            for(product of products){
                const cartProductdata = cart.products.find(prod => prod.id === product.id);
                if(cartProductdata){
                    cartProducts.push({productData:product, qty: cartProductdata.qty});
                }
            }
            res.render('shop/cart', {
            path: '/cart',
            pageTitle: 'My Cart',
            products: cartProducts
            });
        });
        
    });
    
};

exports.postCart = (req, res, next) =>{

    const prodID = req.body.productID;
    Product.findByID(prodID, (product) =>{
        Cart.addProduct(prodID, product.price);
    });
    res.redirect('/cart');
};

exports.postCartDeleteProduct = (req, res, next)=>{

    const prodID = req.body.productID;
    Product.findByID(prodID, product => {
        Cart.deleteProduct(prodID, product.price);
        res.redirect('/cart');
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
