// user defined package name must be same as folder name
// can not run : non-main package

package DAL

import "fmt"

// can be exported outside package
func ReadFile() {
	fmt.Println("Read File is called from file2.go...")
}