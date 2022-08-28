package main

import "fmt"

func main(){

	var slice1 =[]int{10,20,30}

	var slice2 = make([]int,2)

	// 1st dest slice, 2nd source slice
	copy(slice2,slice1)


	fmt.Println(slice2)
	fmt.Println(slice1)

}