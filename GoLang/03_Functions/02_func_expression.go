package main

import "fmt"

func main() {

	// var holding function definition
	
	var func1 = func() int {

		return 1000
	}

	fmt.Println(func1)      // function definition or address

	fmt.Println(func1())	// function call or value 1000
}
