const express = require('express')
const morgan = require('morgan')
const app = new express()

// Gives log or information
app.use(morgan('dev'))

// Serve all static content from this folder
app.use(express.static('public'))

// Default Route : GET Request
app.get('/', function(req, res){

    // 1) Send content from here
    //res.send('Welcome Home From Express!')

    // 2) Only for static content/file 
    res.sendFile('index.html')

    // 3) Template use for serving dynamic content
    // res.render('index.ejs)
    
})

// Route for showing products
app.get('/products', function(req, res){
    res.send('Products Information!')
})

// Route for getting products
app.post('/products', function(req, res){
    res.send('New product added to DB!')
})

app.listen(3000, function(){

    console.log('Server is running on 3000')
})
