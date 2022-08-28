const http = require('http');

const server = http.createServer((req, res) =>{

    const url = req.url;

    if(url === '/'){
        res.setHeader('Content-Type', 'text/html');
        res.write('<html>')
        res.write('<head><title>Server Response Form</title></head>');
        res.write('<body>');
        res.write('<form action="/message" method="POST">');
        res.write('<input type="text" name="message">');
        res.write('<button type="submit">Send</button>');
        res.write('</form>');
        res.write('</body>');
        res.write('</html>')
        return res.end();
    }

    res.setHeader('Content-Type', 'text/html');
    res.write('<html>')
    res.write('<head><title>My First Server Response</title></head>');
    res.write('<body><h1>Pawri Ho Rahi Hai</h1></body>');
    res.write('</html>')
    res.end();
});

server.listen(3000);