const http = require('http')
const url = require('url')

// Callback Approach

const server = http.createServer(function(req, res){

    // Routing Logic for URL's

    console.log('New request arrived')
    console.log('URL is : ' + req.url)

    if(req.url === '/'){

        var url_parts = url.parse(req.url, true)
        console.log(url_parts)

        res.write('Welcome Home !!!')
        res.end();
    }
    
    else if(req.url === '/contacts'){

        console.log('Method : ' + req.method)

        var url_parts = url.parse(req.url, true)
        console.log(url_parts)

        if(req.method === 'GET')
            res.write('Contact Information')

        res.end();
    }
})

server.listen(3000, function(){

    console.log('Server is running on 3000')
})