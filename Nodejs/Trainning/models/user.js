const mongoose = require('mongoose')
const Schema = mongoose.Schema;

const userSchema = new Schema({

    name:{
        type: String,
        required: true
    },

    age:{
        type: String,
        required: true,
        min: 1
    }
})

var user = mongoose.model('User', userSchema, 'users')

module.exports = user;