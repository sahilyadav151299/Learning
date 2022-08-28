// A single product is what defines our app in the end

const fs = require('fs');
const path = require('path');
const Cart = require('./cart');

const p = path.join(
    path.dirname(process.mainModule.filename), 
    'data', 
    'products.json');
    
const getProductsFromFile = cb => {

    fs.readFile(p, (err, fileContent) => {

        if(err)
        cb([]);
        else
        cb(JSON.parse(fileContent));

        //this is asynchronous code it simply registers this callback in its event emitter register
        //then it just finishes with this function and this function itself does not return anything.
        //it returns undefined therefore and hence in my view, in the shop.ejs file, if I try to access the length and get error
    });
}

module.exports = class Product {

    constructor(id, getTitle, getImageURL, getPrice, getDesc){
        this.id = id;
        this.title = getTitle;
        this.imageURL = getImageURL;
        this.price = getPrice;
        this.description = getDesc;   
    }

    save(){

        getProductsFromFile( products => {

            if(this.id){
                const existingProductIndex = products.findIndex(prod => prod.id === this.id);
                const updatedProduct = [...products];
                updatedProduct[existingProductIndex] = this;
                fs.writeFile(p, JSON.stringify(updatedProduct), (err) => {
                    console.log(err);
                });
            }else{
                this.id = Math.random().toString();
                products.push(this);
                fs.writeFile(p, JSON.stringify(products), (err) => {
                    console.log(err);
                }); 
            }
        });   
    }

    static deleteByID(id){

        getProductsFromFile( prodcuts => {
            const product = prodcuts.find(prod => prod.id === id);
            const updatedProduct = prodcuts.filter(prod => prod.id !== id);
            fs.writeFile(p, JSON.stringify(updatedProduct), (err)=>{
                if(!err){
                    Cart.deleteProduct(id, product.price);
                }
            });
        })
    }

    static fetchAll(cb){
        getProductsFromFile(cb);
    }

    static findByID(id, cb){

        getProductsFromFile(prodcuts => {
            const product = prodcuts.find(p => p.id === id);
            cb(product);
        });
    }
}