const express = require('express')
const bodyParser = require('body-parser')
const app = express()
const port = 3000
const router = express.Router();

app.use(bodyParser.urlencoded({extended:false}));

// Users Data
var allUsers = [
    {'name':'Joe', 'age':21},
    {'name':'Pet', 'age':23}
]

// Default Route : http://localhost:3000  
app.get('/', (req, res) => res.send('Hello World!'))

// Direct all request coming to /api to the router
app.use('/api', router);

// Use Router : http://localhost:3000/api/users
router.route('/users',)
    .get((req, res) => {
        // sending JSON response
        res.json(allUsers)
    })
    .post((req, res) => {
        // extract name & age from request body
        var name = req.body.name
        var age = req.body.age

        allUsers.push({name: name, age: age})

        res.json({message:'New User Added'})
    })

// Use Route : http://localhost:3000/api/users/sahil    
router.route('/users/:name')
    .get((req, res) => {
        
    })
    .put((req, res) => {
        
    })
    .delete((req, res) => {

    })


app.listen(port, () => console.log(`Example app listening on port ${port}!`))
