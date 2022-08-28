const http = require('http');
const fs = require('fs');

const server = http.createServer((req, res) =>{

    const url = req.url;
    const method = req.method;

    if(url === '/'){
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

    if(url === '/message' && method === 'POST'){
        fs.writeFileSync('textFile.txt', 'Dummy Data');
        res.statusCode = 302;
        res.setHeader('Location', '/');
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