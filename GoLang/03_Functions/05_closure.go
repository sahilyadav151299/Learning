package main

import "fmt"

// Req1 : counter should be local
// Req2 : still it should be initalized only once

var getHits = func() func() int {

	var counter = 0

	var addHits = func() int {
		counter++
		return counter
	}

	return addHits
}()

func main() {

	fmt.Println(getHits()) 	// adHits will be called and will get value of counter
	fmt.Println(getHits()) 	// adHits will be called and will get value of counter
	fmt.Println(getHits()) 	// adHits will be called and will get value of counter

	// counter = 100       Error - undefined: counter
}