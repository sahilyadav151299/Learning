exports.getPosts = (req, res, next) => {

    // provided by express to return a json data with right headers being set & so on
    // 200 : just success
    res.status(200).json({

        // array of posts object inside an object
        posts: [
            {
            title: 'First Post',
            content: 'This is the first post!'
            }
        ]
    });  
};

// use post if wanna work with adding/appending instead overwriting
exports.createPost = (req, res, next) => {

    // parse data from the incoming request
    const title = req.body.title;
    const content = req.body.content;

    // create post in db, 201 : success a resource was created
    res.status(201).json({
        message: 'Post created successfully!',
        post: {
            id: new Date().toISOString(),
            title: title,
            content: content
        }    
    });
};