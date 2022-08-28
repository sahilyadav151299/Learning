// A single product is what defines our app in the end

const fs = require('fs');
const path = require('path');
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

        //this is asynchronous code
        //it simply registers this callback in its event emitter register
        //then it just finishes with this function 
        //and this function itself does not return anything.
        //it returns undefined therefore and hence in my view, 
        //in the shop.ejs file, if I try to access the length and get error
    });
}

module.exports = class Product {

    constructor(getTitle, getImageURL, getPrice, getDesc){

        this.title = getTitle;
        this.imageURL = getImageURL;
        this.price = getPrice;
        this.description = getDesc;   
    }

    save(){
        getProductsFromFile( prodcuts => {
            prodcuts.push(this);
            fs.writeFile(p, JSON.stringify(prodcuts), (err) => {
                console.log(err);
            }); 
        });   
    }

    static fetchAll(cb){
        getProductsFromFile(cb);
    }
}