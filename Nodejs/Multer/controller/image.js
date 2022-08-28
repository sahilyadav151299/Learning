const imgModel = require('../model')
const fs = require('fs')
const path = require('path')

exports.getImage = (req, res, next) => {

    imgModel.find({}, (err, items) => {
        if (err) {
            console.log(err);
            res.status(500).send('An error occurred', err);
        }
        else {
            res.render('imagesPage', { items: items });
        }
    });
}

exports.setImage = (req, res, next) => {

     
    console.log(req.file)

    var obj = {
        name: req.body.name,
        desc: req.body.desc.trim(),
        img: {
            data: fs.readFileSync(path.join(__dirname.split('controller')[0] + '/uploads/' + req.file.filename)),
            contentType: 'image/png'
        }
    }

    imgModel.create(obj, (err, item) => {
        if (err) {
            console.log(err);
        }
        else {
            res.redirect('/');
        }
    });
}