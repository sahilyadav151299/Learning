const mongoose = require('mongoose')
const Schema = mongoose.Schema;

const orderSchema = new Schema({

    status:{
        type: Boolean,
    },

    customerId:{
        type: Schema.Types.ObjectId,
        ref: 'Customer'
    },

    created_at:{
        type: Date,
        default: new Date()
    }
})

var order = mongoose.model('Order', orderSchema, 'orders')

module.exports = order;