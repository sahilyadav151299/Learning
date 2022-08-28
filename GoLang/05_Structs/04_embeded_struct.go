package main

import "fmt"

type Car struct {
	NoOfWheets int
	ModelNo    int
}

func (car Car) Drive() {
	fmt.Println("Driving a Car")
}

func (car Car) Start() {
	fmt.Println("Start a Car")
}

type Honda struct {

	Car					// Embed Car struct : Inheritance        				
	SpeedLimit int
}

func (honda Honda) AirBags(noofBags int) bool{
	fmt.Println("Air Bags....")
	return true
}

// method overriding

func (honda Honda) Start() {
	fmt.Println("Start a Honda Car...")
}

func main() {

	car := Car {4, 1234}

	honda := Honda {car, 100}

	honda.Drive()       // call parent if not present in child

	honda.AirBags(4)

	honda.Start()

}
