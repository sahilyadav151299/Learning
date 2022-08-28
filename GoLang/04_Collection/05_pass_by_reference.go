package main

import "fmt"

func main() {

	var data = 100

	//pointer to int type of variable
	var iPointer *int 

    iPointer = &data

    fmt.Println(iPointer) // address of data var

    fmt.Println(data)

    changeValue(iPointer)

    fmt.Println(data)
	
    var a int = 10
	var b int = 20

	fmt.Println("Before swapping ", a, b)

	swap(&a, &b)

	fmt.Println("After swapping ", a, b)
}

func swap(a *int, b *int){
	var temp = *a
	*a = *b
	*b = temp
}

func changeValue(value *int) {

    *value = 900
}