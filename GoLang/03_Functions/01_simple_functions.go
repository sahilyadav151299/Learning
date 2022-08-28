package main

import "fmt"
import "strings"

func main() {

	// 1) take nothing return nothing

	Func1()

	// 2) take something return nothing

	Func2("Sahil", 21)

	// 3) take something return something

	var fname = Func3("Sahil")
	lname := Func3("Yadav")

	fmt.Println(fname + " " + lname)

	// 4) take something return many thing

	salary1, grade1 := GetEMpDetails1(10)

	fmt.Println(salary1, grade1)

	salary2, grade2 := GetEMpDetails2(10)

	fmt.Println(salary2, grade2)

}

// 4) take something return many thing
// Way-1, Named return parameters, 
// - zero initailized return parameters
// - gives information about returning values and parameters

func GetEMpDetails1(id int) (salary int, grade string) {

	salary = 1000
	grade = "5.x"

	return 
}

// Way-2, Function returning multiple values

func GetEMpDetails2(id int) (int, string) {

	var salary = 1000
	var grade = "5.x"

	return salary, grade
}

// 1) take nothing return nothing
func Func1() {
	fmt.Println("Hey there !")
}

// 2) take something return nothing
func Func2(name string, age int) {
	fmt.Println("Hey " + name + " your age is ", age)
}

// 3) take something return something
func Func3(name string) string {
	return strings.ToUpper(name)
}