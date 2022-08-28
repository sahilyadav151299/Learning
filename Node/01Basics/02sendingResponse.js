const http = require('http');

const server = http.createServer( (req, res) => {
    console.log(req.url, req.method, req.headers);

    // Sending Response

    res.setHeader('Content-Type', 'text/html');
    res.write('<html>')
    res.write('<head><title>My First Server Response</title></head>');
    res.write('<body><h1>Look in the console (Network + Refresh)</h1></body>');
    res.write('</html>')
    res.end();
});

server.listen(3000);