package main

import "fmt"

func main() {

    var weekdays = []string {"MON","TUE","WED","THR","FRI"}

	weekdays = append(weekdays[:2], weekdays[3:]...)
	
	fmt.Println(weekdays)
}