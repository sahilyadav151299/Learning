package main

import (
	"io"
	"net/http"
	"encoding/json"
	"github.com/gorilla/mux" 		
)

type Book struct {
	Id     int
	Name   string
	Isbn   string
	Pages  int
	author string
}

func GetBooks1(w http.ResponseWriter, r *http.Request) {

	var books [] Book

	books = append(books, Book {10, "JS", "isbn123", 100, "autho1"})
	books = append(books, Book {11, "HTML", "isbn90", 100, "auth2"})
	books = append(books, Book {12, "GoLang", "isbn90", 100, "auth2"})

	// convert Go object into JSON
	// send Books JSON data as response
	json.NewEncoder(w).Encode(books)

	io.WriteString(w, "Get Books is called...")
}

func DeleteBook(w http.ResponseWriter, r *http.Request) {

	io.WriteString(w, "Delet Books is called...")
}
func PutBook(w http.ResponseWriter, r *http.Request) {

	io.WriteString(w, "Put Books is called...")
}

func PostBook(w http.ResponseWriter, r *http.Request) {
	
	io.WriteString(w, "Post Books is called...")
}

func main() {

	// http://hostname:port/books

	var router = mux.NewRouter()

	// routing : map url with http handler

	router.HandleFunc("/books", GetBooks1).Methods("GET")
	router.HandleFunc("/books", PostBook).Methods("POST")
	router.HandleFunc("/books", PutBook).Methods("PUT")
	router.HandleFunc("/books", DeleteBook).Methods("DELETE")

	// listen : http://localhost:9900/books

	http.ListenAndServe(":9900", router)

}
