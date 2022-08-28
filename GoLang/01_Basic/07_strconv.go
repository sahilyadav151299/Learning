package main

import (
	"fmt"
	"strconv"
)

func main() {

	var a = "1000"

	// for converiosn from string to int

	value, err := strconv.Atoi(a)
	fmt.Println(value,err)				// if no error, returns <nil>

	// if don't want second value
	val, _ := strconv.Atoi(a)
	fmt.Println(val)

	// for converiosn from int to string
	value1 := 1000

	strcovalue := strconv.Itoa(value1)
	fmt.Println(strcovalue)

	b, err := strconv.ParseBool("true")
	f, err := strconv.ParseFloat("3.1415", 64)
	i, err := strconv.ParseInt("-42", 10, 64)
	u, err := strconv.ParseUint("42", 10, 64)

	fmt.Println(b, err)
	fmt.Println(f, err)
	fmt.Println(i, err)
	fmt.Println(u, err)

	s1 := strconv.FormatBool(true)
	s2 := strconv.FormatFloat(3.1415, 'E', -1, 64)
	s3 := strconv.FormatInt(-42, 16)
	s4 := strconv.FormatUint(42, 16)

	fmt.Println(s1)
	fmt.Println(s2)
	fmt.Println(s3)
	fmt.Println(s4)
}


