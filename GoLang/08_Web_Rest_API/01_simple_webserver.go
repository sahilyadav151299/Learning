package main

import (
	"io"
	"net/http"
)

// getRequest functionality
func GetBooks(w http.ResponseWriter, r *http.Request) {

	io.WriteString(w, "Get Books is called...")
}

func main() {
	
	// routing : map url with http handler
	// http://hostname:port/books

	http.HandleFunc("/books", GetBooks)		
	http.ListenAndServe(":9900", nil)

	// listen : http://localhost:9900/books
}
