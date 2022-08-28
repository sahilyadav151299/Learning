const mongoose = require('mongoose');

// constructor imported
const Schema = mongoose.Schema;

// As mongo db has less strict schema so here we may make rigid one for some cases
const productSchema = new Schema({

    title: {
        type: String,
        required: true
    },

    price: {
        type: Number,
        required: true
    },

    description: {
        type: String,
        required: true
    },

    imageUrl:{
        type: String,
        required: true
    },

    userId:{
        type: Schema.Types.ObjectId,
        ref: 'User', //FK
        required: true
    }
});

// Model name defined as 'Product' to use it
module.exports = mongoose.model('Product', productSchema);