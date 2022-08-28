package main

import "fmt"

type Student struct {
	
	FName  string
	LName  string
	RollNo int
}

func main() {

	// way 1
	std1 := Student { FName: "Rahul", LName: "M" } // order can be anything
	fmt.Println(std1.FName)
	fmt.Println(std1.LName)
	fmt.Println(std1.RollNo)

	// way 2
	std2 := Student { "Pooja", "P", 30 }  // all property values needs to specify in this way
	fmt.Println(std2.FName)

	// way 3
	var std3 Student 
	fmt.Println(std3.FName, std3.LName, std3.RollNo)
	std3.FName = "Simran"
	fmt.Println(std3.FName, std3.LName, std3.RollNo)

	// in case of reference type we can have nill object
	// in case of value type we can have zero value object
}
