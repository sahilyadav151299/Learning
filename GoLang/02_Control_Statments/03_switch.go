package main

import "fmt"

func main() {

	// 1) Using a variable 

	var name = "Ken"

	switch name {

		case "John":
			fmt.Println("John is executed")
			fallthrough							// this will execute immediate next case also          
		case "Ken":
			fmt.Println("Ken is executed")
		case "Ram":
			fmt.Println("Ram is executed")
		default:
			fmt.Println("Default executed")
	}

	// 2) For common case

	switch name {

		case "John", "Ken":
			fmt.Println("John/Ken is executed")
		case "Ram":
			fmt.Println("Ram is executed")
		default:
			fmt.Println("Default executed")
	}

	// 3) Without variable for specifying conditions

	switch {

		case len(name) == 10:
			fmt.Println("Length is 10")
		case len(name) == 11:
			fmt.Println("Length is 11")
		case len(name) == 3:
			fmt.Println("Length is 3")
		default:
			fmt.Println("Default executed")
	}
}
