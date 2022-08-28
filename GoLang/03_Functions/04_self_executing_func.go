package main

import "fmt"

func main() {

	// it will be executed only once
	// generally it is used for one time initialization of members
	

	// no need to specify name : error
	func() {

		fmt.Println("Self Executing function is called")

	}() // Execute where it is defined

	
	var func1 = func() int {
		
		return 1200
	}()	// Execute where it is defined

	fmt.Println(func1) // 1200

}
