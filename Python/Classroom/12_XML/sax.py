# Simple API for XML (SAX)
# It parses the file as it reads it from disk
# & entire file is never stored in memory

import xml.sax

class BookHandler(xml.sax.ContentHandler):

    def __init__(self):
        self.currentTag = ''
        self.catalog = ''
        self.book = ''
        self.author = ''
        self.title = ''
        self.genre = ''
        self.price = ''
        self.publish_date = ''
        self.description = ''

    def startElement(self, tag, attributes):
        print ("Element : " + tag)
        self.currentTag = tag

        if tag == "book":
            print("Book Id : " + attributes["id"])

    def endElement(self, tag):
        if tag == "author":
            print("Author:", self.author)
        elif tag == "title":
            print("Title:", self.title)
        elif tag == "genre":
            print("Genre:", self.genre)
        elif tag == "price":
            print("Price:", self.price)
        elif tag == "publish_date":
            print("Publish date:", self.publish_date)
        elif tag == "description":
            print("Description:", self.description)

        self.currentTag = ""

    def characters(self, content):
        if self.currentTag == "author":
            self.author = content
        elif self.currentTag == "title":
            self.title = content
        elif self.currentTag == "genre":
            self.genre = content
        elif self.currentTag == "price":
            self.price = content
        elif self.currentTag == "publish_date":
            self.publish_date = content
        elif self.currentTag == "description":
            self.description = content




# Make parser for parsing content
parser = xml.sax.make_parser()
# BookHandler() object
handler = BookHandler()
# Pass object to parser for content
parser.setContentHandler(handler)
# Parser content
parser.parse("books.xml")