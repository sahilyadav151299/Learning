// variable are zero value in go if not initialized
// synatx : var <identifier> <datatype>

package main

import "fmt"


// global variable  
var var1 string			// blank
var var2 int			// 0
var var3 bool			// false
var var4 string = "Persistent"

func main() {

	// local variable
	var var5 string		// blank
	var var6 int		// 0
	var var7 bool		// false
	var var8 string = "Systems"

	fmt.Println(var1, var2, var3, var4)		// variadic parameter
	fmt.Println(var5, var6, var7, var8)		// variadic parameter

	// variable initialization
	var1 = "Sahil"		
	var2 = 21
	var3 = true

	// one line variable initialization
	var5, var6, var7 = "Yadav", 22, false

	fmt.Println(var1, var2, var3)
	fmt.Println(var5, var6, var7)

	// one line variable declaration + initializarion
	var var9, var10 string = "Sahil", "Yadav" 

	fmt.Println(var9, var10)

	fmt.Println("These are go lang standard variables")
}