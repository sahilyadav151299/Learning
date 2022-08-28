package main

import "fmt"

func main() {

	slice1 := []int{100, 200, 300, 400, 500}
    
    fmt.Println(slice1[0:3])  // 0,1,2
    fmt.Println(slice1[:3])   // 0,1,2
    fmt.Println(slice1[2:])   // 2 to end of slice
    fmt.Println(slice1[:])

}