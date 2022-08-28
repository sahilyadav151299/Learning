package main

import "fmt"

// syntax : var <identifier> = <value>

var address = "Pune"

func main() {

	// without datatype specification
	// must be intialized at the time of var declaration
	// they are not zero value variable : as they can't be left uninitialized
	
	var name = "Shyam"
	var id = 100

	// var code	: gives error

	fmt.Println(name, id, address)

	// one line variable declaration + initializarion

	var FName, LName, salary, status = "Sachin", "Tendulkar", 1000, true

	fmt.Println(FName, LName, salary, status)

}
