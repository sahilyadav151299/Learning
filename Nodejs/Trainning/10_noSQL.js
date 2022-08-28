const express = require('express')
const bodyParser = require('body-parser')
const app = express()
const port = 3000
const router = express.Router()
const mongoose = require('mongoose')
const user = require('./models/user')

app.use(bodyParser.urlencoded({extended:false}));

// Connect to userdb database
mongoose.connect('mongodb://localhost:27017/userdb')

// Default Route : http://localhost:3000  
app.get('/', (req, res) => res.send('Hello World!'))

// Direct all request coming to /api to the router
app.use('/api', router);

// Use Router : http://localhost:3000/api/users
router.route('/users')
    .get((req, res) => {
        // Query the collection 'users' & fetch the data
        user.find({}, (err, allUsers) => {
            if(err)
                res.send({message:'Error in fetching data'})
            else
                res.json(allUsers)    
        })
    })
    .post((req, res) => {
        // extract name and age from request body
        var obj = new user(req.body)

        obj.save((err) => {
            if(err)
                res.send({message:'Error in fetching data'})
            else
                res.json({message:'New user added'})   
        })
    })

// Use Route : http://localhost:3000/api/users/sahil    
router.route('/users/:name')
    .get((req, res) => {

        var uname = req.params.name

        // Query the collection 'users' & fetch the data
        user.findOne({name:uname}, (err, allUsers) => {
            if(err)
                res.send({message:'Error in fetching data'})
            else
                res.json(allUsers)    
        })
    })
    .put((req, res) => {

        // update one
        // find one and update
    })
    .delete((req, res) => {

        // delete one
        // find one and delete
    })


app.listen(port, () => console.log(`Example app listening on port ${port}!`))
