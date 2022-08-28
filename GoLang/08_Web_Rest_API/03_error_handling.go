package main

import "fmt"

func main() {

	// catch error in finally block
	defer cleanup() 		
	
	var a = 10
	var b = 0
	var result = a / b

	fmt.Println("result is ", result)
}

// must be called at the end
func cleanup() {

	// catch exception 
	r := recover()
	 
	fmt.Println(r)
	fmt.Println("cleanup is done!")
}
