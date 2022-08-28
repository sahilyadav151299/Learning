var express = require('express')
var app = express()
var bodyParser = require('body-parser');
var mongoose = require('mongoose')
var multer = require('multer');
const imageRoutes = require('./routes/image')

app.use(bodyParser.urlencoded({ extended: false }))
app.use(bodyParser.json())

app.set("view engine", "ejs"); 
           
var storage = multer.diskStorage({
    destination: (req, file, cb) => {
        cb(null, 'uploads')
    },
    filename: (req, file, cb) => {
        cb(null, file.fieldname + '-' + Date.now() + '-' + file.originalname)
    }
});
  
app.use(multer({ storage: storage }).single('image'))

app.use('/' ,imageRoutes)

mongoose.connect("mongodb://localhost:27017/imgdb", { useNewUrlParser: true, useUnifiedTopology: true })
    .then(() => {
        console.log('Database created and connected successfully!')
    })
    .then(() => {
        app.listen(8000, () => {
            console.log(`serve at http://localhost:8000`);
        });
    })
    .catch((err) =>  console.log(err)) 