package main

import "fmt"

type EMployee struct {

	EmpCode int
	EmpName string
}

func main() {

	// struct is value type

	emp1 := EMployee{100, "M"}

	fmt.Println(emp1.EmpCode)
	ChangeStruct1(emp1)
	fmt.Println(emp1.EmpCode)

	fmt.Println(emp1.EmpCode)
	ChangeStruct(&emp1)
	fmt.Println(emp1.EmpCode)

	// create struct as ref type : Way 1

	emp2 := & EMployee { 200, "N" }

	fmt.Println(emp2.EmpCode)
	ChangeStruct(emp2)
	fmt.Println(emp2.EmpCode)

	// create struct as ref type : Way 2

	emp3 := new (EMployee)

	emp3.EmpName = "Sahil"
	emp3.EmpCode = 1000

	fmt.Println(emp3.EmpCode)
	ChangeStruct(emp3)
	fmt.Println(emp3.EmpCode)

}

func ChangeStruct1(emp EMployee) {

	emp.EmpCode = 900
}

func ChangeStruct(emp *EMployee) {

	emp.EmpCode = 900
}
