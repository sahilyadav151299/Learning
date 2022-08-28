// mongodb imported
const mongodb = require('mongodb');

// extract mongo client
const MongoClient = mongodb.MongoClient;

// the underscore is only here to signal that 
// this will only be used internally in this file
let _db;


// connect to database
const mongoConnect = callback => {

    // sahilyadav:xZ6xgy4Qys6TjcS db user and password // shop?  db name
    // connection code
    MongoClient
        .connect('mongodb+srv://sahilyadav:xZ6xgy4Qys6TjcS@cluster0.zvwgx.mongodb.net/shop?retryWrites=true&w=majority')
        .then( client => {
            console.log('Connected');
            // gives access to shop db 
            // automatically creates db in not exists
            // can be used as client.db('test') to override & connect to another db  
            _db = client.db(); 
            callback();
        })
        .catch( err => {
            console.log('err');
            throw err;
        });
};

// returns acces to db if it exists
const getDb = () => {

    if(_db){
        return _db;
    }
    throw 'No Database found!';
}

exports.mongoConnect = mongoConnect;
exports.getDb = getDb;