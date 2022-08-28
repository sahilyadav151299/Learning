package main

import (
	"fmt"
	"sync"
	"time"
)

// wait group object
var wg sync.WaitGroup

func CheckoutProducts() {

	for i := 0; i < 5; i++ {
		// sleep for 1 second
		time.Sleep(1 * time.Second)
		fmt.Println("Value of i from Checkout Product ", i)
	}

	wg.Done()
}

func BrowseProducts() {

	for i := 0; i < 5; i++ {
		// sleep for 1 second
		time.Sleep(1 * time.Second)
		fmt.Println("Value of i from Browse Product ", i)
	}

	wg.Done()
}

// main go routine
func main() {

	// both functions will be executed on seperate go routines
	// add routines for parallel processing
	
	wg.Add(2)

	// execute concurrently
	go CheckoutProducts() 		// go routine
	go BrowseProducts()   		// go routine

	// main won't wait untill we specify so it will print this
	fmt.Println("Control returned to main 1")

	// wait till all routines finish their work
	wg.Wait()

	fmt.Println("Control returned to main 2")
}
