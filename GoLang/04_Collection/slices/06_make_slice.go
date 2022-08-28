package main

import "fmt"

func main() {

	var slice []int // nil slice
	fmt.Println(slice)
	fmt.Println(len(slice))
	
	
	// make : make is used for making a slice
	// make can be used for slice, map & channel
    
	var slice1 = make([]int, 2)		// 2 block for values for initial use

	fmt.Println(slice1)

	slice1[0] = 66
	slice1[1] = 77

	slice1 = append(slice1, 40, 50)	// can increase the size

	fmt.Println(slice1)
	fmt.Println(len(slice1))

}
