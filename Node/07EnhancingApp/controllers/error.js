exports.get404Page = (req, res, next) => {
    
    res.status(404).render('404', {pageTitle: 'Error 404', path : '/404'});
};