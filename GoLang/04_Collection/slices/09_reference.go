package main

import "fmt"

func main() {

    // this is only in case of using make for making slice
    // if 2 slice have same capacity & values, 
    // they reference to same slice & original becomes garbage
	slice1 := make([]int,2,4)

    slice1[0]=100
    slice1[1]=200

    slice2 := append(slice1,300)

    fmt.Println(slice1)
    fmt.Println(slice2)

    slice2[0]=88888

    fmt.Println(slice1)
    fmt.Println(slice2)

	// 2 different slice if capacity of second one increases

	slice3 := make([]int,2,4)

    slice3[0]=100
    slice3[1]=200

    slice4 := append(slice3,300, 700, 700)
    
    fmt.Println(slice3)
    fmt.Println(slice4)
    
    slice4[0]=88888

    fmt.Println(slice3)
    fmt.Println(slice4)
}
