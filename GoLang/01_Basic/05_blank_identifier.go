package main

import "fmt"		
import _ "reflect"				// compiler won't give error here if we won't make use of it

func main()  {

	code, _  := 190, 200 		// value returned from a function

	var var2 = 20
	fmt.Println(var2, code)
}