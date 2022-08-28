package main

import (
	"encoding/json"
	"fmt"
	"io"
	"net/http" // we will host application on this server. We will configure Routing
	"strconv"

	"github.com/gorilla/mux" //third Pary pkg
	"web.com/DAL"
)

//Handler should hvae Request and Response as i/p parameters
func GetBooks(w http.ResponseWriter, r *http.Request) {

	books := DAL.GetBooksSQL()
	//books : SLice of Book

	//convert go Lang object into JSOn and then send it as a Response

	json.NewEncoder(w).Encode(books)
}

func GetBooksById(w http.ResponseWriter, r *http.Request) {
	//we should read data from Request

	params := mux.Vars(r)

	id, _ := params["id"]

	idvalue, _ := strconv.Atoi(id)

	book := DAL.GetBookById1(idvalue)

	json.NewEncoder(w).Encode(book)

}
func PostBooks(w http.ResponseWriter, r *http.Request) {

	//io.WriteString(w, "This is Post Request")
	//NEed to read data from Request object : Data will be in JSOn format

	var book DAL.Book

	decoder := json.NewDecoder(r.Body)

	err := decoder.Decode(&book)

	fmt.Println(err)

	DAL.PostBook(book)

}

func PutBook(w http.ResponseWriter, r *http.Request) {

	io.WriteString(w, "Write Response to Server...")
	var book DAL.Book
	decoder := json.NewDecoder(r.Body)
	err := decoder.Decode(&book)
	fmt.Println(book)
	if err != nil {
		fmt.Println(err)
	}
	if book != (DAL.Book{}) {
		DAL.UpdateBook(book)
	}

}

func DeleteBookId(w http.ResponseWriter, r *http.Request) {
	var params = mux.Vars(r)
	//json.NewEncoder(w).Encode(people)
	//w.Write("Get Books..")

	//io.WriteString(w, "Delete abook with "+params["id"])
	id, _ := strconv.Atoi(params["id"])
	DAL.DeleteBook1(id)
}
func main() {

	//Configure Route
	// http.HandleFunc("/books", GetBooks) // http://localhost:8080/books
	// http.ListenAndServe(":8080", nil)

	var router = mux.NewRouter()

	router.HandleFunc("/books", GetBooks).Methods("GET")
	router.HandleFunc("/books/{id}", GetBooksById).Methods("GET") //route parameter http://localhost:8080/books/10
	router.HandleFunc("/books", PostBooks).Methods("POST")
	router.HandleFunc("/books", PutBook).Methods("PUT")
	//router.HandleFunc("/books", DeleteBook).Methods("DELETE")

	http.ListenAndServe(":8080", router)

	//CLient can send data to Server
	//Using URL
	//Using Request body
}
