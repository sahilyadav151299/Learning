const fs = require('fs');
const path = require('path');

const { validationResult } = require('express-validator/check');

// post model or table or relation
const Post = require('../models/post');
const User = require('../models/user');

exports.getPosts = (req, res, next) => {
  // pagination logic
  const currentPage = req.query.page || 1;
  const perPage = 2;
  let totalItems;
  Post.find()
    //pagination logic
    .countDocuments()
    .then(count => {
      totalItems = count;
      return Post.find()
        .skip((currentPage - 1) * perPage)
        .limit(perPage);
    })
    .then(posts => {
      res
        .status(200)
        .json({
          message: 'Fetched posts successfully.',
          posts: posts,
          totalItems: totalItems
        });
    })
    // if err throw server error code
    .catch(err => {
      if (!err.statusCode) {
        err.statusCode = 500;
      }
      next(err);
    });
};

// use post if wanna work with adding/appending instead overwriting
exports.createPost = (req, res, next) => {
  const errors = validationResult(req);
  if (!errors.isEmpty()) {
    const error = new Error('Validation failed, entered data is incorrect.');
    error.statusCode = 422;
    throw error;
  }
  // check if file set or not
  if (!req.file) {
    const error = new Error('No image provided.');
    error.statusCode = 422; 
    throw error;
  }

  // parse data from the incoming request
  const imageUrl = req.file.path; // path hold path to the file
  const title = req.body.title;
  const content = req.body.content;
  let creator;
  // new post using post model
  const post = new Post({
    title: title,
    content: content,
    imageUrl: imageUrl,
    creator: req.userId
  });

  // save post in mongodb
  post
    .save()
    .then(result => {
      return User.findById(req.userId)
    })
    .then( user => { 
      creator = user;
      user.posts.push(post);
      return user.save();
    })
    .then(result => {
      // 201 : success a resource was created
      res.status(201).json({
        message: 'Post created successfully!',
        post: post,
        creator: { _id: creator._id, name: creator.name }
      });
    })
    .catch(err => {
      if (!err.statusCode) {
        err.statusCode = 500;
      }
      next(err); 
      // just like throw (Server side error)
      // throw will not reach at next middlware inside then catch
    });
};


exports.getPost = (req, res, next) => {

  // extract postID from param property of req
  const postId = req.params.postId;

  // in the post model find that post with postId
  Post.findById(postId)
    .then(post => {
      // if undefined thorw an error
      if (!post) {
        const error = new Error('Could not find post.');
        error.statusCode = 404;
        // when we throw here next catch block will be reached where we are calling next
        throw error;
      }
      // if exists set success status code 200 and return
      res.status(200).json({ message: 'Post fetched.', post: post });
    })
    .catch(err => {
      // comes from throw of then
      if (!err.statusCode) {
        err.statusCode = 500; // server error
      }
      next(err);
    });
};

// via put 
exports.updatePost = (req, res, next) => {

  const postId = req.params.postId;
  const errors = validationResult(req);
  if (!errors.isEmpty()) {
    const error = new Error('Validation failed, entered data is incorrect.');
    error.statusCode = 422;
    throw error;
  }
  const title = req.body.title;
  const content = req.body.content;
  let imageUrl = req.body.image;
  // if file upload check and change tha path
  if (req.file) {
    imageUrl = req.file.path;
  }
  if (!imageUrl) {
    const error = new Error('No file picked.');
    error.statusCode = 422;
    throw error;
  }

  Post.findById(postId)
    .then(post => {
      if (!post) {
        const error = new Error('Could not find post.');
        error.statusCode = 404;
        throw error;
      }

      if(post.creator.toString() !== req.userId){
        
        const error = new Error('Not Authorized');
        error.statusCode = 404;
        throw error;
      }

      if (imageUrl !== post.imageUrl) {
        // if image changed clear and put new one 
        clearImage(post.imageUrl);
      }
      post.title = title;
      post.imageUrl = imageUrl;
      post.content = content;
      return post.save();
    })
    .then(result => {
      // not a new resource
      res.status(200).json({ message: 'Post updated!', post: result });
    })
    .catch(err => {
      if (!err.statusCode) {
        err.statusCode = 500;
      }
      next(err);
    });
};

exports.deletePost = (req, res, next) => {

  const postId = req.params.postId;
  Post.findById(postId)
    .then(post => {
      if (!post) {
        const error = new Error('Could not find post.');
        error.statusCode = 404;
        throw error;
      }

      if(post.creator.toString() !== req.userId){
        
        const error = new Error('Not Authorized');
        error.statusCode = 404;
        throw error;
      }
      // Check logged in user
      clearImage(post.imageUrl);
      return Post.findByIdAndRemove(postId);
    })
    .then(result => {
      return User.findById(req.userId);
    })
    .then(user => {
      user.posts.pull(postId);
      return user.save();
    })
    .then(result => {
      console.log(result);
      res.status(200).json({ message: 'Deleted post.' });
    })
    .catch(err => {
      if (!err.statusCode) {
        err.statusCode = 500;
      }
      next(err);
    });
};

// used in delete/update post function
const clearImage = filePath => {
  filePath = path.join(__dirname, '..', filePath);
  fs.unlink(filePath, err => console.log(err));
};
