module.exports = (req, res, next) => {

    // if not logged in return to login page
    if (!req.session.isLoggedIn) {
        return res.redirect('/login');
    }
    next();
}