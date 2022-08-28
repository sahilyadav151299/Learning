package main

import "fmt"

func main() {

	CalculateMarks("Sachin")
	CalculateMarks("Virat", 90, 100)
	CalculateMarks("Rohit", 90, 100, 200)
	CalculateMarks("DHoni", 90, 100, 200, 300)
}

// ... : variadic parameter: to this parameter we can pass 0 or more value
// Internally this parameter will be stored as dynamic array (Slice)
// In a given function we can have single variadic parameter but at the end

func CalculateMarks(name string, marks ...int) {

	fmt.Println(name, marks)
}
