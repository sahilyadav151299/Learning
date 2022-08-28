package main

import "fmt"

// interface contains only declaration
// can not be instaintiated : can only have reference

type IShape interface {
	Area(side int)
	Perimeter()
}

// interface implementation is not implicit in go
type Traingle struct {
	Side int
}

type Square struct {
	side int
}

// Implement methods for Traingle struct which are specified in IShape interface

func (tra Traingle) Area(side int) {
	fmt.Println("Traingle Area is calculated...")
}

func (tra Traingle) Perimeter() {
	fmt.Println("Traingle Perimeter is calculated...")
}

func (tra Square) Area(side int) {
	fmt.Println("Square Area is calculated...")
}

func (tra Square) Perimeter() {
	fmt.Println("Square Perimeter is calculated...")
}
func main() {

	// reference of interface IShape
	var shape IShape

	// while instantiated, compiler will check whether Triangle implement all interface methods or not
	// if child didn't implemented whole interface, it gives error 

	shape = Traingle{10}		
	// what shape containes : tringale object
	shape.Area(10)
	shape.Perimeter()

	shape = Square{20}
	// what shape containes : square object
	shape.Area(10)
	shape.Perimeter()
	
}
