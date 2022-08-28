package main

import "fmt"

func main() {

	var array = [2][2] int {{1, 1}, {2, 2}}

	for i := 0; i < 2; i++ {

		for j := 0; j < 2; j++ {

			fmt.Println(array[i][j])
		}
	}
}