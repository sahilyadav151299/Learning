package main

import "fmt"

type Teacher struct {
	Name string
	Id   int
}

type Item struct {
	Id int
}

// Method : Function with receiver (Type or Struct on which this method is added)

func (teacher Teacher) GetSyllabus() {

	fmt.Println("GetSyllabus is called...", teacher.Name)
}

func (item Item) getItem() {
	
	fmt.Println("getItem is called...", item.Id)
}

func main() {
	
	teacher := Teacher {"ABC", 10}

	teacher.GetSyllabus()

	item := Item {40}

	item.getItem()
}
