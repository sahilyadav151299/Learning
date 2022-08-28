package main

import "fmt"

func main() {

	calc()
	calc(22)
	calc(22, 22)
}

func calc(Marks ...int)  {
	fmt.Println(Marks)	
}