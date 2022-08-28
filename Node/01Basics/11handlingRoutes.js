const express = require('express'); 

const app = express();

app.use('/',(req, res, next) => {
    console.log('Always Runs');
    next();
});                        

app.use('/app-product',(req, res, next) => {
    console.log('In the middleware 1');
    res.send('<h1>Hello From App-Product</h1>');   
}); // 1

app.use('/',(req, res, next) => {
    console.log('In the middleware 2');
    res.send('<h1>Hello From ExpressJS</h1>');   
}); // 2                                                    

// This is at 2 beacuse '/' means it has to start with this 
// so if it would be on 1 while calling /app-product this will execute it as starts with /

app.listen(3000);     