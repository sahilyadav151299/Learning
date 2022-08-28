const mongodb = require('mongodb');

// imported access to our shop db
const getDb = require('../util/database').getDb;

class Product {

    constructor(title, price, description, imageUrl, id, userId) {

        this.title = title;
        this.price = price;
        this.description = description;
        this.imageUrl = imageUrl;
        this._id = id ? new mongodb.ObjectID(id) : null;
        this.userId = userId;
    }

    save() {

        const db = getDb();
        let dbOp;
        if(this._id){
            // Update the product
            dbOp = db.collection('products').updateOne( { _id : this._id }, { $set : this });
        } else {
            // insert new one
            dbOp = db.collection('products').insertOne(this);
        }

        return dbOp
            .then(result => {
                console.log(result);
            })
            .catch(err => {
                console.log(err);
            });
    }

    static fetchAll(){

        const db = getDb();
        return db
            .collection('products')
            .find() // returns a cursor
            .toArray() // returns a promise
            .then( products => {
                console.log(products);
                return products;
            })
            .catch(err => {
                console.log(err);
            });
    }

    static findById(prodId){

        const db = getDb();
        return db   
            .collection('products') // BSON format data
            .find({ _id: new mongodb.ObjectID(prodId) })  // still returns cursor, mongodb don't know its only one 
            .next() // so that we can return promise instead of cursor
            .then( product => {
                console.log(product);
                return product;
            })
            .catch( err => {console.log(err);})
    }

    static deleteById(prodId){

        const db = getDb();
        return db.collection('products')
                 .deleteOne( { _id: new mongodb.ObjectID(prodId) } )
                 .then( result => {
                        console.log('Deleted');
                  })
                 .catch( err => {console.log(err);})
    }


}

module.exports = Product;
