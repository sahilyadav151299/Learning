package main

import "fmt"

func main() {

	var result = OuterFun()		 // result will have memory address of innerfunc

	fmt.Println(result)			 // func defn of innerfunc
	fmt.Println(result()) 		 // executing innerfunc()

	var result2 = OuterFun1()

	fmt.Println(result2(100))
}


// outer function returns inner function definition
func OuterFun1() (func(int) string) {

	var innerfunc = func(a int) string {

		return "2000"
	}

	return innerfunc
}


// outer function returns inner function definition
func OuterFun() (func() string) {

	var innerfunc = func() string {
		return "2000"
	}

	return innerfunc
}