package main

// syntax : <identifier> := <value>

// import "fmt"
// import "reflect"

import (
	"fmt"
	"reflect"
)

func main() {

	// shorthand is only for local variables

	a := "Mukta"
	b := 1000
	c := 123.67

	fmt.Println(a, b, c)

	// one line variable declaration + initialization

	name, id, status := "Mukta", 100, true

	fmt.Println(name, id, status)

	// print data type of variables

	fmt.Printf("%T \n", name)
	fmt.Printf("%T \n", id)
	fmt.Printf("%T \n", status)

	// print data type using reflect package

	fmt.Println(reflect.TypeOf(name))
	fmt.Println(reflect.TypeOf(id))
	fmt.Println(reflect.TypeOf(status))
}
