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

        const body = [];

        req.on('data', (chunk) => { // callback === event listener
            console.log(chunk);
            body.push(chunk);
        });

        req.on('end', () => {   //return 
            const parseBody = Buffer.concat(body).toString();
            console.log(parseBody);
            const message = parseBody.split("=")[1];
            fs.writeFileSync('textFile.txt', message);
            res.statusCode = 302;
            res.setHeader('Location', '/');
            return res.end();
        });
    }    

    res.setHeader('Content-Type', 'text/html');
    res.write('<html>')
    res.write('<head><title>My First Server Response</title></head>');
    res.write('<body><h1>Pawri Ho Rahi Hai</h1></body>');
    res.write('</html>')
    res.end();
});

server.listen(3000);

// Event Driven Code Execution
// Order of execution of JS Code isn't it in order in which we write 
// JS exceutes registered event Asynchronously but not immediately 
// Node JS has some internal registry of events (data) & listeners to these events (function)
// When Node JS has done parsing your request it will go through registery and call them
// But won't paused code execution so we won't be redirected to same page here 
// Put retuen at line 31 to get rid of this
// Asynch nature helps in efficent processing, won't let server down