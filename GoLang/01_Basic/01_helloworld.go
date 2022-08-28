// every go program must be a part of some package
// first line of code must be a package declaration
package main

// in-built formatting package
import "fmt"		

func main() {	// Entry point

	// compiler automatically inserts ;
	
	fmt.Println("Hello World")	
	
}

// Way 1: Using VSCode terminal

// D:\Path\GoLang\01 Basic> go build .\01helloworld.go
// only builds the program not executes it

// D:\Path\GoLang\01 Basic> go run .\01helloworld.go
// Hello World

// Way 2 : Using Windows CMD

// D:\Path\GoLang\01 Basic> go run 01helloworld.go
// Hello World

// If error occured, execute this command
// D:\Path\GoLang\01 Basic> go mod init Example.com



