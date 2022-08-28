package main

import "fmt"

type Student struct {
	FName string
	LName string
}

type Exams struct {
	UnitTestsExam int
}

func (exam Exams) Test() {
	fmt.Println("Test from Exam")
}

func (exam Exams) TakeExam() {
	fmt.Println("TakeExams from Exams struct")
}
func (std Student) TakeExam() {
	fmt.Println("TakeExams from Student struct")
}

// child struct multiple inheritance
type SchoolStd struct { 
	Student
	Exams
}



func main() {

	std := Student {"Sachin", "T"}
	exam := Exams {10}

	schoolstd := SchoolStd {std, exam}

	fmt.Println(schoolstd.FName, schoolstd.UnitTestsExam)

	//schoolstd.TakeExam() // : ambiguty

	//call TakeExams of Student/Exams struct
	schoolstd.Student.TakeExam()
	schoolstd.Exams.TakeExam()

	// no ambiguity call like this
	schoolstd.Test()
	
}
