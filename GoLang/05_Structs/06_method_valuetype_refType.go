package main

import "fmt"

type Product struct {

	ProductId int
	ProductName string
}

// value type receiver : it will be called on copy of original object
func (product Product) setData1() {

	product.ProductName = "Modify"
}

// ref type reciver : it will be called on original object
func (product *Product) setData2() {

	product.ProductName = "Modify"
}

func main() {

	prd1 := Product{10, "TV"}

	prd1.setData1() 			

	fmt.Println(prd1)			// { 10 TV }

	prd1.setData2()				

	fmt.Println(prd1)			// { 10 Modify }
}
