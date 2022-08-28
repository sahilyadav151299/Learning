const db = require('../util/database');
const Cart = require('./cart');
    
module.exports = class Product {

    constructor(id, getTitle, getImageURL, getPrice, getDesc){
        this.id = id;
        this.title = getTitle;
        this.imageURL = getImageURL;
        this.price = getPrice;
        this.description = getDesc;   
    }

    save(){
        return db.execute(
            'INSERT INTO nodedb.products (title, price, imageURL, description) VALUES (?, ?, ?, ?)',
            [this.title, this.price, this.imageURL, this.description]
        );
    }
    // [] safely insert values and not face the issue of SQL injection which is an attack pattern where
    // where users can insert special data into your input fields in your webpage that runs as SQL queries
   
    static deleteByID(id){

        
    }

    static fetchAll(){
        return db.execute('SELECT * From nodedb.products');
    }

    static findByID(id){
        return db.execute(
            'SELECT * From nodedb.products WHERE nodedb.products.id = ?',
            [id]
        );

    }
}