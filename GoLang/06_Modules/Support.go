// we can have more than one main package in common module
// but we can only have one main function

package main

import "fmt"

func GetData() {
	fmt.Println("GetData() is called from Support.go")
}

// as support.go and helloworld.go are in the same package
// we can call support.go without import
// call if 2 main pkg : go run .\HelloWorld.go .\Support.go