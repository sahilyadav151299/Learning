package main

import (
	"fmt"
	"sync"
	"time"
)

// wait group object
var wg sync.WaitGroup

func ReadFromFile(ch1 chan int) {

	for i := 0; i < 5; i++ {
		time.Sleep(1 * time.Second)

		// read from file & put value into channel
		ch1 <- i 

		fmt.Println("Value put into channel ", i)
	}

	wg.Done()
}

func WriteIntoDB(ch1 chan int) {
	for i := 0; i < 5; i++ {
		time.Sleep(1 * time.Second)
		
		// read value from channel & write in db
		fmt.Println("Read Value from channel", <-ch1)
	}

	wg.Done()
}

func main() {

	// buffered channel : multi-value
	// ch1 := make(chan int,3)  

	// channel of int type data : ch are reference type
	// unbuffered channel : single value
	ch1 := make(chan int) 
	
	// both functions will be executed on seperate go routines
	// add routines for parallel processing

	wg.Add(2)

	// execute concurrently
	go ReadFromFile(ch1) 		// go routines
	go WriteIntoDB(ch1)  		// go routine

	// main won't wait untill we specify so it will print this
	fmt.Println("Control returned to main 1")

	// wait till all routines finish their work
	wg.Wait()

	fmt.Println("Control returned to main 2")
}
