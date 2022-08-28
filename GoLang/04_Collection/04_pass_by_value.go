package main

import "fmt"

func main() {

    var data = 100

    fmt.Println("Value of data ", data)

    changeValue(data)

    fmt.Println("Value of data ", data)
    
}

func changeValue(value int) {

    value = 900
}