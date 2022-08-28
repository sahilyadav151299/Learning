package main

import "fmt"

func main() {

	// Array : array := [2]string{"java","c#"}
	// Slice : slice := [ ]string{"java","c#"} 
	
	// append only works for slice

	var slice1 = []int{1,2,3,4,5}

	//append is for adding new elements to slice
	slice1 = append(slice1,50,70) 
	
	for i,v := range slice1{
		fmt.Println(i,v)
	}

	// ...variadic paramter
	slice1 = append(slice1,50,70,80,90)

	fmt.Println(slice1)

	// get in another slice empty slice
	var slice2 [] int
	var slice3 = [] int {}

	slice2 = append(slice1, 70)
	slice3 = append(slice3, 70)

	fmt.Println(slice1)
	fmt.Println(slice2)
	fmt.Println(slice3)
}