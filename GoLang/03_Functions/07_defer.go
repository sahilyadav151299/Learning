package main

import "fmt"

// defer : function with defer keyword will be called at the end
// or even if we get exception in between function with defer keyword will be called for sure
// function which are going to do some kind of clenup (db/file connection closing)

func main() {

	defer foo()

	var a = 10
	var b = 2
	var result = a / b

	fmt.Println(result)

	bar()
	test()
}

func foo() {
	fmt.Println("foo is called")
}

func bar() {
	fmt.Println("bar is called")
}

func test() {
	fmt.Println("test is called")
}
