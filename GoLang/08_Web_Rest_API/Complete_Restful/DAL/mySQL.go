package DAL

import (
	"database/sql"
	"log"

	"fmt"

	_ "github.com/go-sql-driver/mysql"
)

// its init will be called

// type Book struct {
// 	//`json:"myName"`
// 	//Field int `json:"myName,omitempty"`
// 	ID     int    `json:"id"`
// 	Name   string `json:"fname,omitempty"`
// 	Isbn   string
// 	Author string `json:"author,omitempty"`
// 	Pages  int    `json:"-,"`
// }

type Book struct {
	//`json:"myName"`
	//Field int `json:"myName,omitempty"`
	ID     int
	Name   string
	Isbn   string
	Author string
	Pages  int
}

func connect() *sql.DB {

	db, err := sql.Open("mysql", "root:root123@tcp(127.0.0.1:3306)/sample")

	if err != nil {
		log.Print(err)
	}

	return db
}

func PostBook(book Book) {

	//http://localhost:8080/books/7

	//INSERT INTO Books (name, isbn, author,pages)
	//VALUES ("javascript","isbn123","Cody Lindley",100);
	db := connect()
	defer db.Close()

	stmt, err := db.Prepare("insert into Books (name, isbn, author,pages) values(?,?,?,?);")
	if err != nil {
		//fmt.Print(err.Error())
	}
	_, err = stmt.Exec(book.Name, book.Isbn, book.Author, book.Pages)

	if err != nil {
		fmt.Print(err.Error())
	}

	// 	res, err := stmt.Exec(33,"Ray Martin")
	//  if err != nil {
	//  log.Fatal(err)
	//  }
	//  lastId, err := res.LastInsertId()
	//  if err != nil {
	//  log.Fatal(err)
	//  }
	//  rowCnt, err := res.RowsAffected()
}

func GetBookById(id int) Book {
	var db = connect()
	var book Book
	defer db.Close()

	row := db.QueryRow("Select ID,name,isbn,author,pages from Books where ID = ?;", id)
	err := row.Scan(&book.ID, &book.Name, &book.Isbn, &book.Author, &book.Pages)

	if err != nil {
		log.Print(err)
	}

	return book
}

func UpdateBook(book Book) {

	var db = connect()
	defer db.Close()
	insForm, err := db.Prepare("UPDATE Books SET name=?, isbn=? WHERE id=?")
	if err != nil {
		log.Print(err)
	}
	_, err1 := insForm.Exec(book.Name, book.Isbn, book.ID)

	if err1 != nil {
		log.Print(err1)
	}

}
func PostBook1(book Book) {

	var db = connect()
	defer db.Close()

	//    insert, err := db.Query("INSERT INTO test VALUES ( 2, 'TEST' )")

	stmt, err := db.Prepare("insert into Books(name,isbn,author,pages) values(?,?,?,?);")

	if err != nil {
		log.Print(err)
	}

	_, err1 := stmt.Exec(book.Name, book.Isbn, book.Author, book.Pages)
	if err1 != nil {
		log.Print(err1)
	}

}

func GetBookById1(id int) Book {

	var db = connect()
	defer db.Close()

	var book Book

	row := db.QueryRow("Select ID,Name,Isbn from Books where ID=?;", id)

	err := row.Scan(&book.ID, &book.Name, &book.Isbn)

	if err != nil {
		log.Print(err)
	}

	return book
}
func GetBooksSQL1() []Book {
	var db = connect()
	defer db.Close()
	var book Book
	var books []Book
	defer db.Close()

	id := 3
	author := "mukta"

	//db.QueryRow("Select ID,name,isbn,author,pages from Books where ID = ?;", id)
	rows, err := db.Query("Select ID,name,isbn,author,pages from Books where ID =? and  author=?;", id, author)

	if err != nil {
		log.Print(err)
	}
	for rows.Next() {

		err := rows.Scan(&book.ID, &book.Name, &book.Isbn, &book.Author, &book.Pages)

		if err != nil {
			log.Print(err)
		}
		//book object contains row data from table

		books = append(books, book)

	}

	return books

}

func GetBooksSQL() []Book {

	var db = connect()

	defer db.Close()

	log.Print(db)
	var book Book
	var books []Book

	rows, err := db.Query("Select ID,name,isbn,author,Pages from Books")

	// id := "5"
	// pages := "400"
	// strQuery := "Select ID,name,isbn,author,pages from Books where ID = " + id + " AND pages=" + pages
	// rows, err := db.Query(strQuery)

	if err != nil {
		log.Print(err)
	}
	log.Print(rows)

	// (*Row) Scan scans the row, copying the column values to the parameter passed into it.
	for rows.Next() {
		err := rows.Scan(&book.ID, &book.Name, &book.Isbn, &book.Author, &book.Pages)
		//convert SQL row into Book object
		if err != nil {
			log.Print(err)
		} else {

			books = append(books, book)
		}
	}
	return books

}

func DeleteBook1(id int) {
	db := connect()
	defer db.Close()
	fmt.Println("Delete book connected")
	//delForm, err := db.Prepare("DELETE FROM Books WHERE ID=?")
	delForm, err := db.Prepare("DELETE FROM Books WHERE ID=1")
	if err != nil {
		panic(err.Error())
	}
	//	delForm.Exec(id)
	delForm.Exec()

}
func GetBook(id int) Book {
	var book Book
	db := connect()
	defer db.Close()

	row := db.QueryRow("Select ID,name,isbn,author,pages from Books where ID = ?;", id)
	err := row.Scan(&book.ID, &book.Name, &book.Isbn, &book.Author, &book.Pages)

	if err != nil {
		log.Print(err)
	}

	return book

	//One of the major differences between QueryRow() and Query() is how errors are handled.
	//With QueryRow(), error handling is deferred until you call Scan(),
	//and an error is returned when 0 records are found. Query() behaves very differently from this.

}
