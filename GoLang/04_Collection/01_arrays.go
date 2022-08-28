package main

import "fmt"

func main() {

	// way 1 : array is fixed size in go
	var array1 [3] int		

	fmt.Println(array1)		// zero value array [0, 0, 0]

	array1[0] = 100
	array1[1] = 200
	array1[2] = 300

	fmt.Println(array1)

	// loop through array
	for i := 0; i < len(array1); i++ {

		fmt.Println(array1[i])
	}

	// when range is used for array/slices 
	// it returns index and value

	for i, v := range array1 {
		
		fmt.Println(i, v)
	}

	for _, v := range array1 {

		fmt.Println(v)
	}

	// way 2
	var array2 = [2]string{"java","c#"}

	fmt.Println(array2)
	
	// way 3 : shorthand
	array3 := [2]string{"java","c#"}

	fmt.Println(array3)	
}
