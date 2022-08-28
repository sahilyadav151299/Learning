const fs = require('fs');

const requestHandler = (req, res) => {

    const url = req.url;
    const method = req.method;

    if(url === '/'){
        res.write('<html>')
        res.write('<head><title>Server Response Form</title></head>');
        res.write('<body>');
        res.write('<form action="/message" method="POST">');
        res.write('<input type="text" name="message">');
        res.write('<button type="submit>Send</button>');
        res.write('</form>');
        res.write('</body>');
        res.write('</html>')
        return res.end();
    }

    if(url === '/message' && method === 'POST'){

        const body = [];

        req.on('data', (chunk) => {
            console.log(chunk);
            body.push(chunk);
        });

        return req.on('end', () => {   
            const parseBody = Buffer.concat(body).toString();
            console.log(parseBody);
            const message = parseBody.split("=")[1];

            fs.writeFile('textFile.txt', message, (err) => {
                res.statusCode = 302;
                res.setHeader('Location', '/');
                return res.end();
            });   
        });
    }    

    res.setHeader('Content-Type', 'text/html');
    res.write('<html>')
    res.write('<head><title>My First Server Response</title></head>');
    res.write('<body><h1>Pawri Ho Rahi Hai</h1></body>');
    res.write('</html>')
    res.end();

};

/*module.exports = {
    handler : requestHandler,
    someText : "This is some text okk"
};*/

//module.exports = {requestHandler};

//module.exports.handler = requestHandler;
//module.exports.someText = "This is some text okk";

exports.handler = requestHandler;
exports.someText = "This is some hard coded text";