const mongoose = require('mongoose')
const Schema = mongoose.Schema;

const customerSchema = new Schema({

    name:{
        type: String,
        required: true
    },

    age:{
        type: String,
        required: true,
        min: 1
    },

    created_at:{
        type: String,
        default: new Date()
    }
})

var customer = mongoose.model('Customer', customerSchema, 'customers')

var newCustomer = new customer({
    name: 'S100',
    age: '23'
})

newCustomer.save()

module.exports = customer;