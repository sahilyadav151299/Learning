# This is a W3C recommendation wherein entire file is read into the memory
# and store in hierarchical form to represent all the features of XML doc.

import  xml.dom.minidom

DOMTree = xml.dom.minidom.parse('books.xml')

collection = DOMTree.documentElement

print(collection.tagName)
print(collection.hasAttribute('id'))

books = collection.getElementsByTagName('book')
print(books)

for book in books:
    print('Book Id      : ' + book.getAttribute('id'))
    print('Author       : ' + book.getElementsByTagName('author')[0].childNodes[0].data)
    print('Title        : ' + book.getElementsByTagName('title')[0].childNodes[0].data)
    print('Genre        : ' + book.getElementsByTagName('genre')[0].childNodes[0].data)
    print('Price        : ' + book.getElementsByTagName('price')[0].childNodes[0].data)
    print('Publish Date : ' + book.getElementsByTagName('publish_date')[0].childNodes[0].data)
    print('Description  : ' + book.getElementsByTagName('description')[0].childNodes[0].data)
    print('-----------------------------------------------------------------------------------')

