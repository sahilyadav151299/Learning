package main

import "fmt"

func main() {

	// 1) general for loop
	
	var i int

	for i = 0; i < 10; i++ {
		fmt.Println(i)
	}

	// 2) shorthand for loop

	for i := 0; i < 10; i++ {
		fmt.Println(i)
	}

	// 3) only condition for loop : while

	var j = 0

	for j < 10 {

		fmt.Println(j)
		j++
	}

	// 4) break & continue + only for loop

	var k = 0

	for {

		k++

		if k >= 20 {
			break       
		}

		if k%2 == 0 {
			continue    
		}

		fmt.Println("Odd number : ", k)
	}
}
