const path = require('path');

const rootDir = require('../util/path');

const express = require('express');

const router = express.Router();

router.get('/', (req, res, next) => {           
    
    // Ohh Get, order doesn't matter now
    res.sendFile(path.join(rootDir,'views', 'shop.html'));
    //res.sendFile(path.join(__dirname,'../','views', 'shop.html')); 
    
    // returns a path, constructs this path by concatenating
    // .. or ../ means go up one level 
    // beacuse __dirname points to routes folder
});


module.exports = router;