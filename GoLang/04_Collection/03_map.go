package main

import "fmt"

func main() {

    // var <identifier> = map [key dt] value dt { key:value}
    var map1 = map [string] int {"GoLang": 100, "JavaScript": 200}
    
	for key1, value1 := range map1 {
        fmt.Println(key1, value1)
    }

    // var <identifier> = make(map [key dt] value dt)
    var map2 = make(map[int]string)

    map2[100] = "Ashay"
    map2[200] = "Hrishikesh"
    map2[300] = "Rahul"

    fmt.Println(map2[300])

    map2[300] = "Pooja"

    fmt.Println(map2)

    delete(map2, 300)
	
    fmt.Println(map2)
}