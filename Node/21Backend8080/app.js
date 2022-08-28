const path = require('path');

const express = require('express');
const bodyParser = require('body-parser');
const mongoose = require('mongoose');

// for file upload download
const multer = require('multer');

const feedRoutes = require('./routes/feed');
const authRoutes = require('./routes/auth');

const app = express();

// configuration
const fileStorage = multer.diskStorage({
  destination: (req, file, cb) => {
    cb(null, 'images'); // images folder
  },
  filename: (req, file, cb) => {
    cb(null, new Date().toISOString() + '-' + file.originalname);
  }
});

// filter file format
const fileFilter = (req, file, cb) => {
  if (
    file.mimetype === 'image/png' ||
    file.mimetype === 'image/jpg' ||
    file.mimetype === 'image/jpeg'
  ) {
    cb(null, true);
  } else {
    // no error but false
    cb(null, false);
  }
};

// this way is good for data(form data) encoded in x-www-form-urlencoded
//app.use(bodyParser.urlencoded());

// json() able to parse the JSON data instead form data
// good for application/json
app.use(bodyParser.json()); 

// resgister multer config, single file used 
app.use(
  multer({ storage: fileStorage, fileFilter: fileFilter }).single('image')
);

// to serve image statically
app.use('/images', express.static(path.join(__dirname, 'images')));

//resolve CORS erro
app.use((req, res, next) => {
  res.setHeader('Access-Control-Allow-Origin', '*');
  res.setHeader('Access-Control-Allow-Methods','OPTIONS, GET, POST, PUT, PATCH, DELETE');
  res.setHeader('Access-Control-Allow-Headers', 'Content-Type, Authorization');
  next();
});

app.use('/feed', feedRoutes);
app.use('/auth', authRoutes);

// handles thrown error forwarded by next
app.use((error, req, res, next) => {
  console.log(error);

  const status = error.statusCode || 500;
  const message = error.message;
  const data = error.data;
  res.status(status).json({ message: message, data: data });
});

mongoose
  .connect(
    'mongodb+srv://sahilyadav:xZ6xgy4Qys6TjcS@cluster0.zvwgx.mongodb.net/messages?retryWrites=true&w=majority'
  )
  .then(result => {
    console.log('connected');
    app.listen(8080);
  })
  .catch(err => console.log(err));
