const express = require('express')
const mongoose = require('mongoose')
const bodyParser = require('body-parser')
const customer = require('./models/customer')
const order = require('./models/order')

const app = express()
const router = express.Router()

app.use(bodyParser.urlencoded({extended:false}));
app.use('/', router);

mongoose.connect('mongodb://localhost:27017/db1')
        .then(() => console.log('Database created and connected successfully!'))
        .catch((err) =>  console.log(err))

app.get('/', (req, res) => {
    res.write('<h1>Hello World!</h1>')
})

// http://localhost:3000/customers
router.route('/customers')
.get((req, res) => {
    // Query the collection 'users' & fetch the data
    
    var id = req.body._id
    console.log(id)

    customer.findOne({ "_id" : id}, (err, customer) => {
        if(err)
            res.send({message:'Error in fetching data'})
        else
            res.json(customer)
            console.log(customer)
    })
})
    .post((req, res) => {

        // extract name and age from request body
        console.log(req.body)
        
        var newCustomer = new customer(req.body)

        newCustomer.save((err) => {
            if(err)
                res.send({message:'Error in fetching data'})
            else
                res.json({message:'New user added'})   
        })
    })
    

// http://localhost:3000/orders
router.route('/orders')
    .post((req, res) => {

        // extract name and age from request body
        console.log(req.body)
        
        var newOrder = new order(req.body)

        newOrder.save((err) => {
            if(err)
                console.log(err)
            else
                res.json({message:'New order created'})   
        })
    })    

app.listen(3000, () => {
    console.log('Server running at port 3000 !!!')
})