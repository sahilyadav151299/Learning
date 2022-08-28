package main

import "fmt"

func main() {

	// passing variadic param
	getData(10, 20, 30)

	// passing slice as variadic param
	slice1 := []int{10, 20}
	getData(slice1...)

	var slice3 = []string{"MON", "TUE", "WED"}
	var slice4 = []string{"THR", "FRI", "SAT"}

	// passing slice as variadic param
	slice3 = append(slice3, slice4...)

	fmt.Println(slice3)
}

func getData(values ...int) {
	fmt.Println("In getData()")
}
