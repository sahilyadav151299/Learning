// user defined package name must be same as folder name
// can not run : non-main package 

package DAL

import "fmt"

// global variable
var fileName string 	// not exported
var DbName string 		// exported as Capitalized

func init() {
	fmt.Println("init of DAL is called..")
}

// Capitalization : If first letter of member is capital 
// then only exported outside the package
// naming convention itself define access modifier

// private to package DAL
func readDB() { 
	fmt.Println("ReadDB is called from file1.go..")
}

// can be exported outside package
func WriteDB() { 
	fmt.Println("WriteDB is called from file1.go...")
}
