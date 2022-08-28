package main

import "fmt"

func main() {

	// Declaring some const variables
	const name, dept = "GeeksforGeeks", "CS"

	// Calling Printf() function
	fmt.Printf("%s is a %s Portal.\n", name, dept)

	// Declaring some const variables
	const num11, num22, num33 = 5, 10, 15

	// Calling Printf() function
	fmt.Printf("%d + %d = %d\n", num11, num22, num33)

	var str = "Geeksforgeeks"
	fmt.Printf("The string is %s \n", str)

  	var num1 int = 21
	fmt.Printf("The decimal value is %d \n", num1)

  	var num2 float32 = 7.786
	fmt.Printf("The floating point is %g \n", num2)
	fmt.Printf("The floating point is %f \n", num2)
	fmt.Printf("The floating point is %.f \n", num2)
	fmt.Printf("The floating point is %.2f \n", num2)

  	var num3 int = 14
	fmt.Printf("The binary value of num3 is %b \n", num3)

  	var num4 = 4 + 1i
  	fmt.Printf("Scientific Notation of num4 : %e \n", num4)

  	var FName = "Virat"
	var LName = "Kohli"

	s := fmt.Sprintf("My Name is %s %s", FName, LName)
	
	fmt.Println(s)
}