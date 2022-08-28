package main

import "fmt"

func main() {

	var slice2 = make( [] int, 2, 5)

	// 2   : len - current no of element
	// 5   : capacity of underlaying array
	// capacity is 5 but initial holds 2 blocks

	fmt.Println(cap(slice2))			// 5
	fmt.Println(len(slice2))			// 2 : [0, 0]

	slice2[0] = 100
	slice2[1] = 200

	fmt.Println("Length , Cap ", len(slice2), cap(slice2))

	slice2 = append(slice2, 300, 400)

	fmt.Println("Length , Cap ", len(slice2), cap(slice2))

	slice2 = append(slice2, 500)

	fmt.Println("Length , Cap ", len(slice2), cap(slice2))

	// out of capacity
	slice2 = append(slice2, 900) 

	// internally created a new arry of double capacity 5 * 2 = 10
	fmt.Println("Length , Cap ", len(slice2), cap(slice2))

	// out of capacity
	slice2 = append(slice2, 900, 100, 100, 1100, 1200) 
	
	// internally created a new arry of double capacity 10 * 2 = 20
	fmt.Println("Length , Cap ", len(slice2), cap(slice2))

}
