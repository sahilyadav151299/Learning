package main

import "fmt"

func main() {

	// general way of if-else

	var i = 100

	if i > 90 && i == 100 {
		fmt.Println("if is executed..")
	} else if i == 200 {
		fmt.Println("else if is executed")
	} else {
		fmt.Println("else is executed")
	}

	// function call + condition

	if value := GetData(); value == 900 {
		fmt.Println("if is called for", value)
	} else {
		fmt.Println("else is called for", value)
	}
}

func GetData() int {

	return 900
}
