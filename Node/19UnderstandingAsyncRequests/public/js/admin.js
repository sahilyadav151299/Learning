// this will run in the client side

const deleteProduct = btn => {

  // btn === <btton> line in product.ejs

  // accessing other element values
  const prodId = btn.parentNode.querySelector('[name=productId]').value;
  const csrf = btn.parentNode.querySelector('[name=_csrf]').value;

  // returns closest element with that selector
  const productElement = btn.closest('article');

  // requests for sending and fetching data
  // path = /admin/product/id
  fetch('/admin/product/' + prodId, {

    // configuration
    method: 'DELETE',
    headers: {
      'csrf-token': csrf5
    }
  })
    .then(result => {
      // returns a new promise
      return result.json();
    })
    .then(data => {
      console.log(data);
      // here we delete the product that we fetched from the dom without reload or redirect
      productElement.parentNode.removeChild(productElement);
    })
    .catch(err => {
      console.log(err);
    });
};
