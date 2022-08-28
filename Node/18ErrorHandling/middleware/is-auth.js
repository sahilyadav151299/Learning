module.exports = (req, res, next) => {
    if (!req.session.isLoggedIn) {
        return res.redirect('/login');
        // already 300 status
        // can change
    }
    next();
}